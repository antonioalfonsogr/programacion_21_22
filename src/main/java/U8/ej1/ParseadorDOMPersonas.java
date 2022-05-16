package U8.ej1;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ParseadorDOMPersonas {

  public static void parse(String nomFile) {

    String nombre = null;
    Integer edad = null;

    // CARGAR EL FICHERO XML EN MEMORIA --------------------------------------------------------------------
    try {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.parse(new File(nomFile));

      // Cojo el elemento (etiqueta) raíz
      Element root = doc.getDocumentElement();

      // Obtengo todos los nodos hijos del elemento raíz
      NodeList nl = root.getChildNodes();

      for (int i = 0; i < nl.getLength(); i++) {

        // Es un hijo que es etiqueta (element)
        if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

          // Muestro la información del elemento (etiqueta)
          System.out.println("ETIQUETA");
          Element e = (Element) nl.item(i);
          System.out.println("NOMBRE DE PERSONA: " + e.getTagName());
          if(e.getTagName().equals("persona")) {
            NodeList lista_personas = nl.item(i).getChildNodes();
            for (int j = 0; j < lista_personas.getLength(); j++) {
              if (lista_personas.item(j).getNodeType() == Node.ELEMENT_NODE) {
                Element e2 = (Element) lista_personas.item(j);
                System.out.print("Nombre de etiqueta: " + e2.getTagName() + " -> ");
                System.out.println(e2.getTextContent());
              }
            }
          }

          // Compruebo si el elemento (etiqueta tiene atributos)
          if (e.hasAttributes()) {

            System.out.println("Y este nodo tiene atributos");

            // Obtengo los atributos y los muestro
            NamedNodeMap nodeMap = e.getAttributes();
            for (int j = 0; j < nodeMap.getLength(); j++) {
              Node node = nodeMap.item(j);
              Attr atributo = e.getAttributeNode(node.getNodeName());
              System.out.println("Atributo: " + atributo.getNodeName());
              System.out.println("Valor: " + atributo.getValue());
            }
          }

          // He encontado un nodo comentario
        } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
          System.out.println("He encontrado un nodo comentario");
          System.out.println("Y contiene:");
          Comment comentario = (Comment) nl.item(i);
          System.out.println(comentario.getTextContent());
        }
        System.out.println("----------------------------------------");
      }

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }


  }
}
