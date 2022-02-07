package U5.T1.A6;

import U5.T1.A5.Instrumento;

import java.util.Arrays;

public class Campana extends Instrumento {

  // Constructor
  public Campana() {}

  // Método interpretar
  public void interpretar() {
    System.out.print("Notas Campana: ");
    for (int i = 0; i < getIndiceNotas(); i++) {
      System.out.print(getNotasArray()[i] + " ");
    }
    System.out.println();
  }
}
