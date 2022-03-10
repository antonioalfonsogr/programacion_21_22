package U7.T1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class A6 {
  public static void main(String[] args) {
    // Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán
    // en una colección, de forma que se conserve el orden de inserción y que no puedan repetirse.
    // Mostrar la estructura por pantalla.

    Scanner sc = new Scanner(System.in);
    String nombre;
    LinkedHashSet<String> nombresOrdenados = new LinkedHashSet<>();

    System.out.println("Introduzca un nombre:");
    nombre = sc.nextLine();

    while (!nombre.equalsIgnoreCase("fin")) {
      nombresOrdenados.add(nombre);
      System.out.println("Introduzca un nombre:");
      nombre = sc.nextLine();
    }

    System.out.println(nombresOrdenados);
  }
}
