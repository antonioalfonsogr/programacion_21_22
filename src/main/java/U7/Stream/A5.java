package U7.Stream;

import java.util.Scanner;
import java.util.stream.Stream;

public class A5 {
  public static void main(String[] args) {
    // Repite la actividad anterior, pero en vez de mostrar por pantalla las palabras, construye una
    // cadena con las palabras de más de tres letras.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca palabras separadas por espacio");

    String cadena = sc.nextLine();

    String[] cadenaArray = cadena.split(" ");

    String mayores3 =
        Stream.of(cadenaArray)
            .sorted()
            .filter(s -> s.length() > 3)
            .reduce("", (a, b) -> a + " " + b);

    System.out.println(mayores3);
  }
}
