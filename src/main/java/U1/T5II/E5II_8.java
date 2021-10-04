package U1.T5II;

import java.util.Scanner;

// Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).

public class E5II_8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println(
        "Este programa resuelve ecuaciones de segundo grado (del tipo ax2 + bx + c = 0)");
    System.out.println("Por favor, introduzca el valor de a");
    double a = teclado.nextDouble();
    System.out.println("Por favor, introduzca el valor de b");
    double b = teclado.nextDouble();
    System.out.println("Por favor, introduzca el valor de c");
    double c = teclado.nextDouble();
    double raiz = ((b * b) - (4 * a * c));
    double xmas = ((0 - b) + (Math.sqrt(raiz))) / (2 * a);
    double xmenos = ((0 - b) - (Math.sqrt(raiz))) / (2 * a);
    System.out.println("Los resultados son " + xmas + " y " + xmenos);
  }
}
