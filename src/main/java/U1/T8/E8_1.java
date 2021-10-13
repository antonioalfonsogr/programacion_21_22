package U1.T8;

import java.util.Scanner;

public class E8_1 {
  public static void main(String[] args) {
    // Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es
    // positivo, y su cuadrado. El proceso terminará cuando el número introducido por teclado sea 0.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca los números uno a uno, para finalizar introduzca 0");
    int num;
    do {
      num = teclado.nextInt();
      if (num % 2 == 0) {
        System.out.print(num + " es par,");
      } else {
        System.out.print(num + " es impar,");
      }
      if (num > 0) {
        System.out.print(" es positivo,");
      } else if (num < 0) {
        System.out.print(" es negativo,");
      }
      System.out.println(" su cuadrado es " + num * num + ".");
    } while (num != 0);
  }
}
