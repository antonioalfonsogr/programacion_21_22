package U1.T8;

import java.util.Scanner;

public class E8_8 {
  public static void main(String[] args) {
    // Pedir un número y calcular su factorial.

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número");
    int num = teclado.nextInt();
    int resultado = 1;
    System.out.print(num + "! = ");
    for (int i = 1; i <= num; i++) {
      resultado = resultado * i;
    }
    System.out.println(resultado);
  }
}
