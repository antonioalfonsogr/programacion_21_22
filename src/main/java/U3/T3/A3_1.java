package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

public class A3_1 {
  public static void main(String[] args) {
    // Diseñar un programa que solicite al usuario 5 números decimales. A continuación, debe mostrar
    // los números en el mismo orden en que se han introducido.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca 5 números decimales");
    double[] ar = new double[5];
    for (int i = 0; i < ar.length; i++) {
      ar[i] = sc.nextDouble();
    }
    System.out.println(Arrays.toString(ar));
  }
}
