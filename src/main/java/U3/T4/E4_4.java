package U3.T4;

import java.util.Arrays;
import java.util.Scanner;

public class E4_4 {
  public static void main(String[] args) {
    // Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
    // podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el
    // alfil se mueve siempre en diagonal. El tablero cuenta con64 casillas. Las columnas se indican
    // con las letras de la “a” a la “h” y las filas se indican del 1 al 8.

    Scanner sc = new Scanner(System.in);

    String[][] tablero = new String[8][8];
    String letras = "abcdefgh";

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = letras.charAt(j) + String.valueOf(tablero.length - i);
      }
    }
    for (String[] fila : tablero) {
      System.out.println(Arrays.toString(fila));
    }

    System.out.println();
    System.out.println("Introduzca la posición del alfil:");
    String posicionIntroducida = sc.next();
    System.out.println();

    int x = -1;
    int y = -1;

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        if (tablero[i][j].equalsIgnoreCase(posicionIntroducida)) {
          x = i;
          y = j;
        }
      }
    }

    int incrementoX;
    int incrementoY;

    incrementoX = -1;
    incrementoY = 1;
    String movimientosPosiblesd1 = movimientos(tablero, x, y, incrementoX, incrementoY);

    incrementoX = -1;
    incrementoY = -1;
    String movimientosPosiblesd2 = movimientos(tablero, x, y, incrementoX, incrementoY);

    incrementoX = 1;
    incrementoY = 1;
    String movimientosPosiblesd3 = movimientos(tablero, x, y, incrementoX, incrementoY);

    incrementoX = 1;
    incrementoY = -1;
    String movimientosPosiblesd4 = movimientos(tablero, x, y, incrementoX, incrementoY);

    String movimientoPosiblesResultado =
        movimientosPosiblesd1
            + movimientosPosiblesd2
            + movimientosPosiblesd3
            + movimientosPosiblesd4;

    System.out.println(
        "El alfil puede moverse a las siguientes posiciones: " + movimientoPosiblesResultado);
  }

  public static String movimientos(
      String[][] matriz, int x, int y, int incrementoX, int incrementoY) {
    String movimientos = "";
    x = x + incrementoX;
    y = y + incrementoY;

    while (x >= 0 && x < matriz.length && y >= 0 && y < matriz.length) {
      movimientos += matriz[x][y] + " ";
      x = x + incrementoX;
      y = y + incrementoY;
    }

    return movimientos;
  }
}
