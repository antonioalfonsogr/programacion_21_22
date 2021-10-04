package U1.T2;

import java.util.Scanner;

// Crea un programa que calcule y muestre la división de dos números enteros introducidos por el
// usuario.

public class E2_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Intruduzca el primer numero");
    int num1 = teclado.nextInt();
    System.out.println("Intruduzca el siguiente numero");
    int num2 = teclado.nextInt();
    System.out.println("la división de los dos numeros es: " + num1 / num2);
  }
}
