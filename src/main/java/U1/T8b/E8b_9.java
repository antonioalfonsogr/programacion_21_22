package U1.T8b;

import java.util.Scanner;

public class E8b_9 {
  public static void main(String[] args) {
    // Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa
    // pedirá la altura. El palo horizontal de la L tendrá una longitud de la mitad (división entera
    // entre 2) de la altura más uno.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca la altura");
    int altura = teclado.nextInt();

    for (int i = 0; i < altura - 1; i++) {
      System.out.println("*");
    }
    for (int i = 0; i < ((altura / 2) + 1); i++) {
      System.out.print("*");
    }
  }
}
