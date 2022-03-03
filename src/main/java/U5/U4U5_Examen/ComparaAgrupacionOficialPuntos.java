package U5.U4U5_Examen;

import java.util.Comparator;

public class ComparaAgrupacionOficialPuntos implements Comparator {
  @Override
  public int compare(Object o, Object t1) {
    if (!(o instanceof AgrupacionOficial)) return 0;
    if (!(t1 instanceof AgrupacionOficial)) return 0;
    AgrupacionOficial ao1 = (AgrupacionOficial) o;
    AgrupacionOficial ao2 = (AgrupacionOficial) t1;
    return ao1.getPuntosObtenidos() - ao2.getPuntosObtenidos();
  }
}
