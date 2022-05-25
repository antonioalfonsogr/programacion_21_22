package U9.U8_U9_Examen_20_21.Ej1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ModificacionDOM {

  private static Document doc;

  public static void parseDOM() {
    try {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      doc = db.parse(new File("XMLs/biblioteca.xml"));

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(e.getMessage());
    }
  }

  // Añada un nuevo libro a la biblioteca solicitando los datos al usuario.

  public static void annadirLibro() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca titulo: ");
    String ntitulo = sc.nextLine();

    System.out.print("Introduzca autor: ");
    String nautor = sc.nextLine();

    System.out.print("Introduzca editorial: ");
    String neditorial = sc.nextLine();

    System.out.print("Introduzca número de páginas: ");
    int npaginas = sc.nextInt();
    sc.nextLine();

    Element root = doc.getDocumentElement();

    Element nuevoLibro = doc.createElement("libro");

    root.appendChild(nuevoLibro);

    Element titulo = doc.createElement("titulo");
    nuevoLibro.appendChild(titulo);
    titulo.setTextContent(ntitulo);

    Element autor = doc.createElement("autor");
    nuevoLibro.appendChild(autor);
    autor.setTextContent(nautor);

    Element editorial = doc.createElement("editorial");
    nuevoLibro.appendChild(editorial);
    editorial.setTextContent(neditorial);

    Element paginas = doc.createElement("paginas");
    nuevoLibro.appendChild(paginas);
    paginas.setTextContent(Integer.toString(npaginas));
  }

  // Inserte un nuevo nodo dentro de editorial que indique el país de origen de la editorial.

  public static void insertarPaisEditorial() {
    Element root = doc.getDocumentElement();

    NodeList nl = root.getChildNodes();

    for (int i = 0; i < nl.getLength(); i++) {

      if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

        Element e = (Element) nl.item(i);

        NodeList nl2 = e.getChildNodes();

        for (int j = 0; j < nl2.getLength(); j++) {

          if (nl2.item(j).getNodeType() == Node.ELEMENT_NODE) {

            Element e2 = (Element) nl2.item(j);

            if (e2.getTagName().equalsIgnoreCase("editorial")) {

              Element pais = doc.createElement("pais");
              pais.setTextContent("España");
              e2.appendChild(pais);
            }
          }
        }
      }
    }
  }

  // Escriba todo esto en un fichero llamado ejercicio2.xml

  public static void guardarEnFichero() {

    try {

      TransformerFactory tf = TransformerFactory.newInstance();
      Transformer transformer = tf.newTransformer();

      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
      transformer.setOutputProperty(OutputKeys.METHOD, "xml");
      transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

      DOMSource origenDOM = new DOMSource(doc);

      File ejercicio2 = new File("XMLs/ejercicio2.xml");
      StreamResult destino = new StreamResult(ejercicio2);

      transformer.transform(origenDOM, destino);

    } catch (TransformerException e) {
      System.out.println(e.getMessage());
    }
  }
}
