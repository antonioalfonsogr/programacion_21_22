package U8.T1_Entregable_1920;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class saxSimple {
  public static void main(String[] args) {

    try {
      SAXParserFactory spf = SAXParserFactory.newInstance();
      SAXParser saxParser = spf.newSAXParser();

      PersonaSax p = new PersonaSax();
      DefaultHandler personaSax = p;

      saxParser.parse(new File("XMLs/personasXML.xml"), personaSax);

      List<Persona> listaPersona = p.getListaPersona();
      System.out.println(listaPersona);

    } catch (ParserConfigurationException | IOException | SAXException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }
}
