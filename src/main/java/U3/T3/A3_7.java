package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

public class A3_7 {
  public static void main(String[] args) {
    // Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro
    // educativo. Cada clase está compuesta por 5 alumnos. Se pide leer las notas (números enteros)
    // de cada uno de los alumnos en el primer trimestre, luego, las del segundo, y luego, las del
    // tercero. Debemos mostrar, al final, la nota media del grupo en cada trimestre, y la media del
    // alumno que se encuentra en la posición pos (que se lee por teclado). (Podéis hacerlo usando 3
    // vectores -uno por trimestre-, o usando una matriz bidimensional en la que las filas sean los
    // trimestres y las columnas los alumnos).

    Scanner sc = new Scanner(System.in);

    int[][] notasTrimeste = new int[3][5];

    int trimestre = 0;
    System.out.println("Introduzca las notas del primer trimestre");
    fRellenarArray3x5(notasTrimeste, trimestre);

    trimestre++;
    System.out.println("Introduzca las notas del segundo trimestre");
    fRellenarArray3x5(notasTrimeste, trimestre);

    trimestre++;
    System.out.println("Introduzca las notas del tercer trimestre");
    fRellenarArray3x5(notasTrimeste, trimestre);

    System.out.println(Arrays.deepToString(notasTrimeste));

    System.out.println("Notas medias trimestres:");

    int[] mediaTrimestres = new int[3];
    for (int i = 0; i < 3; i++) {
      int media = 0;
      for (int j = 0; j < 5; j++) {
        media = notasTrimeste[i][j] + media;
      }
      mediaTrimestres[i] = media / 5;
    }
    System.out.println(Arrays.toString(mediaTrimestres));

    System.out.println("Notas medias alumnos:");

    int[] mediaAlumnos = new int[5];
    for (int i = 0; i < 3; i++) {
      int media = 0;
      for (int j = 0; j < 5; j++) {
        media = notasTrimeste[i][j] + media;
      }
      mediaAlumnos[i] = media / 3;
    }
    System.out.println(Arrays.toString(mediaAlumnos));
  }

  public static void fRellenarArray3x5(int[][] ar, int fila) {

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      ar[fila][i] = (int) (1 + Math.random() * 10);
    }
  }
}
