package U3.Examen_U3;

import java.util.Arrays;

public class Ej3 {
  public static void main(String[] args) {
    // Desarrolla dos funciones para trabajar con cadenas. La primera tendrá la siguiente cabecera:
    //
    // public static String[] invertir(String cadena)
    // Recibe una cadena (String), y devuelve esa cadena invertida y en mayúsculas pero colocada en
    // un array (una letra por posición)
    //
    // Ejemplo:
    //
    // invertir("hola") debe devolver [ "A","L","O","H"]
    // La segunda función tendrá la siguiente cabecera:
    //
    // public static String[] desplazarVocales(String cadena)
    // Recibe una cadena (String), y devuelve esa misma cadena con las vocales desplazadas una
    // posición:
    //
    // a -> e
    // e -> i
    // i -> o
    // o -> u
    // u -> a
    // y colocada en un vector (una letra por posición)
    // Ejemplo:
    //
    // desplazarVocales("hola") debe devolver ["h","u","l","e"]

    String palabra = "hola";

    System.out.println("La palabra es:");
    System.out.println(palabra);
    System.out.println("El resultado tras la función invertir es:");
    System.out.println(Arrays.toString(invertir(palabra)));
    System.out.println("El resultado tras la función desplazarVocales es:");
    System.out.println(Arrays.toString(desplazarVocales(palabra)));
  }

  public static String[] invertir(String cadena) {

    String mayus = cadena.toUpperCase();

    String[] invertido = new String[cadena.length()];
    int idcadena = 0;

    for (int i = invertido.length - 1; i >= 0; i--) {
      invertido[i] = String.valueOf(mayus.charAt(idcadena));
      idcadena++;
    }

    return invertido;
  }

  public static String[] desplazarVocales(String cadena) {

    String[] desplazado = new String[cadena.length()];

    for (int i = 0; i < desplazado.length; i++) {
      desplazado[i] = String.valueOf(cadena.charAt(i));
    }

    for (int i = 0; i < desplazado.length; i++) {
      switch (desplazado[i]) {
        case "a":
          desplazado[i] = "e";
          break;
        case "e":
          desplazado[i] = "i";
          break;
        case "i":
          desplazado[i] = "o";
          break;
        case "o":
          desplazado[i] = "u";
          break;
        case "u":
          desplazado[i] = "a";
          break;
      }
    }

    return desplazado;
  }
}
