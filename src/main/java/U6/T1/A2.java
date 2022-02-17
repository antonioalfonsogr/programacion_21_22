package U6.T1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A2 {
  public static void main(String[] args) {
    // Diseñar una aplicación que pida al usuario su nombre y edad. Estos datos deben guardarse en
    // el fichero "datos.txt". Si este fichero existe, debe borrarse su contenido, y en caso de no
    // existir, debe crearse.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca su Nombre:");
    String nombre = sc.nextLine();

    System.out.println("Introduzca su Edad");
    int edad = sc.nextInt();

    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("FicherosTexto/datos.txt"));
      out.write("Nombre: ");
      out.write(nombre);
      out.newLine();
      out.write("Edad: ");
      out.write(String.valueOf(edad));
      out.write(" años");
      out.newLine();
      out.close();
    } catch (IOException ex) {
      System.out.println("ERROR: Fallo al escribir el fichero");
    }
  }
}
