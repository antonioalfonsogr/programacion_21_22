package U1.U1_Entregable;

import java.util.Scanner;

public class Ej2 {
  public static void main(String[] args) {
    // Escribe un programa que solicite al usuario los siguientes números:
    // Un número entero positivo
    // Un número entre 0 y 2 (ambos inclusive)
    // Una vez introducidos los dos números nos debe construir un número saltando las cifras según
    // indique el segundo número.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número: ");
    long num = sc.nextLong();
    int salto = 0;

    do {
      System.out.println("Introduzca el salto: ");
      salto = sc.nextInt();
    } while (salto < 0 || salto > 2);

    long cociente = num;
    long invertido = 0;

    while (cociente != 0) {
      invertido = invertido * 10 + cociente % 10;
      cociente = cociente / 10;
    }

    cociente = invertido;
    num = 0;
    int a_saltar = 0;

    while (cociente != 0) {
      if (a_saltar == 0) {
        num = num * 10 + cociente % 10;
        cociente = cociente / 10;
        a_saltar = salto;
      } else {
        cociente = cociente / 10;
        a_saltar--;
      }
    }

    System.out.println("Resultado = " + num);
  }
}
