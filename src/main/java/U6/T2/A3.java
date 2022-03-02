package U6.T2;

import java.io.*;
import java.util.Scanner;

public class A3 {
  public static void main(String[] args) {
    // Pedir números enteros positivos por consola y guardarlos en un fichero binario hasta que se
    // introduzca un número negativo. Leer del fichero todos los enteros guardados y mostrarlos por
    // pantalla.

    Scanner sc = new Scanner(System.in);

    int num;

    try {
      FileOutputStream fichero = new FileOutputStream("FicherosBinarios/a3.dat");
      ObjectOutputStream out = new ObjectOutputStream(fichero);
      System.out.println("Introduzca un número:");
      num = sc.nextInt();
      while (num != -1) {
        System.out.println("Introduzca un número:");
        out.writeInt(num);
        num = sc.nextInt();
      }
      out.close();
    } catch (IOException ex) {
      System.out.println("ERROR al escribir en el fichero");
    }

    try {
      FileInputStream fichero = new FileInputStream("FicherosBinarios/a3.dat");
      ObjectInputStream in = new ObjectInputStream(fichero);
      while (true) {
        num = in.readInt();
        System.out.println(num);
      }
      // in.close();
    } catch (IOException ex) {
      System.out.println("ERROR al leer en el fichero" + ex.getMessage());
    }
  }
}
