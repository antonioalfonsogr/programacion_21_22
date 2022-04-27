package U8.T2_Entregable_1920;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {

  Document doc;

  public ModificarDOM(String xmlfile) {

    try {
      // Cargo el Fichero XML en Memoria
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      this.doc = db.parse(new File(xmlfile));

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
