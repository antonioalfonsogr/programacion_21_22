package U5.U4U5_Examen;

import U5.U4U5_Entregable.Multimedia;

public abstract class Agrupacion implements Comparable {

  // Atributos
  private String nombre;
  private String autor;
  private String autorMusica;
  private String autorLetra;
  private String tipo;
  private static Integer numeroTotalAgrupaciones = 0;

  // Constructor
  public Agrupacion(
      String nombre, String autor, String autorMusica, String autorLetra, String tipo) {
    this.nombre = nombre;
    this.autor = autor;
    this.autorMusica = autorMusica;
    this.autorLetra = autorLetra;
    this.tipo = tipo;
    numeroTotalAgrupaciones++;
  }

  // Método cantar_la_presentacion()
  public abstract void cantar_la_presentacion();

  // Método hacer_tipo()
  public abstract void hacer_tipo();

  // Ordenación por defecto nombre
  @Override
  public int compareTo(Object o) {
    if (!(o instanceof Agrupacion)) return 0;
    Agrupacion that = (Agrupacion) o;
    return this.nombre.compareTo(that.nombre);
  }

  // to String
  @Override
  public String toString() {
    return "Agrupacion{"
        + "nombre='"
        + nombre
        + '\''
        + ", autor='"
        + autor
        + '\''
        + ", autorMusica='"
        + autorMusica
        + '\''
        + ", autorLetra='"
        + autorLetra
        + '\''
        + ", tipo='"
        + tipo
        + '\''
        + '}';
  }

  // Getter & Setter
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getAutorMusica() {
    return autorMusica;
  }

  public void setAutorMusica(String autorMusica) {
    this.autorMusica = autorMusica;
  }

  public String getAutorLetra() {
    return autorLetra;
  }

  public void setAutorLetra(String autorLetra) {
    this.autorLetra = autorLetra;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}
