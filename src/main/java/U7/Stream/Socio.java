package U7.Stream;

import U5.U4U5_Examen.Agrupacion;

import java.time.LocalDate;
import java.util.Objects;

public class Socio implements Comparable {

  // Atributos

  private String dni;
  private String nombre;
  private LocalDate fechaNacimiento;
  private LocalDate fechaAlta;
  private Double cuota;
  private Integer numFamiliares;

  // Constructor
  public Socio(
      String dni,
      String nombre,
      LocalDate fechaNacimiento,
      LocalDate fechaAlta,
      Double cuota,
      Integer numFamiliares) {
    this.dni = dni;
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.fechaAlta = fechaAlta;
    this.cuota = cuota;
    this.numFamiliares = numFamiliares;

    // equal

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Socio)) return false;
    Socio socio = (Socio) o;
    return Objects.equals(dni, socio.dni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dni);
  }

  // compareTo

  @Override
  public int compareTo(Object o) {
    Socio s = (Socio) o;
    if (!(o instanceof Socio)) return 0;
    Socio that = (Socio) o;
    return this.dni.compareTo(that.dni);
  }

  // toString

  @Override
  public String toString() {
    return "Socio{"
        + "dni='"
        + dni
        + '\''
        + ", nombre='"
        + nombre
        + '\''
        + ", fechaNacimiento="
        + fechaNacimiento
        + ", fechaAlta="
        + fechaAlta
        + ", cuota="
        + cuota
        + ", numFamiliares="
        + numFamiliares
        + '}';
  }

  // Getter & Setter

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public LocalDate getFechaAlta() {
    return fechaAlta;
  }

  public void setFechaAlta(LocalDate fechaAlta) {
    this.fechaAlta = fechaAlta;
  }

  public Double getCuota() {
    return cuota;
  }

  public void setCuota(Double cuota) {
    this.cuota = cuota;
  }

  public Integer getNumFamiliares() {
    return numFamiliares;
  }

  public void setNumFamiliares(Integer numFamiliares) {
    this.numFamiliares = numFamiliares;
  }
}
