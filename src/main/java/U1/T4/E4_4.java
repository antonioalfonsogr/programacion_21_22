package U1.T4;

import java.util.Scanner;

// Sería interesante disponer de un programa que pida como entrada un número decimal y lo muestre
// redondeando al entero más próximo. ej: 2,3 -> 2      4,8 -> 5

public class E4_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escriba un número decimal a redondear");
    double decimal = teclado.nextDouble();
    double enteroDouble = Math.round(decimal);
    int enteroInt = (int) enteroDouble;
    System.out.println(decimal + " redondeado es: " + enteroInt);
  }
}
