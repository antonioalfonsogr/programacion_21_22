package U5.T3.A2;

public class ColaTablaMain {
  public static void main(String[] args) {
    // Una cola es otra estructura dinámica como la pila, donde los elementos, en vez de apilarse y
    // desapilarse, se encolan y desencolan. La diferencia es que se desencola el primer elemento
    // encolado y no el último, como en las colas del autobús o del cine. El primero que llega es el
    // primero que sale de la cola  (vamos a suponer que nadie se cuela). Por tanto, los elementos
    // se encolan y desencolan en extremos opuestos de la estructura, llamados primero (el que está
    // primero y será el próximo en abandonar la cola) y último (el que llegó último). Se pide
    // implementar la clase ColaTabla en la que los elementos Integer encolados se guardan en una
    // tabla.

    ColaTabla ct1 = new ColaTabla(3);

    ct1.encolar(10);
    ct1.encolar(20);
    ct1.encolar(30);
    ct1.encolar(40);
    ct1.encolar(50);

    System.out.println(ct1);

    System.out.println(ct1.desenencolar());

    System.out.println(ct1);

    ct1.encolar(60);

    System.out.println(ct1);

    System.out.println(ct1.desenencolar());
    System.out.println(ct1.desenencolar());

    System.out.println(ct1);

    System.out.println(ct1.desenencolar());
    System.out.println(ct1.desenencolar());
    System.out.println(ct1.desenencolar());

    System.out.println(ct1);

    System.out.println(ct1.desenencolar());
    System.out.println(ct1);
  }
}
