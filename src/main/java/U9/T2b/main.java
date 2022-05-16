package U9.T2b;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    System.out.print("\n-> ");
    ADClassicModels a = new ADClassicModels();

    System.out.println("\n - LISTA DE EMPLEADOS \n");
    System.out.println(a.getEmpleados());
    System.out.println("\n - LISTA DE OFICINAS \n");
    System.out.println(a.getOffices());

    System.out.println("\n-----------------------------------");
    System.out.println("|             M E N Ú             |");
    System.out.println("-----------------------------------");
    Scanner teclado = new Scanner(System.in);

    Integer opcion = 0;

    while (opcion != 5) {
      System.out.print(
          "\n* Seleccione una de las siguientes opciones: \n"
              + "  -  1. Insertar nuevo CLIENTE \n"
              + "  -  2. Asignar EMPLEADO a CLIENTE \n"
              + "  -  3. Añadir PRODUCTO a PEDIDO \n"
              + "  -  4. Mostrar con detalle un PEDIDO \n"
              + "  -  5. Salir de la aplicación \n"
              + "\nIntroduzca opción: ");
      opcion = teclado.nextInt();

      if (opcion == 1) {
        a.insertarCliente();
      } else if (opcion == 2) {
        a.AsignarEmpleadoCliente();
      }
    }

    ConexionBD.close();
  }
}
