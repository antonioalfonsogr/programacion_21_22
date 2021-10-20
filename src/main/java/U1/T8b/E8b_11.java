package U1.T8b;

import java.util.Scanner;

public class E8b_11 {
  public static void main(String[] args) {
    // Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se
    // debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe
    // mostrar un mensaje de error.

    Scanner teclado = new Scanner(System.in);

    int altura;

    do {
      System.out.println("Introduzca la altura");
      altura = teclado.nextInt();
    } while ((altura < 3) || altura % 2 == 0);

    for (int i = 0; i < altura; i++) {

      for (int j = 0; j < altura; j++) {
        if (j == i || j + i == (altura - 1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
