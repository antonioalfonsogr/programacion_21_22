package U8.U8_entregable1_xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class RecorridoDOM {
  Document doc;

  public RecorridoDOM(String xmlfile) {

    try {
      // Cargo el Fichero XML en Memoria
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      this.doc = db.parse(new File(xmlfile));

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public void numNodosHijos() {
    Element root = doc.getDocumentElement();
    NodeList nl = root.getChildNodes();
    System.out.println("Hay " + nl.getLength() + " nodos hijos directos del raíz.");

    for (int i = 0; i < nl.getLength(); i++) {
      System.out.print("Nodo " + i + " ");
      ProcesaNodoRaiz(nl.item(i));
    }
  }

  public void mostrarXMLDom() {
    Element root = doc.getDocumentElement();
    NodeList nl = root.getChildNodes();

    for (int i = 0; i < nl.getLength(); i++) {
      ProcesaNodoXML(nl.item(i));
    }
  }

  public void mostrarContenidoEtiqueta(String etiqueta) {
    System.out.println("etiqueta: " + etiqueta);

    Element root = doc.getDocumentElement();
    NodeList nl = root.getElementsByTagName(etiqueta);

    for (int i = 0; i < nl.getLength(); i++) {
      if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
        Element e = (Element) nl.item(i);
        System.out.println("Contenido de la etiqueta: " + e.getTextContent());
      }
    }

    if (nl.getLength() == 0) {
      System.out.println("No hay ocurrencias de esa etiqueta");
    }
  }

  public static void ProcesaNodoRaiz(Node n) {
    if (n.getNodeType() == Node.ELEMENT_NODE) {
      System.out.println("nodo etiqueta");
    } else if (n.getNodeType() == Node.TEXT_NODE) {
      System.out.println("nodo texto");
    } else if (n.getNodeType() == Node.COMMENT_NODE) {
      System.out.println("nodo comentario");
    }
  }

  public static void ProcesaNodoXML(Node n) {
    if (n.getNodeType() == Node.ELEMENT_NODE) {
      System.out.print("<" + n.getNodeName());
      if (n.hasAttributes()) {
        for (int i = 0; i < n.getAttributes().getLength(); i++) {
          System.out.print(
              " "
                  + n.getAttributes().item(i).getNodeName()
                  + "=\""
                  + n.getAttributes().item(i).getNodeValue()
                  + "\"");
        }
      }
      System.out.print(">" + "</" + n.getNodeName() + ">");
      System.out.println();
    }
  }
}
