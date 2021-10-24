package U1.Examen_Mañana_Azul_2020;

import java.util.Scanner;

public class E_EMA20_3 {
  public static void main(String[] args) {
    // Realizar un programa que dibuja flechas señalando hacia la izquierda. Se solicitará al
    // usuario la altura de la flecha que deberá ser impar y mayor o igual que tres. En caso de no
    // ser así se seguirá solicitando la altura:
    // El "palito" de la flecha será siempre de 5 caracteres "*"

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca la altura de la flecha: ");
    int altura = teclado.nextInt();

    while (altura < 3 || altura % 2 == 0) {
      System.out.println(
          "ERROR: La altura de la flecha que deberá ser impar y mayor o igual que tres.");
      System.out.println("Introduzca la altura de la flecha: ");
      altura = teclado.nextInt();
    }

    for (int i = 0; i < altura / 2; i++) {
      for (int j = 0; j < (altura / 2) + 1; j++) {

        if (j >= ((altura / 2) - i)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = 0; i < (altura / 2) + 6; i++) {
      System.out.print("*");
    }
    System.out.println();
    for (int i = 0; i < altura / 2; i++) {
      for (int j = 0; j < (altura / 2) + 1; j++) {

        if (j > i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
