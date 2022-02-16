package U5.T2.A1;

import java.util.Arrays;

public class PilaTabla implements Pila {

  // Atributos
  private Integer[] pilaArray;
  private int indice;

  // Constructor por defecto 3
  public PilaTabla() {
    this.pilaArray = new Integer[3];
    this.indice = 0;
  }

  // Constructor elige tamaño
  public PilaTabla(int tamannoPila) {
    this.pilaArray = new Integer[tamannoPila];
    this.indice = 0;
  }

  // Método Apilar
  public void apilar(Integer num) {

    if (indice >= pilaArray.length) {
      pilaArray = Arrays.copyOf(pilaArray, pilaArray.length + 1);
    }
    pilaArray[indice] = num;
    indice++;
  }

  // Método Desapilar
  public Integer desapilar() {
    Integer num = pilaArray[indice - 1];
    indice--;
    pilaArray = Arrays.copyOfRange(pilaArray, 0, indice);
    return num;
  }

  // Método Cima
  public Integer cima() {
    if (indice < 1) {
      return null;
    } else {
      return pilaArray[indice - 1];
    }
  }

  // Getter
  public Integer[] getPilaArray() {
    return pilaArray;
  }
}
