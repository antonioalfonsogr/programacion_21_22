package U3.T1;

import java.util.Scanner;

public class A1_12 {
  public static void main(String[] args) {
    // Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es
    // 1.

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un número");
    int num = sc.nextInt();

    System.out.println(fFactorial(num));
  }

  static int fFactorial(int n) {
    if (n == 1) {
      return 1;
    }
    return fFactorial(n - 1) * n;
  }
}
