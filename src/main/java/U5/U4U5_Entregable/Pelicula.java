package U5.U4U5_Entregable;

public class Pelicula extends Multimedia implements Reproducible {

  // Atributos
  private String Director_a;
  private Integer duracion;
  private String productora;
  private String pais;

  // Constructor
  public Pelicula(
      String titulo,
      Integer anyo,
      String director_a,
      Integer duracion,
      String productora,
      String pais) {
    super(titulo, anyo);
    Director_a = director_a;
    this.duracion = duracion;
    this.productora = productora;
    this.pais = pais;
  }

  // Métodos de Reproducible
  @Override
  public void play() {
    System.out.println("Reproduciendo película " + getTitulo());
  }

  @Override
  public void pause() {
    System.out.println("Pausando película " + getTitulo());
  }

  @Override
  public void stop() {
    System.out.println("Parando película " + getTitulo());
  }

  // toString

  @Override
  public String toString() {
    return "Pelicula{"
        + super.toString()
        + "Director_a='"
        + Director_a
        + '\''
        + ", duracion="
        + duracion
        + ", productora='"
        + productora
        + '\''
        + ", pais='"
        + pais
        + '\''
        + '}';
  }

  // Getter & Setter

  public String getDirector_a() {
    return Director_a;
  }

  public void setDirector_a(String director_a) {
    Director_a = director_a;
  }

  public Integer getDuracion() {
    return duracion;
  }

  public void setDuracion(Integer duracion) {
    this.duracion = duracion;
  }

  public String getProductora() {
    return productora;
  }

  public void setProductora(String productora) {
    this.productora = productora;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }
}
