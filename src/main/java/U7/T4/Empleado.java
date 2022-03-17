package U7.T4;

import java.io.Serializable;
import java.util.Objects;

public class Empleado extends Persona implements Serializable {

  // Atributos

  private String nombre;
  private String dni;
  private Integer edad;
  private Double sueldo;

  // Constructor

  public Empleado(Double altura, String nombre, String dni, Integer edad, Double sueldo) {
    super(altura);
    this.nombre = nombre;
    this.dni = dni;
    this.edad = edad;
    this.sueldo = sueldo;
  }

  // toString

  @Override
  public String toString() {
    return "Empleado{"
        + "nombre='"
        + nombre
        + '\''
        + ", dni='"
        + dni
        + '\''
        + ", edad="
        + edad
        + ", altura="
        + super.toString()
        + ", sueldo="
        + sueldo
        + '}';
  }

  // equal

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Empleado)) return false;
    if (!super.equals(o)) return false;
    Empleado empleado = (Empleado) o;
    return Objects.equals(nombre, empleado.nombre) && Objects.equals(dni, empleado.dni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), nombre, dni);
  }

  // Getter & Setter

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  public Double getSueldo() {
    return sueldo;
  }

  public void setSueldo(Double sueldo) {
    this.sueldo = sueldo;
  }
}
