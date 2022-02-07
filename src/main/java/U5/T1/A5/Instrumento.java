package U5.T1.A5;

public abstract class Instrumento {

  // Enum notas
  public enum notasEnum {
    Do,
    Re,
    Mi,
    Fa,
    Sol,
    La,
    Si
  }

  // Atributos
  private notasEnum[] notasArray;
  private int indiceNotas;

  // Constructor
  protected Instrumento() {
    this.notasArray = new notasEnum[100];
    this.indiceNotas = 0;
  }

  // Método add
  public void add(notasEnum nota) {
    if (indiceNotas < notasArray.length) {
      notasArray[indiceNotas] = nota;
      indiceNotas++;
    } else {
      System.out.println("ERROR: Se han almacenado el máximo número de notas");
    }
  }

  // Método abstracto interpretar
  public abstract void interpretar();

  // Getter notas
  public notasEnum[] getNotasArray() {
    return notasArray;
  }

  // Getter indice
  public int getIndiceNotas() {
    return indiceNotas;
  }
}
