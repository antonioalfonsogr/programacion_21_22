package U5.U4U5_Entregable;

public class Libro extends Multimedia {

  // Atributos
  private String autor;
  private String editorial;
  private String iISBN;
  private Integer numPaginas;

  // Constructor
  public Libro(
      String titulo,
      Integer anyo,
      String autor,
      String editorial,
      String iISBN,
      Integer numPaginas) {
    super(titulo, anyo);
    this.autor = autor;
    this.editorial = editorial;
    this.iISBN = iISBN;
    this.numPaginas = numPaginas;
  }

  // toString

  @Override
  public String toString() {
    return "Libro{"
        + super.toString()
        + "autor='"
        + autor
        + '\''
        + ", editorial='"
        + editorial
        + '\''
        + ", iISBN='"
        + iISBN
        + '\''
        + ", numPaginas="
        + numPaginas
        + '}';
  }

  // Getter & Setter

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getEditorial() {
    return editorial;
  }

  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }

  public String getiISBN() {
    return iISBN;
  }

  public void setiISBN(String iISBN) {
    this.iISBN = iISBN;
  }

  public Integer getNumPaginas() {
    return numPaginas;
  }

  public void setNumPaginas(Integer numPaginas) {
    this.numPaginas = numPaginas;
  }
}
