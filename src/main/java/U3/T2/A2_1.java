package U3.T2;

import java.util.Scanner;

public class A2_1 {
  public static void main(String[] args) {
    // Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca la primera palabra");
    String palabra1 = sc.next();

    System.out.println("Introduzca la segunda palabra");
    String palabra2 = sc.next();

    if (palabra1.length() < palabra2.length()) {
      System.out.println("La palabra más corta es " + palabra1);
    } else if (palabra1.length() > palabra2.length()) {
      System.out.println("La palabra más corta es " + palabra2);
    } else {
      System.out.println(palabra1 + " y " + palabra2 + " Tienen la misma longitud");
    }
  }
}
