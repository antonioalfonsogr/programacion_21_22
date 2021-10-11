package U1.T6;

import java.util.Scanner;

public class E6_4 {
  public static void main(String[] args) {
    // Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor",
    // que tenga el valor del menor de esos dos números. Hazlo primero con un "if" y luego con un
    // "operador condicional".
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el primer número entero");
    byte num1 = teclado.nextByte();
    System.out.println("Introduzca el segundo número entero");
    byte num2 = teclado.nextByte();
    // con if
    byte menor;
    if (num1 > num2) {
      menor = num2;
      System.out.println(menor);
    } else {
      menor = num1;
      System.out.println(menor);
    }
  }
}
