package U7.T3b;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Traductor {

  private HashMap diccionario;

  public Traductor(String rutaDiccionario) {

    try {
      FileInputStream fichero = new FileInputStream(rutaDiccionario);
      ObjectInputStream in = new ObjectInputStream(fichero);
      //      while (true) {
      //        String linea = (String) in.readObject();
      //        String[] aux = linea.split("; ");
      //        diccionario.put(aux[0], aux[1]);
      //      }

    } catch (IOException ex) {
      System.out.println("Error al leer el fichero");
      //    } catch (ClassNotFoundException e) {
      //      e.printStackTrace();
    }
  }

  public String traduceString(String fraseEspañol) {
    String fraseIngles = "";

    return fraseIngles;
  }

  @Override
  public String toString() {
    return "Traductor{" + "diccionario=" + diccionario + '}';
  }
}
