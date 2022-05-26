package U9.U8U9_Examen.Ejercicio1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ModificacionDOM {

  // Partiendo del XML que se proporciona, crear una clase ModificacionDOM que haga lo siguiente:

  private static Document doc;

  public static void parseDOM() {
    try {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      doc = db.parse(new File("pilotos.xml"));

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(e.getMessage());
    }
  }

  // Añada un nuevo piloto a la lista de pilotos solicitando los datos al usuario.

  public static void addPiloto() {
    Scanner sc = new Scanner(System.in);

    System.out.println("---Nuevo Piloto---");

    System.out.print("Introduzca nombre: ");
    String nombreNew = sc.nextLine();

    System.out.print("Introduzca edad: ");
    Integer edadNew = sc.nextInt();
    sc.nextLine();

    System.out.print("Introduzca escudería: ");
    String escuderiaNew = sc.nextLine();

    System.out.print("Introduzca número de campeonatos: ");
    Integer campeonatosNew = sc.nextInt();
    sc.nextLine();

    Element root = doc.getDocumentElement();

    Element pilotoNew = doc.createElement("piloto");

    root.appendChild(pilotoNew);

    Element nombre = doc.createElement("nombre");
    pilotoNew.appendChild(nombre);
    nombre.setTextContent(nombreNew);

    Element autor = doc.createElement("edad");
    pilotoNew.appendChild(autor);
    autor.setTextContent(String.valueOf(edadNew));

    Element escuderia = doc.createElement("escuderia");
    pilotoNew.appendChild(escuderia);
    escuderia.setTextContent(escuderiaNew);

    Element campeonatos = doc.createElement("campeonatos");
    pilotoNew.appendChild(campeonatos);
    campeonatos.setTextContent(String.valueOf(campeonatosNew));
  }

  // Inserte un nuevo nodo dentro cada piloto que indique el país de origen del piloto

  public static void insertPais() {

    Element root = doc.getDocumentElement();

    NodeList nl = root.getChildNodes();

    for (int i = 0; i < nl.getLength(); i++) {
      if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

        Element e = (Element) nl.item(i);

        if (e.getTagName().equalsIgnoreCase("piloto")) {

          Element pais = doc.createElement("pais");
          pais.setTextContent("España");
          e.appendChild(pais);
        }
      }
    }
  }

  // Escriba todo esto en un fichero llamado ejercicio1.xml

  public static void saveXML() {
    try {

      TransformerFactory tf = TransformerFactory.newInstance();
      Transformer transformer = tf.newTransformer();

      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
      transformer.setOutputProperty(OutputKeys.METHOD, "xml");
      transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

      DOMSource origenDOM = new DOMSource(doc);

      File ejercicio1 = new File("ejercicio1.xml");
      StreamResult destino = new StreamResult(ejercicio1);

      transformer.transform(origenDOM, destino);

    } catch (TransformerException e) {
      System.out.println(e.getMessage());
    }
  }
}
