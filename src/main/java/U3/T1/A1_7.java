package U3.T1;

import java.util.Scanner;

// Diseñar una función que nos diga si un número es primo.

public class A1_7 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número");
    int num = sc.nextInt();

    if (fEsPrimo(num)) {
      System.out.println(num + " es primo");
    } else {
      System.out.println(num + " NO es primo");
    }
  }

  public static boolean fEsPrimo(int num) {

    boolean esPrimo = true;

    for (int i = 2; i < num; i++) {

      if (num % i == 0) {
        esPrimo = false;
        break;
      }
    }
    return esPrimo;
  }
}
