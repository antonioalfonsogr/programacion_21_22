package U6.T1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class A6 {
  public static void main(String[] args) {
    // Un libro de firmas es útil para recoger todas las personas que han pasado por un determinado
    // lugar. Crear una aplicación que permita mostrar el libro de firmas o insertar un nuevo nombre
    // (comprobando que no se encuentre repetido). Llamaremos al fichero firmas.txt.

    Scanner sc = new Scanner(System.in);

    System.out.println("Escriba su nombre para firmar:");
    String firma = sc.nextLine();

    String[] libroFirmas = new String[0];

    int contador = 0;

    try {
      BufferedReader in = new BufferedReader(new FileReader("FicherosTexto/firmas.txt"));

      String linea = in.readLine();
      while (linea != null) {
        libroFirmas = Arrays.copyOf(libroFirmas, libroFirmas.length + 1);
        libroFirmas[contador] = linea;
        contador++;
        linea = in.readLine();
      }
      in.close();
    } catch (IOException ex) {
      System.out.println("ERROR: Fallo al leer el fichero");
    }

    boolean firmado = false;

    for (String libroFirma : libroFirmas) {
      if (firma.equalsIgnoreCase(libroFirma)) {
        firmado = true;
        break;
      }
    }

    if (!firmado) {
      try {
        BufferedWriter out = new BufferedWriter(new FileWriter("FicherosTexto/firmas.txt", true));
        out.newLine();
        out.write(firma);
        out.close();
      } catch (IOException ex) {
        System.out.println("ERROR: Fallo al escribir el fichero");
      }
    }

    System.out.println(Arrays.toString(libroFirmas));
  }
}
