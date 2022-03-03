package U5.U4U5_Examen;

public class Romancero extends Agrupacion implements Callejera {

  // Atributos
  private String tematicaCartelon;

  // Constructor

  public Romancero(
      String nombre,
      String autor,
      String autorMusica,
      String autorLetra,
      String tipo,
      String tematicaCartelon) {
    super(nombre, autor, autorMusica, autorLetra, tipo);
    this.tematicaCartelon = tematicaCartelon;
  }

  // Método cantar_la_presentacion()
  @Override
  public void cantar_la_presentacion() {
    System.out.println("Cantando la presentación del Romancero " + this.getNombre());
  }

  // Método hacer_tipo()
  @Override
  public void hacer_tipo() {
    System.out.println("El Romancero " + this.getNombre() + " va de " + getTipo());
  }

  // Método amo_a_escucha()
  @Override
  public void amo_a_escucha() {
    System.out.println("Amo a escucha el Romancero " + this.getNombre());
  }

  // toSting
  @Override
  public String toString() {
    return "Romancero{"
        + "nombre='"
        + getNombre()
        + '\''
        + ", autor='"
        + getAutor()
        + '\''
        + ", autorMusica='"
        + getAutorMusica()
        + '\''
        + ", autorLetra='"
        + getAutorLetra()
        + '\''
        + ", tipo='"
        + getTipo()
        + '\''
        + ", tematicaCartelon='"
        + tematicaCartelon
        + '\''
        + '}';
  }

  // Getter & Setter
  public String getTematicaCartelon() {
    return tematicaCartelon;
  }

  public void setTematicaCartelon(String tematicaCartelon) {
    this.tematicaCartelon = tematicaCartelon;
  }
}
