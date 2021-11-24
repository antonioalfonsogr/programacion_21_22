package U3.T3;

import java.util.Arrays;

public class A3_9 {
  public static void main(String[] args) {
    // Definir una función que tome como parámetros dos tablas, la primera con 6 números de una
    // apuesta de la primitiva, y la segunda con los 6 números de la combinación ganadora. La
    // función devolverá el número de aciertos.

    int[] apuestaPrimitiva = new int[6];
    int[] combinacionGanadora = new int[6];

    fRellenarArray6(apuestaPrimitiva);
    fRellenarArray6(combinacionGanadora);

    System.out.println(Arrays.toString(apuestaPrimitiva));
    System.out.println(Arrays.toString(combinacionGanadora));

    System.out.println(
        "Has tenido " + fnumAciertos(apuestaPrimitiva, combinacionGanadora) + " aciertos");
  }

  public static int fnumAciertos(int[] ar1, int[] ar2) {
    int numAciertos = 0;
    for (int i = 0; i < ar1.length; i++) {
      if (ar1[i] == ar2[i]) numAciertos++;
    }

    return numAciertos;
  }

  public static void fRellenarArray6(int[] ar) {

    for (int i = 0; i < 6; i++) {
      ar[i] = (int) (1 + Math.random() * 10);
    }
  }
}
