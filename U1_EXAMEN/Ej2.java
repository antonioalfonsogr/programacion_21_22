package U1.U1_EXAMEN;

import java.util.Scanner;

public class Ej2 {
  public static void main(String[] args) {
    // Realiza un programa que diga los dígitos que aparecen y los que no aparecen en un número
    // entero introducido por teclado. El orden es el que se muestra en los ejemplos. Utiliza el
    // tipo long para que el usuario pueda introducir números largos.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número: ");
    long num = sc.nextLong();

    long cociente = num;
    int resto;

    boolean d0 = false;
    boolean d1 = false;
    boolean d2 = false;
    boolean d3 = false;
    boolean d4 = false;
    boolean d5 = false;
    boolean d6 = false;
    boolean d7 = false;
    boolean d8 = false;
    boolean d9 = false;

    if (num % 10 == 0) {
      d0 = true;
    }

    while (cociente != 0) {
      resto = (int) cociente % 10;
      cociente = cociente / 10;
      switch (resto) {
        case 0:
          d0 = true;
          break;
        case 1:
          d1 = true;
          break;
        case 2:
          d2 = true;
          break;
        case 3:
          d3 = true;
          break;
        case 4:
          d4 = true;
          break;
        case 5:
          d5 = true;
          break;
        case 6:
          d6 = true;
          break;
        case 7:
          d7 = true;
          break;
        case 8:
          d8 = true;
          break;
        case 9:
          d9 = true;
          break;
      }
    }
    System.out.print("Dígitos que aparecen en el número " + num + " : ");
    if (d0) System.out.print("0 ");
    if (d1) System.out.print("1 ");
    if (d2) System.out.print("2 ");
    if (d3) System.out.print("3 ");
    if (d4) System.out.print("4 ");
    if (d5) System.out.print("5 ");
    if (d6) System.out.print("6 ");
    if (d7) System.out.print("7 ");
    if (d8) System.out.print("8 ");
    if (d9) System.out.print("9 ");

    System.out.println();
    System.out.print("Dígitos que no aparecen: ");
    if (!d0) System.out.print("0 ");
    if (!d1) System.out.print("1 ");
    if (!d2) System.out.print("2 ");
    if (!d3) System.out.print("3 ");
    if (!d4) System.out.print("4 ");
    if (!d5) System.out.print("5 ");
    if (!d6) System.out.print("6 ");
    if (!d7) System.out.print("7 ");
    if (!d8) System.out.print("8 ");
    if (!d9) System.out.print("9 ");
  }
}
