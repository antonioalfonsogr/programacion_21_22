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
      String resultado_parcial = "";
      char letra;

    for (int i = 0; i < cadena_a_adivinar.length(); i++) {
      resultado_parcial += '-';
    }

    do{
      System.out.println(resultado_parcial);
      System.out.println("Introduzca una letra:");
      letra = sc.nextLine().charAt(0);

     resultado_parcial = palabraAhorcado(cadena_a_adivinar, resultado_parcial, letra);
    }while (!cadena_a_adivinar.equalsIgnoreCase(resultado_parcial));

  }
  public static String palabraAhorcado (String cadena_a_adivinar, String resultado_parcial, char letra){
    resultado_parcial = "";

    for (int i = 0; i < cadena_a_adivinar.length(); i++) {
      if (cadena_a_adivinar.charAt(i)==letra){
          resultado_parcial += letra;
      }else resultado_parcial += '-';
    }

      return resultado_parcial;
  }
}
