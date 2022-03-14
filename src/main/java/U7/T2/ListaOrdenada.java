package U7.T2;

import java.util.LinkedList;

public class ListaOrdenada<E> extends LinkedList<E> {

  private LinkedList listaOrdenada;

  public ListaOrdenada() {
    this.listaOrdenada = new ListaOrdenada<E>();
  }

  public void insertarOrdenado(E elemento) {

    listaOrdenada.add(elemento);
  }
}
