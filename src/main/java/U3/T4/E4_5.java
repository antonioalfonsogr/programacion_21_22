package U3.T4;

import java.util.Arrays;

public class E4_5 {
  public static void main(String[] args) {
    // Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con
    // números aleatorios entre 200 y 300. A continuación, el programa debe mostrar los números de
    // la diagonal que va desde la esquinas superior izquierda a la esquina inferior derecha, así
    // como el máximo, el mínimo y la media de los números que hay en esa diagonal.

    int[][] matriz = new int[10][10];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = (int) (200 + Math.random() * 101);
      }
    }
    for (int[] fila : matriz) {
      System.out.println(Arrays.toString(fila));
    }
    System.out.println();

    int[] diagonal = new int[matriz.length];

    int x = 0;
    int y = 0;

    for (int i = 0; i < diagonal.length; i++) {
      diagonal[i] = matriz[x][y];
      x++;
      y++;
    }

    int max = 200;
    int min = 300;
    int suma = 0;

    for (int j : diagonal) {
      if (j > max) max = j;
      if (j < min) min = j;
      suma = suma + j;
    }

    System.out.println(Arrays.toString(diagonal));
    System.out.println();
    System.out.println("El máximo es: " + max);
    System.out.println("El mínimo es: " + min);
    System.out.println("La media es: " + suma / diagonal.length);
  }
}
