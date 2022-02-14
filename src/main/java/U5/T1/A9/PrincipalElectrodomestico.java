package U5.T1.A9;

import java.util.Arrays;

public class PrincipalElectrodomestico {
  public static void main(String[] args) {

    // Creo Electrodomésticos
    System.out.println("Electrodomesticos:");
    Electrodomestico e1 = new Electrodomestico();
    System.out.println(e1);
    System.out.println();

    Electrodomestico e2 = new Electrodomestico(200, 35);
    System.out.println(e2);
    System.out.println();

    Electrodomestico e3 =
        new Electrodomestico(
            900, Electrodomestico.colorEnum.negro, Electrodomestico.cunsumosEnergeticosEnum.B, 300);
    System.out.println(e3);
    System.out.println();

    // Creo Lavadoras
    System.out.println("Lavadora:");
    Lavadora l1 = new Lavadora();
    System.out.println(l1);
    System.out.println();

    Lavadora l2 = new Lavadora(200, 60);
    System.out.println(l2);
    System.out.println();

    Lavadora l3 =
        new Lavadora(
            400,
            Electrodomestico.colorEnum.gris,
            Electrodomestico.cunsumosEnergeticosEnum.A,
            90,
            35);
    System.out.println(l3);
    System.out.println();

    Lavadora l4 =
        new Lavadora(
            1000,
            Electrodomestico.colorEnum.azul,
            Electrodomestico.cunsumosEnergeticosEnum.D,
            300,
            30);
    System.out.println(l4);
    System.out.println();

    // Comparador por defecto
    System.out.println(l1.compareTo(l3));

    // Comparador con clase comparator
    ComparaPFLavadora cpfl1 = new ComparaPFLavadora();
    System.out.println(cpfl1.compare(l1, l2));

    // Creación de Televisores
    System.out.println();
    System.out.println("Televisores:");

    Television t1 = new Television();
    System.out.println(t1);
    System.out.println();

    Television t2 = new Television(500, 20);
    System.out.println(t2);
    System.out.println();

    Television t3 =
        new Television(
            800,
            Electrodomestico.colorEnum.negro,
            Electrodomestico.cunsumosEnergeticosEnum.B,
            35,
            55,
            true);
    System.out.println(t3);
    System.out.println();

    // Ahora crea una clase ejecutable que realice lo siguiente:
    // Crea un array de Electrodomesticos de 10 posiciones.
    // Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
    // Deberás mostrar el contenido del array. (Fíjate sobre todo en que el precio que muestra es el
    // correspondiente a la clase correcta)
    // Crea después un array de objetos Lavadora, y ordena el array con la ordenación por defecto de
    // objetos Lavadora.
    // Crea otro array y ordénalo por precioFinal.

    Electrodomestico[] electrodomesticosArray = new Electrodomestico[10];
    electrodomesticosArray[0] = e1;
    electrodomesticosArray[1] = e2;
    electrodomesticosArray[2] = e3;
    electrodomesticosArray[3] = l1;
    electrodomesticosArray[4] = l2;
    electrodomesticosArray[5] = l3;
    electrodomesticosArray[6] = l4;
    electrodomesticosArray[7] = t1;
    electrodomesticosArray[8] = t2;
    electrodomesticosArray[9] = t3;

    imprimir(electrodomesticosArray);

    Lavadora[] lavadoraArray1 = new Lavadora[4];
    lavadoraArray1[0] = l1;
    lavadoraArray1[1] = l2;
    lavadoraArray1[2] = l3;
    lavadoraArray1[3] = l4;
    imprimir(lavadoraArray1);

    Arrays.sort(lavadoraArray1);
    imprimir(lavadoraArray1);

    Lavadora[] lavadoraArray2 = new Lavadora[4];
    lavadoraArray2[0] = l2;
    lavadoraArray2[1] = l4;
    lavadoraArray2[2] = l1;
    lavadoraArray2[3] = l3;
    imprimir(lavadoraArray2);

    Arrays.sort(lavadoraArray2, cpfl1);
    imprimir(lavadoraArray2);
  }

  public static void imprimir(Electrodomestico[] array) {
    for (Electrodomestico x : array) {
      System.out.println(x);
    }
    System.out.println(
        "------------------------------------------------------------------------------------------------");
    System.out.println();
  }
}
