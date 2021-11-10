package U3.T1;

import java.util.Scanner;

public class A1_9 {
  public static void main(String[] args) {
    // Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos
    // del número que se le pasa como parámetro

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número");
    int num = sc.nextInt();

    fDivisoresPrimos(num);
  }

  public static void fDivisoresPrimos(int num) {

    System.out.print("Son divisores primos de " + num + " : ");

    for (int i = 1; i <= num; i++) {

      if (num % i == 0 && fEsPrimo(i)) {
        System.out.print(i + " ");
      }
    }
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
