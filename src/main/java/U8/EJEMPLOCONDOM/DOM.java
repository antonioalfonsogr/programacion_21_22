package U8.EJEMPLOCONDOM;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class DOM {

  public static void main(String[] args) {

    try {
      // Cargo el Fichero XML en Memoria
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.parse(new File("personasXML.xml"));

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
        }
      }

      // Imprimo el nombre de la etiqueta raíz
      System.out.println("</" + root.getTagName() + ">");

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }

    System.out.println();
    numNodosHijos();
    System.out.println();
    mostrarXMLDom();
    System.out.println();
    mostrarContenidoEtiqueta("nombre");

  }

  public static void numNodosHijos() {

    try {

      Integer contador = 1;

      // Cargo el Fichero XML en Memoria
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.parse(new File("personasXML.xml"));

      // Cojo el elemento (etiqueta) raíz
      Element root = doc.getDocumentElement();

      // Obtengo todos los nodos hijos del elemento raíz
      NodeList nl = root.getChildNodes();

      // Recorremos todos los nodos hijos del elemento raíz
      for (int i = 0; i < nl.getLength(); i++) {

        // Es un hijo que es etiqueta (element)
        if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

          Element e = (Element) nl.item(i);

          // Muestro el nombre del elemento (etiqueta)
          System.out.println(contador++ + ". <" + e.getTagName() + ">" + " -> Tipo: Elemento");

        } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {

          Text texto = (Text) nl.item(i);

          System.out.println(contador++ + ". " + texto.getTextContent().trim() + " -> Tipo: Texto");

        }

      }

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }

  public static void mostrarXMLDom(){

    try {

      Integer contador = 1;

      // Cargo el Fichero XML en Memoria
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.parse(new File("personasXML.xml"));

      // Cojo el elemento (etiqueta) raíz
      Element root = doc.getDocumentElement();

      // Obtengo todos los nodos hijos del elemento raíz
      NodeList nl = root.getChildNodes();

      // Recorremos todos los nodos hijos del elemento raíz
      for (int i = 0; i < nl.getLength(); i++) {

        // Es un hijo que es etiqueta (element)
        if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

          Element e = (Element) nl.item(i);

          // Muestro el nombre del elemento (etiqueta)
          System.out.println(contador++ + ". Elemento");

        } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {

          Text texto = (Text) nl.item(i);

          System.out.println(contador++ + ". Texto");

        }

      }

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }

  public static void mostrarContenidoEtiqueta(String s) {

    try {

      Integer contador = 0;

      // Cargo el Fichero XML en Memoria
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.parse(new File("personasXML.xml"));

      // Cojo el elemento (etiqueta) raíz
      Element root = doc.getDocumentElement();

      // Obtengo todos los nodos hijos del elemento raíz
      NodeList nl = root.getChildNodes();

      // Recorremos todos los nodos hijos del elemento raíz
      for (int i = 0; i < nl.getLength(); i++) {

        // Es un hijo que es etiqueta (element)
        if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

          Element e = (Element) nl.item(i);

          if (e.getTagName().equals(s)) {

            // Muestro el nombre del elemento (etiqueta)
            System.out.println(contador++ + ". <" + e.getTagName() + ">");

          }

          NodeList n2 = e.getChildNodes();

          for (int j = 0; j < n2.getLength(); j++) {

            if (n2.item(j).getNodeType() == Node.ELEMENT_NODE) {

              Element e2 = (Element) n2.item(j);

              if (e2.getTagName().equals(s)) {

                // Muestro el nombre del elemento (etiqueta)
                System.out.println(contador++ + ". <" + e2.getTagName() + ">");

              }
            }
          }
        }
      }

      if (contador == 0) {
        System.out.println("No existen Elementos con ese nombre.");
      }

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }
}
