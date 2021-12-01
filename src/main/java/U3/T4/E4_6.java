package U3.T4;

import java.util.Arrays;

public class E4_6 {
  public static void main(String[] args) {
    // Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
    // positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá
    // dar la posición tanto del máximo como del mínimo.
    //
    // NOTA IMPORTANTE: Los números no pueden repetirse.

    int[][] matriz = new int[6][10];
    boolean repetido;
    int numRandom;
    int min = 1000;
    int max = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        numRandom = (int) (Math.random() * 1001);
        repetido = false;
        for (int k = 0; k < matriz.length; k++) {
          for (int l = 0; l < matriz[k].length; l++) {
            if (numRandom == matriz[k][l]) {
              repetido = true;
              break;
            }
          }
        }
        if (repetido) {
          if (j > 0) {
            j--;
            }else i--;
        } else {
          matriz[i][j] = numRandom;
          if (numRandom < min) min = numRandom;
          if (numRandom > max) max = numRandom;
        }
      }
    }
    for (int[] fila : matriz) {
      System.out.println(Arrays.toString(fila));
    }

    String posMin = "";
    String posMax = "";

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (min == matriz[i][j]) posMin = "["+i + "] [" + j + "]";
        if (max == matriz[i][j]) posMax = "["+i + "] [" + j + "]";
      }
    }
    System.out.println("El máximo esta en la posición " + posMax);
    System.out.println("El mínimo esta en la posición " + posMin);
  }
}
