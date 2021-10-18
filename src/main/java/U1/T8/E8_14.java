package U1.T8;

import java.util.Scanner;

public class E8_14 {
  public static void main(String[] args) {
    // Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para
    // ello asteriscos (*). Por ejemplo, para n=4:

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el número del lado del triangulo");
    int lado = teclado.nextInt();

    for (int i = lado; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
