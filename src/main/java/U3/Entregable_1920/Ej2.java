package U3.Entregable_1920;

import java.util.Arrays;

public class Ej2 {
  public static void main(String[] args) {
    // Escribe un programa que pida 20 números enteros. Estos números se deben
    // introducir en un array de 4 filas por 5 columnas. El programa mostrará las
    // sumas parciales de filas y columnas igual que si de una hoja de cálculo se
    // tratara. La suma total debe aparecer en la esquina inferior derecha.

    int[][] matriz = new int[4][5];
    int[][] matrizResultado;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = (int) (Math.random() * 10);
      }
    }
    for (int[] fila : matriz) {
      System.out.println(Arrays.toString(fila));
    }
    System.out.println();

    matrizResultado = Arrays.copyOf(matriz, matriz.length + 1);
    matrizResultado[matrizResultado.length - 1] = new int[matriz[0].length + 1];

    for (int i = 0; i < matriz.length; i++) {
      matrizResultado[i] = Arrays.copyOf(matriz[i], matrizResultado.length + 1);
    }
    int suma;

    for (int i = 0; i < matrizResultado[0].length; i++) {

      matrizResultado[4][i] =
              matrizResultado[0][i]
                      + matrizResultado[1][i]
                      + matrizResultado[2][i]
                      + matrizResultado[3][i];
    }

    for (int i = 0; i < matrizResultado.length; i++) {
      suma = 0;
      for (int j = 0; j < matrizResultado[i].length-1; j++) {
        suma = suma + matrizResultado[i][j];
        matrizResultado[i][5] = suma;
      }
    }

    for (int[] fila : matrizResultado) {
      System.out.println(Arrays.toString(fila));
    }
    }
  }

