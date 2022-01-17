package U4.T1.A1;

public class Main {
  public static void main(String[] args) {

    CuentaCorriente c1 = new CuentaCorriente("Antonio", "12345678A");

    System.out.println("Saldo inicial " + c1.getSaldo());

    c1.sacarDinero(60);

    System.out.println("Saldo después de intento de sacar " + c1.getSaldo());

    c1.sacarDinero(30);

    System.out.println("Saldo después de sacar " + c1.getSaldo());

    c1.ingresarDinero(100);

    System.out.println("Saldo después de ingresar " + c1.getSaldo());

    c1.mostrarInformacion();
  }
}
