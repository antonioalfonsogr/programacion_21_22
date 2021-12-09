package U3.Entregable_U3;

import java.util.Arrays;

public class Ej2 {
  public static void main(String[] args) {
    // Desarrollar una función que se denomine insertarEnVector con el siguiente prototipo:
    // public static int[] insertarEnVector(int[] v1, int [] v2, int pos)
    // Recibirá como parámetros dos vectores de enteros y una posición. Devolverá un vector de
    // enteros que contenga el primer array con el segundo array insertado de manera completa a
    // partir de la posición dada. Si la posición es menor que 0, el vector devuelto deberá contener
    // el primer array. Si la posición es mayor que la longitud del primer array, el vector devuelto
    // deberá contener el segundo array. Si la posición es igual a la longitud del primer array, el
    // vector devuelto deberá contener el primer array con el segundo array insertado al final.
    // Probar dicha función en el método Main.

    int[] v1 = {1, 2, 3, 4, 5, 6};
    int[] v2 = {4, 9, 12, 5, 7};
    int pos = 2;

    System.out.println("v1 = " + Arrays.toString(v1));
    System.out.println("v1 = " + Arrays.toString(v2));
    System.out.println("pos = " + pos);
    System.out.println("El resultado de insertarEnVector será:");
    System.out.println(Arrays.toString(insertarEnVector(v1, v2, pos)));
    System.out.println();

    int[] v3 = {6, 12, 8, 9, 3, 13};
    int[] v4 = {13, 11, 4, 8, 6, 1};
    pos = -1;

    System.out.println("v1 = " + Arrays.toString(v3));
    System.out.println("v1 = " + Arrays.toString(v4));
    System.out.println("pos = " + pos);
    System.out.println("El resultado de insertarEnVector será:");
    System.out.println(Arrays.toString(insertarEnVector(v3, v4, pos)));
    System.out.println();

    int[] v5 = {6, 12, 8, 9, 3, 13};
    int[] v6 = {13, 11, 4, 8, 6, 1};
    pos = 7;

    System.out.println("v1 = " + Arrays.toString(v5));
    System.out.println("v1 = " + Arrays.toString(v6));
    System.out.println("pos = " + pos);
    System.out.println("El resultado de insertarEnVector será:");
    System.out.println(Arrays.toString(insertarEnVector(v3, v4, pos)));
    System.out.println();
  }

  public static int[] insertarEnVector(int[] v1, int[] v2, int pos) {
    int[] vr = new int[v1.length + v2.length];

    if (pos < 0) return v1;
    if (pos > v1.length) return v2;

    int idV1 = 0;
    int idV2 = 0;

    for (int i = 0; i < pos; i++) {
      vr[i] = v1[idV1];
      idV1++;
    }
    for (int i = pos; i < v2.length + pos; i++) {
      vr[i] = v2[idV2];
      idV2++;
    }
    for (int i = pos + v2.length; i < vr.length; i++) {
      vr[i] = v1[idV1];
      idV1++;
    }

    return vr;
  }
}
