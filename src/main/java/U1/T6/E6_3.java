package U1.T6;

import java.util.Scanner;

public class E6_3 {
  public static void main(String[] args) {
    // Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1 si
    // ese número es par o el valor 0 si no es par. Hazlo primero con un "if" y luego con un
    // "operador condicional".
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número entero");
    int num = teclado.nextInt();
    int par;
    // con if
    if ((num % 2) == 0) {
      par = 1;
    } else {
      par = 0;
    }
  }
}
