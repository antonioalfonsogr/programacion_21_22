package U5.T3.A2;

import java.util.Arrays;

public class ColaTabla {

  // Atributos
  private Integer[] colaArray;
  private int indice;

  // Constructor eligiendo el tamaño
  public ColaTabla(int tamanno) {
    this.colaArray = new Integer[tamanno];
    this.indice = 0;
  }

  // Método encolar
  public void encolar(Integer num) {

    if (indice >= colaArray.length) {
      colaArray = Arrays.copyOf(colaArray, colaArray.length + 1);
    }
    colaArray[indice] = num;
    indice++;
  }

  // Método desencolar
  public Integer desenencolar() {
    if (colaArray.length > 0) {
      Integer num = colaArray[0];
      colaArray = Arrays.copyOfRange(colaArray, 1, indice);
      indice--;
      return num;
    } else {
      System.out.println("No quedan elementos en cola");
      return -1;
    }
  }

  // Getter
  public Integer[] getColaArray() {
    return colaArray;
  }

  // toString
  @Override
  public String toString() {
    return Arrays.toString(colaArray);
  }
}
