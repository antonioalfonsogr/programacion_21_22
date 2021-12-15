package U3.Examen_2021_Mañana_Azul;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
  public static void main(String[] args) {
    // Utilizando vectores bidimensionales en la función, realizar la siguiente función para un
    // juego
    // de ajedrez:
    // public static boolean jaque(String posRey, String posReina)
    // Y nos devuelva si reina está en posición de jaque al rey.
    // La posiciones que recibe la función son posiciones de ajedrez: a5, h4,c8
    // Para recordar una imagen de un tablero con las posiciones:

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

    System.out.println("Introduzca la posición del rey");
    String posRey = sc.next();

    System.out.println("Introduzca la posición de la reina");
    String posReina = sc.next();

    if (jaque(posRey,posReina)){
      System.out.println("El rey esta en jaque");
    } else System.out.println("El rey NO esta en jaque");
  }

  public static boolean jaque(String posRey, String posReina) {

    String[][] tablero = new String[8][8];
    String letras = "abcdefgh";

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = letras.charAt(j) + String.valueOf(tablero.length - i);
      }
    }

    int xRey = -1, yRey = -1, xReina = -1, yReina = -1;

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        if (tablero[i][j].equals(posRey)) {
          yRey = i;
          xRey = j;
        }
        if (tablero[i][j].equals(posReina)) {
          yReina = i;
          xReina = j;
        }
      }
    }
    if (xRey == xReina || yReina == yRey) return true;

    int incrementoX;
    int incrementoY;

    incrementoX = -1;
    incrementoY = 1;
    String[] movimientosPosiblesd1 = movimientos(tablero, xReina, yReina, incrementoX, incrementoY);

    for (String s : movimientosPosiblesd1) {
      if (s.equalsIgnoreCase(posRey)) return true;
    }

    incrementoX = -1;
    incrementoY = -1;
    String[] movimientosPosiblesd2 = movimientos(tablero, xReina, yReina, incrementoX, incrementoY);

    for (String s : movimientosPosiblesd2) {
      if (s.equalsIgnoreCase(posRey)) return true;
    }

    incrementoX = 1;
    incrementoY = 1;
    String[] movimientosPosiblesd3 = movimientos(tablero, xReina, yReina, incrementoX, incrementoY);

    for (String s : movimientosPosiblesd3) {
      if (s.equalsIgnoreCase(posRey)) return true;
    }

    incrementoX = 1;
    incrementoY = -1;
    String[] movimientosPosiblesd4 = movimientos(tablero, xReina, yReina, incrementoX, incrementoY);

    for (String s : movimientosPosiblesd4) {
      if (s.equalsIgnoreCase(posRey)) return true;
    }

    return false;
  }
  public static String[] movimientos(
          String[][] matriz, int x, int y, int incrementoX, int incrementoY) {
    String[] movimientos = new String[0];
    x = x + incrementoX;
    y = y + incrementoY;

    int i = 0;
    while (x >= 0 && x < matriz.length && y >= 0 && y < matriz.length) {
      movimientos = Arrays.copyOf(movimientos, movimientos.length+1);
      movimientos[i] = matriz[x][y];
      x = x + incrementoX;
      y = y + incrementoY;
      i++;
    }

    return movimientos;
  }
}