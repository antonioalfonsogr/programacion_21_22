package U3.T2;

import java.util.Scanner;

public class A2_2 {
  public static void main(String[] args) {
    // Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las
    // palabras introducidas con espacios en blanco. Terminar de leer la frase cuando la palabra
    // introducida sea "fin" escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
    // "fin" no aparecerá en la frase final.

    Scanner sc = new Scanner(System.in);
    String frase = "";
    String palabra;

    System.out.println("Introduzca la primera palabra para la frase:");
    palabra = sc.next();

    while (!palabra.equalsIgnoreCase("fin")) {
      frase = frase + palabra + (" ");
      System.out.println("Introduzca la siguiente palabra para la frase:");
      palabra = sc.next();
    }
    System.out.println(frase);
  }
}
