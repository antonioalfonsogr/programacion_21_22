package U7.T1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class A8 {
  public static void main(String[] args) {
    // Implementar una función a la que se le pase una lista de nombres y devuelva una copia sin
    // elementos repetidos (sin modificar la original), con el prototipo:
    // List eliminaRepetidos (List c)

    ArrayList<String> nombres = new ArrayList<>();
    nombres.add("Juan");
    nombres.add("Pepe");
    nombres.add("Juan");
    nombres.add("Antonio");
    nombres.add("Juan");
    nombres.add("Carlos");

    System.out.println(nombres);

    System.out.println(eliminaRepetidos(nombres));
  }

  public static List eliminaRepetidos(List c) {
    LinkedHashSet sinRepetidos = new LinkedHashSet(c);
    c.clear();
    c.addAll(sinRepetidos);

    return c;
  }
}
