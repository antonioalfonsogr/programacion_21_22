package U7.T3b;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A1 {
  public static void main(String[] args) {
    // Crea un HashMap cuya clave sea un Integer, y cuyos valores sean los nombres de algunos de tus
    // compañeros. La clave ha de calcularse mediante un método que reciba un String que represente
    // el dni, y devuelva la suma de sus dígitos.
    // 46221877D -> 4+6+2+2+1+8+7+7=37
    // Una vez guardados los elementos, deben mostrarse todos los elementos (clave-valor) del
    // HasMap.

    Map<Integer, String> mapa = new HashMap<>();

    mapa.put(calculaClaveDni("12345678X"), "Antonio");
    mapa.put(calculaClaveDni("11111111A"), "Juana");
    mapa.put(calculaClaveDni("22222222B"), "Pepe");
    mapa.put(calculaClaveDni("33333333C"), "Ana");
    mapa.put(calculaClaveDni("44444444D"), "Manolo");

    System.out.println(mapa);
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
