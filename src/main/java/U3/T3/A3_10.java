package U3.T3;

import java.util.Scanner;

public class A3_10 {
  public static void main(String[] args) {
    // Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla
    // unidimensional que debe rellenar de la siguiente forma: se leerá por teclado una serie de
    // números, guardando en la tabla los pares hasta que esté llena, e ignorando los impares. La
    // función tiene que devolver la cantidad de impares desechados.

    int[] ar = new int[6];
    System.out.println("Has desechado " + rellenaPares(ar) + " impares");
  }

  public static int rellenaPares(int[] ar) {
    Scanner sc = new Scanner(System.in);
    int numimpares = 0;
    for (int i = 0; i < ar.length; i++) {
      System.out.println("Introduce un número");
      int proximoNum = sc.nextInt();
      while (proximoNum % 2 != 0) {
        numimpares++;
        System.out.println("Introduce un número");
        proximoNum = sc.nextInt();
      }
      ar[i] = proximoNum;
    }

    return numimpares;
  }
}
