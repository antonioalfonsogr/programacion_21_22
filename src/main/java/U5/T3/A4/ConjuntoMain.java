package U5.T3.A4;

public class ConjuntoMain {
  public static void main(String[] args) {

    Conjunto c1 = new Conjunto();

    c1.addNumConjunto(1);
    c1.addNumConjunto(2);
    c1.addNumConjunto(3);
    c1.addNumConjunto(4);
    c1.addNumConjunto(5);
    c1.addNumConjunto(6);
    c1.addNumConjunto(6);

    System.out.println(c1.getNumElementos());
    System.out.println(c1);

    Conjunto c2 = new Conjunto(10);

    c2.addNumConjunto(2);
    c2.addNumConjunto(4);
    c2.addNumConjunto(6);
    c2.addNumConjunto(8);
    c2.addNumConjunto(8);

    System.out.println(c2.getNumElementos());
    System.out.println(c2);
    System.out.println();

    c2.addConjuntoAlConjunto(c1);

    System.out.println(c2.getNumElementos());
    System.out.println(c2);

    c1.eliminaElemento(2);
    c1.eliminaElemento(4);
    c1.eliminaElemento(6);
    c1.eliminaElemento(8);

    System.out.println();
    System.out.println(c1.getNumElementos());
    System.out.println(c1);

    c2.eliminarConjuntoDelConjunto(c1);
    System.out.println();
    System.out.println(c2.getNumElementos());
    System.out.println(c2);

    System.out.println();
    c2.comprobarElementoEnConjunto(4);
    c2.comprobarElementoEnConjunto(5);
  }
}
