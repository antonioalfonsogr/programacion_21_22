package U5.U4U5_Examen;

public class Coro extends AgrupacionOficial {

  // Atributos
  private Integer numeroBandurrias;
  private Integer numeroGuitarras;

  // Constructor

  public Coro(
      String nombre,
      String autor,
      String autorMusica,
      String autorLetra,
      String tipo,
      Integer numeroBandurrias,
      Integer numeroGuitarras) {
    super(nombre, autor, autorMusica, autorLetra, tipo);
    this.numeroBandurrias = numeroBandurrias;
    this.numeroGuitarras = numeroGuitarras;
    setPuntosObtenidos(0);
  }

  // Método cantar_la_presentacion()
  @Override
  public void cantar_la_presentacion() {
    System.out.println("Cantando la presentación del Coro " + this.getNombre());
  }

  // Método hacer_tipo()
  @Override
  public void hacer_tipo() {
    System.out.println("El Coro " + this.getNombre() + " va de " + getTipo());
  }

  // Método caminito_del_falla()
  @Override
  public void caminito_del_falla() {
    System.out.println("El coro " + this.getNombre() + " va caminito del falla.");
  }

  // toSting
  @Override
  public String toString() {
    return "Coro{"
        + "nombre='"
        + getNombre()
        + '\''
        + ", autor='"
        + getAutor()
        + '\''
        + ", autorMusica='"
        + getAutorLetra()
        + '\''
        + ", autorLetra='"
        + getAutorLetra()
        + '\''
        + ", tipo='"
        + getTipo()
        + '\''
        + ", numeroBandurrias="
        + numeroBandurrias
        + '\''
        + ", numeroGuitarras="
        + numeroGuitarras
        + '\''
        + ", puntosObtenidos="
        + getPuntosObtenidos()
        + '}';
  }

  // Getter & Setter
  public Integer getNumeroBandurrias() {
    return numeroBandurrias;
  }

  public void setNumeroBandurrias(Integer numeroBandurrias) {
    this.numeroBandurrias = numeroBandurrias;
  }

  public Integer getNumeroGuitarras() {
    return numeroGuitarras;
  }

  public void setNumeroGuitarras(Integer numeroGuitarras) {
    this.numeroGuitarras = numeroGuitarras;
  }
}
