package U1.T8;

import java.util.Scanner;

public class E8_13 {
  public static void main(String[] args) {
    // Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
    Scanner teclado = new Scanner(System.in);

    int nota;
    int alumAprobados = 0;
    int alumCondicionados = 0;
    int alumSuspensos = 0;

    for (int i = 1; i <= 6; i++) {
      System.out.println("Introduzca una nota");
      nota = teclado.nextInt();
      if (nota >= 5) {
        alumAprobados++;
      } else if (nota < 4) {
        alumSuspensos++;
      } else {
        alumCondicionados++;
      }
    }
    System.out.println(alumAprobados + " Alumnos Aprobados");
    System.out.println(alumCondicionados + " Alumnos Condicionados");
    System.out.println(alumSuspensos + " Alumnos Suspensos");
  }
}
