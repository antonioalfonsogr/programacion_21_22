package U7.T4;

import java.io.Serializable;
import java.util.Objects;

public abstract class Persona implements Serializable {

  // Atributos

  private Double altura;

  // Constructor

  public Persona(Double altura) {
    this.altura = altura;
  }

  // toString

  @Override
  public String toString() {
    return "altura";
  }

  // equals

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Persona)) return false;
    Persona persona = (Persona) o;
    return Objects.equals(altura, persona.altura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altura);
  }

  // Getter & Setter

  public Double getAltura() {
    return altura;
  }

  public void setAltura(Double altura) {
    this.altura = altura;
  }
}
