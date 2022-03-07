package U6.T2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class A5 {
  public static void main(String[] args) {
    // Leer de un fichero binario una tabla de números double. Mostrar el contenido de la tabla por
    // consola.

    Double[] doublesArray = new Double[0];

    try {
      FileInputStream fichero = new FileInputStream("FicherosBinarios/a4.dat");
      ObjectInputStream in = new ObjectInputStream(fichero);

      doublesArray = (Double[]) in.readObject();
      in.close();

    } catch (IOException | ClassNotFoundException ex) {
      System.out.println("ERROR al leer en el fichero" + ex.getMessage());
    }

    System.out.println(Arrays.toString(doublesArray));
  }
}
