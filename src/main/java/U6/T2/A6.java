package U6.T2;

import java.io.*;
import java.util.Scanner;

public class A6 {
  public static void main(String[] args) {
    // En un fichero binario, sabemos que se ha guardado una serie de números double, pero no
    // sabemos cuántos. Implementar un programa que los lea todos y los muestre por pantalla.

    Scanner sc = new Scanner(System.in);

    Double num;

    try {
      FileOutputStream fichero = new FileOutputStream("FicherosBinarios/a6.dat");
      ObjectOutputStream out = new ObjectOutputStream(fichero);
      System.out.println("Introduzca un número:");
      num = sc.nextDouble();
      while (num != -1) {
        System.out.println("Introduzca un número:");
        out.writeDouble(num);
        num = sc.nextDouble();
      }
      out.close();
    } catch (IOException ex) {
      System.out.println("ERROR al escribir en el fichero");
    }

    try {
      FileInputStream fichero = new FileInputStream("FicherosBinarios/a6.dat");
      ObjectInputStream in = new ObjectInputStream(fichero);
      while (true) {
        num = in.readDouble();
        System.out.println(num);
      }

    } catch (IOException ex) {
      System.out.println("ERROR al leer en el fichero");
    }
  }
}
