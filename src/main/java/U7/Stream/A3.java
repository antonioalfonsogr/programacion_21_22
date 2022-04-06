package U7.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class A3 {
  public static void main(String[] args) {
    // Fusiona dos listas, cada una con 20 enteros aleatorios entre 1 y 100, en un Stream ordenado
    // sin repeticiones. Muestra los elementos del Stream.

    List<Integer> lista1 = new ArrayList<>(20);
    for (int i = 0; i < 20; i++) {
      lista1.add((int) (1 + Math.random() * 100));
    }

    List<Integer> lista2 = new ArrayList<>(20);
    for (int i = 0; i < 20; i++) {
      lista2.add((int) (1 + Math.random() * 100));
    }

    Stream.concat(lista1.stream(), lista2.stream())
        .sorted()
        .distinct()
        .forEach(System.out::println);
  }
}
