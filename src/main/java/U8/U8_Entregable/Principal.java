package U8.U8_Entregable;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ProcessPosts.parseDOM("posts.xml");

    System.out.println("Introduzca los datos para un nuevo post");

    System.out.print("Titulo:");
    String title = sc.nextLine();

    System.out.print("Link:");
    String link = sc.nextLine();

    System.out.print("Descripción:");
    String description = sc.nextLine();

    System.out.print("Fecha de publicación:");
    String pubDate = sc.nextLine();

    System.out.print("GUID:");
    String guid = sc.nextLine();

    Post p1 = new Post(title, link, description, pubDate, guid, true);

    ProcessPosts.addPost(p1);

    System.out.println(ProcessPosts.getPosts());

    System.out.println(ProcessPosts.convertToJSON());

    System.out.println(ProcessPosts.numPostsStax("post.xml"));
  }
}
