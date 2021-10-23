package U1.Entregable_1920;

import java.util.Scanner;

public class E_1920_4 {
  public static void main(String[] args) {
    // Crear programa que pinte una flecha doble hacia la izquierda. Se pide al usuario la altura de
    // la figura, que debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
    // de asteriscos es siempre de 5 espacios. Si la altura introducida por el usuario no es un
    // número impar mayor o igual que 3, el programa debe mostrar un mensaje de error.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Intruduzca la altura de la figura");
    int altura = teclado.nextInt();

    if (altura % 2 == 0 || altura < 3) {
      System.out.println("Error, la altura introducida debe ser impar y mayor que 3");
    } else {

      for (int i = 0; i <= altura / 2; i++) {

        for (int j = 0; j <= altura; j++) {

          if (j == (altura / 2 - i) || (j == (altura - i) && i <= altura / 2)) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }

      for (int i = 0; i < altura / 2; i++) {

        for (int j = 0; j <= altura; j++) {

          if (j == (altura / 2 + (i - (altura / 2) + 1))
              || (j == (altura + (i - (altura / 2) + 1)) && i <= altura / 2)) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  }
}
