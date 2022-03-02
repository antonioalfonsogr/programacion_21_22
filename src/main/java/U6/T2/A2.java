package U6.T2;

import java.io.*;

public class A2 {
  public static void main(String[] args) {
    // Abrir el archivo del ejercicio anterior, leer el double y mostrarlo por pantalla
    double num;
    try {
      FileInputStream fichero = new FileInputStream("FicherosBinarios/numDouble.dat");
      ObjectInputStream in = new ObjectInputStream(fichero);
      num = in.readDouble();
      System.out.println(num);
    } catch (IOException ex) {
      System.out.println("ERROR al leer en el fichero" + ex.getMessage());
    }
  }
}
