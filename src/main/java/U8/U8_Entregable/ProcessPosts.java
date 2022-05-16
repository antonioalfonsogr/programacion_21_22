package U8.U8_Entregable;

import com.google.gson.Gson;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcessPosts {

  private static Document doc;
  private static List<Post> postList = new ArrayList<>();

  // Getter & Setter
  public static Document getDoc() {
    return doc;
  }

  public static void setDoc(Document doc) {
    ProcessPosts.doc = doc;
  }

  // parseDOM(String filename) que recibe el nombre del fichero XML de una serie de posts de la web
  // de noticias de Pinterest. El método guardará en una propiedad doc el documento entero parseado
  // con el DOM.

  public static void parseDOM(String filename) {

    try {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      doc = db.parse(new File(filename));

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }

  // addPost(Post post) que añadirá un nuevo post a la propiedad doc, modificando para ello el árbol
  // DOM del mismo. El objeto post debe ser creado en el main, solicitando los datos necesarios al
  // usuario.

  public static void addPost(Post post) {

    Element root = doc.getDocumentElement();

    Element newpost = doc.createElement("post");

    root.appendChild(newpost);

    Element title = doc.createElement("title");
    newpost.appendChild(title);
    title.setTextContent(post.getTitle());

    Element link = doc.createElement("link");
    newpost.appendChild(link);
    link.setTextContent(post.getLink());

    Element description = doc.createElement("description");
    newpost.appendChild(description);
    description.setTextContent(post.getLink());

    Element pubDate = doc.createElement("pubDate");
    newpost.appendChild(pubDate);
    pubDate.setTextContent(post.getPubDate());

    Element guid = doc.createElement("guid");
    newpost.appendChild(guid);
    guid.setTextContent(post.getGuid());

    guid.setAttribute("isPermaLink", String.valueOf(post.getPermaLink()));
  }

  // getPosts() que devolverá una lista de objetos Post con los posts parseados del documento doc.

  public static List<Post> getPosts() {
    String tagActual = "";

    Element root = doc.getDocumentElement();

    NodeList nl = root.getChildNodes();

    for (int i = 0; i < nl.getLength(); i++) {

      if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
        Post p = new Post();

        Element e = (Element) nl.item(i);

        NodeList n2 = e.getChildNodes();

        for (int j = 0; j < n2.getLength(); j++) {

          if (n2.item(j).getNodeType() == Node.ELEMENT_NODE) {
            Element e2 = (Element) n2.item(j);
            tagActual = e2.getTagName();
            switch (tagActual) {
              case "title":
                p.setTitle(e2.getTextContent());
                break;
              case "link":
                p.setLink(e2.getTextContent());
                break;
              case "description":
                p.setDescription(e2.getTextContent());
                break;
              case "pubDate":
                p.setPubDate(e2.getTextContent());
                break;
              case "guid":
                p.setGuid(e2.getTextContent());
                break;
            }
          }
        }
        p.setPermaLink(true);
        postList.add(p);
      }
    }

    return postList;
  }

  // convertToJSON() que devolverá una cadena JSON con los posts parseados del documento doc.
  // Adicionalmente, creará un fichero posts.json con el mismo contenido que devuelve el método.

  public static String convertToJSON() {

    Gson gson = new Gson();

    String postJson = gson.toJson(postList);

    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("posts.json"));
      out.write(postJson);

      out.close();
    } catch (IOException ex) {
      System.out.println("ERROR: Fallo al escribir el fichero");
    }

    return postJson;
  }

  // numPostsStax(String filename) que parseará mediante Stax el fichero filename pasado por
  // parámetro, contará el número de posts que hay en el fichero y devolverá este número.

  public static Integer numPostsStax(String filename) {

    Integer contador = 0;

    try {

      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      XMLEventReader xmlReader =
          xmlInputFactory.createXMLEventReader(new FileInputStream("posts.xml"));

      while (xmlReader.hasNext()) {
        XMLEvent xmlEvent = xmlReader.nextEvent();

        if (xmlEvent.isStartElement()) {

          StartElement startTag = xmlEvent.asStartElement();

          if (startTag.getName().toString().equalsIgnoreCase("post")) {
            contador++;
          }
        }
      }

    } catch (FileNotFoundException | XMLStreamException e) {
      System.out.println(e.getMessage());
    }
    return contador;
  }
}
