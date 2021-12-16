package U3.Examen_U3;

import java.util.Arrays;

public class Ej2 {
  public static void main(String[] args) {
    // Realiza un programa que genere 10 números aleatorios entre 12 y 89 y que los almacene en un
    // array. A continuación, se mostrará el contenido de ese array junto al índice (0 – 9)
    // utilizando para ello otro array adicional (o bien utilizando originalmente un array
    // bidimensional, como se prefiera). Seguidamente el programa pasará los números pares a las
    // primeras posiciones, conservando el orden, desplazando el resto de números (los impares) de
    // tal forma que no se pierda ninguno y se conserve el orden entre ellos. Al final se debe
    // mostrar el array resultante junto con el índice.
    //
    // Ejemplo:
    //
    // Array original:
    // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    // [54, 63, 83, 47, 13, 69, 63, 80, 56, 47]
    //
    // Array nuevo:
    // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    // [54, 80, 56, 63, 83, 47, 13, 69, 63, 47]

    int[] indices = new int[10];
    int[] original = new int[10];

    for (int i = 0; i < indices.length; i++) {
      indices[i] = i;
    }

    for (int i = 0; i < original.length; i++) {
      original[i] = (int) (12 + Math.random() * 78);
    }

    System.out.println("Array original:");
    System.out.println(Arrays.toString(indices));
    System.out.println(Arrays.toString(original));
    System.out.println();

    int[] nuevo = new int[10];
    int[] pares = new int[0];
    int[] impares = new int[0];
    int idPares = 0;
    int idImpares = 0;

    for (int j : original) {
      if (esPar(j)) {
        pares = Arrays.copyOf(pares, pares.length + 1);
        pares[idPares] = j;
        idPares++;
      } else {
        impares = Arrays.copyOf(impares, impares.length + 1);
        impares[idImpares] = j;
        idImpares++;
      }
    }

    System.arraycopy(pares, 0, nuevo, 0, pares.length);
    idImpares = 0;
    for (int i = pares.length; i < nuevo.length; i++) {
      nuevo[i] = impares[idImpares];
      idImpares++;
    }

    System.out.println("Array nuevo:");
    System.out.println(Arrays.toString(indices));
    System.out.println(Arrays.toString(nuevo));
  }

  public static boolean esPar(int num) {
    return num % 2 == 0;
  }
}
