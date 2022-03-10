package U7.T1;

import java.util.Comparator;

public class OrdenaAlReves implements Comparator<Integer> {

  @Override
  public int compare(Integer i1, Integer i2) {
    return i2 - i1;
  }
}
