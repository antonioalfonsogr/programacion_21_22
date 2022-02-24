package U5.U4U5_Entregable;

import java.util.Arrays;

public class Catalogo {

  // Atributos
  private Multimedia[] catalogoArray;
  private Integer indiceCatalogo;

  // Constructor
  public Catalogo() {
    this.catalogoArray = new Multimedia[1];
    this.indiceCatalogo = 0;
  }

  // add_multimedia(Multimedia elemento). Que añade un elemento multimedia al final del array de
  // elementos multimedia. No devuelve nada.
  public void add_multimedia(Multimedia elemento) {
    if (indiceCatalogo >= catalogoArray.length) {
      catalogoArray = Arrays.copyOf(catalogoArray, catalogoArray.length + 1);
    }

    catalogoArray[indiceCatalogo] = elemento;
    indiceCatalogo++;
  }

  // eliminar_multimedia(Multimedia elemento). Que elimina el elemento multimedia que se le pasa.
  // Devuelve true si lo ha eliminado, false si no lo ha eliminado (porque no exista el elemento
  // pasado, por ejemplo).
  public boolean eliminar_multimedia(Multimedia elemento) {
    boolean eliminado = false;

    int indiceEliminar;
    for (int i = 0; i < catalogoArray.length; i++) {
      if (catalogoArray[i].equals(elemento)) {
        indiceEliminar = i;
        eliminar_elemento_x_indice(indiceEliminar);
        eliminado = true;
      }
    }

    return eliminado;
  }

  // Método eliminar_elemento_x_indice para usarlo en elimar_capitulo
  private void eliminar_elemento_x_indice(int indice) {
    Multimedia[] aux = new Multimedia[indiceCatalogo - 1];
    for (int i = 0; i < indice; i++) {
      aux[i] = catalogoArray[i];
    }
    for (int i = indice; i < aux.length; i++) {
      aux[i] = catalogoArray[i + 1];
    }
    indiceCatalogo--;

    catalogoArray = Arrays.copyOf(aux, aux.length);
  }

  // ordenar_por_id(). Ordena el catálogo por el identificador único.
  public void ordenar_por_id() {
    Arrays.sort(catalogoArray);
  }

  // ordenar_por_titulo(). Ordena el catálogo por el título de la obra.
  public void ordenar_por_titulo() {
    Arrays.sort(catalogoArray, new ComparaMultimediaTitulo());
  }

  // ordenar_por_anyo(). Ordena el catálogo por el año de publicación/estreno
  public void ordenar_por_anyo() {
    Arrays.sort(catalogoArray, new ComparaMultimediaanyo());
  }

  // numero_de_elementos(). Devuelve el número de elementos Multimedia en el catálogo
  public int numero_de_elementos() {
    return indiceCatalogo;
  }

  // toString

  @Override
  public String toString() {
    return "Catalogo{" + "catalogoArray=" + Arrays.toString(catalogoArray) + '}';
  }

  // Getter & Setter

  public Multimedia[] getCatalogoArray() {
    return catalogoArray;
  }

  public void setCatalogoArray(Multimedia[] catalogoArray) {
    this.catalogoArray = catalogoArray;
  }

  public Integer getIndiceCatalogo() {
    return indiceCatalogo;
  }

  public void setIndiceCatalogo(Integer indiceCatalogo) {
    this.indiceCatalogo = indiceCatalogo;
  }
}
