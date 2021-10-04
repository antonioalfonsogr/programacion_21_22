package U1.T3;

import java.util.Scanner;

// Crea un programa que calcule y muestre la suma de dos números de dos cifras (de tipo byte) que
// introduzca el usuario.

public class E3_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce primer numero a sumar");
    byte num1 = teclado.nextByte();
    System.out.println("Introduce segundo numero a sumar");
    byte num2 = teclado.nextByte();
    int num3 = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + num3);
  }
}
