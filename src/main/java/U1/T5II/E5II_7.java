package U1.T5II;

import java.util.Scanner;

public class E5II_7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca primera nota");
    double nota1 = teclado.nextDouble();
    System.out.println("Introduzca segunda nota");
    double nota2 = teclado.nextDouble();
    System.out.println("Introduzca tercera nota");
    double nota3 = teclado.nextDouble();
    double media = (nota1 + nota2 + nota3) / 3;
    String boletin;
    if (media < 5) {
      boletin = "Insuficiente";
    } else if (media >= 5 && media < 6) {
      boletin = " Suficiente";
    } else if (media >= 6 && media < 7) {
      boletin = " Bien";
    } else if (media >= 7 && media < 9) {
      boletin = " Notable";
    } else {
      boletin = " Sobresaliente";
    }
    System.out.println("La nota media es " + media + boletin);
  }
}
