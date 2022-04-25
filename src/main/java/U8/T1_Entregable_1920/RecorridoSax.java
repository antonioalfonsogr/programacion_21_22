package U8.T1_Entregable_1920;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class RecorridoSax extends DefaultHandler {
  public static void main(String[] args) {
    try {
      SAXParserFactory spf = SAXParserFactory.newInstance();
      SAXParser saxParser = spf.newSAXParser();

      RecorridoSax p = new RecorridoSax();
      DefaultHandler personaSax = p;

      saxParser.parse(new File("XMLs/personasXML.xml"), personaSax);

      //      List<Persona> listaPersona = p.getListaPersona();
      //      System.out.println(listaPersona);

    } catch (ParserConfigurationException | IOException | SAXException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }

  public RecorridoSax() {
    super();
  }

  @Override
  public void startDocument() throws SAXException {
    super.startDocument();
    System.out.println("Comienzo del parseado");
  }

  @Override
  public void endDocument() throws SAXException {
    super.endDocument();
    System.out.println("\n Fin del parseado");
  }

  @Override
  public void characters(char[] ch, int start, int length) throws SAXException {
    super.characters(ch, start, length);
    String content = new String(ch, start, length);
    System.out.print(content);
  }

  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes)
      throws SAXException {
    super.startElement(uri, localName, qName, attributes);

    System.out.print("<" + qName);

    if (attributes != null) {
      for (int i = 0; i < attributes.getLength(); i++) {
        System.out.print(" " + attributes.getQName(i) + "=\"" + attributes.getValue(i) + "\"");
      }
    }

    System.out.print(">");
  }

  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {
    super.endElement(uri, localName, qName);

    System.out.print("</" + qName + ">");
  }
}
