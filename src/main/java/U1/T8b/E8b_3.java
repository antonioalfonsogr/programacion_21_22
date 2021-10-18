package U1.T8b;

import java.util.Scanner;

public class E8b_3 {
  public static void main(String[] args) {
    // Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
    // término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
    // anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,
    // 89, 144... El número n se debe introducir por teclado.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número");
    int num = teclado.nextInt();

    int a = 0;
    int b = 1;
    int c;

    System.out.print(a + ", " + b);

    for (int i = 0; i < num; i++) {
      a = a + b;
      b = a;
      System.out.print(", " + a);
    }
  }
}
