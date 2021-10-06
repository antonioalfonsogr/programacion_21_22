package U1.T5II;

import java.util.Scanner;

public class E5II_20 {
  public static void main(String[] args) {
    // Escribe un programa que calcule el precio final de un producto según su base imponible
    // (precio antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el
    // código promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4%
    // respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que
    // significan respectivamente que no se aplica promoción, el precio se reduce a la mitad, se
    // descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se muestran los
    // valores correctos, aunque los números no estén tabulados.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca la base imponible");
    double baseimponible = teclado.nextDouble();

    System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
    String tipoiva = teclado.next();

    System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc):");
    String codpromo = teclado.next();

    if (codpromo.equals("nopro")) {
      if (tipoiva.equals("general")) {
        System.out.println("Base imponible: " + baseimponible);
        System.out.println("IVA (21%): " + baseimponible * 0.21);
        System.out.println("Precio con IVA: " + baseimponible * 1.21);
        System.out.println("Cód.promo. (nopro)");
        System.out.println("Total: " + baseimponible * 1.21);
      } else if (tipoiva.equals("reducido")) {
        System.out.println("Base imponible: " + baseimponible);
        System.out.println("IVA (10%): " + baseimponible * 0.1);
        System.out.println("Precio con IVA: " + baseimponible * 1.1);
        System.out.println("Cód.promo. (nopro)");
        System.out.println("Total: " + baseimponible * 1.1);
      } else if (tipoiva.equals("superreducido")) {
        System.out.println("Base imponible: " + baseimponible);
        System.out.println("IVA (4%): " + baseimponible * 0.04);
        System.out.println("Precio con IVA: " + baseimponible * 1.04);
        System.out.println("Cód.promo. (nopro)");
        System.out.println("Total: " + baseimponible * 1.04);
      } else {
        System.out.println("Tipo de iva mal introducido");
      }
    }
  }
}
