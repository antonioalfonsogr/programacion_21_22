package U6.T1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A5 {
  public static void main(String[] args) {
    // En el archivo numeros.txt disponemos de una serie de números (uno por cada línea). Diseñar un
    // programa que procese el fichero y nos muestre el menor y el mayor.

    int menor = -1;
    int mayor = -1;
    int contador = 0;

    try {
      BufferedReader in = new BufferedReader(new FileReader("FicherosTexto/numeros.txt"));
      int num;
      String linea = in.readLine();
      while (linea != null) {
        num = Integer.parseInt(linea);
        if (contador == 0) {
          mayor = num;
          menor = num;
        }
        if (mayor < num) {
          mayor = num;
        }
        if (menor > num) {
          menor = num;
        }
        contador++;
        linea = in.readLine();
      }
      in.close();
    } catch (IOException ex) {
      System.out.println("ERROR: Fallo al leer el fichero");
    }

    System.out.println("El número menor es : " + menor);
    System.out.println("El número mayor es : " + mayor);
  }
}
