package U7.T5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntroducirAspirantes {

  private static Map<Integer, Aspirante> aspiranteMap = new HashMap<>();
  private static Integer ids = 0;

  public static void insertarAspirante() {
    boolean insertarOtro = false;
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca nombre:");
    String nombre = sc.nextLine();

    System.out.println("Introduzca dni:");
    String dni = sc.nextLine();

    System.out.println("Introduzca teléfono:");
    Integer telefono = sc.nextInt();
    sc.nextLine();

    do {
      Aspirante a = new Aspirante(nombre, dni, telefono);
      aspiranteMap.put(ids, a);
      ids++;

      System.out.println("Desea insertar otro aspirante");
      sc.nextBoolean();
      sc.nextLine();

    } while (insertarOtro);
  }

  public static Map<Integer, Aspirante> getAspiranteMap() {
    return aspiranteMap;
  }

  public static void setAspiranteMap(Map<Integer, Aspirante> aspiranteMap) {
    IntroducirAspirantes.aspiranteMap = aspiranteMap;
  }
}
