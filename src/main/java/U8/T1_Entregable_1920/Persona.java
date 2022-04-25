package U8.T1_Entregable_1920;

public class Persona {

  private String nombre;
  private Integer edad;
  private Integer id;

  public Persona(String nombre, Integer edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public Persona() {}

  @Override
  public String toString() {
    return "\n Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", id=" + id + '}';
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
