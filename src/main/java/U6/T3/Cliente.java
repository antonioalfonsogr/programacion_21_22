package U6.T3;

import java.util.Objects;

public class Cliente implements Comparable {

  // Atributos
  private String dni;
  private String nombre;
  private Integer edad;
  private Double saldo;

  // Constructor
  public Cliente(String dni, String nombre, Integer edad, Double saldo) {
    this.dni = dni;
    this.nombre = nombre;
    this.edad = edad;
    this.saldo = saldo;
  }

  // Método toString
  @Override
  public String toString() {
    return "Cliente{"
        + "dni='"
        + dni
        + '\''
        + ", nombre='"
        + nombre
        + '\''
        + ", edad="
        + edad
        + ", saldo="
        + saldo
        + '}';
  }

  // Método equals
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Cliente)) return false;
    Cliente cliente = (Cliente) o;
    return dni.equals(cliente.dni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dni);
  }

  // Método compareTo
  @Override
  public int compareTo(Object o) {
    if (!(o instanceof Cliente)) return 0;
    Cliente that = (Cliente) o;
    return this.dni.compareTo(that.dni);
  }

  // Getter

  public String getDni() {
    return dni;
  }

  public String getNombre() {
    return nombre;
  }

  public Integer getEdad() {
    return edad;
  }

  public Double getSaldo() {
    return saldo;
  }
}
