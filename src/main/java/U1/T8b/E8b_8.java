package U1.T8b;

import java.util.Scanner;

public class E8b_8 {
  public static void main(String[] args) {
    // Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la
    // semana. No se tendrán en cuenta los minutos ni los segundos. El día de la semana se puede
    // pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se debe
    // comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior
    // al primero.

    Scanner teclado = new Scanner(System.in);

    // Variables

    int dia1Entero = 0;
    int dia2Entero = 0;
    String dia1Cadena;
    String dia2Cadena;

    // Primer día

    do {
      System.out.println("Introduzca el primer día de la semana (del 1 a 7 ó Lunes a domingo)");
      dia1Cadena = teclado.next();
      if (dia1Cadena.equals("Lunes") || dia1Cadena.equals("1")) {
        dia1Entero = 1;
      } else if (dia1Cadena.equals("Martes") || dia1Cadena.equals("2")) {
        dia1Entero = 2;
      } else if (dia1Cadena.equals("Miércoles") || dia1Cadena.equals("3")) {
        dia1Entero = 3;
      } else if (dia1Cadena.equals("Jueves") || dia1Cadena.equals("4")) {
        dia1Entero = 4;
      } else if (dia1Cadena.equals("Viernes") || dia1Cadena.equals("5")) {
        dia1Entero = 5;
      } else if (dia1Cadena.equals("Sábado") || dia1Cadena.equals("6")) {
        dia1Entero = 6;
      } else if (dia1Cadena.equals("Domingo") || dia1Cadena.equals("7")) {
        dia1Entero = 7;
      } else {
        System.out.println("Primer día introducido incorrectamente");
      }
    } while (dia1Entero < 1);

    // Segundo día

    do {
      System.out.println("Introduzca el segundo día de la semana (del 1 a 7 ó Lunes a Domingo)");
      dia2Cadena = teclado.next();
      if (dia2Cadena.equals("Lunes") || dia2Cadena.equals("1")) {
        dia2Entero = 1;
      } else if (dia2Cadena.equals("Martes") || dia2Cadena.equals("2")) {
        dia2Entero = 2;
      } else if (dia2Cadena.equals("Miércoles") || dia2Cadena.equals("3")) {
        dia2Entero = 3;
      } else if (dia2Cadena.equals("Jueves") || dia2Cadena.equals("4")) {
        dia2Entero = 4;
      } else if (dia2Cadena.equals("Viernes") || dia2Cadena.equals("5")) {
        dia2Entero = 5;
      } else if (dia2Cadena.equals("Sábado") || dia2Cadena.equals("6")) {
        dia2Entero = 6;
      } else if (dia2Cadena.equals("Domingo") || dia2Cadena.equals("7")) {
        dia2Entero = 7;
      } else {
        System.out.println("Primer día introducido incorrectamente");
      }
    } while (dia2Entero < dia1Entero);

    System.out.println(
        "Entre los días introducidos hay " + ((dia2Entero - dia1Entero) * 24) + " horas");
  }
}
