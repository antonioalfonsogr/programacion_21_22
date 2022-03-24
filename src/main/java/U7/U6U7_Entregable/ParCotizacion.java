package U7.U6U7_Entregable;

import java.io.Serializable;
import java.util.Objects;

public class ParCotizacion implements Serializable {

  // Atributos

  private Divisa divisaBase;
  private Divisa dividaCotizada;
  private Double precioEntreDivisas;
  private Double variacionPorcentualUltimaHora;

  // Constructor

  public ParCotizacion(
      Divisa divisaBase,
      Divisa dividaCotizada,
      Double precioEntreDivisas,
      Double variacionPorcentualUltimaHora) {
    this.divisaBase = divisaBase;
    this.dividaCotizada = dividaCotizada;
    this.precioEntreDivisas = precioEntreDivisas;
    this.variacionPorcentualUltimaHora = variacionPorcentualUltimaHora;
  }

  // toString

  @Override
  public String toString() {
    return "ParCotizacion{"
        + "divisaBase="
        + divisaBase
        + ", dividaCotizada="
        + dividaCotizada
        + ", precioEntreDivisas="
        + precioEntreDivisas
        + ", variacionPorcentualUltimaHora="
        + variacionPorcentualUltimaHora
        + '}';
  }

  // equals

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ParCotizacion)) return false;
    ParCotizacion that = (ParCotizacion) o;
    return Objects.equals(divisaBase, that.divisaBase)
        && Objects.equals(dividaCotizada, that.dividaCotizada)
        && Objects.equals(precioEntreDivisas, that.precioEntreDivisas)
        && Objects.equals(variacionPorcentualUltimaHora, that.variacionPorcentualUltimaHora);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        divisaBase, dividaCotizada, precioEntreDivisas, variacionPorcentualUltimaHora);
  }

  // Getter & Setter

  public Divisa getDivisaBase() {
    return divisaBase;
  }

  public void setDivisaBase(Divisa divisaBase) {
    this.divisaBase = divisaBase;
  }

  public Divisa getDividaCotizada() {
    return dividaCotizada;
  }

  public void setDividaCotizada(Divisa dividaCotizada) {
    this.dividaCotizada = dividaCotizada;
  }

  public Double getPrecioEntreDivisas() {
    return precioEntreDivisas;
  }

  public void setPrecioEntreDivisas(Double precioEntreDivisas) {
    this.precioEntreDivisas = precioEntreDivisas;
  }

  public Double getVariacionPorcentualUltimaHora() {
    return variacionPorcentualUltimaHora;
  }

  public void setVariacionPorcentualUltimaHora(Double variacionPorcentualUltimaHora) {
    this.variacionPorcentualUltimaHora = variacionPorcentualUltimaHora;
  }
}
