package U4.T1.A7;

public class SintonizadorDigitalFM {

  public double frecuencia;
  private double minMHz = 80;
  private double maxMHz = 108;
  private double salto = 0.5;

  public SintonizadorDigitalFM() {

    frecuencia = 80;
  }

  public void up() {

    if (frecuencia + salto > maxMHz) {
      frecuencia = minMHz;
    } else frecuencia += salto;
    System.out.println("Frecuencia up");
  }

  public void down() {

    if (frecuencia - salto < minMHz) {
      frecuencia = maxMHz;
    } else frecuencia -= salto;
    System.out.println("Frecuencia down");
  }

  public void display() {

    System.out.println("La frecuencia actual son " + frecuencia + " MHz");
  }
}
