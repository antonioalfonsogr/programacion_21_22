package U3.Entregable_U3;

import java.util.Arrays;

public class Ej4 {
  public static void main(String[] args) {
    // Desarrollar una función que se denomine insertarFilaEnMatriz. Dicha función tendrá el
    // siguiente prototipo:
    // public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos)
    // Recibirá como parámetro un vector bidimensional de Strings, un array unidimensional de
    // Strings y una posición. Devolverá como resultado un array bidimensional en el que esté
    // insertado como una nueva fila en la matriz el array en la posición que se indica.
    // Se deberá imprimir la matriz antes y después de insertar la fila.
    // NOTA: Las filas de la matriz deben tener el mismo número de elementos. No es necesario
    // comprobarlo, como tampoco es necesario comprobar que la posición pasada es válida, se
    // entenderá que el usuario pasa una posición válida.

    String[][] matriz = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};

    System.out.println("Matriz:");
    for (String[] fila : matriz) {
      System.out.println(Arrays.toString(fila));
    }
    System.out.println();

    System.out.println("Fila: ");
    String[] fila = {"j", "k", "l"};
    System.out.println(Arrays.toString(fila));
    System.out.println();

    int pos = 1;
    System.out.println("pos = " + pos);
    System.out.println();

    System.out.println("El resultado de insertarFilaEnMatriz será:");
    for (String[] fila2 : insertarFilaEnMatriz(matriz, fila, pos)) {
      System.out.println(Arrays.toString(fila2));
    }
  }

  public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {
    String[][] matrizResultado = new String[matriz.length + 1][matriz[0].length];

    int idfila = 0;

    for (int i = 0; i < pos; i++) {
      for (int j = 0; j < matrizResultado[i].length; j++) {
        matrizResultado[i][j] = matriz[i][j];
      }
      idfila++;
    }

    for (int i = 0; i < matrizResultado[pos].length; i++) {
      matrizResultado[pos][i] = fila[i];
    }

    for (int i = idfila + 1; i < matrizResultado.length; i++) {
      for (int j = 0; j < matrizResultado[i].length; j++) {
        matrizResultado[i][j] = matriz[i - 1][j];
      }
    }

    return matrizResultado;
  }
}
