package U3.T1;

import java.util.Scanner;

public class A1_3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el radio de la base");
    int radioBase = sc.nextInt();

    System.out.println("Introduzca la altura");
    int altura = sc.nextInt();

    System.out.println("Introduzca 1: calcular area");
    System.out.println("Introduzca 2: calcular volumen");
    int areaVolumen = sc.nextInt();

    fAreaVolumen(areaVolumen, radioBase, altura);
  }

  static void fAreaVolumen(int areaVolumen, int radioBase, int altura) {
    if (areaVolumen == 1) {
      System.out.println(2 * Math.PI * radioBase * (altura + radioBase));
    } else if (areaVolumen == 2) {
      System.out.println(Math.PI * radioBase * radioBase * altura);
    } else {
      System.out.println("Error, no ha introducido un valor valido.");
    }
  }
}
