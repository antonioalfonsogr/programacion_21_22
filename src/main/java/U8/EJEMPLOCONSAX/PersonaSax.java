package U8.EJEMPLOCONSAX;

import org.w3c.dom.ls.LSOutput;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

// Hereda de la clase que tiene ya implementaciones por defecto de todos los interfaces
public class PersonaSax extends DefaultHandler {

  ArrayList<Persona> ArrayPersonas = new ArrayList<>();

  private String etiq = null;
  private String nom = null;
  private String ed = null;

  public PersonaSax() {
    super();
  }

  // Handler para el evento comienzo de documento
  @Override
  public void startDocument() throws SAXException {
    super.startDocument();
    System.out.println("Comienzo del parseado del documento personasXML.xml");
  }

  // Handler para el evento fin de documento
  @Override
  public void endDocument() throws SAXException {
    super.endDocument();
    System.out.println("Fin del parseado del documento personasXML.xml");

    System.out.println(ArrayPersonas);
  }

  // Handler para el evento etiqueta de apertura
  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes)
      throws SAXException {
    super.startElement(uri, localName, qName, attributes);

    // Abro la etiqueta
    System.out.print("<" + qName);

    etiq = qName;

    // Recorro los atributos (si tuviera)
    if (attributes != null) {
      for (int i = 0; i < attributes.getLength(); i++) {
        System.out.print(" " + attributes.getQName(i) + "=\"" + attributes.getValue(i) + "\"");
      }
    }

    // Cierro la etiqueta
    System.out.print(">");
  }

  // Handler para el evento etiqueta de cierre
  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {
    super.endElement(uri, localName, qName);

    System.out.print("</" + qName + ">");
  }

  // Handler para el evento Nodo de Texto encontrado
  @Override
  public void characters(char[] ch, int start, int length) throws SAXException {
    super.characters(ch, start, length);

    String content = new String(ch, start, length);
    System.out.print(content);

    if (etiq.equals("nombre")) {
      nom = content;
    } else if (etiq.equals("edad")) {
      ed = content;
    }

    if (nom != "" && ed != "" && nom != null && ed != null) {

      Persona p = new Persona(nom, ed);
      ArrayPersonas.add(p);

      nom = null;
      ed = null;
    }
  }
}
