package U5.T2.A1;

import java.util.Scanner;

public class PrincipalPila {
  public static void main(String[] args) {
    //

    Scanner sc = new Scanner(System.in);

    Pila p1 = new PilaLista();

    for (int i = 0; i < 10; i++) {
      System.out.println("Introduce número: ");
      p1.apilar(sc.nextInt());
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(p1.desapilar());
    }

    Pila p2 = new PilaTabla();
    p2.apilar(1);
    p2.apilar(2);
    p2.apilar(3);
    p2.apilar(4);
    p2.apilar(5);
    p2.apilar(6);
    p2.apilar(7);
    p2.apilar(8);
    p2.apilar(9);
    p2.apilar(10);

    for (int i = 0; i < 10; i++) {
      System.out.println(p2.desapilar());
    }
  }
}
