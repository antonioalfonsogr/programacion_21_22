package U1.T8b;

import java.util.Scanner;

public class E8b_4 {
  public static void main(String[] args) {
    // Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y
    // cuántos son negativos.

    Scanner teclado = new Scanner(System.in);

    int num = 0;
    int contadorNumPositivos = 0;
    int contadorNumNegativos = 0;

    for (int i = 0; i < 10; i++) {

      System.out.println("Escriba un número");
      num = teclado.nextInt();

      if (num > 0) {
        contadorNumPositivos++;
      } else if (num < 0) {
        contadorNumNegativos++;
      }
    }
    System.out.println(contadorNumPositivos + " números positivos");
    System.out.println(contadorNumNegativos + " números negativos");
  }
}
