package U5.U4U5_Examen;

public class Comparsa extends AgrupacionOficial {

  // Atributos
  private String empresaAtrezzo;

  // Constructor

  public Comparsa(
      String nombre,
      String autor,
      String autorMusica,
      String autorLetra,
      String tipo,
      String empresaAtrezzo) {
    super(nombre, autor, autorMusica, autorLetra, tipo);
    this.empresaAtrezzo = empresaAtrezzo;
    setPuntosObtenidos(0);
  }

  // Método cantar_la_presentacion()
  @Override
  public void cantar_la_presentacion() {
    System.out.println("Cantando la presentación de la Comparsa " + this.getNombre());
  }

  // Método hacer_tipo()
  @Override
  public void hacer_tipo() {
    System.out.println("La Comparsa " + this.getNombre() + " va de " + getTipo());
  }

  // Método caminito_del_falla()
  @Override
  public void caminito_del_falla() {
    System.out.println("La comparsa " + this.getNombre() + " va caminito del falla.");
  }

  // toSting
  @Override
  public String toString() {
    return "Comparsa{"
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
        + ", empresaAtrezzo='"
        + empresaAtrezzo
        + '\''
        + ", puntosObtenidos="
        + getPuntosObtenidos()
        + '}';
  }

  // Getter & Setter
  public String getEmpresaAtrezzo() {
    return empresaAtrezzo;
  }

  public void setEmpresaAtrezzo(String empresaAtrezzo) {
    this.empresaAtrezzo = empresaAtrezzo;
  }
}
