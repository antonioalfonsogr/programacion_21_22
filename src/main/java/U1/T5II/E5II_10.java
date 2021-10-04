package U1.T5II;

import java.util.Scanner;

// Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que
// faltan para llegar a la medianoche.

public class E5II_10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Intruduzca el número de la hora actual");
    int hora = teclado.nextInt();
    System.out.println("Introduzca el número del minuto actual");
    int min = teclado.nextInt();
    int secactual = (hora * 60 * 60) + (min * 60);
    int secfaltan = (24 * 60 * 60) - secactual;
    System.out.println("Faltan " + secfaltan + " segundo para la medianoche");
  }
}
