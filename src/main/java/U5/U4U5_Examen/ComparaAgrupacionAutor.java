package U5.U4U5_Examen;

import U5.U4U5_Entregable.Multimedia;

import java.util.Comparator;

public class ComparaAgrupacionAutor implements Comparator {
  @Override
  public int compare(Object o, Object t1) {
    if (!(o instanceof Agrupacion)) return 0;
    if (!(t1 instanceof Agrupacion)) return 0;
    Agrupacion a1 = (Agrupacion) o;
    Agrupacion a2 = (Agrupacion) t1;
    return a1.getAutor().compareTo(a2.getAutor());
  }
}
