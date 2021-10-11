package U1.T7;

import java.util.Scanner;

public class E7_1 {
  public static void main(String[] args) {
    // Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el primer número entero");
    byte a = teclado.nextByte();
    System.out.println("Introduzca el segundo número entero");
    byte b = teclado.nextByte();
    byte aux;
    aux = a;
    a = b;
    b = aux;
    System.out.println(a);
    System.out.println(b);
  }
}
