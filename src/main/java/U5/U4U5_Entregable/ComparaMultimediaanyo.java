package U5.U4U5_Entregable;

import java.util.Comparator;

public class ComparaMultimediaanyo implements Comparator {
  @Override
  public int compare(Object o, Object t1) {
    if (!(o instanceof Multimedia)) return 0;
    if (!(t1 instanceof Multimedia)) return 0;
    Multimedia m1 = (Multimedia) o;
    Multimedia m2 = (Multimedia) t1;
    return m1.getAnyo() - m2.getAnyo();
  }
}
