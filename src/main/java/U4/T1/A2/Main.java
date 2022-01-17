package U4.T1.A2;

public class Main {
  public static void main(String[] args) {
    CuentaCorriente c1 = new CuentaCorriente("Antonio", "12345678A");
    CuentaCorriente c2 = new CuentaCorriente(1000);
    CuentaCorriente c3 = new CuentaCorriente(500, -100, "87654321Z");

    c1.mostrarInformacion();
    c2.mostrarInformacion();
    c3.mostrarInformacion();
  }
}
