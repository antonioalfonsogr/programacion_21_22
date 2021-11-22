package U3.T3;

import java.util.Arrays;

public class A3_6 {
  public static void main(String[] args) {
    // Implementar una función sinRepetidos() con el prototipo:
    // int[] sinRepetidos(int t[])
    // que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han
    // eliminado los datos repetidos.

    int[] ar = {7, 8, 9, 9, 6, 3, 9};
    int[] arSinRepetidos;

    arSinRepetidos = sinRepetidos(ar);
    System.out.println(Arrays.toString(arSinRepetidos));
  }

  public static int[] sinRepetidos(int[] ar) {
    int[] arSinRepetidos = new int[0];

    boolean noRepetido;
    int indNoRepetido = 0;

    for (int i = 0; i < ar.length; i++) {
      noRepetido = true;
      for (int j = 0; j < arSinRepetidos.length; j++) {
        if (ar[i] == arSinRepetidos[j]) {
          noRepetido = false;
          break;
        }
      }
      if (noRepetido) {
        arSinRepetidos = Arrays.copyOf(arSinRepetidos, arSinRepetidos.length + 1);
        arSinRepetidos[indNoRepetido++] = ar[i];
      }
    }
    return arSinRepetidos;
  }
}
