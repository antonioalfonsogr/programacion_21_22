package U1.T5II;

import java.util.Scanner;

// Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que
// podrá ser una letra, un número o un símbolo como *, +, -, $, &,etc. El programa debe permitir al
// usuario mediante un menú elegir si el vértice
// de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
public class E5II_14 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Intruduzca 1: para vértice hacia arriba");
    System.out.println("Intruduzca 2: para vértice hacia la derecha");
    System.out.println("Intruduzca 3: para vértice hacia abajo");
    System.out.println("Intruduzca 4: para vértice hacia la izquierda");
    byte vertice = teclado.nextByte();
    switch (vertice) {
      case 1:
        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
        break;
      case 2:
        System.out.println("*    ");
        System.out.println("***  ");
        System.out.println("*****");
        System.out.println("***  ");
        System.out.println("*    ");
        break;
      case 3:
        System.out.println("*****");
        System.out.println(" *** ");
        System.out.println("  *  ");
        break;
      case 4:
        System.out.println("    *");
        System.out.println("  ***");
        System.out.println("*****");
        System.out.println("  ***");
        System.out.println("    *");
        break;
    }
  }
}
