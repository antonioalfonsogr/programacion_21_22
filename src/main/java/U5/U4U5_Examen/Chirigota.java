package U5.U4U5_Examen;

public class Chirigota extends AgrupacionOficial implements Callejera {

  // Atributos
  private Integer numeroCuples;

  // Constructor
  public Chirigota(
      String nombre,
      String autor,
      String autorMusica,
      String autorLetra,
      String tipo,
      Integer numeroCuples) {
    super(nombre, autor, autorMusica, autorLetra, tipo);
    this.numeroCuples = numeroCuples;
    setPuntosObtenidos(0);
  }

  // Método cantar_la_presentacion()
  @Override
  public void cantar_la_presentacion() {
    System.out.println("Cantando la presentación de la Chirigota " + this.getNombre());
  }

  // Método hacer_tipo()
  @Override
  public void hacer_tipo() {
    System.out.println("La Chirigota " + this.getNombre() + " va de " + getTipo());
  }

  // Método caminito_del_falla()
  @Override
  public void caminito_del_falla() {
    System.out.println("La chirigota " + this.getNombre() + " va caminito del falla.");
  }

  // Método amo_a_escucha()
  @Override
  public void amo_a_escucha() {
    System.out.println("Amo a escucha la Chirigota " + this.getNombre());
  }

  // toSting
  @Override
  public String toString() {
    return "Chirigota{"
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
        + ", numeroCuples='"
        + numeroCuples
        + '\''
        + ", puntosObtenidos="
        + getPuntosObtenidos()
        + '}';
  }

  // Getter & Setter
  public Integer getNumeroCuples() {
    return numeroCuples;
  }

  public void setNumeroCuples(Integer numeroCuples) {
    this.numeroCuples = numeroCuples;
  }
}
