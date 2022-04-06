package U7.Stream;

import java.util.Scanner;
import java.util.stream.Stream;

public class A4 {
  public static void main(String[] args) {
    // A partir de una cadena con palabras separadas por espacios introducida por teclado, construye
    // una tabla con las palabras. A partir de ella, crea un Stream con las palabras ordenadas por
    // orden alfabético y muéstralas por pantalla.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca palabras separadas por espacio");

    String cadena = sc.nextLine();

    String[] cadenaArray = cadena.split(" ");

    Stream.of(cadenaArray).sorted().forEach(System.out::println);
  }
}
