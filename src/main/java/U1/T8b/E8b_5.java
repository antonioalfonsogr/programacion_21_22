package U1.T8b;

import java.util.Scanner;

public class E8b_5 {
  public static void main(String[] args) {
    // Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
    // El carácter con el que se pinta la pirámide también se debe pedir por teclado.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca la altura de la pirámide");
    int altura = teclado.nextInt();

    System.out.println("Introduzca el carácter con el que pintar la pirámide");
    char caracter = teclado.next().charAt(0);

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < (altura * 2) - 1; j++) {

        if (j >= (((altura) - 1) - i) && j <= (((altura) - 1) + i)) {
          System.out.print(caracter);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
