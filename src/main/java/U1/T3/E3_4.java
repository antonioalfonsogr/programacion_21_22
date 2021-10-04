package U1.T3;

import java.util.Scanner;

// Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su
// equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km).

public class E3_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Intruduzca longitud en millas");
    float num1 = teclado.nextFloat();
    double num2 = num1 * 1.609;
    System.out.println(num1 + " millas son " + num2 + " kilometos");
  }
}
