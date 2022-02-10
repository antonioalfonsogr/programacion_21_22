package U5.T1.A9;

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

    // Comparador por defecto
    System.out.println(l1.compareTo(l3));

    // Comparador con clase comparator
    ComparaPFLavadora cpfl1 = new ComparaPFLavadora();
    System.out.println(cpfl1.compare(l1, l2));
  }
}
