package U7.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class A1 {
  public static void main(String[] args) {
    // A partir de una lista de 100 enteros aleatorios menores que 1000:
    // Calcula cuántos son primos.
    // Determina cuál es el mayor, el menor, la suma de todos ellos y el valor promedio.

    List<Integer> lista100 = new ArrayList<>(100);
    for (int i = 0; i < 100; i++) {
      lista100.add((int) (Math.random() * 1001));
    }

    // lista100.stream().forEach(System.out::println);

    long numPrimos = lista100.stream().filter(A1::esPrimo).count();
    System.out.println("Hay " + numPrimos + " números primos");

    int max = lista100.stream().max(Integer::compareTo).get();
    System.out.println("El mayor es " + max);

    int min = lista100.stream().min(Integer::compareTo).get();
    System.out.println("El menos es " + min);

    int suma = lista100.stream().mapToInt(Integer::intValue).sum();
    System.out.println("Las suma es " + suma);

    OptionalDouble mediaOptional = lista100.stream().mapToInt(Integer::intValue).average();
    Double media = null;
    if (mediaOptional.isPresent()) media = mediaOptional.getAsDouble();
    System.out.println("La media es " + media);
  }

  static boolean esPrimo(int num) {
    boolean esPrimo = true;
    for (int i = 2; i < num; i++) {
      if (num % 2 == 0) {
        esPrimo = false;
        break;
      }
    }
    return esPrimo;
  }
}
