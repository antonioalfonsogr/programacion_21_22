package U1.T3;

import java.util.Scanner;

public class E3_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Intruduzca Dividendo:");
    double num1 = teclado.nextDouble();
    System.out.println("Intruduzca Divisor:");
    double num2 = teclado.nextDouble();
    double num3 = num1 / num2;
    System.out.println(num1 + " / " + num2 + " = " + num3);
  }
}
