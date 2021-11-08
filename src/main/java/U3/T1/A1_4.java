package U3.T1;

import java.util.Scanner;

// Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los
// dos.

public class A1_4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el primer número");
    int num1 = sc.nextInt();
    sc.nextLine();

    System.out.println("Introduzca el segundo número");
    int num2 = sc.nextInt();

    System.out.println("El mayor es " + fMayor(num1, num2));
  }

  static int fMayor(int num1, int num2) {
    return num1 > num2 ? num1 : num2;
  }
}
