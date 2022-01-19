package U4.T1.A8;

public class Casa {
  public static void main(String[] args) {

    Bombilla b1 = new Bombilla("Entrada");
    Bombilla b2 = new Bombilla("Salon");
    Bombilla b3 = new Bombilla("Cocina");
    Bombilla b4 = new Bombilla("Baño");
    Bombilla b5 = new Bombilla("Dormitorio");

    b1.consultar();
    b2.consultar();
    b3.consultar();
    b4.consultar();
    b5.consultar();

    System.out.println();
    System.out.println("Pulso los interruptores impares");

    b1.interruptor();
    b3.interruptor();
    b5.interruptor();

    b1.consultar();
    b2.consultar();
    b3.consultar();
    b4.consultar();
    b5.consultar();

    Bombilla.setInterruptorGeneral(false);

    System.out.println();
    System.out.println("Apago el interruptor general");

    b1.consultar();
    b2.consultar();
    b3.consultar();
    b4.consultar();
    b5.consultar();

    Bombilla.setInterruptorGeneral(true);

    System.out.println();
    System.out.println("Enciendo el interruptor general");

    b1.consultar();
    b2.consultar();
    b3.consultar();
    b4.consultar();
    b5.consultar();
  }
}
