package U1.T8;

import java.util.Scanner;

public class E8_15 {
  public static void main(String[] args) {
    // Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que
    // sean primos. Un número primo es aquel que sólo es divisible por 1 y por él mismo.

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número");
    int num = teclado.nextInt();
    int contadorPrimos = 0;
    for (int i = 2; i <= num; i++) {
      int contadorDivisible = 0;
      for (int j = 1; j <= i; j++) {

        if (i % j == 0) {
          contadorDivisible++;
          if (contadorDivisible > 2) {
            break;
          }
        }
      }
      if (contadorDivisible == 2) {
        System.out.println(i + "-> primo");
        contadorPrimos++;
      } else {
        System.out.println(i + "-> no primo");
      }
    }
    System.out.println("Entre 1 y " + num + " hay " + contadorPrimos + " números primos");
  }
}
