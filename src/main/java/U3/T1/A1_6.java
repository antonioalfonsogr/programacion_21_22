package U3.T1;

import java.util.Scanner;

// Crear una función que, mediante un booleano, indique si el carácter que se pasa como parámetro de
// entrada corresponde con una vocal.

public class A1_6 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un carácter");
    char caracter = sc.nextLine().charAt(0);

    if (fvocal(caracter)) {
      System.out.println(caracter + " Es una vocal");
    } else {
      System.out.println(caracter + " NO es vocal");
    }
  }

  static boolean fvocal(char caracter) {
    boolean esVocal;
    esVocal =
        caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    return esVocal;
  }
}
