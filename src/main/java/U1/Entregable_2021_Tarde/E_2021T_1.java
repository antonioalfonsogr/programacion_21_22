package U1.Entregable_2021_Tarde;

import java.util.Scanner;

public class E_2021T_1 {
  public static void main(String[] args) {
    // Realiza un programa que pinte por pantalla un rombo hueco hecho con
    // asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
    // sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
    // mensaje de error y volverlo a pedir hasta que sea correcto.
    // Ejemplo:
    // Por favor, introduzca la altura del rombo: 5
    //   *
    //  * *
    // *   *
    //  * *
    //   *

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca la altura");
    int altura = teclado.nextInt();

    while (altura < 3 || altura % 2 == 0) {
      System.out.println("ERROR: la altura debe ser un número impar mayor que 3");
      System.out.println("Introduzca de nuevo la altura");
      altura = teclado.nextInt();
    }

    for (int i = 0; i <= altura / 2; i++) {
      for (int j = 0; j < altura; j++) {

        if ((j == (altura / 2) - i) || (j == (altura / 2) + i)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = 0; i < altura / 2; i++) {
      for (int j = 0; j < altura; j++) {

        if (j == 1 + i || j == (altura - 2) - i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
