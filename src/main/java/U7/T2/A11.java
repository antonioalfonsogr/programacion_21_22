package U7.T2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class A11 {
  public static void main(String[] args) {
    // Diseñar un método que devuelva la diferencia de dos conjuntos (elementos que pertenecen al
    // primero, pero no al segundo). Con el prototipo:
    // Set diferencia (Set conjunto1, Set conjunto2)

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
    System.out.println(diferencia(conj1, conj2));
  }

  public static Set diferencia(Set conjunto1, Set conjunto2) {

    conjunto1.removeAll(conjunto2);

    return conjunto1;
  }
}
