package U5.T2.A2;

import java.util.Comparator;

public class ComparaClientesNombre implements Comparator {

  @Override
  public int compare(Object o, Object t1) {
    if (!(o instanceof Cliente)) return 0;
    if (!(t1 instanceof Cliente)) return 0;
    Cliente c1 = (Cliente) o;
    Cliente c2 = (Cliente) t1;
    return c1.getNombre().compareTo(c2.getNombre());
  }
}
