package U7.T2;

import java.util.Set;
import java.util.TreeSet;

public class A9 {
  public static void main(String[] args) {
    // Implementar el método unión de dos conjuntos, que devuelva un nuevo conjunto con todos los
    // elementos que pertenezcan, al menos, a uno de los dos conjuntos. Su prototipo es:
    // Set union (Set conjunto1, Set conjunto2)

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
    System.out.println(union(conj1, conj2));
  }

  public static Set union(Set conjunto1, Set conjunto2) {
    conjunto1.addAll(conjunto2);

    return conjunto1;
  }
}
