package U8.T5;

import java.util.List;

public class Futbolista {

  private Integer dorsal;
  private String nombre;
  private List<String> posiciones;
  private String equipo;

  public Futbolista(Integer dorsal, String nombre, List<String> posiciones, String equipo) {
    this.dorsal = dorsal;
    this.nombre = nombre;
    this.posiciones = posiciones;
    this.equipo = equipo;
  }

  public Integer getDorsal() {
    return dorsal;
  }

  public void setDorsal(Integer dorsal) {
    this.dorsal = dorsal;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public List<String> getPosiciones() {
    return posiciones;
  }

  public void setPosiciones(List<String> posiciones) {
    this.posiciones = posiciones;
  }

  public String getEquipo() {
    return equipo;
  }

  public void setEquipo(String equipo) {
    this.equipo = equipo;
  }

  @Override
  public String toString() {
    return "Futbolista{"
        + "dorsal="
        + dorsal
        + ", nombre='"
        + nombre
        + '\''
        + ", posiciones="
        + posiciones
        + ", equipo='"
        + equipo
        + '\''
        + '}';
  }
}
