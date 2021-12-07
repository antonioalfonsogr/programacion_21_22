package U3.Entregable_2021_Tarde;

import java.util.Arrays;

public class Ej1 {
  public static void main(String[] args) {
    // Crea la función filtraPrimos que:
    // Recibe un array de enteros
    // Devuelve un array de enteros con todos los primos que se encuentran en el array origen
    // Obviamente el tamaño del array  que se devuelve será de una longitud menor o igual al que se
    // pasa como parámetro. Para facilitar el ejercicio aunque un número primo se repita lo
    // añadiremos al vector. Si no existe ningún número primo en el vector original, se devuelve un
    // array con el número -1 como único elemento.

    int[] matriz = new int[10];

    for (int i = 0; i < matriz.length; i++) {
      matriz[i] = (int) (Math.random() * 100);
    }

    System.out.println(Arrays.toString(matriz));
    System.out.println(Arrays.toString(filtrarPrimos(matriz)));
  }

  public static boolean esPrimo(int num) {
    boolean esPrimo = true;
    for (int i = 2; i < num; i++) {
      if (num % 2 == 0) {
        esPrimo = false;
        break;
      }
    }
    return esPrimo;
  }

  public static int[] filtrarPrimos(int[] matriz) {
    int[] matrizPrimos = new int[0];
    int idMatrizPrimos = 0;

    for (int i = 0; i < matriz.length; i++) {
      if (esPrimo(matriz[i]) && i > 1) {
        matrizPrimos = Arrays.copyOf(matrizPrimos, matrizPrimos.length + 1);
        matrizPrimos[idMatrizPrimos] = matriz[i];
        idMatrizPrimos++;
      }
    }

    if (matrizPrimos.length == 0) {
      matrizPrimos = Arrays.copyOf(matrizPrimos, matrizPrimos.length + 1);
      matrizPrimos[0] = -1;
    }

    return matrizPrimos;
  }
}
