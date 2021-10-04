package U1.T3;

import java.util.Scanner;

// Crea un programa que pida al usuario su año de nacimiento y el año actual (usando datos de tipo
// short) y halle la diferencia de ambos para obtener su edad.

public class E3_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Intruduce tu año de nacimiento");
    short num1 = teclado.nextShort();
    System.out.println("Intruduce el año actual");
    short num2 = teclado.nextShort();
    int num3 = num2 - num1;
    System.out.println("Tienes " + num3 + " años");
  }
}
