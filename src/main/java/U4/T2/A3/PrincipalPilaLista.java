package U4.T2.A3;

import U4.T2.A1.Lista;

import java.util.Arrays;

public class PrincipalPilaLista {
  public static void main(String[] args) {

    Lista list1 = new Lista(1);
    list1.insertarFinal(11);

    Lista list2 = new Lista(1);
    list2.insertarFinal(22);

    Lista list3 = new Lista(1);
    list3.insertarFinal(33);

    Lista list4 = new Lista(1);
    list4.insertarFinal(44);

    Lista list5 = new Lista(1);
    list5.insertarFinal(55);

    PilaLista pila1 = new PilaLista();

    System.out.println(pila1.cima());

    pila1.apilar(list1);
    System.out.println(pila1.cima());

    pila1.apilar(list2);
    System.out.println(pila1.cima());

    pila1.apilar(list3);
    System.out.println(pila1.cima());

    pila1.apilar(list4);
    System.out.println(pila1.cima());

    System.out.println(Arrays.toString(pila1.getPilaLista()));

    System.out.println(pila1.desapilar());
    System.out.println(pila1.cima());
    System.out.println(Arrays.toString(pila1.getPilaLista()));

    pila1.apilar(list5);
    System.out.println(pila1.cima());
    System.out.println(Arrays.toString(pila1.getPilaLista()));
  }
}
