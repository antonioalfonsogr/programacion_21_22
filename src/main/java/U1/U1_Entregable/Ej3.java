package U1.U1_Entregable;

import java.util.Scanner;

public class Ej3 {
  public static void main(String[] args) {
    // La hamburguesería Pitanza Feliz quiere se informatice su empresa. Realiza un programa que
    // calcule el precio de unos pedidos en función del número de hamburguesas y del día en el que
    // se haga.
    // El precio de la hamburguesa básica con los ingredientes mínimos (pan, carne, queso) es de 3
    // euros. La hamburguesa gourmet cuesta 5 euros, porque tiene carne de Waygu, pan artesano y
    // queso de oveja.
    // Los martes locos de Pitanza Feliz, un pedido de dos gourmet cuesta 9 euros, y los miércoles
    // de desmadre, la hamburguesa básica cuesta 2 euros.
    // Perteneciendo al club Fanegas de Pitanza Feliz, se obtiene un 12% de descuento sobre el
    // precio final del pedido.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Pedidos Pitanza Feliz");

    System.out.println("Número de hamburguesas básicas:");
    int numHamburguesaBasica = teclado.nextInt();

    System.out.println("Número de hamburguesas gourmet:");
    int numHamburguesagourmet = teclado.nextInt();

    System.out.println("Día de la semana");
    String diaSemana = teclado.nextLine();

    System.out.println("Pertenece al club Fanegas (s/n)");
    char clubFanegas = teclado.next().charAt(0);

    if (diaSemana.equals("martes")) {

    } else if (diaSemana.equals("viernes")) {
      int precioHamburguesaBasica = 3;
      int precioHamburguesaGourmet = 5;

    } else {

      int precioHamburguesaBasica = 3;
      int precioHamburguesaGourmet = 5;

      int precioTotal =
          (numHamburguesaBasica * precioHamburguesaBasica)
              + (numHamburguesagourmet * precioHamburguesaGourmet);
      int descuento;
      int aPagar;
    }
  }
}
