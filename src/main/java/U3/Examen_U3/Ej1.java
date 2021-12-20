package U3.Examen_U3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
  public static void main(String[] args) {
    // Crea una función con la siguiente cabecera:
    //
    // public static boolean esPuntoDeSilla(int x[][], int i, int j)
    // Que devuelve true si un número en una determinada posición de una matriz, es punto de silla.
    // El punto de silla cumple la condición de ser el mínimo en su fila y máximo en su columna.
    //
    // Desde el programa principal se debe pedir al usuario un número de filas y de columnas, y
    // generar una matriz de números enteros aleatorios entre 11 y 1003 con el tamaño introducido
    // por el usuario. Llamará a la función para comprobar si cada uno de sus elementos es punto de
    // silla.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el número de filas");
    int numFilas = sc.nextInt();

    System.out.println("Introduzca el número de columnas");
    int numColumnas = sc.nextInt();

    int[][] matriz = new int[numFilas][numColumnas];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = (int) (11 + Math.random() * 993);
      }
    }

    for (int[] fila : matriz) {
      System.out.println(Arrays.toString(fila));
    }

    System.out.println("Son Punto De Silla: ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (esPuntoDeSilla(matriz, i, j)) {
          System.out.print(matriz[i][j] + " ");
        }
      }
    }
  }

  public static boolean esPuntoDeSilla(int x[][], int i, int j) {

    int max = 10;
    int min = 1004;

    int oi = i;
    int oj = j;

    for (j = 0; j < x[i].length; j++) {
      if (x[i][j] < min) min = x[i][j];
    }
    for (i = 0; i < x.length; i++) {
      if (x[oi][oj] > max) max = x[oi][oj];
    }

    if (x[oi][oj] == max && x[oi][oj] == min) return true;

    return false;
  }
}
