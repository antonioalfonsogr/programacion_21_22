package U1.T5II;

import java.util.Scanner;

// Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes
// o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
// respectivamente. Sólo se tienen en cuenta las
// horas, los minutos no se deben introducir por teclado.

public class E5II_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escriba número de la hora");
    byte hora = teclado.nextByte();
    if (hora >= 6 && hora <= 12) {
      System.out.println("buenos días");
    } else if (hora >= 13 && hora <= 20) {
      System.out.println("buenas tardes");
    } else if ((hora >= 21 && hora <= 24) || (hora >= 0 && hora <= 5)) {
      System.out.println("buenas noches");
    } else {
      System.out.println("No ha intoducido un número del 0 al 24");
    }
  }
}
