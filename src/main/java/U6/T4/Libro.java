package U6.T4;

import java.util.Objects;

public class Libro implements Comparable<Libro> {

  // Atributos
  private String titulo;
  private String autor;

  // Constructor
  public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
  }

  // toString
  @Override
  public String toString() {
    return titulo + ": " + autor;
  }

  // equals
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Libro libro = (Libro) o;
    return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
  }

  // compareTo
  @Override
  public int compareTo(Libro o) {
    return this.titulo.compareTo(o.titulo);
  }

  // Getter & Setter
  @Override
  public int hashCode() {
    return Objects.hash(titulo, autor);
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }
}
