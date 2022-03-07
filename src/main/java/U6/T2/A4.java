package U6.T2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class A4 {
  public static void main(String[] args) {
    // Pedir un entero n por consola. A continuación, pedir n números double, que iremos guardando
    // en una tabla. Guardar la tabla en un archivo binario.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca la cantidad de doubles:");
    int numDoubles = sc.nextInt();

    Double[] doublesArray = new Double[numDoubles];

    for (int i = 0; i < doublesArray.length; i++) {
      System.out.println("Introduzca un double:");
      doublesArray[i] = sc.nextDouble();
    }

    try {
      FileOutputStream fichero = new FileOutputStream("FicherosBinarios/a4.dat");
      ObjectOutputStream out = new ObjectOutputStream(fichero);
      out.writeObject(doublesArray);
    } catch (IOException ex) {
      System.out.println("ERROR al escribir en el fichero");
    }
  }
}
