package U3.T2;

import java.util.Scanner;

public class A2_5 {
  public static void main(String[] args) {
    // Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier
    // vocal del nombre. Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz". Sólo se eliminarán
    // las vocales (mayúsculas, minúsculas y acentuadas). El resto de caracteres no se modifican.

    Scanner sc = new Scanner(System.in);

    String vocales = "AÁaáEÉeéIÍiíOÓoóUÚuú";

    System.out.println("Escriba su Nombre y Apellidos");
    String nombreApellidos = sc.nextLine();

    for (int i = 0; i < nombreApellidos.length(); i++) {
      char caracter = nombreApellidos.charAt(i);
      if (vocales.indexOf(caracter) == -1) System.out.print(caracter);
    }
  }
}
