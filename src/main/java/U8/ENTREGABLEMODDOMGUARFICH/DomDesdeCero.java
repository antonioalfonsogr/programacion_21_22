package U8.ENTREGABLEMODDOMGUARFICH;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class DomDesdeCero {

  public static void main(String[] args) {

    ArrayList<Coche> coches = new ArrayList<>();

    Integer variable = 0;

    for (int i = 0; i < 10; i++) {

      variable++;
      Coche c = new Coche("Audi", "a" + variable, 2000 + i, 1 * i);
      coches.add(c);
    }

    System.out.println(coches);

    try {

      // Obtenemos la referencia al objeto Document
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();

      // No parseo ningún fichero XML existente, simplemente lo obtengo
      Document doc = db.newDocument();

      // Creo el elemento raíz ya que está vacío
      Element root = doc.createElement("coches");

      // Añado el elemento raíz
      doc.appendChild(root);

      // Procedo a crear la etiqueta que voy a almacenar el fichero
      // El número de horas será un atributo y el resto de lo atributos del objeto serán
      // etiquetas hijas

      for (int i = 0; i < coches.size(); i++) {

        Element coche = doc.createElement("coche");
        coche.setAttribute("año", Integer.toString(coches.get(i).getYear()));

        Element marca = doc.createElement("marca");
        marca.setTextContent(coches.get(i).getMarca());

        Element modelo = doc.createElement("modelo");
        modelo.setTextContent(coches.get(i).getModelo());

        Element km = doc.createElement("kilómetros");
        km.setTextContent(coches.get(i).getKm().toString());

        coche.appendChild(marca);
        coche.appendChild(modelo);
        coche.appendChild(km);

        root.appendChild(coche);

      }

      TransformerFactory tf = TransformerFactory.newInstance();
      Transformer transformer = tf.newTransformer();

      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
      transformer.setOutputProperty(OutputKeys.METHOD, "xml");
      transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

      // Creación del origen DOMSource
      DOMSource origenDOM = new DOMSource(root);

      // Creación del fichero que va a ser mi destino
      File xmlcoches = new File("domdesdecero.xml");
      StreamResult destino = new StreamResult(xmlcoches);

      // Hacemos la transformación que en nuestro caso es la escritura
      transformer.transform(origenDOM, destino);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
