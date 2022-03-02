package U6.T2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class A1 {
  public static void main(String[] args) {
    // Pedir un double por consola y guardarlo en un archivo binario.

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un double");
    double num = sc.nextDouble();

    try {
      FileOutputStream fichero = new FileOutputStream("FicherosBinarios/numDouble.dat");
      ObjectOutputStream out = new ObjectOutputStream(fichero);
      out.writeDouble(num);
      out.close();
    } catch (IOException ex) {
      System.out.println("ERROR al escribir en el fichero");
    }
  }
}
