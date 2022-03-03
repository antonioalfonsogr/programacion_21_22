package U5.U4U5_Examen;

public abstract class AgrupacionOficial extends Agrupacion {

  // Atributos
  private Integer puntosObtenidos;

  // Constructor

  public AgrupacionOficial(
      String nombre, String autor, String autorMusica, String autorLetra, String tipo) {
    super(nombre, autor, autorMusica, autorLetra, tipo);
    this.puntosObtenidos = 0;
  }

  // Método caminito_del_falla()
  public abstract void caminito_del_falla();

  // toString

  @Override
  public String toString() {
    return "AgrupacionOficial{"
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
        + ", puntosObtenidos="
        + puntosObtenidos
        + '}';
  }

  // Getter & Setter
  public Integer getPuntosObtenidos() {
    return puntosObtenidos;
  }

  public void setPuntosObtenidos(Integer puntosObtenidos) {
    this.puntosObtenidos = puntosObtenidos;
  }
}
