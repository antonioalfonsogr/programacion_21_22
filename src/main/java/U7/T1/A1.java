package U7.T1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class A1 {
  public static void main(String[] args) {
    // Crear una colección de 20 números enteros aleatorios menores que 100, y guardarlos en el
    // orden en que se vayan generando; mostrar por pantalla dicha lista una vez creada. Ordenarla
    // en sentido creciente y volverla a mostrar por pantalla.

    ArrayList<Integer> lista20menores100 = new ArrayList<>();

    for (int i = 0; i < 20; i++) {
      lista20menores100.add((int) (Math.random() * 100));
    }

    System.out.println(lista20menores100);

    Collections.sort(lista20menores100);

    System.out.println(lista20menores100);
  }
}
