package U7.T3b;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A2 {
  public static void main(String[] args) {
    // Añada al programa anterior la siguiente funcionalidad. El programa pedirá al usuario un dni,
    // calculará la clave que ha de consultar, comprobará que dicha clave existe, y, en tal caso,
    // mostrará el valor asociado a esa clave en el HashMap.

    Map<Integer, String> mapa = new HashMap<>();

    mapa.put(calculaClaveDni("12345678X"), "Antonio");
    mapa.put(calculaClaveDni("11111111A"), "Juana");
    mapa.put(calculaClaveDni("22222222B"), "Pepe");
    mapa.put(calculaClaveDni("33333333C"), "Ana");
    mapa.put(calculaClaveDni("44444444D"), "Manolo");

    System.out.println(mapa);

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca DNI a consultar:");
    String nuevoDni = sc.next();

    if (mapa.containsKey(calculaClaveDni(nuevoDni))) {
      System.out.println(mapa.get(calculaClaveDni(nuevoDni)));
    } else System.out.println("No existe registro con esa clave");
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
