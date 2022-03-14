package U7.T2;

import java.util.Set;
import java.util.TreeSet;

public class A12 {
  public static void main(String[] args) {
    // Escribir el método incluido(), que devuelve true si todos los elementos del primer conjunto
    // pertenecen al segundo y false si hay algún elemento del primero que no pertenezca al segundo.
    // Su prototipo es:
    // boolean incluido(Set conjunto1, Set conjunto2)

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

    TreeSet<Integer> conj3 = new TreeSet<>();
    conj2.add(1);
    conj2.add(3);
    conj2.add(5);

    System.out.println(incluido(conj1, conj2));
    System.out.println(incluido(conj1, conj3));
  }

  public static boolean incluido(Set conjunto1, Set conjunto2) {

    return conjunto1.containsAll(conjunto2);
  }
}
