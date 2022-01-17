package U4.T1.A5;

public class Main {
  public static void main(String[] args) {
    Texto t1 = new Texto(16);

    t1.sumaPalabra("Casa", true);

    t1.sumaPalabra("Hola", true);

    t1.sumaPalabra("Adios", false);

    t1.sumaCaracter('a', true);

    t1.sumaPalabra("Esternocleidomastoideo", false);

    t1.sumaCaracter('z', false);

    t1.sumaCaracter('x', true);
  }
}
