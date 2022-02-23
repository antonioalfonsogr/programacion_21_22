package U5.T3.A1;

import java.util.Arrays;
import java.util.Comparator;

public class A1 {

  public static void main(String[] args) {
    // Crear una tabla de 20 números Integer aleatorios entre 1 y 100. Implementar un comparador que
    // ordene los números en orden decreciente. Utilizarlo para ordenar en sentido decreciente la
    // tabla de enteros.

    Integer[] tabla20 = new Integer[20];

    for (int i = 0; i < tabla20.length; i++) {
      tabla20[i] = (int) (1 + Math.random() * 99);
    }

    System.out.println(Arrays.toString(tabla20));
    System.out.println();

    Arrays.sort(
        tabla20,
        new Comparator() {
          @Override
          public int compare(Object o, Object t1) {
            if (!(o instanceof Integer)) return 0;
            if (!(t1 instanceof Integer)) return 0;
            Integer num1 = (Integer) o;
            Integer num2 = (Integer) t1;
            return num2 - num1;
          }
        });

    System.out.println(Arrays.toString(tabla20));
  }
}
