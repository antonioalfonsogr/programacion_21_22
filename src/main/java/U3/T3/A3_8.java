package U3.T3;

import java.util.Arrays;

public class A3_8 {
  public static void main(String[] args) {
    // Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición
    // [n,m] debe contener n+m. Después, se debe mostrar su contenido.

    int[][] ar = new int[5][5];

    for (int i = 0; i < ar.length; i++) {
      for (int j = 0; j < ar[0].length; j++) {
        ar[i][j] = i + j;
      }
    }
    System.out.println(Arrays.deepToString(ar));
  }
}
