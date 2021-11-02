package Entregable1;

import java.util.Scanner;

public class ej4 {
  public static void main(String[] args) {
    // Escribe un programa que pida un número entero positivo por teclado y que
    // muestre a continuación los 5 números consecutivos a partir del número
    // introducido (incluyendo él mismo). Al lado de cada número se debe indicar
    // si se trata de un primo o no.
    //
    // Ejemplo:
    // Por favor, introduzca un número entero positivo: 17
    // 17 es primo
    // 18 no es primo
    // 19 es primo
    // 20 no es primo
    // 21 no es primo

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número entero positivo");
    int num = teclado.nextInt();

    for (int i = 0; i < 5; i++) {
      int contadorDivisible = 0;
      for (int j = 1; j <= num; j++) {

        if (num % j == 0) {
          contadorDivisible++;
        }
      }
      if (contadorDivisible == 2) {
        System.out.println(num + " es primo");
      } else {
        System.out.println(num + " no es primo");
      }

      num++;
    }
  }
}
