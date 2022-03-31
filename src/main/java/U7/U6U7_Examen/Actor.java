package U7.U6U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Serializable {

  private String nombre;
  private String apellido;
  private String nacionalidad;
  private Integer idActor;
  private static Integer contadorIdsActor = 0;

  public Actor(String nombre, String apellido, String nacionalidad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.nacionalidad = nacionalidad;
    this.idActor = contadorIdsActor;
    contadorIdsActor++;
  }

  @Override
  public String toString() {
    return "Actor{"
        + "nombre='"
        + nombre
        + '\''
        + ", apellido='"
        + apellido
        + '\''
        + ", nacionalidad='"
        + nacionalidad
        + '\''
        + ", idActor="
        + idActor
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Actor)) return false;
    Actor actor = (Actor) o;
    return Objects.equals(nombre, actor.nombre) && Objects.equals(apellido, actor.apellido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, apellido);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getNacionalidad() {
    return nacionalidad;
  }

  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }

  public Integer getIdActor() {
    return idActor;
  }

  public void setIdActor(Integer idActor) {
    this.idActor = idActor;
  }

  public static Integer getContadorIdsActor() {
    return contadorIdsActor;
  }
}
