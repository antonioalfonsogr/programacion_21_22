package U8.U8_entregable1_xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class RecorridoSax extends DefaultHandler {
  @Override
  public void startDocument() throws SAXException {
    super.startDocument();
    System.out.println("Comienzo del parseado del documento");
  }

  @Override
  public void endDocument() throws SAXException {
    super.endDocument();
    System.out.println("Fin del parseado del documento");
  }

  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes)
      throws SAXException {
    super.startElement(uri, localName, qName, attributes);

    // Abro la etiqueta
    System.out.print("<" + qName);

    // Recorro los atributos (si tuviera)
    if (attributes != null) {
      for (int i = 0; i < attributes.getLength(); i++) {
        System.out.print(" " + attributes.getQName(i) + "=\"" + attributes.getValue(i) + "\"");
      }
    }

    // Cierro la etiqueta
    System.out.print(">");
  }

  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {
    super.endElement(uri, localName, qName);
    System.out.print("</" + qName + ">");
  }

  @Override
  public void characters(char[] ch, int start, int length) throws SAXException {
    super.characters(ch, start, length);

    String content = new String(ch, start, length);
    System.out.print(content);
  }
}
