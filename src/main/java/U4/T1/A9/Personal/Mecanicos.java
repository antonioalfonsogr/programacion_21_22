package U4.T1.A9.Personal;

import java.io.Serializable;

public class Mecanicos implements Serializable {

  private String nombreCompleto;
  private int tlfno;

  public enum Especialidades {
    frenos,
    hidraulica,
    electricidad,
    electronica,
  }

  public Especialidades especialidad;

  public Mecanicos(String nombreCompleto, int tlfno, Especialidades especialidad) {

    this.nombreCompleto = nombreCompleto;
    this.tlfno = tlfno;
    this.especialidad = especialidad;
  }
}
