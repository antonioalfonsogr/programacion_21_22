package U9.U8_U9_Examen_20_21.Ej2;

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

  // Muestre por pantalla los datos del libro con más páginas.

  public static void mostrarLibroMasPaginas() {
    try {

      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      XMLEventReader xmlReader =
          xmlInputFactory.createXMLEventReader(new FileInputStream("XMLs/biblioteca.xml"));

      String lmpTitulo = "";
      String lmpAutor = "";
      String lmpEditorial = "";
      int lmpPaginas = 0;

      String aTitulo = "";
      String aAutor = "";
      String aEditorial = "";
      int aPaginas = 0;

      while (xmlReader.hasNext()) {

        XMLEvent xmlEvent = xmlReader.nextEvent();

        String tagName;

        String tagActual = "";

        if (xmlEvent.isStartElement()) {

          StartElement startTag = xmlEvent.asStartElement();

          tagName = startTag.getName().getLocalPart();

          System.out.println(tagName);

          tagActual = tagName;

        } else if (xmlEvent.isStartDocument()) {

          System.out.println("Comienzo del parseado del documento");

        } else if (xmlEvent.isEndDocument()) {

          System.out.println("Fin del parseado del documento");

        } else if (xmlEvent.isCharacters()) {

          Characters texto = xmlEvent.asCharacters();

          if (!texto.getData().contains("\n")) {
            if (!tagActual.equals("")) {
              System.out.println(tagActual);

              switch (tagActual) {
                case "titulo":
                  aTitulo = texto.getData();
                  System.out.println(aTitulo);
                  break;
                case "autor":
                  aAutor = texto.getData();
                  break;
                case "editorial":
                  aEditorial = texto.getData();
                  break;
                case "paginas":
                  aPaginas = Integer.parseInt(texto.getData());
                  break;
                default:
                  System.out.println("default");
              }
            }
          }
        } else if (xmlEvent.isEndElement()) {

          EndElement endtag = xmlEvent.asEndElement();

          if (endtag.getName().getLocalPart().equals("libro")) {

            System.out.println(aPaginas);
            System.out.println(aTitulo);
            System.out.println(aEditorial);
            System.out.println(aAutor);
            System.out.println();

            if (aPaginas > lmpPaginas) {

              lmpTitulo = aTitulo;
              lmpAutor = aAutor;
              lmpEditorial = aEditorial;
              lmpPaginas = aPaginas;
            }

            aTitulo = "";
            aAutor = "";
            aEditorial = "";
            lmpPaginas = 0;
          }

          tagActual = "";
        }
      }

      System.out.println("Datos del libro con más páginas:");
      System.out.println("Titulo: " + lmpTitulo);
      System.out.println("Autor: " + lmpAutor);
      System.out.println("Editorial: " + lmpEditorial);
      System.out.println("Páginas: " + lmpPaginas);

    } catch (FileNotFoundException | XMLStreamException e) {
      System.out.println(e.getMessage());
    }
  }

  // Que muestre por pantalla el número de libros de una editorial determinada que se solicitará al
  // usuario.

  public static void mostrarNumLibrosEditorial(String editorial) {

    Integer contador = 0;

    try {

      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      XMLEventReader xmlReader =
          xmlInputFactory.createXMLEventReader(new FileInputStream("XMLs/biblioteca.xml"));

      while (xmlReader.hasNext()) {
        XMLEvent xmlEvent = xmlReader.nextEvent();

        if (xmlEvent.isCharacters()) {

          Characters texto = xmlEvent.asCharacters();

          if (texto.getData().equalsIgnoreCase(editorial)) {
            contador++;
          }
        }
      }

      System.out.println("Hay " + contador + " libros de la editorial " + editorial + ".");

    } catch (FileNotFoundException | XMLStreamException e) {
      System.out.println(e.getMessage());
    }
  }
}
