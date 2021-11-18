package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

public class A3_3 {
  public static void main(String[] args) {
    // Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
    // Realizar la media de los números positivos, la media de los negativos, y contar el número de
    // ceros introducidos.

    Scanner sc = new Scanner(System.in);

    System.out.println("¿Cuantos números desea introducir?");
    int longitud = sc.nextInt();
    int[] ar = new int[longitud];

    for (int i = 0; i < ar.length; i++) {
      System.out.println("Introduzca número:");
      ar[i] = sc.nextInt();
    }
    double sumaPositivos = 0;
    int contPositivos = 0;
    double sumaNegativos = 0;
    int contNegativos = 0;
    int cont0 = 0;

    for (int i = 0; i < ar.length; i++) {
      if (ar[i] < 0) {
        sumaNegativos = sumaNegativos + ar[i];
        contNegativos++;
      } else if (ar[i] > 0) {
        sumaPositivos = sumaPositivos + ar[i];
        contPositivos++;
      } else {
        cont0++;
      }
    }
    System.out.println("Media positivos: " + sumaPositivos / contPositivos);
    System.out.println("Media Negativos: " + sumaNegativos / contNegativos);
    System.out.println("Número de 0: " + cont0);
  }
}
