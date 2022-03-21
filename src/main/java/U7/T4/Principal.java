package U7.T4;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Principal {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Escriba fichero, si desea cargar los datos de un fichero binario ");
    System.out.println("Escriba consola, si desea insertarlos desde la consola");
    System.out.println("Elija una opción:");

    String opcionUsuario = sc.next();

    LinkedHashMap<String, Empleado> diccionarioDatosEmpledos = new LinkedHashMap<>();

    String rutaFichero = "";

    if (opcionUsuario.equalsIgnoreCase("fichero")) {
      System.out.println("Escriba la ruta del fichero:");
      rutaFichero = sc.nextLine();

      try {
        FileInputStream fichero = new FileInputStream(rutaFichero);
        ObjectInputStream in = new ObjectInputStream(fichero);
        while (true) {
          Empleado emple = (Empleado) in.readObject();
          diccionarioDatosEmpledos.put(emple.getDni(), emple);

          System.out.println(diccionarioDatosEmpledos);
        }

      } catch (IOException ex) {
        System.out.println("ERROR al leer el fichero");
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }

    } else if (opcionUsuario.equalsIgnoreCase("consola")) {

      boolean otroEmpleado;

      do {
        System.out.println("Nombre del Empleado:");
        String nombreEmpleado = sc.next();
        System.out.println("DNI del Empleado:");
        String dniEmpleado = sc.next();
        System.out.println("Edad del Empleado:");
        Integer edadEmpleado = sc.nextInt();
        sc.nextLine();
        System.out.println("altura del Empleado:");
        Double alturaEmpleado = sc.nextDouble();
        sc.nextLine();
        System.out.println("Sueldo del Empleado:");
        Double sueldoEmpleado = sc.nextDouble();
        sc.nextLine();

        Empleado emple =
            new Empleado(alturaEmpleado, nombreEmpleado, dniEmpleado, edadEmpleado, sueldoEmpleado);

        diccionarioDatosEmpledos.put(emple.getDni(), emple);

        System.out.println(diccionarioDatosEmpledos);

        System.out.println("Desea introducir otro empleado (true or false)");
        otroEmpleado = sc.nextBoolean();

      } while (otroEmpleado);

    } else {
      System.out.println("ERROR: No ha seleccionado una opción valida");
    }

    boolean otroMenu;

    do {
      System.out.println("MENU:");
      System.out.println("1. VISUALIZAR LISTADO");
      System.out.println("2. BORRAR EMPLEADO/S");
      System.out.println("3. VISUALIZAR EMPLEADO");
      System.out.println("4. MODIFICAR EMPLEADO");
      System.out.println("5. INSERTAR EMPLEADO/S");
      System.out.println("Seleccione una opción tecleando 1 al 5:");
      int menuUsuario = sc.nextInt();
      sc.nextLine();

      switch (menuUsuario) {
        case 1:
          visualizarListado(diccionarioDatosEmpledos);
          System.out.println(diccionarioDatosEmpledos);
          break;
        case 2:
          Boolean eliminarOtro;
          do {
            System.out.println("Introduzca DNI del Empleado a borrar:");
            String dniAEliminar = sc.next();

            borrarEmpleado(diccionarioDatosEmpledos, dniAEliminar);

            System.out.println("Desea borrar otro Empleado (true or false):");
            eliminarOtro = sc.nextBoolean();

            System.out.println(diccionarioDatosEmpledos);
          } while (eliminarOtro);
          break;
        case 3:
          System.out.println("Introduzca DNI del Empleado a visualizar:");
          String dniAVisualizar = sc.next();

          visualizarEmpleado(diccionarioDatosEmpledos, dniAVisualizar);
          System.out.println(diccionarioDatosEmpledos);
          break;
        case 4:
          System.out.println("Introduzca DNI del Empleado a modificar:");
          String dniAModificar = sc.next();

          modificarEmpleado(diccionarioDatosEmpledos, dniAModificar);
          System.out.println(diccionarioDatosEmpledos);
          break;
        case 5:
          insertarEmpleado(diccionarioDatosEmpledos);
          System.out.println(diccionarioDatosEmpledos);
          break;
        default:
          System.out.println("No ha seleccionado una operación correctamente");
      }

      System.out.println("Desea realizar realizar otra operación (true or false)");
      otroMenu = sc.nextBoolean();

      System.out.println(diccionarioDatosEmpledos);

    } while (otroMenu);

    if (opcionUsuario.equalsIgnoreCase("fichero")) {
      try {
        FileOutputStream fichero = new FileOutputStream(rutaFichero);
        ObjectOutputStream out = new ObjectOutputStream(fichero);

      } catch (IOException ex) {
        System.out.println("Error al escribir el fichero");
      }
    } else {
      try {
        FileOutputStream fichero = new FileOutputStream("FicherosBinarios/");
        ObjectOutputStream out = new ObjectOutputStream(fichero);

      } catch (IOException ex) {
        System.out.println("Error al escribir el fichero");
      }
    }
  }

  public static void visualizarListado(LinkedHashMap empleadosMapa) {
    Set<Map.Entry<String, Empleado>> empleadosSet = empleadosMapa.entrySet();

    for (Map.Entry<String, Empleado> empleadoSet : empleadosSet) {
      System.out.println("Empleado: " + empleadoSet.getKey());
      System.out.println(empleadoSet.getValue());
    }
  }

  public static void borrarEmpleado(LinkedHashMap empleadosMapa, String dniEmpleado) {
    if (empleadosMapa.containsKey(dniEmpleado)) {
      empleadosMapa.remove(dniEmpleado);
    } else System.out.println("No existe empleado con eso DNI");
  }

  public static void visualizarEmpleado(LinkedHashMap empleadosMapa, String dniEmpleado) {
    System.out.println(empleadosMapa.get(dniEmpleado));
  }

  public static void modificarEmpleado(LinkedHashMap empleadosMapa, String dniEmpleado) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nombre del Empleado:");
    String nombreEmpleado = sc.next();
    System.out.println("Edad del Empleado:");
    Integer edadEmpleado = sc.nextInt();
    System.out.println("altura del Empleado:");
    Double alturaEmpleado = sc.nextDouble();
    System.out.println("Sueldo del Empleado:");
    Double sueldoEmpleado = sc.nextDouble();

    empleadosMapa.remove(dniEmpleado);

    Empleado emple =
        new Empleado(alturaEmpleado, nombreEmpleado, dniEmpleado, edadEmpleado, sueldoEmpleado);

    empleadosMapa.put(emple.getDni(), emple);
  }

  public static void insertarEmpleado(LinkedHashMap empleadosMapa) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nombre del Empleado:");
    String nombreEmpleado = sc.next();
    System.out.println("DNI del Empleado:");
    String dniEmpleado = sc.next();
    System.out.println("Edad del Empleado:");
    Integer edadEmpleado = sc.nextInt();
    System.out.println("altura del Empleado:");
    Double alturaEmpleado = sc.nextDouble();
    System.out.println("Sueldo del Empleado:");
    Double sueldoEmpleado = sc.nextDouble();

    Empleado emple =
        new Empleado(alturaEmpleado, nombreEmpleado, dniEmpleado, edadEmpleado, sueldoEmpleado);

    empleadosMapa.put(emple.getDni(), emple);
  }
}
