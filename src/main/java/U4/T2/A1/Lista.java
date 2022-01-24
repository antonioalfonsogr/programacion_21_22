package U4.T2.A1;

public class Lista {

  private int[] listaArray;

  // Constructor por defecto que cree la tabla con capacidad para 10 números.
  public Lista() {
    this.listaArray = new int[10];
  }

  // Constructor al que se le pasa como argumento el tamaño inicial de la tabla.
  public Lista(int capacidad) {
    this.listaArray = new int[capacidad];
  }

  // Insertar un número al final de la lista.
  public void insertarFinal() {}

  // Insertar un número al principio de la lista.
  public void insertarPrincipio() {}

  // Insertar un número en un lugar de la lista cuyo índice se pasa como parámetro.
  public void insertarEnIndice() {}

  // Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
  public void insertarArray() {}

  // Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
  public void eliminaEnIndice() {}

  // Obtener el elemento cuyo índice se pasa como parámetro.
  public void devuelveEnIndice() {}

  // Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no
  // está, devolver -1.

  // Representar la lista con una cadena de caracteres.
}
