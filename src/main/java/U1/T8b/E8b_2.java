package U1.T8b;

import java.util.Scanner;

public class E8b_2 {
  public static void main(String[] args) {
    // Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
    // números enteros a partir de uno que se introduce por teclado.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número");
    int num = teclado.nextInt();

    for (int i = num; i < (num + 5); i++) {

      System.out.println(i + " " + i * i + " " + i * i * i);
    }
  }
}
