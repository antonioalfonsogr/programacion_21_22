package U7.T3b;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A3 {
  public static void main(String[] args) {
    // Recorre el Map anterior, extrayendo cada pareja clave-valor, y mostrándolas, de tal forma que
    // se escriban los datos así:
    // La clave 37 está asociada al nombre "Pedro Gonzalez Jimenez".
    // La clave ... está asociada al nombre ....

    Map<Integer, String> mapa = new HashMap<>();

    mapa.put(calculaClaveDni("12345678X"), "Antonio");
    mapa.put(calculaClaveDni("11111111A"), "Juana");
    mapa.put(calculaClaveDni("22222222B"), "Pepe");
    mapa.put(calculaClaveDni("33333333C"), "Ana");
    mapa.put(calculaClaveDni("44444444D"), "Manolo");

    System.out.println(mapa);
    System.out.println();

    Set<Integer> claves = mapa.keySet();

    for (int clave : claves) {
      System.out.println("La clave " + clave + " está asociada al nombre " + mapa.get(clave));
    }
  }

  public static Integer calculaClaveDni(String dni) {

    String numDniString = dni.substring(0, dni.length() - 1);

    char[] numDniCharArray = numDniString.toCharArray();

    int[] numDniIntArray = new int[numDniCharArray.length];

    for (int i = 0; i < numDniIntArray.length; i++) {
      numDniIntArray[i] = Character.getNumericValue(numDniCharArray[i]);
    }

    return Arrays.stream(numDniIntArray).sum();
  }
}
