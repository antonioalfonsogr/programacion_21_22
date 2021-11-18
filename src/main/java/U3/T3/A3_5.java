package U3.T3;

import java.util.Arrays;

public class A3_5 {
  public static void main(String[] args) {
    // Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar.
    // Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos tablas en una
    // tercera, de forma que los 12 números sigan ordenados. Fusionar significa copiar en el orden
    // correcto para que los datos resultantes continúen ordenados sin necesidad de volver a
    // realizar una ordenación.

    int[] ar1 = new int[6];
    int[] ar2 = new int[6];

    fRellenarArray6(ar1);
    fRellenarArray6(ar2);

    Arrays.sort(ar1);
    Arrays.sort(ar2);

    System.out.println(Arrays.toString(ar1));
    System.out.println(Arrays.toString(ar2));

    int contadorAr1 = 0;
    int contadorAr2 = 0;

    int[] arResultado = new int[12];

    int i = 0;
    while (contadorAr1 < 6 && contadorAr2 < 6) {
      if (ar1[contadorAr1] <= ar2[contadorAr2]) {
        arResultado[i] = ar1[contadorAr1];
        contadorAr1++;
      } else {
        arResultado[i] = ar2[contadorAr2];
        contadorAr2++;
      }
      i++;
    }
    if (contadorAr1 == 6) {
      while (i < 12) {
        arResultado[i] = ar2[contadorAr2];
        contadorAr2++;
        i++;
      }
    } else {
      while (i < 12) {
        arResultado[i] = ar1[contadorAr1];
        contadorAr1++;
        i++;
      }
    }

    System.out.println(Arrays.toString(arResultado));
  }

  public static void fRellenarArray6(int[] ar) {

    for (int i = 0; i < 6; i++) {
      ar[i] = (int) (1 + Math.random() * 100);
    }
  }
}
