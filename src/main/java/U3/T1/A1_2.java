package U3.T1;

import java.util.Scanner;

// Diseñar una función a la que se le pasen dos enteros y muestre todos los números comprendidos
// entre ellos.

public class A1_2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el primer número");
    int numInicio = sc.nextInt();

    System.out.println("Introduzca el segundo número");
    int numFin = sc.nextInt();

    comprendidosEntre(numInicio, numFin);
  }

  static void comprendidosEntre(int num1, int num2) {
    for (int i = num1; i <= num2; i++) {
      System.out.println(i);
    }
  }
}
