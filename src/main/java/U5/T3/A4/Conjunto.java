package U5.T3.A4;

public class Conjunto extends Lista {

  // Atributos
  private Integer numElementos;

  // Constructor por defecto 10
  public Conjunto() {
    super(10);
    numElementos = 0;
  }

  // Constructor elegir tamaño
  public Conjunto(int capacidad) {
    super(capacidad);
    numElementos = 0;
  }

  // Getter
  public Integer getNumElementos() {
    return numElementos;
  }

  // Método insertar número si no está en el conjunto
  public void addNumConjunto(int num) {
    boolean insertado = false;

    for (int i = 0; i < this.getListaArray().length; i++) {
      if (getListaArray()[i] == num) {
        insertado = true;
        break;
      }
    }
    if (!insertado) {
      insertarFinal(num);
      numElementos++;
    }
  }

  // Añadir al conjunto los elementos de otro que se pasa como parámetro
  public void addConjuntoAlConjunto(Conjunto conj) {
    for (int i = 0; i < conj.getListaArray().length; i++) {
      addNumConjunto(conj.getListaArray()[i]);
    }
  }

  // Eliminar un elemento que se pasa como parámetro. Si no estaba, no se hace nada.
  public void eliminaElemento(int num) {
    if (buscaNum(num) != -1) {
      eliminaEnIndice(buscaNum(num));
      numElementos--;
    }
  }

  // Eliminar del conjunto los elementos de otro que se pasa como parámetro
  public void eliminarConjuntoDelConjunto(Conjunto conj) {
    for (int i = 0; i < conj.getListaArray().length; i++) {
      eliminaElemento(conj.getListaArray()[i]);
    }
  }

  // Decir si un elemento que se le pasa como parámetro pertenece o no al conjunto
  public void comprobarElementoEnConjunto(int num) {
    boolean insertado = false;

    for (int i = 0; i < this.getListaArray().length; i++) {
      if (getListaArray()[i] == num) {
        insertado = true;
        break;
      }
    }
    if (insertado) {
      System.out.println("El elemento " + num + " ya esta insertado en el conjunto");
    } else {
      System.out.println("El elemento " + num + " NO esta insertado en el conjunto");
    }
  }

  @Override
  public String toString() {
    return representaCadena();
  }
}
