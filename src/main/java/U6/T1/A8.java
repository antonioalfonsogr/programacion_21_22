package U6.T1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class A8 {
  public static void main(String[] args) {
    // Disponemos de dos ficheros perso1.txt y perso2.txt con nombres de personas (ambos ordenados).
    // Realizar un programa que lea ambos ficheros y que cree un tercer fichero (todos.txt) con
    // todos los nombres ordenados alfabéticamente.

    String[] nombresOrdenarArray = new String[0];
    int indice = 0;

    try {
      BufferedReader in = new BufferedReader(new FileReader("FicherosTexto/perso1.txt"));
      String linea = in.readLine();
      while (linea != null) {
        if (nombresOrdenarArray.length <= indice) {
          nombresOrdenarArray = Arrays.copyOf(nombresOrdenarArray, nombresOrdenarArray.length + 1);
        }
        nombresOrdenarArray[indice] = linea;
        indice++;
        linea = in.readLine();
      }
      in.close();

    } catch (IOException ex) {
      System.out.println("ERROR: Fallo al leer el fichero");
    }

    try {
      BufferedReader in = new BufferedReader(new FileReader("FicherosTexto/perso2.txt"));
      String linea = in.readLine();
      while (linea != null) {
        if (nombresOrdenarArray.length <= indice) {
          nombresOrdenarArray = Arrays.copyOf(nombresOrdenarArray, nombresOrdenarArray.length + 1);
        }
        nombresOrdenarArray[indice] = linea;
        indice++;
        linea = in.readLine();
      }

      in.close();

    } catch (IOException ex) {
      System.out.println("ERROR: Fallo al leer el fichero");
    }

    System.out.println();

    Arrays.sort(nombresOrdenarArray);
    System.out.println(Arrays.toString(nombresOrdenarArray));
  }
}
