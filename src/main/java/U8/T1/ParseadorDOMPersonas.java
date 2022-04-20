package U8.T1;

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

public class ParseadorDOMPersonas {

  public static void parse(String nomFile) {

    try {

      String nombre = null;
      Integer edad = null;

      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.parse(new File("XMLs/" + nomFile));

      // Cojo directamente las etiquetas persona
      NodeList nl = doc.getElementsByTagName("persona");

      Persona[] personasArray = new Persona[nl.getLength()];

      // Voy a tratar cada una de estas etiquetas persona
      for (int i = 0; i < nl.getLength(); i++) {
        Node nodo = nl.item(i);

        Element e = (Element) nl.item(i);

        if (nodo.getNodeType() == Node.ELEMENT_NODE) {

          if (nodo.hasChildNodes()) {

            NodeList listaInterior = nodo.getChildNodes();

            for (int j = 0; j < listaInterior.getLength(); j++) {

              if (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                Element eHijo = (Element) listaInterior.item(j);
                if (eHijo.getTagName().equals("nombre")) {
                  nombre = eHijo.getTextContent();
                }
                if (eHijo.getTagName().equals("edad")) {
                  edad = Integer.valueOf(eHijo.getTextContent());
                }
              }
            }
          }
        }
        Persona p = new Persona(nombre, edad);
        personasArray[i] = p;
      }
      for (Persona p : personasArray) {
        System.out.println(p);
      }
    } catch (ParserConfigurationException | SAXException | IOException e) {
      throw new RuntimeException(e);
    }
  }
}
