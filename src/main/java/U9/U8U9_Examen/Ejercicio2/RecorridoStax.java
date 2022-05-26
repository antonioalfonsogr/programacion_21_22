package U9.U8U9_Examen.Ejercicio2;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoStax {

  // Utilizando el parser Stax crear una clase llamada RecorridoStax que:

  // Muestre por pantalla los datos del piloto con más campeonatos.

  public static void showPilotoMasCampeonatos() {

    try {

      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      XMLEventReader xmlReader =
          xmlInputFactory.createXMLEventReader(new FileInputStream("pilotos.xml"));

      String nombreMax = "";
      int edadMax = 0;
      String escuderiaMax = "";
      int campeonatosMax = 0;

      String nombreActual = "";
      int edadActual = 0;
      String escuderiaActual = "";
      int campeonatosActual = 0;

      String tagActual = "";

      while (xmlReader.hasNext()) {

        XMLEvent xmlEvent = xmlReader.nextEvent();

        if (xmlEvent.isStartElement()) {

          StartElement startTag = xmlEvent.asStartElement();

          tagActual = startTag.getName().getLocalPart();

        } else if (xmlEvent.isCharacters()) {

          Characters texto = xmlEvent.asCharacters();

          if (!texto.getData().contains("\n")) {
            if (!tagActual.equals("")) {

              switch (tagActual) {
                case "nombre":
                  nombreActual = texto.getData();
                  break;
                case "edad":
                  edadActual = Integer.parseInt(texto.getData());
                  break;
                case "escuderia":
                  escuderiaActual = texto.getData();
                  break;
                case "campeonatos":
                  campeonatosActual = Integer.parseInt(texto.getData());
                  break;
              }
            }
          }
        } else if (xmlEvent.isEndElement()) {

          EndElement endtag = xmlEvent.asEndElement();

          if (endtag.getName().getLocalPart().equals("piloto")) {

            if (campeonatosActual > campeonatosMax) {

              nombreMax = nombreActual;
              edadMax = edadActual;
              escuderiaMax = escuderiaActual;
              campeonatosMax = campeonatosActual;
            }

            nombreActual = "";
            edadActual = 0;
            escuderiaActual = "";
            campeonatosActual = 0;
          }
        }
      }

      System.out.println("Datos del piloto con más campeonatos:");
      System.out.println("Nombre: " + nombreMax);
      System.out.println("Edad: " + edadMax);
      System.out.println("Escudería: " + escuderiaMax);
      System.out.println("Campeonatos: " + campeonatosMax);

    } catch (FileNotFoundException | XMLStreamException e) {
      System.out.println(e.getMessage());
    }
  }

  // Que muestre por pantalla el número de pilotos de una escudería determinada que se solicitará al
  // usuario.

  public static void showNumPilotoEscuderia(String escuderia) {

    Integer contador = 0;

    try {

      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      XMLEventReader xmlReader =
          xmlInputFactory.createXMLEventReader(new FileInputStream("pilotos.xml"));

      while (xmlReader.hasNext()) {
        XMLEvent xmlEvent = xmlReader.nextEvent();

        if (xmlEvent.isCharacters()) {

          Characters texto = xmlEvent.asCharacters();

          if (texto.getData().equalsIgnoreCase(escuderia)) {
            contador++;
          }
        }
      }

      System.out.println("Hay " + contador + " pilotos de la escudería " + escuderia + ".");

    } catch (FileNotFoundException | XMLStreamException e) {
      System.out.println(e.getMessage());
    }
  }
}
