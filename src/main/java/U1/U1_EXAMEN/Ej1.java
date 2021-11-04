package U1.U1_EXAMEN;

import java.util.Scanner;

public class Ej1 {
  public static void main(String[] args) {
    // Escribe un programa que pinte por pantalla las letras AB. El usuario debe introducir la
    // altura que deberá ser mayor que 3 e impar. Las letras estarán separadas por dos espacios

    Scanner sc = new Scanner(System.in);

    int altura;

    do {
      System.out.println("Introduzca la altura");
      altura = sc.nextInt();
    } while (altura < 3 || altura % 2 == 0);

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura * 2 - 1; j++) {

        if (j == (((altura) - 1) - i)
            || j == (((altura) - 1) + i)
            || ((i == altura - altura / 2) && j >= ((altura) - 1) - i)
                && j <= (((altura) - 1) + i)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      for (int j = 0; j < 2; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < altura; j++) {
        if (((i == 0 && j < altura - 1) || (i == altura / 2 && j < altura - 1))
            || (i == altura - 1 && j < altura - 1)
            || (j == 0)
            || (j == altura - 1 && (i > 0 && i < altura / 2)
                || (j == altura - 1 && (i < altura - 1 && i > altura / 2)))) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
