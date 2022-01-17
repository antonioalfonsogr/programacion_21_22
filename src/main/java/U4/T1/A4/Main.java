package U4.T1.A4;

public class Main {
  public static void main(String[] args) {

    CuentaCorriente c1 = new CuentaCorriente("Antonio", "12345678A");

    c1.mostrarInformacion();

    CuentaCorriente.setBanco("BBVA");

    c1.mostrarInformacion();
  }
}
