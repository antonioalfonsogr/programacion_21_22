package U5.U4U5_Examen;

public class Cuarteto extends AgrupacionOficial implements Callejera {

  // Atributos
  private Integer numeroMiembros;

  // Constructor

  public Cuarteto(
      String nombre,
      String autor,
      String autorMusica,
      String autorLetra,
      String tipo,
      Integer numeroMiembros) {
    super(nombre, autor, autorMusica, autorLetra, tipo);
    this.numeroMiembros = numeroMiembros;
    setPuntosObtenidos(0);
  }

  // Método cantar_la_presentacion()
  @Override
  public void cantar_la_presentacion() {
    System.out.println("Cantando la presentación del Cuarteto " + this.getNombre());
  }

  // Método hacer_tipo()
  @Override
  public void hacer_tipo() {
    System.out.println("El Cuarteto " + this.getNombre() + " va de " + getTipo());
  }

  // Método caminito_del_falla()
  @Override
  public void caminito_del_falla() {
    System.out.println("El cuarteto " + this.getNombre() + " va caminito del falla.");
  }

  // Método amo_a_escucha()
  @Override
  public void amo_a_escucha() {
    System.out.println("Amo a escucha el Cuarteto " + this.getNombre());
  }

  // toSting
  @Override
  public String toString() {
    return "Cuarteto{"
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
        + ", numeroMiembros='"
        + numeroMiembros
        + '\''
        + ", puntosObtenidos="
        + getPuntosObtenidos()
        + '}';
  }

  // Getter & Setter
  public Integer getNumeroMiembros() {
    return numeroMiembros;
  }

  public void setNumeroMiembros(Integer numeroMiembros) {
    this.numeroMiembros = numeroMiembros;
  }
}
