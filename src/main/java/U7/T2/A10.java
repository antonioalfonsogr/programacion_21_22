package U7.T2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class A10 {
  public static void main(String[] args) {
    // Hacer lo mismo que en el ejercicio anterior con la intersección, formada por los elementos
    // comunes a los dos conjuntos. Su prototipo es:
    // Set interseccion (Set conjunto1, Set conjunto2)

    TreeSet<Integer> conj1 = new TreeSet<>();
    conj1.add(1);
    conj1.add(2);
    conj1.add(3);
    conj1.add(4);
    conj1.add(5);

    TreeSet<Integer> conj2 = new TreeSet<>();
    conj2.add(2);
    conj2.add(4);
    conj2.add(6);
    conj2.add(8);
    conj2.add(10);

    System.out.println(conj1);
    System.out.println(conj2);
    System.out.println(interserccion(conj1, conj2));
  }

  public static Set interserccion(Set conjunto1, Set conjunto2) {

    conjunto1.retainAll(conjunto2);

    return conjunto1;
  }
}
