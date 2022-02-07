package U5.T1.A6;

import U5.T1.A5.Instrumento;

import java.util.Arrays;

public class Piano extends Instrumento {

  // Atributos
  private String tipoPiano;

  // Constructor
  public Piano(String tipoPiano) {
    this.tipoPiano = tipoPiano;
  }

  // Método interpretar
  public void interpretar() {
    System.out.print("Notas Piano: ");
    for (int i = 0; i < getIndiceNotas(); i++) {
      System.out.print(getNotasArray()[i] + " ");
    }
    System.out.println();
  }
}
