package U1.T5II;

import java.util.Scanner;

public class E5II_17 {
  public static void main(String[] args) {
    // Escribe un programa que diga cuál es la primera cifra de un número entero introducido por
    // teclado. Se permiten números de hasta 5 cifras.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número entero de hasta 5 cifras");
    int num = teclado.nextInt();
    if (num < 10 && num > -10) {
      System.out.println("La primera cifra de " + num + " es " + num);
    } else if (num < 100 && num > -100) {
      System.out.println("La primera cifra de " + num + " es " + num / 10);
    } else if (num < 1000 && num > -1000) {
      System.out.println("La primera cifra de " + num + " es " + num / 100);
    } else if (num < 10000 && num > -10000) {
      System.out.println("La primera cifra de " + num + " es " + num / 1000);
    } else if (num < 100000 && num > -100000) {
      System.out.println("La primera cifra de " + num + " es " + num / 10000);
    } else {
      System.out.println(num + " tiene más de 5 cifras");
    }
  }
}
