package U7.T5;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CalificacionPruebas {

  private static TreeSet<Integer> idsAspirantes = new TreeSet<>();

  public static Object calificacionesPrueba(TreeSet<Integer> idsAspirantes) {

    ArrayList<Integer> notas = new ArrayList<>();
    Map notasAspirantes = new TreeMap<>();
    for (Integer id : idsAspirantes) {
      for (int i = 0; i < 5; i++) {
        notas.get((int) (Math.random() * 11));
      }
      notasAspirantes.put(id, notas);
    }
    return null;
  }
}
