package U5.U4U5_Entregable;

import Test.Persona;

import java.util.Arrays;

public class Serie extends Multimedia implements Reproducible {

  // Atributos
  private String creador;
  private Integer numTemporadas;
  private String[] capitulosArray;
  private Integer indiceCapitulos;

  // Constructor
  public Serie(
      String titulo, Integer anyo, String creador, Integer numTemporadas, Integer numCapitulos) {
    super(titulo, anyo);
    this.creador = creador;
    this.numTemporadas = numTemporadas;
    this.capitulosArray = new String[numCapitulos];
    this.indiceCapitulos = 0;
  }

  // add_capitulo(String capitulo): que añade un capítulo al final del array de capítulos. No
  // devuelve nada
  public void add_capitulo(String capitulo) {
    if (indiceCapitulos >= capitulosArray.length) {
      capitulosArray = Arrays.copyOf(capitulosArray, capitulosArray.length + 1);
    }

    capitulosArray[indiceCapitulos] = capitulo;
    indiceCapitulos++;
  }

  // eliminar_capitulo(String capitulo): que busca el capítulo que se le pasa, y lo elimina del
  // array. Devuelve true si lo ha eliminado, false si no lo ha eliminado (porque no exista el
  // capítulo pasado, por ejemplo).
  public boolean eliminar_capitulo(String capitulo) {
    boolean eliminado = false;

    int indiceEliminar;
    for (int i = 0; i < capitulosArray.length; i++) {
      if (capitulosArray[i].equalsIgnoreCase(capitulo)) {
        indiceEliminar = i;
        eliminar_capitulo_x_indice(indiceEliminar);
        eliminado = true;
      }
    }

    return eliminado;
  }

  // Método eliminar_capitulo_x_indice para usarlo en elimar_capitulo
  private void eliminar_capitulo_x_indice(int indice) {
    String[] aux = new String[indiceCapitulos - 1];
    for (int i = 0; i < indice; i++) {
      aux[i] = capitulosArray[i];
    }
    for (int i = indice; i < aux.length; i++) {
      aux[i] = capitulosArray[i + 1];
    }
    indice--;

    capitulosArray = Arrays.copyOf(aux, aux.length);
  }

  // Métodos de Reproducible
  @Override
  public void play() {
    System.out.println("Reproduciendo serie " + getTitulo() + ", capítulo " + capituloAleatorio());
  }

  @Override
  public void pause() {
    System.out.println("Pausando serie " + getTitulo() + ", capítulo " + capituloAleatorio());
  }

  @Override
  public void stop() {
    System.out.println("Parando serie " + getTitulo() + ", capítulo " + capituloAleatorio());
  }

  // toString

  @Override
  public String toString() {
    return "Serie{"
        + super.toString()
        + "creador='"
        + creador
        + '\''
        + ", numTemporadas="
        + numTemporadas
        + ", capitulosArray="
        + Arrays.toString(capitulosArray)
        + ", indiceCapitulos="
        + indiceCapitulos
        + '}';
  }

  // Método para obtener capítulo aleatorio
  private String capituloAleatorio() {
    return capitulosArray[(int) (Math.random() * capitulosArray.length)];
  }

  // Getter & Setter

  public String getCreador() {
    return creador;
  }

  public void setCreador(String creador) {
    this.creador = creador;
  }

  public Integer getNumTemporadas() {
    return numTemporadas;
  }

  public void setNumTemporadas(Integer numTemporadas) {
    this.numTemporadas = numTemporadas;
  }

  public String[] getCapitulosArray() {
    return capitulosArray;
  }

  public void setCapitulosArray(String[] capitulosArray) {
    this.capitulosArray = capitulosArray;
  }

  public Integer getIndiceCapitulos() {
    return indiceCapitulos;
  }

  public void setIndiceCapitulos(Integer indiceCapitulos) {
    this.indiceCapitulos = indiceCapitulos;
  }
}
