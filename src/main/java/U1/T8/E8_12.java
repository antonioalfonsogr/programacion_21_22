package U1.T8;

import java.util.Scanner;

public class E8_12 {
  public static void main(String[] args) {
    // Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o
    // no lo hay. Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.
    Scanner teclado = new Scanner(System.in);

    int nota;
    boolean suspenso = false;

    for (int i = 1; i <= 5; i++) {
      System.out.println("Introduzca una nota");
      nota = teclado.nextInt();
      if (nota <= 5) {
        suspenso = true;
      }
    }
    if (suspenso) {
      System.out.println("Hay algún suspenso");
    } else {
      System.out.println("No hay ningún suspenso");
    }
  }
}
