package U6.T2;

import java.io.*;
import java.util.Scanner;

public class A7 {
  public static void main(String[] args) {
    // Escribir por teclado una frase y guardarla en un archivo binario. A continuación, recuperarla
    // del archivo y mostrarla por pantalla.

    Scanner sc = new Scanner(System.in);
    String fraseLeida = "";

    try {
      FileOutputStream fb = new FileOutputStream("FicherosBinarios/A7.dat");
      ObjectOutputStream out = new ObjectOutputStream(fb);
      System.out.println("Introduzca una frase:");
      String frase = sc.nextLine();
      out.writeObject(frase);
      out.close();

    } catch (IOException ex) {
      System.out.println("ERROR al escribir el fichero");
    }

    try {
      FileInputStream fb = new FileInputStream("FicherosBinarios/A7.dat");
      ObjectInputStream in = new ObjectInputStream(fb);
      fraseLeida = (String) in.readObject();
      in.close();

    } catch (IOException ex) {
      System.out.println("ERROR al leer el fichero");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(fraseLeida);
  }
}
