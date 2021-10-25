package U1.U1_Entregable;

import java.util.Scanner;

public class Ej4 {
  public static void main(String[] args) {
    // Realiza un programa que solicite al usuario un número entero positivo con una cantidad de 6
    // cifras exactamente. Si el número no tiene esa cantidad de cifras, se vuelve a pedir el número
    // hasta que sea de 6 cifras.
    // Una vez tengamos el número se deberá comprobar si el número compuesto por las tres primeras
    // cifras es primo. Lo mismo para el número compuesto por las tres últimas cifras. Se deberá
    // mostrar un mensaje por pantalla tanto si es primo como si no lo es. Si al partir el número,
    // se comienza en 0, se considera que el número es el entero que se obtendría. Abajo se muestra
    // un ejemplo del mismo.

    Scanner teclado = new Scanner(System.in);

    int num;

    do {
      System.out.println("Introduzca un número de 6 cifras:");
      num = teclado.nextInt();
    } while (num <= 100000 || num > 999999);

    int numUltimos = 0;
    int cociente = num;
    int resto = 0;
    int contador = 0;

    for (int i = 0; cociente > 1000; i++) {
      resto = cociente % 10;
      cociente = cociente / 10;
      numUltimos = (int) (numUltimos + resto * Math.pow(10, contador));
      contador++;
    }

    int numPrimeros = (num - numUltimos) / 1000;

    int contadorDivisible = 0;

    for (int i = 1; i <= numPrimeros; i++) {
      if (numPrimeros % i == 0) {
        contadorDivisible++;
      }
    }
    if (contadorDivisible == 2) {
      System.out.println(numPrimeros + " - Es un numero primo");
    } else {
      System.out.println(numPrimeros + " - No es un numero primo");
    }

    contadorDivisible = 0;

    for (int i = 1; i <= numUltimos; i++) {
      if (numUltimos % i == 0) {
        contadorDivisible++;
      }
    }
    if (contadorDivisible == 2) {
      System.out.println(numUltimos + " - Es un numero primo");
    } else {
      System.out.println(numUltimos + " - No es un numero primo");
    }
  }
}
