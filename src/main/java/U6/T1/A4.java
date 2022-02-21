package U6.T1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A4 {
  public static void main(String[] args) {
    // Realizar un programa que lea un fichero de texto llamado carta.txt, tenemos que contar los
    // caracteres, las líneas y las palabras. Para facilitar el procesamiento supondremos que cada
    // palabra está separada de otra por un único espacio en blanco.

    int numLineas = 0;
    int numPalabras = 0;

    String texto = "";

    try {
      BufferedReader in = new BufferedReader(new FileReader("FicherosTexto/carta.txt"));
      texto = "";
      String linea = in.readLine();
      while (linea != null) {
        texto += linea;
        linea = in.readLine();
        numLineas++;
      }
      in.close();
    } catch (IOException ex) {
      System.out.println("ERROR: Fallo al leer el fichero");
    }

    for (int i = 0; i < texto.length(); i++) {
      if (texto.charAt(i) == ' ') {
        numPalabras++;
      }
    }

    System.out.println("Número de caracteres: " + texto.length());
    System.out.println("Número de lineas: " + numLineas);
    System.out.println("Número de palabras: " + (numPalabras + numLineas));
  }
}
