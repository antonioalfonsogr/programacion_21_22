package U7.T1;

import java.util.ArrayList;
import java.util.Collections;

public class A2 {
  public static void main(String[] args) {
    // Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.

    ArrayList<Integer> lista20menores100 = new ArrayList<>();

    for (int i = 0; i < 20; i++) {
      lista20menores100.add((int) (Math.random() * 100));
    }

    System.out.println(lista20menores100);

    Collections.sort(lista20menores100);
    Collections.reverse(lista20menores100);

    System.out.println(lista20menores100);
  }
}
