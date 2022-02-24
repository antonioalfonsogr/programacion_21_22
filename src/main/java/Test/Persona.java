package Test;

public class Persona extends Personas {

  // Atibutos

  private String nombre;
  private Boolean gafas;
  private Integer edad;

  // Constructor;
  public Persona(String nombre, Boolean gafas, Integer edad) {
    this.nombre = nombre;
    this.gafas = gafas;
    this.edad = edad;
  }

  // Getter

  public String getNombre() {
    return nombre;
  }

  public Boolean getGafas() {
    return gafas;
  }

  public Integer getEdad() {
    return edad;
  }

  // toString

  @Override
  public String toString() {
    return "Persona{"
        + "nombre='"
        + nombre
        + '\''
        + ", gafas="
        + gafas
        + ", edad="
        + edad
        + '}'
        + "\n";
  }
}
