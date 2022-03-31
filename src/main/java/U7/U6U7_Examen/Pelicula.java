package U7.U6U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable {

  private String titulo;
  private String fecha;
  private String paisOrigen;
  private String genero;
  private String director;
  private Integer idPelicula;
  private static Integer contadorIdsPelicula = 0;

  public Pelicula(String titulo, String fecha, String paisOrigen, String genero, String director) {
    this.titulo = titulo;
    this.fecha = fecha;
    this.paisOrigen = paisOrigen;
    this.genero = genero;
    this.director = director;
    this.idPelicula = contadorIdsPelicula;
    contadorIdsPelicula++;
  }

  @Override
  public String toString() {
    return "Pelicula{"
        + "titulo='"
        + titulo
        + '\''
        + ", fecha='"
        + fecha
        + '\''
        + ", paisOrigen='"
        + paisOrigen
        + '\''
        + ", genero='"
        + genero
        + '\''
        + ", director='"
        + director
        + '\''
        + ", idPelicula="
        + idPelicula
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Pelicula)) return false;
    Pelicula pelicula = (Pelicula) o;
    return Objects.equals(titulo, pelicula.titulo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titulo);
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public String getPaisOrigen() {
    return paisOrigen;
  }

  public void setPaisOrigen(String paisOrigen) {
    this.paisOrigen = paisOrigen;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public Integer getIdPelicula() {
    return idPelicula;
  }
}
