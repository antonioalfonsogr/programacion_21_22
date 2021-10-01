package U1.T5II;

import java.util.Scanner;

public class E5II_6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca primera nota");
    double nota1 = teclado.nextDouble();
    System.out.println("Introduzca segunda nota");
    double nota2 = teclado.nextDouble();
    System.out.println("Introduzca tercera nota");
    double nota3 = teclado.nextDouble();
    double media = (nota1 + nota2 + nota3) / 3;
    System.out.println("La nota media es " + media);
  }
}
