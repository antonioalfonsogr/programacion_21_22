package U1.T5II;

import java.util.Scanner;

public class E5II_18 {
  public static void main(String[] args) {
    // Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos
    // notas que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles
    // da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de
    // que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de
    // recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario
    // ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la
    // recuperación es apto, la nota será un 5; en caso contrario, se  mantiene la nota media
    // anterior.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Nota del primer control: ");
    double nota1 = teclado.nextDouble();
    System.out.println("Nota del segundo control: ");
    double nota2 = teclado.nextDouble();
    double media = (nota1 + nota2) / 2;
    if (media >= 5) {
      System.out.println("Tu nota de Programación es : " + media);
    } else {
      System.out.println("¿Cuál ha sido el resultado de la recuperación? 1=apto 2=no apto):");
      byte recuperacion = teclado.nextByte();
      if (recuperacion == 1) {
        System.out.println("Tu nota de programación es 5");
      } else {
        System.out.println("Tu nota de Programación es " + media);
      }
    }
  }
}
