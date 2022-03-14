package U7.T2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class A13 {
  public static void main(String[] args) {
    // Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva una única
    // lista, fusión de las dos anteriores. Desarrollar el algoritmo de forma no destructiva, es
    // decir, que las listas utilizadas como parámetros de entrada se mantengan intactas.

    List<Integer> lista1 = new ArrayList<>();
    lista1.add(1);
    lista1.add(2);
    lista1.add(3);
    lista1.add(4);
    lista1.add(5);

    List<Integer> lista2 = new LinkedList<>();
    lista2.add(2);
    lista2.add(4);
    lista2.add(6);
    lista2.add(8);
    lista2.add(10);

    System.out.println(unirListas(lista1, lista2));
  }

  public static List unirListas(List lista1, List lista2) {

    List unida = new ArrayList<>();

    unida.addAll(lista1);
    unida.addAll(lista2);

    return unida;
  }
}
