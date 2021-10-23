package U1.Entregable_2021;

import java.util.Scanner;

public class E_2021_1 {
  public static void main(String[] args) {
    // Escribe un programa que pinte por pantalla un par de calcetines, de los que se ponen al lado
    // del árbol de Navidad para que Papá Noel deje sus regalos.
    // El usuario debe introducir la altura. Suponemos que el usuario introduce una altura mayor o
    // igual a 4. Observa que la talla de los calcetines y la distancia
    // que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca la altura de los calcetines");
    int altura = teclado.nextInt();

    for (int i = 0; i < altura - 2; i++) {
      for (int j = 0; j < 12; j++) {
        if (j < 3 || (j > 6 && j < 10)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 12; j++) {
        if (j < 5 || j > 6) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
