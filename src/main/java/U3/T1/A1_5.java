package U3.T1;

import java.util.Scanner;

public class A1_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el primer número");
    int num1 = sc.nextInt();

    System.out.println("Introduzca el segundo número");
    int num2 = sc.nextInt();

    System.out.println("Introduzca el tercer número");
    int num3 = sc.nextInt();

    System.out.println("El mayor es " + fMayor(fMayor(num1, num2), num3));
  }

  static int fMayor(int num1, int num2) {
    return num1 > num2 ? num1 : num2;
  }
}
