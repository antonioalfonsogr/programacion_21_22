package U7.U6U7_Entregable;

import java.io.Serializable;
import java.util.Objects;

public class Fiat extends Divisa implements Serializable {

  // Atributos

  private String paisReferencia;

  // Constructor

  public Fiat(String nombre, String simbolo, Integer idDivisa, String paisReferencia) {
    super(nombre, simbolo, idDivisa);
    this.paisReferencia = paisReferencia;
  }

  // toString

  @Override
  public String toString() {
    return "Fiat{" + super.toString() + "paisReferencia='" + paisReferencia + '\'' + '}';
  }

  // equals

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Fiat)) return false;
    if (!super.equals(o)) return false;
    Fiat fiat = (Fiat) o;
    return Objects.equals(paisReferencia, fiat.paisReferencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), paisReferencia);
  }

  // Getter & Setter

  public String getPaisReferencia() {
    return paisReferencia;
  }

  public void setPaisReferencia(String paisReferencia) {
    this.paisReferencia = paisReferencia;
  }
}
