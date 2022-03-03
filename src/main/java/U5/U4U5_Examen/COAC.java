package U5.U4U5_Examen;

import U5.U4U5_Entregable.Multimedia;

import java.util.Arrays;

public class COAC {

  // Atributo
  private AgrupacionOficial[] agrupacionesCOAC;
  private Integer indiceAgrupacionesCOAC;

  // Constructor

  public COAC(int num) {
    this.agrupacionesCOAC = new AgrupacionOficial[num];
    this.indiceAgrupacionesCOAC = 0;
  }

  // void inscribir_agrupacion(AgrupacionOficial agrupacion): Inscribe la agrupación en el concurso,
  // añadiéndola a un array de elementos de tipo AgrupacionOficial.
  public void inscribir_agrupacion(AgrupacionOficial agrupacion) {
    if (indiceAgrupacionesCOAC >= agrupacionesCOAC.length) {
      agrupacionesCOAC = Arrays.copyOf(agrupacionesCOAC, agrupacionesCOAC.length + 1);
    }

    agrupacionesCOAC[indiceAgrupacionesCOAC] = agrupacion;
    indiceAgrupacionesCOAC++;
  }

  // boolean eliminar_agrupacion(AgrupacionOficial agrupacion): Elimina a la agrupación en el
  // concurso, eliminándola del array. Devolverá true si lo eliminó o false en caso contrario.
  public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
    boolean eliminado = false;

    int indiceEliminar;
    for (int i = 0; i < agrupacionesCOAC.length; i++) {
      if (agrupacionesCOAC[i].equals(agrupacion)) {
        indiceEliminar = i;
        eliminar_x_indice(indiceEliminar);
        eliminado = true;
      }
    }

    return eliminado;
  }

  // Método para eliminar por índice
  private void eliminar_x_indice(int indice) {
    AgrupacionOficial[] aux = new AgrupacionOficial[indiceAgrupacionesCOAC - 1];
    for (int i = 0; i < indice; i++) {
      aux[i] = agrupacionesCOAC[i];
    }
    for (int i = indice; i < aux.length; i++) {
      aux[i] = agrupacionesCOAC[i + 1];
    }
    indiceAgrupacionesCOAC--;

    agrupacionesCOAC = Arrays.copyOf(aux, aux.length);
  }

  // void ordenar_por_puntos(): Ordena el array por los puntos obtenidos.
  public void ordenar_por_puntos() {
    Arrays.sort(agrupacionesCOAC, new ComparaAgrupacionOficialPuntos());
  }

  // void ordenar_por_nombre(): Ordena el array por el nombre de la agrupación.
  public void ordenar_por_nombre() {
    Arrays.sort(agrupacionesCOAC);
  }

  // void ordenar_por_autor(): Ordena el array por el autor de la agrupación.
  public void ordenar_por_autor() {
    Arrays.sort(agrupacionesCOAC, new ComparaAgrupacionAutor());
  }

  // to Sting
  @Override
  public String toString() {
    return "COAC{" + "agrupacionesCOAC=" + Arrays.toString(agrupacionesCOAC) + '}';
  }

  // Getter & Setter
  public AgrupacionOficial[] getAgrupacionesCOAC() {
    return agrupacionesCOAC;
  }

  public void setAgrupacionesCOAC(AgrupacionOficial[] agrupacionesCOAC) {
    this.agrupacionesCOAC = agrupacionesCOAC;
  }

  public Integer getIndiceAgrupacionesCOAC() {
    return indiceAgrupacionesCOAC;
  }

  public void setIndiceAgrupacionesCOAC(Integer indiceAgrupacionesCOAC) {
    this.indiceAgrupacionesCOAC = indiceAgrupacionesCOAC;
  }
}
