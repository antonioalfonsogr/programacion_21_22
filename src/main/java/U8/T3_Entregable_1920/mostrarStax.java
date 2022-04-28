package U8.T3_Entregable_1920;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class mostrarStax {
  public static void main(String[] args) {

    List<Persona> personas = new ArrayList<>();
    Persona personaActual = null;
    String tagActual = "";

    try {

      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      XMLEventReader xmlReader =
          xmlInputFactory.createXMLEventReader(new FileInputStream("XMLs/personasXML.xml"));

      while (xmlReader.hasNext()) {
        XMLEvent xmlEvent = xmlReader.nextEvent();

        if (xmlEvent.isStartElement()) {

          StartElement startTag = xmlEvent.asStartElement();

          String tagName = startTag.getName().getLocalPart();

          System.out.print("<" + tagName);

          switch (tagName) {
            case "personas":
              Attribute info = startTag.getAttributeByName(new QName("info"));
              System.out.print(" " + info.getName() + "=\"" + info.getValue() + "\"");

              Attribute otro = startTag.getAttributeByName((new QName("otro")));
              System.out.print(" " + otro.getName() + "=\"" + otro.getValue() + "\"");

              break;

            case "persona":
              personaActual = new Persona();
              tagActual = "persona";

              Attribute id = startTag.getAttributeByName(new QName("id"));
              System.out.print(" " + id.getName() + "=\"" + id.getValue() + "\"");
              personaActual.setId(Integer.valueOf(id.getValue()));
              break;

            case "nombre":
              tagActual = "nombre";
              break;

            case "edad":
              tagActual = "edad";
              break;
          }

          System.out.print(">");
          if (startTag.getName().getLocalPart().equals("personas")) {
            System.out.println();
          }

        } else if (xmlEvent.isEndElement()) {

          EndElement endtag = xmlEvent.asEndElement();
          System.out.println("<\\" + endtag.getName().getLocalPart() + ">");

          if (endtag.getName().getLocalPart().equals("persona")) {
            personas.add(personaActual);
          }

          tagActual = "";
        } else if (xmlEvent.isStartDocument()) {
          System.out.println("Comienzo del documento");
        } else if (xmlEvent.isEndDocument()) {
          System.out.println("Fin del documento");
        } else if (xmlEvent.isCharacters()) {
          Characters texto = xmlEvent.asCharacters();

          if (!texto.getData().contains("\n")) {
            System.out.print(texto.getData());
          }
          if (!tagActual.equals("")) {
            switch (tagActual) {
              case "nombre":
                personaActual.setNombre(texto.getData());
                break;
              case "edad":
                personaActual.setEdad(Integer.valueOf(texto.getData()));
            }
          }
        }
      }

    } catch (XMLStreamException | FileNotFoundException e) {
      throw new RuntimeException(e);
    }
    System.out.println(personas);
  }
}
