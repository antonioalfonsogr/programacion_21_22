package U8.STAXentregable;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class crearStaxCero {

  public static void main(String[] args) {

    ArrayList<objeto> objetos = new ArrayList<>();

    Integer variable = 0;

    for (int i = 0; i < 10; i++) {

      variable++;
      objeto c = new objeto("a" + variable, 65 + variable, 7 + variable, 23 * variable - variable);
      objetos.add(c);
    }

    System.out.println(objetos);

    try {

      // Creo el objeto que me va a servir para escribir
      XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
      XMLEventWriter xmlWriter =
          xmlOutputFactory.createXMLEventWriter(new FileOutputStream("objetos.xml"));

      // Creo el objeto que me va a servir para crear los eventos
      XMLEventFactory eventFactory = XMLEventFactory.newInstance();

      // Creo el evento de principio de documento y lo escribo con el objeto escritor
      StartDocument startDocument = eventFactory.createStartDocument();
      xmlWriter.add(startDocument);

      // Creo el evento para introducir el salto de línea y el de salto de línea con tabulador
      // Los usaré para maquetar el fichero correctamente (aunque no son estrictamente necesarios)
      Characters saltoDeLinea = eventFactory.createCharacters("\n");
      Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
      Characters tabulador = eventFactory.createCharacters("\t");
      xmlWriter.add(saltoDeLinea);

      // Creo el evento necesario para crear la etiqueta raíz pedidos
      StartElement objetosStartElement = eventFactory.createStartElement("", "", "objetos");
      xmlWriter.add(objetosStartElement);
      xmlWriter.add(saltoDeLineaTab);

      // Recorro pedidos y voy creando las etiquetas (eventos) necesarias para cada uno de elllas

      // Esta variable la creo para controlar si es el último de los pedidos ya que querré diferente
      // salida
      int longitud = 0;

      int contador = 0;

      for (objeto o : objetos) {

        // Creo todas las etiquetas de apertura  que va a tener cada uno de los pedidos
        StartElement objetoStart = eventFactory.createStartElement("", "", "objeto");
        StartElement alturaStart = eventFactory.createStartElement("", "", "altura");
        StartElement edadStart = eventFactory.createStartElement("", "", "edad");
        StartElement pesoStart = eventFactory.createStartElement("", "", "peso");

        // Creo el atribudo id
        Attribute calidad = eventFactory.createAttribute("calidad", o.getCalidad());

        // Creo todas las etiquetas de cierre que va a tener cada uno de los pedidos
        EndElement objetoEnd = eventFactory.createEndElement("", "", "objeto");
        EndElement alturaEnd = eventFactory.createEndElement("", "", "altura");
        EndElement edadEnd = eventFactory.createEndElement("", "", "edad");
        EndElement pesoEnd = eventFactory.createEndElement("", "", "peso");

        // Creo los contenidos
        Characters altura = eventFactory.createCharacters(o.getAltura().toString());
        Characters edad = eventFactory.createCharacters(o.getEdad().toString());
        Characters peso = eventFactory.createCharacters(o.getPeso().toString());

        // Añado todos los elementos correspondientes a un pedido en el orden que es necesario
        xmlWriter.add(objetoStart);
        xmlWriter.add(calidad);
        xmlWriter.add(saltoDeLineaTab);
        xmlWriter.add(tabulador);
        xmlWriter.add(alturaStart);
        xmlWriter.add(altura);
        xmlWriter.add(alturaEnd);
        xmlWriter.add(saltoDeLineaTab);
        xmlWriter.add(tabulador);
        xmlWriter.add(edadStart);
        xmlWriter.add(edad);
        xmlWriter.add(edadEnd);
        xmlWriter.add(saltoDeLineaTab);
        xmlWriter.add(tabulador);
        xmlWriter.add(pesoStart);
        xmlWriter.add(peso);
        xmlWriter.add(pesoEnd);
        xmlWriter.add(saltoDeLineaTab);
        xmlWriter.add(objetoEnd);

        if (objetos.size() - 1 > contador) {
          xmlWriter.add(saltoDeLineaTab);
        } else {
          xmlWriter.add(saltoDeLinea);
        }

        contador++;
      }

      // Creo el evento necesario para cerrar la etiqueta raíz pedidos
      EndElement pedidosEndElement = eventFactory.createEndElement("", "", "objetos");
      xmlWriter.add(pedidosEndElement);
      xmlWriter.add(saltoDeLinea);

      // Creo el evento de finalización del documento y lo escribo con el objeto escritor
      EndDocument endDocument = eventFactory.createEndDocument();
      xmlWriter.add(endDocument);

    } catch (XMLStreamException | FileNotFoundException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }
}
