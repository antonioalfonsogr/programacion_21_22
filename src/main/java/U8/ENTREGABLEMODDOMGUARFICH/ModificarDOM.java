package U8.ENTREGABLEMODDOMGUARFICH;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ModificarDOM {
  private static Document doc;

  public static void main(String[] args) {

    System.out.println("---");
    parsear();
    System.out.println("---");
    imprimir();
    System.out.println("---");
    anadircomentario();
    System.out.println("---");
    imprimir();
    System.out.println("---");
    anadirpersona();
    System.out.println("---");
    imprimir();
    System.out.println("---");
    reemplazarpersona();
    System.out.println("---");
    imprimir();
    System.out.println("---");
    volcar();
    System.out.println("---");
  }

  public static void parsear() {

    try {
      // Cargo el Fichero XML en Memoria
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      doc = db.parse(new File("XMLs/personasXML.xml"));

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }

  public static void imprimir() {

    // Cojo el elemento (etiqueta) raíz
    Element root = doc.getDocumentElement();

    // Imprimo el nombre de la etiqueta raíz
    System.out.println("<" + root.getTagName() + ">");

    // Obtengo todos los nodos hijos del elemento raíz
    NodeList nl = root.getChildNodes();

    // Recorremos todos los nodos hijos del elemento raíz
    for (int i = 0; i < nl.getLength(); i++) {

      // Es un hijo que es etiqueta (element)
      if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

        Element e = (Element) nl.item(i);

        // Muestro la información del elemento (etiqueta)
        System.out.println("   <" + e.getTagName() + ">");
        // System.out.println(e.getTextContent());

        NodeList n2 = e.getChildNodes();

        for (int j = 0; j < n2.getLength(); j++) {

          if (n2.item(j).getNodeType() == Node.ELEMENT_NODE) {

            Element e2 = (Element) n2.item(j);
            System.out.print("      <" + e2.getTagName() + ">");
            System.out.print(e2.getTextContent());
            System.out.println("</" + e2.getTagName() + ">");
          }
        }

        System.out.println("   </" + e.getTagName() + ">");

      } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {

        Comment c = (Comment) nl.item(i);

        System.out.println(c.getTextContent());
      }
    }

    // Imprimo el nombre de la etiqueta raíz
    System.out.println("</" + root.getTagName() + ">");
    System.out.println();
  }

  public static void anadircomentario() {

    // Cojo el elemento (etiqueta) raíz
    Element root = doc.getDocumentElement();

    // Obtener una lista de nodo (de TODOS los TIPOS)
    NodeList nl = doc.getElementsByTagName("persona");

    // Recorremos lista con todos los nodos "persona".
    for (int i = 0; i < nl.getLength(); i++) {
      Comment nodocomentario =
          doc.createComment("<!-- COMENTARIO AÑADIDO DESDE DOM PERSONA " + (i + 1) + "-->");
      root.insertBefore(nodocomentario, nl.item(i));
    }
  }

  public static void anadirpersona() {

    Element root = doc.getDocumentElement();

    NodeList nl = doc.getElementsByTagName("persona");

    Element newperson = doc.createElement("persona");

    root.appendChild(newperson);

    Element nombre = doc.createElement("nombre");

    newperson.appendChild(nombre);

    nombre.setTextContent("Pepe");

    Element edad = doc.createElement("edad");

    newperson.appendChild(edad);

    edad.setTextContent("56");
  }

  private static void reemplazarpersona() {

    Element root = doc.getDocumentElement();

    NodeList nl = doc.getElementsByTagName("persona");

    Element newperson2 = doc.createElement("persona");

    Element nombre = doc.createElement("nombre");

    newperson2.appendChild(nombre);

    nombre.setTextContent("Jose");

    Element edad = doc.createElement("edad");

    newperson2.appendChild(edad);

    edad.setTextContent("46");

    root.replaceChild(newperson2, nl.item(0));
  }

  private static void volcar() {

    try {
      TransformerFactory tf = TransformerFactory.newInstance();
      Transformer transformer = tf.newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
      transformer.setOutputProperty(OutputKeys.METHOD, "xml");
      transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

      // Creación del origen DOMSource
      Node root = doc.getDocumentElement(); // <-- para obtener el nodo raíz
      DOMSource origenDOM = new DOMSource(root);
      // Creación del fichero que va a ser mi destino
      File nuevoPersonas = new File("dom_modificado.xml");
      StreamResult destino = new StreamResult(nuevoPersonas);

      transformer.transform(origenDOM, destino);

    } catch (TransformerException e) {
      throw new RuntimeException(e);
    }
  }
}
