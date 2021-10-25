package U1.U1_Entregable;

import java.util.Scanner;

public class Ej1 {
  public static void main(String[] args) {
    // Dibuja por pantalla la palabra MY (en mayúsculas) hechas de asteriscos separadas por 4
    // espacios. La anchura y altura de cada una de las letras deberá ser la misma. Se solicitará al
    // usuario una altura que deberá siempre impar y mayor que 3. En caso de que el usuario no
    // introduzca un valor correcto, se pedirá de nuevo la altura.

    Scanner teclado = new Scanner(System.in);

    int altura;

    do {
      System.out.println("Introduzca una altura:");
      altura = teclado.nextInt();
    } while (altura < 3 || altura % 2 == 0);

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < (altura * 3) - 2; j++) {
        if (j == 0 || j == 4 || i == j && i == (altura / 2)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
