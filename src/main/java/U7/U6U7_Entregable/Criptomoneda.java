package U7.U6U7_Entregable;

import java.io.Serializable;
import java.util.Objects;

public class Criptomoneda extends Divisa implements Serializable {

  // Atributos

  private Double precioEnDoble;
  private Double volumenTransaccion24h;
  private String fechaCreacion;
  private Integer rankingExchange;

  // Constructor

  public Criptomoneda(
      String nombre,
      String simbolo,
      Integer idDivisa,
      Double precioEnDolar,
      Double volumenTransaccion24h,
      String fechaCreacion,
      Integer rankingExchange) {
    super(nombre, simbolo, idDivisa);
    this.precioEnDoble = precioEnDoble;
    this.volumenTransaccion24h = volumenTransaccion24h;
    this.fechaCreacion = fechaCreacion;
    this.rankingExchange = rankingExchange;
  }

  // toString

  @Override
  public String toString() {
    return "Criptomoneda{"
        + super.toString()
        + "precioEnDoble="
        + precioEnDoble
        + ", volumenTransaccion24h="
        + volumenTransaccion24h
        + ", fechaCreacion='"
        + fechaCreacion
        + '\''
        + ", rankingExchange="
        + rankingExchange
        + '}';
  }

  // equals

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Criptomoneda)) return false;
    if (!super.equals(o)) return false;
    Criptomoneda that = (Criptomoneda) o;
    return Objects.equals(precioEnDoble, that.precioEnDoble)
        && Objects.equals(volumenTransaccion24h, that.volumenTransaccion24h)
        && Objects.equals(fechaCreacion, that.fechaCreacion)
        && Objects.equals(rankingExchange, that.rankingExchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(), precioEnDoble, volumenTransaccion24h, fechaCreacion, rankingExchange);
  }

  // Getter & Setter

  public Double getPrecioEnDoble() {
    return precioEnDoble;
  }

  public void setPrecioEnDoble(Double precioEnDoble) {
    this.precioEnDoble = precioEnDoble;
  }

  public Double getVolumenTransaccion24h() {
    return volumenTransaccion24h;
  }

  public void setVolumenTransaccion24h(Double volumenTransaccion24h) {
    this.volumenTransaccion24h = volumenTransaccion24h;
  }

  public String getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(String fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public Integer getRankingExchange() {
    return rankingExchange;
  }

  public void setRankingExchange(Integer rankingExchange) {
    this.rankingExchange = rankingExchange;
  }
}
