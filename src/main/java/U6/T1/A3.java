package U6.T1;

import java.io.*;
import java.util.Scanner;

public class A3 {
  public static void main(String[] args) {
    // Crear un programa que duplique el contenido de un fichero. Realizar dos versiones:
    // 1. Duplicaremos el fichero original.txt en uno que se llame copia.txt
    // 2. Pedir el nombre del fichero fuente y duplicarlo en un fichero con el mismo nombre con el
    // prefijo "copia_de".

    Scanner sc = new Scanner(System.in);

    System.out.println("Elija la versión del programa (1 ó 2):");
    int version = sc.nextInt();

    String original = "original.txt";
    String copia = "copia.txt";

    if (version == 2) {
      System.out.println("Introduzca el nombre del fichero a leer:");
      original = sc.next();
      copia = "copia_de_" + original;
    }

    String texto = "";
    try {
      BufferedReader in = new BufferedReader(new FileReader("FicherosTexto/" + original));
      texto = "";
      String linea = in.readLine();
      while (linea != null) {
        texto += linea + "\n";
        linea = in.readLine();
      }
      in.close();
    } catch (IOException ex) {
      System.out.println("ERROR: Fallo al leer el fichero");
    }

    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("FicherosTexto/" + copia));
      out.write(texto);
      out.close();
    } catch (IOException ex) {
      System.out.println("ERROR: Fallo al escribir el fichero");
    }
  }
}
