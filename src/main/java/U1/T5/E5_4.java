package U1.T5;

import java.util.Scanner;

// Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.

public class E5_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el primer número");
    int num1 = teclado.nextInt();
    byte pares = 0;
    if ((num1 % 2) == 0) {
      pares++;
    }
    System.out.println("Introduzca el segundo número");
    int num2 = teclado.nextInt();
    if ((num2 % 2) == 0) {
      pares++;
      System.out.println("Ha introducido " + pares + " números pares");
    } else {
      System.out.println("Ha introducido " + pares + " números pares");
    }
  }
}
