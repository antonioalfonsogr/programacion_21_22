package U5.T3.A3;

import java.util.Arrays;

public class ColaLista extends Lista {
  // Atributos
  private Integer[] colaArray;
  private int indice;

  // Constructor eligiendo el tamaño
  public ColaLista(int tamanno) {
    this.colaArray = new Integer[tamanno];
    this.indice = 0;
  }

  // Método encolar
  public void encolar(Integer num) {
    insertarFinal(num);
  }

  // Método desencolar
  public Integer desenencolar() {
    int num = devuelveEnIndice(0);
    eliminaEnIndice(0);
    return num;
  }

  // Getter
  public Integer[] getColaArray() {
    return colaArray;
  }

  // toString
  @Override
  public String toString() {
    return representaCadena();
  }
}
