package U8.STAXentregable;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mostrarstax {

  public static void main(String[] args) {


    try {
      // Obtenemos el lector de XML
      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      XMLEventReader xmlReader =
              xmlInputFactory.createXMLEventReader(new FileInputStream("domdesdecero.xml"));

      // Recorro la lista de eventos. Soy yo el que los va obteniendo PULL con nextEvent()
      while (xmlReader.hasNext()) {

        // Obtengo el evento siguiente que voy a tratar
        XMLEvent xmlEvent = xmlReader.nextEvent();

        // Es un evento de apertura de etiqueta
        if (xmlEvent.isStartElement()) {

          // Si he recibido el evento de comiento de una etiqueta
          // Obtengo la información de la etiqueta

          StartElement startTag = xmlEvent.asStartElement();

          // Inicio la apertura de la etiqueta pero no lo cierro por si tiene atributos
          System.out.print("<" + startTag.getName().getLocalPart() + ">\n");

        } else if (xmlEvent.isEndElement()) {

          // Si he recibido el evento de fin de una etiqueta
          // Muestro la etiqueta de cierre
          EndElement endtag = xmlEvent.asEndElement();
          System.out.println("<\\" + endtag.getName().getLocalPart() + ">");

        } else if (xmlEvent.isStartDocument()) {
          System.out.println("Comienzo del parseado del documento");

        } else if (xmlEvent.isEndDocument()) {
          System.out.println("Fin del parseado del documento");

        } else if (xmlEvent.isCharacters()) {

          // Estoy en un nodo de texto
          Characters texto = xmlEvent.asCharacters();

          // No es un salto de línea Estoy suponiendo que el texto de las etiquetas nodo no lleva un
          // salto
          // de línea
          if (!texto.getData().contains("\n")) {
            System.out.print("  " + texto.getData() + "\n");
          }
        }
      }
    } catch (FileNotFoundException | XMLStreamException e) {
      System.out.println(e.getMessage());
    }








  }
}
