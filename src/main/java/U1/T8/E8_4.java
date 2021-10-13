package U1.T8;

import java.util.Scanner;

public class E8_4 {
  public static void main(String[] args) {
    // Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número entero positivo");
    int num = teclado.nextInt();
    for (int i = 1; i <= num; i++) {
      //
      System.out.println(i);
    }
  }
}
