package U5.T2.A2;

import java.util.Arrays;

public class PrincipalCliente {
  public static void main(String[] args) {

    // Creo clientes y los meto en un Array

    Cliente[] tablaClientes = new Cliente[5];

    Cliente c1 = new Cliente("76658116J", "Manolo", 38, 8000.25);
    Cliente c2 = new Cliente("56524167B", "Ana", 19, 500.87);
    Cliente c3 = new Cliente("14450878R", "Roberto", 35, 2345.23);
    Cliente c4 = new Cliente("30140731J", "Lucía", 65, 878.23);
    Cliente c5 = new Cliente("50671711C", "Bea", 28, 15234.49);

    tablaClientes[0] = c1;
    tablaClientes[1] = c2;
    tablaClientes[2] = c3;
    tablaClientes[3] = c4;
    tablaClientes[4] = c5;

    // Imprimo sin ordenar
    System.out.println("Sin ordenar");
    for (Cliente c : tablaClientes) {
      System.out.println(c);
    }
    System.out.println();

    // Ordeno por dni
    Arrays.sort(tablaClientes);

    System.out.println("Ordenado por dni");
    for (Cliente c : tablaClientes) {
      System.out.println(c);
    }
    System.out.println();

    // ordeno por nombre
    ComparaClientesNombre comparaClientesNombre = new ComparaClientesNombre();
    Arrays.sort(tablaClientes, comparaClientesNombre);

    System.out.println("Ordenado por nombre");
    for (Cliente c : tablaClientes) {
      System.out.println(c);
    }
    System.out.println();

    // Ordeno por edad
    ComparaClientesEdad comparaClientesEdad = new ComparaClientesEdad();
    Arrays.sort(tablaClientes, comparaClientesEdad);

    System.out.println("Ordenado por edad");
    for (Cliente c : tablaClientes) {
      System.out.println(c);
    }
    System.out.println();
  }
}
