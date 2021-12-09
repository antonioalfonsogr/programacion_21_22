package U3.Entregable_U3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
  public static void main(String[] args) {
    // Realiza un programa que muestre por pantalla un array bidimensional con tantas filas y
    // columnas como indique el usuario. Deberá rellenarse la matriz con números aleatorios entre 14
    // y 78 (ambos incluidos).
    // A continuación, el programa debe insertar en un array pares los números que se encuentran en
    // la intersección de las filas pares con las columnas pares. Se hace lo mismo para el array
    // impares con los números que se encuentran en la intersección de las filas impares con las
    // columnas impares.
    // Finalmente se debe mostrar la matriz de números, el array de números pares, el de números
    // impares, y la suma, media y máximo y mínimo de cada uno de los arrays pares e impares.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el número de filas:");
    int filas = sc.nextInt();

    System.out.println("Introduzca el número de columnas:");
    int columnas = sc.nextInt();

    int[][] matriz = new int[filas][columnas];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = (int) (14 + Math.random() * 65);
      }
    }

    System.out.println("Matriz:");
    for (int[] fila : matriz) {
      System.out.println(Arrays.toString(fila));
    }
    System.out.println();

    int[] pares = new int[0];
    int[] impares = new int[0];
    int idpares = 0;
    int idimpares = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (i % 2 == 0 && j % 2 == 0) {
          pares = Arrays.copyOf(pares, pares.length + 1);
          pares[idpares] = matriz[i][j];
          idpares++;
        }
        if (i % 2 != 0 && j % 2 != 0) {
          impares = Arrays.copyOf(impares, impares.length + 1);
          impares[idimpares] = matriz[i][j];
          idimpares++;
        }
      }
    }

    System.out.println("Pares:");
    System.out.println(Arrays.toString(pares));
    System.out.println();

    System.out.println("Impares:");
    System.out.println(Arrays.toString(impares));
    System.out.println();

    int sumaPares = 0;
    int sumaImpares = 0;
    double mediaPares;
    double mediaImpares;
    int maximoPares = 0;
    int minimoPares = 78;
    int maximoImpares = 0;
    int minimoImpares = 78;

    for (int pare : pares) {
      sumaPares = sumaPares + pare;
      if (pare > maximoPares) maximoPares = pare;
      if (pare < minimoPares) minimoPares = pare;
    }
    mediaPares = sumaPares / (float) pares.length;

    for (int impare : impares) {
      sumaImpares = sumaImpares + impare;
      if (impare > maximoImpares) maximoImpares = impare;
      if (impare < minimoImpares) minimoImpares = impare;
    }
    mediaImpares = sumaImpares / (float) impares.length;

    System.out.println("Suma de pares: " + sumaPares);
    System.out.println("Suma de impares: " + sumaImpares);
    System.out.println("Media de pares: " + mediaPares);
    System.out.println("Media de impares: " + mediaImpares);
    System.out.println("Máximo de pares: " + maximoPares);
    System.out.println("Mínimo de pares: " + minimoPares);
    System.out.println("Máximo de impares: " + maximoImpares);
    System.out.println("Mínimo de impares: " + minimoImpares);
  }
}
