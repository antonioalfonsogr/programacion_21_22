package U1.T5II;

// Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.

import java.util.Scanner;

public class E5II_16 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número entero");
    int num = teclado.nextInt();
    System.out.println("La ultima cifra de " + num + " es " + num % 10);
  }
}
