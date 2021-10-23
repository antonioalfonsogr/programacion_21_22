package U1.Entregable_2021;

import java.util.Scanner;

public class E_2021_2 {
  public static void main(String[] args) {
    // Realizar un programa que dado un número que se solicita la usuario por consola eliminará de
    // ese número de ese número
    // todos los 0 y todos los 8 indicando adicionalmente cuántos números ha eliminado.Deberá
    // solicitar el número mientras que
    // el número introducido no sea positivo.

    Scanner teclado = new Scanner(System.in);

    long num;

    do {

      System.out.println("Introduzca un número entero positivo:");
      num = teclado.nextLong();
    } while (num <= 0);

    long cociente = num;
    double resto;
    long contadorSuprimidos = 0;
    double contadorTotal = 0;
    double numNuevo = 0;

    while (cociente > 0) {

      resto = cociente % 10;
      cociente = cociente / 10;

      if (resto == 0 || resto == 8) {
        contadorSuprimidos++;
      } else {

        numNuevo = numNuevo + (resto * Math.pow(10, contadorTotal));
        contadorTotal++;
      }
    }
    System.out.println("Número resultado: " + (int) numNuevo);
    System.out.println("Dígitos eliminados " + contadorSuprimidos);
  }
}
