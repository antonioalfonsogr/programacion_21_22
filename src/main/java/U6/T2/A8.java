package U6.T2;

import java.io.*;
import java.util.Arrays;

public class A8 {
  public static void main(String[] args) {
    // Crear una tabla de números aleatorios menores que 100, ordenados de menor a mayor, y
    // guardarlos en un fichero binario. A continuación, recuperarlos y mostrarlos por consola.

    Integer[] aleatoriosMenor100 = new Integer[(int) (1 + Math.random() * 99)];

    for (int i = 0; i < aleatoriosMenor100.length; i++) {
      aleatoriosMenor100[i] = (int) (1 + Math.random() * 99);
    }

    Arrays.sort(aleatoriosMenor100);

    try {
      FileOutputStream fb = new FileOutputStream("FicherosBinarios/A8.dat");
      ObjectOutputStream out = new ObjectOutputStream(fb);
      for (int i = 0; i < aleatoriosMenor100.length; i++) {
        out.writeInt(aleatoriosMenor100[i]);
      }
      out.close();
    } catch (IOException ex) {
      System.out.println("ERROR al escribir el fichero");
    }

    try {
      FileInputStream fb = new FileInputStream("FicherosBinarios/A8.dat");
      ObjectInputStream in = new ObjectInputStream(fb);
      while (true) {
        Integer num = in.readInt();
        System.out.println(num);
      }
    } catch (IOException ex) {
      System.out.println("ERROR al leer el fichero");
    }
  }
}
