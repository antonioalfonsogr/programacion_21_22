package U4.T2.A1;

import java.util.Arrays;

public class Lista {

  private int[] listaArray;

  private int indice;

  // Constructor por defecto que cree la tabla con capacidad para 10 números.
  public Lista() {
    this.listaArray = new int[10];
    this.indice = 0;
  }

  // Constructor al que se le pasa como argumento el tamaño inicial de la tabla.
  public Lista(int capacidad) {
    this.listaArray = new int[capacidad];
    this.indice = 0;
  }

  // Insertar un número al final de la lista.
  public void insertarFinal(int num) {

    insertarEnIndice(indice, num);
  }

  // Insertar un número al principio de la lista.
  public void insertarPrincipio(int num) {
    insertarEnIndice(0, num);
  }

  // Insertar un número en un lugar de la lista cuyo índice se pasa como parámetro.
  public void insertarEnIndice(int ind, int num) {

    int[] aux;

    if (indice < listaArray.length) {
      aux = new int[listaArray.length];

      for (int i = 0; i < ind; i++) {
        aux[i] = listaArray[i];
      }
      aux[ind] = num;
      for (int i = ind + 1; i < indice + 1; i++) {
        aux[i] = listaArray[i - 1];
      }
    } else {
      listaArray = Arrays.copyOf(listaArray, listaArray.length + 1);
      aux = new int[listaArray.length];

      for (int i = 0; i < ind; i++) {
        aux[i] = listaArray[i];
      }
      aux[ind] = num;
      for (int i = ind + 1; i < indice + 1; i++) {
        aux[i] = listaArray[i];
      }
    }
    listaArray = Arrays.copyOf(aux, aux.length);
    indice++;
  }

  // Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
  public void insertarArray(Lista list) {

    for (int i = 0; i < list.getIndice(); i++) {
      insertarEnIndice(indice, list.devuelveEnIndice(i));
    }
  }

  // Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
  public void eliminaEnIndice(int ind) {

    int[] aux = new int[indice - 1];

    for (int i = 0; i < ind; i++) {
      aux[i] = listaArray[i];
    }
    for (int i = ind; i < indice - 1; i++) {
      aux[i] = listaArray[i + 1];
    }

    listaArray = Arrays.copyOf(aux, aux.length);

    indice--;
  }

  // Obtener el elemento cuyo índice se pasa como parámetro.
  public int devuelveEnIndice(int ind) {
    int num;

    num = listaArray[ind];

    return num;
  }

  // Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no
  // está, devolver -1.
  public int buscaNum(int num) {
    int ind = -1;
    for (int i = 0; i < indice; i++) {
      if (listaArray[i] == num) {
        ind = i;
        break;
      }
    }
    return ind;
  }

  // Representar la lista con una cadena de caracteres.
  public String representaCadena() {

    StringBuilder cadena = new StringBuilder();

    for (int i = 0; i < indice; i++) {
      cadena.append(listaArray[i]).append(" ");
    }
    return cadena.toString();
  }

  // Getter
  public int getIndice() {
    return indice;
  }

  // Método toString
  @Override
  public String toString() {
    return "Lista" + Arrays.toString(listaArray);
  }
}
