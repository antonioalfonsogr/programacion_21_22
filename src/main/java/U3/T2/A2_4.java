package U3.T2;

import java.util.Scanner;

public class A2_4 {
  public static void main(String[] args) {
    // Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique
    // cuántos espacios en blanco tiene.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca una frase:");
    String frase = sc.nextLine();

    int contador = 0;

    for (int i = 0; i < frase.length(); i++) {
      char caracter = frase.charAt(i);
      if (caracter == ' ') contador++;
    }

    System.out.println("la frase tiene " + contador + " espacios.");
  }
}
