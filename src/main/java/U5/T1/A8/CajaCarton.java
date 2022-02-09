package U5.T1.A8;

import U5.T1.A7.Caja;

public class CajaCarton extends Caja {

  // Atributos
  private int etiqueta;
  private static double superficieTotal = 0;

  // Constructor
  public CajaCarton(double ancho, double alto, double fondo) {
    super(ancho, alto, fondo, unidadesEnum.cm);
    superficieTotal += calculaSuperficie(ancho, alto, fondo);
  }

  // Setter Etiqueta
  public void setEtiqueta(int etiqueta) {
    this.etiqueta = etiqueta;
  }

  // Método getVolumen polimórfico 80%
  @Override
  public double getVolumen() {
    return super.getVolumen() * 0.8;
  }

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

  // Método superficie
  private double calculaSuperficie(double ancho, double alto, double fondo) {
    return 2 * ((ancho * fondo) + (ancho * alto) + (fondo * alto));
  }

  // Getter superficieTotal
  public static double getSuperficieTotal() {
    return superficieTotal;
  }
}
