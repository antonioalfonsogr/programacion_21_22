package U5.T3.A3;

public class ColaListaMain {
  public static void main(String[] args) {
    //
    ColaLista ct1 = new ColaLista(3);

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
  }
}
