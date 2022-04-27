package U8.U8_entregable1_xml;

// Construir un XML que tenga  al menos 3 niveles, es decir, un nodo raíz, etiquetas hijas y
// etiquetas nietas. Debe haber al menos 5 etiquetas hijas y 3 etiquetas nietas para cada una   de
// esas etiqueta hijas (todas ellas con contenido). Todas las etiquetas hijas deben tener algún
// atributo. Algo similar al ejemplo de personasXML.xml
//
// Crear una clase RecorridoSax en cuyo método main se recorra ese fichero utilizando Sax
// y lo muestre por pantalla.
//
// Crear una clase RecorridoDOM que desde su main invoque a los siguiente métodos (que
// debéis también crear):
//   - numNodosHijos() que mostrará por pantalla el número de nodos hijos (descendientes
//     directos del nodo raíz) y el tipo de cada uno de esos nodos (etiqueta, texto, comentario)
//   - mostrarXMLDom() que mostrará por pantalla el contenido del fichero XML llegando
//     únicamente al primer nivel. A partir de ahí puedo mostrar el contenido completo de los nodos.
//   - mostrarContenidoEtiqueta(Element e) que recibe como parámetro un element (etiqueta) y
//     recorrerá los hijos de todas y cada una de las ocurrencias de esas etiquetas mostrando el
//     contenido de los mismos. Si no hay ninguna ocurrencia de esa etiqueta (element) deberá
//     mostrar un mensaje de aviso.

// import U8_xml_json.XML.ejercicios.T4.parserPeliculasSAX;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class u8en1 {
  public static void main(String[] args) {
    //
    final String xmlfile = "src/main/java/U8/U8_Entregable1_xml/peliculas.xml";
    //    RecorreSAX(xmlfile);
    RecorreDOM(xmlfile);
  }

  public static void RecorreSAX(String xmlfile) {
    try {
      // Obtención del Parser Sax
      SAXParserFactory spf = SAXParserFactory.newInstance();
      SAXParser saxParser = spf.newSAXParser();

      // Obtenemos la clase que hemos creado para manejar los eventos en los que estamos interesados
      // Debe implementar lo métodos de los interfaces que estime
      DefaultHandler RecorridoSax = new parserPeliculasSAX();

      // Lanzo el parseado del fichero con nuestro manejador como un argumento
      saxParser.parse(new File(xmlfile), RecorridoSax);

    } catch (ParserConfigurationException | IOException | SAXException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void RecorreDOM(String xmlfile) {
    RecorridoDOM dom = new RecorridoDOM(xmlfile);
    //    dom.numNodosHijos();
    //    dom.mostrarXMLDom();
    //    dom.mostrarContenidoEtiqueta("pelicula");
  }
}
