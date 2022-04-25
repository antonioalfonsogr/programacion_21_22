package U8.T1_Entregable_1920;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class PersonaSax extends DefaultHandler {

  private List<Persona> listaPersona = new ArrayList<>();
  private Persona persona_actual;
  private String contenido_nodo_texto = "";

  @Override
  public void startDocument() throws SAXException {
    super.startDocument();
    System.out.println("Comienzo del parseado");
  }

  @Override
  public void endDocument() throws SAXException {
    super.endDocument();
    System.out.println("Fin del parseado");
  }

  @Override
  public void characters(char[] ch, int start, int length) throws SAXException {
    super.characters(ch, start, length);
    contenido_nodo_texto = new String(ch, start, length);
  }

  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes)
      throws SAXException {
    super.startElement(uri, localName, qName, attributes);

    if (qName.equals("persona")) {
      persona_actual = new Persona();
    }

    if (attributes != null) {
      for (int i = 0; i < attributes.getLength(); i++) {
        if (attributes.getQName(i).equals("id")) {
          persona_actual.setId(Integer.valueOf(attributes.getValue(i)));
        }
      }
    }
  }

  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {
    super.endElement(uri, localName, qName);

    if (qName.equals("persona")) {
      listaPersona.add(persona_actual);
    } else if (qName.equals("nombre")) {
      persona_actual.setNombre(contenido_nodo_texto);
    } else if (qName.equals("edad")) {
      persona_actual.setEdad(Integer.valueOf(contenido_nodo_texto));
    }
  }

  public List<Persona> getListaPersona() {
    return listaPersona;
  }
}
