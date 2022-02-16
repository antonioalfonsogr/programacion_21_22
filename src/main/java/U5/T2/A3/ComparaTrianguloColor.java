package U5.T2.A3;

import java.util.Comparator;

public class ComparaTrianguloColor implements Comparator {
  @Override
  public int compare(Object o, Object t1) {
    if (!(o instanceof Triangulo)) return 0;
    if (!(t1 instanceof Triangulo)) return 0;
    Triangulo tri1 = (Triangulo) o;
    Triangulo tri2 = (Triangulo) t1;
    return tri1.compareTo(tri2);
  }
}
