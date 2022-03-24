package U7.U6U7_Entregable;

import java.io.Serializable;
import java.util.Objects;

public abstract class Divisa implements Comparable<Divisa>, Serializable {

  // Atributos

  private String nombre;
  private String simbolo;
  private Integer idDivisa;

  // Constructor

  public Divisa(String nombre, String simbolo, Integer idDivisa) {
    this.nombre = nombre;
    this.simbolo = simbolo;
    this.idDivisa = idDivisa;
  }

  // toString

  @Override
  public String toString() {
    return "nombre='" + nombre + '\'' + ", simbolo='" + simbolo + '\'' + ", idDivisa=" + idDivisa;
  }

  // compareteTo

  @Override
  public int compareTo(Divisa divisa) {
    Divisa that = divisa;
    return this.simbolo.compareTo(that.simbolo);
  }

  // equals

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Divisa)) return false;
    Divisa divisa = (Divisa) o;
    return Objects.equals(nombre, divisa.nombre)
        && Objects.equals(simbolo, divisa.simbolo)
        && Objects.equals(idDivisa, divisa.idDivisa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, simbolo, idDivisa);
  }

  // Getter & Setter

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getSimbolo() {
    return simbolo;
  }

  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  public Integer getIdDivisa() {
    return idDivisa;
  }

  public void setIdDivisa(Integer idDivisa) {
    this.idDivisa = idDivisa;
  }
}
