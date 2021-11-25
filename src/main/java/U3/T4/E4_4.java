package U3.T4;

import java.util.Scanner;

public class E4_4 {
  public static void main(String[] args) {
    // Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
    // podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el
    // alfil se mueve siempre en diagonal. El tablero cuenta con64 casillas. Las columnas se indican
    // con las letras de la “a” a la “h” y las filas se indican del 1 al 8.

    Scanner sc = new Scanner(System.in);

    int[][] tablero = new int[8][8];

    System.out.println("Introduzca la posición del alfil:");
    //   String posicionIntroducida = sc.next();

    int letra = sc.nextInt();
    int numero = sc.nextInt();

    for (int i = letra; i < 8; i++) {
      for (int j = numero; j < 8; j++) {}
    }
  }
}
