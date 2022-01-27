package U4.T2.A3;

import U4.T2.A1.Lista;

import java.util.Arrays;

public class PilaLista {

  // Atributos
  private Lista[] pilaLista;
  private int indice;

  // Constructor por defecto 3
  public PilaLista() {
    this.pilaLista = new Lista[3];
    this.indice = 0;
  }

  // Método Apilar
  public void apilar(Lista list) {

    if (indice >= pilaLista.length) {
      pilaLista = Arrays.copyOf(pilaLista, pilaLista.length + 1);
    }
    pilaLista[indice] = list;
    indice++;
  }

  // Método Desapilar
  public Lista desapilar() {
    Lista list = pilaLista[indice - 1];
    indice--;
    pilaLista = Arrays.copyOfRange(pilaLista, 0, indice);
    return list;
  }

  // Método Cima
  public Lista cima() {
    if (indice < 1) {
      return null;
    } else {
      return pilaLista[indice - 1];
    }
  }

  // Getter
  public Lista[] getPilaLista() {
    return pilaLista;
  }
}
