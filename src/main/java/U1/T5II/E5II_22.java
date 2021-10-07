package U1.T5II;

import java.util.Scanner;

public class E5II_22 {
  public static void main(String[] args) {
    // La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos
    // ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio
    // base de una bandera es de un céntimo de
    // euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio se incrementa en
    // 2.50 € independientemente del tamaño. Los gastos de envío son 3.25 €. El IVA ya está incluido
    // en todas las tarifas.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca la altura de la bandera en cm:");
    double altura = teclado.nextDouble();
    System.out.println("Ahora introduzca la anchura:");
    double anchura = teclado.nextDouble();
    System.out.println("¿Quiere escudo bordado? (s/n):");
    String bordado = teclado.next();
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    double cm2 = altura * anchura;
    final double preciocm2 = 0.01;
    final double gastosdeenvio = 3.25;
    final double precioescudo = 2.50;
    System.out.println("Bandera de " + Math.round(cm2) + " cm2: " + (cm2 * preciocm2) + " €");
    if (bordado.equals("s")) {
      System.out.println("Con escudo: " + precioescudo + " €");
      System.out.println("Gastos de envío: " + gastosdeenvio + " €");
      System.out.println("Total: " + ((cm2 * preciocm2) + precioescudo + gastosdeenvio) + " €");
    } else if (bordado.equals("n")) {
      System.out.println("Sin escudo: 0,00 €");
      System.out.println("Gastos de envío: " + gastosdeenvio + " €");
      System.out.println("Total: " + ((cm2 * preciocm2) + gastosdeenvio) + " €");
    } else {
      System.out.println("¿Quiere escudo bordado? (s/n): Introducido incorrectamente");
    }
  }
}
