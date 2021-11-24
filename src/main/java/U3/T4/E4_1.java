package U3.T4;

import java.util.Scanner;

public class E4_1 {
  public static void main(String[] args) {
    // Escribe un programa que rellene un array de 100 elementos con números en-teros aleatorios
    // comprendidos entre 0 y 500 (ambos incluidos). A continuación el programa mostrará el array y
    // preguntará si el usuario quiere destacar el máximo o el mínimo. Seguidamente se volverá a
    // mostrar el array escribiendo el número destacado entre dobles asteriscos.

    Scanner sc = new Scanner(System.in);

    int[] ar = new int[100];

    for (int i = 0; i < ar.length; i++) {
      ar[i] = (int) (Math.random() * 501);
    }

    for (int j : ar) {
      System.out.print(j + " ");
    }
    System.out.println();
    System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo):");
    int destacar = sc.nextInt();
    destacar = recorrerAr(ar, destacar);

    for (int j : ar) {
      if (j == destacar) {
        System.out.print("**" + j + "** ");
      } else {
        System.out.print(j + " ");
      }
    }
  }

  public static int recorrerAr(int[] ar, int destacar) {
    int min = 500;
    int max = 0;
    for (int j : ar) {
      if (j < min) min = j;
      if (j > max) max = j;
    }
    if (destacar == 1) return min;
    else return max;
  }
}
