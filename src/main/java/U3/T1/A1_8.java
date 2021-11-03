package U3.T1;

import java.util.Scanner;

public class A1_8 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número");
    int num = sc.nextInt();

    int contador = 0;

    for (int i = 2; i < num; i++) {
      if (num % i == 0 && fEsPrimo(i)) {
        contador++;
      }
    }
    System.out.println(contador);
  }

  public static boolean fEsPrimo(int num) {

    boolean esPrimo = true;

    for (int i = 2; i < num; i++) {

      if (num % i == 0) {
        esPrimo = false;
        break;
      }
    }
    return esPrimo;
  }
}
