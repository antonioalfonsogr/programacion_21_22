package U3.T1;

import java.util.Scanner;

// Diseñar una función eco() a la que se le pasa como parámetro un número n, y muestra por pantalla
// n veces el mensaje "Eco..."

public class A1_1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número");
    int num1 = sc.nextInt();

    eco(num1);
  }

  static void eco(int num) {
    for (int i = 0; i < num; i++) {
      System.out.println("Eco");
    }
  }
}
