package U4.T2.A1;

public class Principal {
  public static void main(String[] args) {

    Lista lista1 = new Lista();
    Lista lista2 = new Lista(5);

    lista1.insertarFinal(12);
    System.out.println(lista1.representaCadena());
    lista1.insertarFinal(13);
    System.out.println(lista1.representaCadena());
    lista1.insertarFinal(14);
    System.out.println(lista1.representaCadena());
    lista1.insertarPrincipio(15);
    System.out.println(lista1.representaCadena());
    lista1.insertarEnIndice(2, 16);
    System.out.println(lista1.representaCadena());
    lista1.insertarFinal(17);
    System.out.println(lista1.representaCadena());

    lista2.insertarFinal(22);
    System.out.println(lista2.representaCadena());
    lista2.insertarFinal(23);
    System.out.println(lista2.representaCadena());
    lista2.insertarFinal(24);
    System.out.println(lista2.representaCadena());
    lista2.insertarPrincipio(25);
    System.out.println(lista2.representaCadena());
    lista2.insertarEnIndice(2, 26);
    System.out.println(lista2.representaCadena());
    lista2.insertarFinal(27);
    System.out.println(lista2.representaCadena());

    lista1.insertarArray(lista2);
    System.out.println(lista1.representaCadena());

    lista2.insertarArray(lista1);
    System.out.println(lista2.representaCadena());

    lista1.eliminaEnIndice(2);
    System.out.println(lista1.representaCadena());

    System.out.println(lista1.devuelveEnIndice(1));

    System.out.println(lista1.buscaNum(22));
    System.out.println(lista2.buscaNum(100));
  }
}
