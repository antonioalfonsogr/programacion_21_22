package U1.T5;

import java.util.Scanner;

// Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los
// tres.

public class E5_5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el primer número");
    long num1 = teclado.nextLong();
    System.out.println("Introduzca el segundo número");
    long num2 = teclado.nextLong();
    System.out.println("Introduzca el tercer número");
    long num3 = teclado.nextLong();
    long mayor;
    if (num1 > num2) {
      mayor = num1;
    } else {
      mayor = num2;
    }
    if (num3 > mayor) {
      System.out.println("El número mayor es " + num3);
    } else {
      System.out.println("El número mayor es " + mayor);
    }
  }
}
