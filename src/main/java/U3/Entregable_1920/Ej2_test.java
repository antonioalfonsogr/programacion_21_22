package U3.Entregable_1920;

import java.util.Arrays;

public class Ej2_test {
  public static void main(String[] args) {

    int[][] matriz = new int[4][5];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = (int) (Math.random() * 10);
      }
      System.out.println(Arrays.toString(matriz[i]));
    }
    matriz = Arrays.copyOf(matriz, matriz.length + 1);
    matriz[matriz.length - 1] = new int[5];

    for (int i = 0; i < matriz.length; i++) {
      matriz[i] = Arrays.copyOf(matriz[i], matriz[i].length + 1);
    }

    int sumac;

    for (int i = 0; i < matriz.length; i++) {
      sumac = 0;
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][matriz[i].length - 1] = sumac;
        sumac = sumac + matriz[i][j];
        matriz[matriz.length - 1][j] = matriz[0][j] + matriz[1][j] + matriz[2][j] + matriz[3][j];
      }
    }

    System.out.println();
    for (int[] fila : matriz) {
      System.out.println(Arrays.toString(fila));
    }
  }
}
