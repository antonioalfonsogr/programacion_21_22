package U4.T1.A8;

public class Bombilla {

  private enum estado {
    Encendida,
    Apagada
  }

  private String lugar;
  private estado estadoBombilla;
  private static boolean interruptorGeneral = true;

  public Bombilla(String lugar) {

    if (Math.random() > 0.5) {
      estadoBombilla = estado.Apagada;
    } else {
      estadoBombilla = estado.Encendida;
    }
    this.lugar = lugar;
  }

  public void interruptor() {
    if (estadoBombilla == estado.Apagada) {
      estadoBombilla = estado.Encendida;
    } else {
      estadoBombilla = estado.Apagada;
    }
  }

  public void consultar() {
    if (estadoBombilla == estado.Encendida && interruptorGeneral) {
      System.out.println("La bombilla de " + lugar + " esta " + estadoBombilla);
    } else {
      System.out.println("La bombilla de " + lugar + " esta " + estado.Apagada);
    }
  }

  public static void setInterruptorGeneral(boolean interruptorGeneral) {
    Bombilla.interruptorGeneral = interruptorGeneral;
  }
}
