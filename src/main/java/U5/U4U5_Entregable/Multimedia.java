package U5.U4U5_Entregable;

import java.util.Objects;

public abstract class Multimedia implements Comparable {

  // Atributos
  private String titulo;
  private Integer anyo;
  private Integer id;
  private static Integer indiceId = 1;
  private boolean finalizado;

  // Constructor
  protected Multimedia(String titulo, Integer anyo) {
    this.titulo = titulo;
    this.anyo = anyo;
    this.id = indiceId;
    this.finalizado = false;
    indiceId++;
  }

  // dar_por_finalizado(). Se tendrá que implementar este método. Bastará con un mensaje por
  // pantalla indicando que se ha marcado como finalizado, con el título del elemento.
  public void dar_por_finalizado() {
    finalizado = true;
    System.out.println(titulo + " se ha marcado como finalizado.");
  }

  // Método equals
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Multimedia)) return false;
    Multimedia that = (Multimedia) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  // Comparador por defecto, ordena por id
  @Override
  public int compareTo(Object o) {
    if (!(o instanceof Multimedia)) return 0;
    Multimedia that = (Multimedia) o;
    return this.id - that.id;
  }

  // toString

  @Override
  public String toString() {
    return "titulo='"
        + titulo
        + '\''
        + ", año="
        + anyo
        + ", id="
        + id
        + ", finalizado="
        + finalizado
        + ", ";
  }

  // Getter & Setter
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Integer getAnyo() {
    return anyo;
  }

  public void setAnyo(Integer anyo) {
    this.anyo = anyo;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public static Integer getIndiceId() {
    return indiceId;
  }

  public static void setIndiceId(Integer indiceId) {
    Multimedia.indiceId = indiceId;
  }

  public boolean isFinalizado() {
    return finalizado;
  }

  public void setFinalizado(boolean finalizado) {
    this.finalizado = finalizado;
  }
}
