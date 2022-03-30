package U7.T5;

public class Aspirante {

  private String nombre;
  private String dni;
  private Integer telefono;

  public Aspirante(String nombre, String dni, Integer telefono) {
    this.nombre = nombre;
    this.dni = dni;
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    return "Aspirante{"
        + "nombre='"
        + nombre
        + '\''
        + ", dni='"
        + dni
        + '\''
        + ", telefono="
        + telefono
        + '}';
  }

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

  public Integer getTelefono() {
    return telefono;
  }

  public void setTelefono(Integer telefono) {
    this.telefono = telefono;
  }
}
