package U6.T1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A1 {
  public static void main(String[] args) {
    // Realizar un programa que solicite al usuario el nombre de un fichero de texto y muestre su
    // contenido en pantalla. Si no se proporciona ningún nombre de fichero, la aplicación utilizará
    // por defecto "prueba.txt".

    Scanner sc = new Scanner(System.in);

    String ficheroLeer;

    System.out.println("Introduzca el nombre del fichero a leer:");
    ficheroLeer = sc.nextLine();

    if (ficheroLeer == "") {
      ficheroLeer = "prueba.txt";
    }

    try {
      BufferedReader in = new BufferedReader(new FileReader("FicherosTexto/" + ficheroLeer));
      String texto = "";
      String linea = in.readLine();
      while (linea != null) {
        texto += linea + "\n";
        linea = in.readLine();
      }
      System.out.println(texto);
      in.close();
    } catch (IOException ex) {
      System.out.println("ERROR: Fallo al leer el fichero");
    }
  }
}
