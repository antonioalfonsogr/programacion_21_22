package U6.T1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A7 {
  public static void main(String[] args) {
    // En LINUX disponemos de un comando "more", al que se le pasa un fichero y lo muestra poco a
    // poco (cada 24 líneas). Implementar un programa que funcione de forma similar.

    Scanner sc = new Scanner(System.in);
    // System.out.println("Nombre del fichero a leer:");
    //  String nombreFichero = sc.nextLine();

    try {
      BufferedReader in = new BufferedReader(new FileReader("FicherosTexto/textoLorem.txt"));
      int contadorLineas = 0;
      String texto = "";
      String linea = in.readLine();
      while (linea != null) {
        while (contadorLineas < 24 && linea != null) {
          texto += linea + "\n";
          linea = in.readLine();
          contadorLineas++;
        }
        System.out.println(texto);
        System.out.println("Pulse enter para continuar");
        String pausa = sc.nextLine();
        contadorLineas = 0;
        texto = "";
      }

      in.close();

    } catch (IOException ex) {
      System.out.println("ERROR: Fallo al leer el fichero");
    }
  }
}
