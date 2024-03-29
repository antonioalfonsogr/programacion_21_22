package U3.Entregable_U3;

import java.util.Scanner;

public class Ej1 {
  public static void main(String[] args) {
    // Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas (la cadena a
    // adivinar y el resultado parcial) y un carácter a buscar en la cadena a adivinar. Debe
    // devolver el resultado de encontrar ese character en la cadena a adivinar.
    // La función tendrá el siguiente prototipo:
    // public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char
    // letra)
    // En el programa principal, se debe pedir al usuario que introduzca una palabra a adivinar y un
    // carácter a buscar en la cadena. Se pedirá caracteres hasta que se consiga adivinar la palabra
    // completa.
    // NOTA: La palabra a adivinar no contendrá tildes ni caracteres extraños, además será en
    // minúsculas para simplificar el ejercicio.

    Scanner sc = new Scanner(System.in);

    String cadena_a_adivinar = "programacion";
    StringBuilder resultado_parcial = new StringBuilder();
    char letra;

    for (int i = 0; i < cadena_a_adivinar.length(); i++) {
      resultado_parcial.append('-');
    }

    do {
      System.out.println(resultado_parcial);
      System.out.println("Introduzca una letra:");
      letra = sc.nextLine().charAt(0);

      resultado_parcial =
          new StringBuilder(
              palabraAhorcado(cadena_a_adivinar, resultado_parcial.toString(), letra));
    } while (!cadena_a_adivinar.equalsIgnoreCase(resultado_parcial.toString()));

    System.out.println("Felicidades, Has ganado");
  }

  public static String palabraAhorcado(
      String cadena_a_adivinar, String resultado_parcial, char letra) {

    StringBuilder rpSB = new StringBuilder(resultado_parcial);

    for (int i = 0; i < cadena_a_adivinar.length(); i++) {
      if (cadena_a_adivinar.charAt(i) == letra) {
        rpSB.setCharAt(i, letra);
      }
    }
    return rpSB.toString();
  }
}
