package U3.Entregable_1920;

import java.util.Arrays;

public class Ej2 {
  public static void main(String[] args) {
    // Escribe un programa que pida 20 números enteros. Estos números se deben
    // introducir en un array de 4 filas por 5 columnas. El programa mostrará las
    // sumas parciales de filas y columnas igual que si de una hoja de cálculo se
    // tratara. La suma total debe aparecer en la esquina inferior derecha.

    int[][] matriz = new int[4][5];
    int[][] matrizResultado = new int[0][0];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = (int) (Math.random() * 100);
      }
    }
    for (int[] fila : matriz) {
      System.out.println(Arrays.toString(fila));
    }
    for (int i = 0; i < 4; i++) {
 matrizResultado=Arrays.copyOf(matriz,matriz.length + 1);
    }
    
  }
}
