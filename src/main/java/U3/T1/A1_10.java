package U3.T1;

import java.util.Scanner;

public class A1_10 {
  public static void main(String[] args) {
    // Escribir una función que decida si dos números enteros positivos son amigos. Dos números son
    // amigos si la suma de los divisores propios (distinto de él mismo) del primer número es igual
    // al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el primer número");
    int num1 = sc.nextInt();
    System.out.println("Introduzca el segundo número");
    int num2 = sc.nextInt();

    if (fNumSonAmigos(num1, num2)) {
      System.out.println(num1 + " y " + num2 + " Son Amigos");
    } else {
      System.out.println(num1 + " y " + num2 + " NO son Amigos");
    }
  }

  public static boolean fNumSonAmigos(int num1, int num2) {
    return fSumaDivisores(num1) == num2 && fSumaDivisores(num2) == num1;
  }

  public static int fSumaDivisores(int num) {
    int sumaDivisores = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sumaDivisores = sumaDivisores + i;
      }
    }
    return sumaDivisores;
  }
}
