package U4.T1.A9.Maquinaria;

import java.io.Serializable;
import java.util.Arrays;

public class Trenes implements Serializable {
  @Override
  public String toString() {
    return "Trenes{"
        + "loc="
        + loc
        + ", vag="
        + Arrays.toString(vag)
        + ", maxVagones="
        + maxVagones
        + ", vagonesActuales="
        + vagonesActuales
        + '}';
  }

  private Locomotoras loc;
  private Vagones[] vag;
  private final int maxVagones = 5;
  private int vagonesActuales;

  public Trenes(Locomotoras loc) {

    this.vag = new Vagones[5];
    this.loc = loc;
    this.vagonesActuales = 1;
  }

  public void annadirVagon(int cargaMaxKg, int cargaActualKg, String tipoMercancia) {

    Vagones vagx = new Vagones(cargaMaxKg, cargaActualKg, tipoMercancia);

    if (vagonesActuales <= maxVagones) {
      vag[vagonesActuales - 1] = vagx;
      vagonesActuales++;
      System.out.println("Añadido el vagon de " + tipoMercancia);
    } else {
      System.out.println("El tren ya tiene el máximo de vagones posible");
    }
  }
}
