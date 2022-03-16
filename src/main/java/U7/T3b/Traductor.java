package U7.T3b;

import java.io.*;
import java.util.HashMap;

public class Traductor {

  private HashMap diccionario;

  public Traductor(String rutaDiccionario) {

    this.diccionario = new HashMap();

    try {
      BufferedReader in = new BufferedReader(new FileReader(rutaDiccionario));
      String linea = in.readLine();
      while (linea != null) {
        String[] aux = linea.split(", ");
        diccionario.put(aux[0], aux[1]);
        linea = in.readLine();
      }

    } catch (IOException ex) {
      System.out.println("Error al leer el fichero");
    }
  }

  public String traduceString(String fraseEspañol) {
    String fraseIngles = "";

    String[] fraseArrayEspannol = fraseEspañol.split("\\s");
    String[] fraseArrayIngles = new String[fraseArrayEspannol.length];

    for (int i = 0; i < fraseArrayIngles.length; i++) {
      fraseArrayIngles[i] = (String) diccionario.get(fraseArrayEspannol[i]);
    }

    for (int i = 0; i < fraseArrayIngles.length; i++) {
      fraseIngles += fraseArrayIngles[i] + " ";
    }

    return fraseIngles;
  }

  @Override
  public String toString() {
    return "Traductor{" + "diccionario=" + diccionario + '}';
  }
}
