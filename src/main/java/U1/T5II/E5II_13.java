package U1.T5II;

import java.util.Scanner;

// Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.

public class E5II_13 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Intruduzca un número");
    int num = teclado.nextInt();
    if ((num % 2) == 0 && (num % 5 == 0)) {
      System.out.println(num + " Es es par y divisible entre 5");
    } else if ((num % 2) == 0) {
      System.out.println(num + " Es par y no es divisible entre 5");
    } else if ((num % 5) == 0) {
      System.out.println(num + " No es par y es divisible entre 5");
    } else {
      System.out.println(num + " No es par y no es divisible entre 5");
    }
  }
}
