package U3.T2;

import java.util.Scanner;

public class A2_3 {
  public static void main(String[] args) {
    // Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición
    // central es o no un espacio.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca una frase:");
    String frase = sc.nextLine();

    char central = frase.charAt(frase.length() / 2);
    if (central == ' ') {
      System.out.println("El carácter central es un espacio");
    } else {
      System.out.println("El carácter central NO es un espacio");
    }
  }
}
