package U7.T1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class A7 {
  public static void main(String[] args) {
    // Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán
    // por orden alfabético en una colección que no permita repeticiones. Mostrar luego la lista de
    // nombres por pantalla.

    Scanner sc = new Scanner(System.in);
    String nombre;
    TreeSet<String> nombresOrdenados = new TreeSet<>();

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
