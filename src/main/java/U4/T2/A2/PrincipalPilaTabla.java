package U4.T2.A2;

import java.util.Arrays;

public class PrincipalPilaTabla {
  public static void main(String[] args) {

    PilaTabla pila1 = new PilaTabla();
    PilaTabla pila2 = new PilaTabla(10);

    System.out.println(pila2.cima());

    System.out.println(pila1.cima());
    pila1.apilar(11);
    System.out.println(pila1.cima());
    pila1.apilar(22);
    System.out.println(pila1.cima());
    pila1.apilar(33);
    System.out.println(pila1.cima());
    pila1.apilar(44);
    System.out.println(pila1.cima());
    System.out.println(Arrays.toString(pila1.getPilaArray()));

    System.out.println(pila1.desapilar());
    System.out.println(pila1.cima());
    System.out.println(Arrays.toString(pila1.getPilaArray()));

    pila1.apilar(55);
    System.out.println(pila1.cima());
    System.out.println(Arrays.toString(pila1.getPilaArray()));
  }
}
