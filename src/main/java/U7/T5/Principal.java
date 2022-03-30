package U7.T5;

import java.io.*;
import java.util.*;

public class Principal {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("1. Introducir datos de aspirante");
    System.out.println("2. Calificar prueba");
    System.out.println("3. Aprobados");
    System.out.println("4. Salir");
    System.out.println("Elija una opción:");
    int opcionMenu = sc.nextInt();
    sc.nextLine();

    switch (opcionMenu) {
      case 1:
        IntroducirAspirantes.insertarAspirante();

        guardadFichero("aspirantes.dat", IntroducirAspirantes.getAspiranteMap());

        guardadFichero("ids_aspirantes.dat", IntroducirAspirantes.getAspiranteMap().keySet());

        break;
      case 2:
        guardadFichero(
            "calificaciones.dat",
            CalificacionPruebas.calificacionesPrueba(
                (TreeSet<Integer>) leerFichero("ids_aspirantes.dat")));
        break;
      case 3:
        break;
      case 4:
        System.out.println("Gracias por usar nuestra aplicación");
        break;
      default:
        System.out.println("No ha elegido una opción correcta");
        break;
    }
  }

  public static void guardadFichero(String nombreFichero, Object objeto) {
    try {
      FileOutputStream ficheroBinario = new FileOutputStream("FicherosBinarios/" + nombreFichero);
      ObjectOutputStream out = new ObjectOutputStream(ficheroBinario);
      out.writeObject(objeto);
      out.close();
    } catch (IOException ex) {
      System.out.println("ERROR al escribir el fichero");
    }
  }

  public static Object leerFichero(String nombreFichero) {
    try {
      FileInputStream ficheroBinario = new FileInputStream("FicherosBinarios/" + nombreFichero);
      ObjectInputStream in = new ObjectInputStream(ficheroBinario);
      Object objeto = in.readObject();
      in.close();
      return objeto;
    } catch (IOException ex) {
      System.out.println("ERROR al leer el fichero");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return null;
  }
}
