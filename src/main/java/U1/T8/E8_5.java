package U1.T8;

import java.util.Scanner;

public class E8_5 {
  public static void main(String[] args) {
    // Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A continuación,
    // solicitará por teclado un valor que debe estar dentro del rango. Si no es asi, volverá a
    // solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca el valor mínimo del rango");
    int min = teclado.nextInt();
    System.out.println("Introduzca el valor máximo del rango");
    int max = teclado.nextInt();
    int num;
    do {
      System.out.println("Introduzca un número para comprobar si esta dentro del rango");
      num = teclado.nextInt();
      if (num >= min && num <= max) {
        System.out.println(num + " esta dentro del rango");
      }
    } while (!(num >= min && num <= max));
  }
}
