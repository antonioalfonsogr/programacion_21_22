package U7.Stream;

import java.util.ArrayList;
import java.util.List;

public class A2 {
  public static void main(String[] args) {
    // A partir de una lista con los enteros del 1 al 100, crea un Stream con los múltiplos de 7.
    // Muéstralos por pantalla.

    List<Integer> lista100 = new ArrayList<>(100);
    for (int i = 1; i < 101; i++) {
      lista100.add(i);
    }

    lista100.stream().filter(n -> n % 7 == 0).forEach(System.out::println);
  }
}
