package U5.T2.A1;

import U4.T2.A1.Lista;

import java.util.Arrays;

public class PilaLista extends Lista implements Pila {

  // Atributos
  private Lista[] pilaLista;
  private int indice;

  // Constructor por defecto 3
  public PilaLista() {
    this.pilaLista = new Lista[3];
    this.indice = 0;
  }

  // Método Apilar
  public void apilar(Integer num) {
    insertarPrincipio(num);
  }

  // Método Desapilar
  public Integer desapilar() {
    Integer num = devuelveEnIndice(0);
    eliminaEnIndice(0);
    return num;
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
