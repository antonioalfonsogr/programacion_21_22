package U1.T4;

import java.util.Scanner;

public class E4_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Intruduzca primera nota");
    byte nota1Byte = teclado.nextByte();
    System.out.println("Intruduzca segunda nota");
    byte nota2Byte = teclado.nextByte();
    float nota1Float = nota1Byte;
    float nota2Float = nota2Byte;
    float notam = (nota1Float + nota2Float) / 2;
    System.out.println("La nota media es: " + notam);
  }
}
