package U5.T1.A7;

public class Caja {

  // Enum Unidades
  protected enum unidadesEnum {
    cm,
    m
  }

  // Atributos
  protected final double ancho;
  protected final double alto;
  protected final double fondo;
  protected unidadesEnum unidad;
  public String etiqueta;

  // Constructor
  public Caja(double ancho, double alto, double fondo, unidadesEnum unidad) {
    this.ancho = ancho;
    this.alto = alto;
    this.fondo = fondo;
    this.unidad = unidad;
  }

  // Método getVolumen

  public double getVolumen() {
    return ancho * alto * fondo;
  }

  // Método toString
  @Override
  public String toString() {
    return "Caja:("
        + "Ancho: "
        + ancho
        + unidad
        + ", Alto: "
        + alto
        + unidad
        + ", Fondo: "
        + fondo
        + unidad
        + ", Etiqueta: "
        + etiqueta
        + ')';
  }

  // Setter Etiqueta
  public void setEtiqueta(String etiqueta) {
    this.etiqueta = etiqueta;
  }

  // Getter Unidad
  public unidadesEnum getUnidad() {
    return unidad;
  }
}
