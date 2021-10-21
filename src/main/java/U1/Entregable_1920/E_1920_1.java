package U1.Entregable_1920;

import java.util.Scanner;

public class E_1920_1 {
  public static void main(String[] args) {
    // Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las tres
    // notas que ha sacado el alumno en los tres primeros controles.
    // Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se
    // mostrará la media y la nota correspondiente .Atendiendo a esa media el alumno tendrá las
    // siguientes notas:
    //
    // Suficiente si la media en mayor o igual que 5 y menor que 6.
    // Bien si la media es mayor o igual que 6 y menor que 7.
    // Notable si la media es mayor o igual que 7 y menor que 9.
    // Sobresaliente en culaquier otro caso.
    // En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen
    // de recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario
    // ¿Cuál
    // ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación
    // es apto, la nota será un 5; en caso contrario, se mantiene la nota media anterior.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Nota del primer control:");
    double nota1 = teclado.nextDouble();
    System.out.println("Nota del segundo control:");
    double nota2 = teclado.nextDouble();

    double media = (nota1 + nota2) / 2;

    if (media >= 5 && media < 6) {
      System.out.println("Tu nota de Programación es " + media + " - Suficiente");
    } else if (media >= 6 && media < 7) {
      System.out.println("Tu nota de Programación es " + media + " - Bien");
    } else if (media >= 7 && media < 9) {
      System.out.println("Tu nota de Programación es " + media + " - Notable");
    } else if (media >= 9) {
      System.out.println("Tu nota de Programación es " + media + " - Sobresaliente");
    } else {
      System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
      String recuperacion = teclado.next();
      if (recuperacion.equals("apto")) {
        System.out.println("Tu nota de Programción es 5 - Suficiente");
      } else {
        System.out.println("Tu nota de Programación es " + media + " - Suspenso");
      }
    }
  }
}
