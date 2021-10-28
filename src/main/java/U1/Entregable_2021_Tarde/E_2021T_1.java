package U1.Entregable_2021_Tarde;

import java.util.Scanner;

public class E_2021T_1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca la altura");
    int altura = sc.nextInt();

    while (altura < 3 || altura % 2 == 0) {
      System.out.println("ERROR: La altura debe ser un entero impar mayor que 3");
      System.out.println("introduzca de nuevo la altura");
      altura = sc.nextInt();
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
