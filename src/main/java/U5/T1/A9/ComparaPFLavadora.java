package U5.T1.A9;

import java.util.Comparator;

public class ComparaPFLavadora implements Comparator {

  @Override
  public int compare(Object o, Object t1) {
    if (!(o instanceof Lavadora)) return 0;
    if (!(t1 instanceof Lavadora)) return 0;
    Lavadora l1 = (Lavadora) o;
    Lavadora l2 = (Lavadora) t1;
    return l1.getPrecioFinal() - l2.getPrecioFinal();
  }
}
