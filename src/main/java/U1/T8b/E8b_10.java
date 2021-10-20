package U1.T8b;

import java.util.Scanner;

public class E8b_10 {
  public static void main(String[] args) {
    // Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa
    // pedirá la altura. Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en
    // la base para simular la curvatura de las esquinas inferiores.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca la altura");
    int altura = teclado.nextInt();

    for (int i = 0; i < altura - 1; i++) {

      for (int j = 0; j < altura; j++) {

        if (j == 0 || j == (altura - 1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int j = 0; j < altura; j++) {

      if (j == 0 || j == (altura - 1)) {
        System.out.print(" ");
      } else {
        System.out.print("*");
      }
    }
  }
}
