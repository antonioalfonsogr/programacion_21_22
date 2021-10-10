package U1.T5II;

import java.util.Scanner;

public class E5II_25 {
  public static void main(String[] args) {
    // Realiza un programa que calcule el precio de un desayuno. El programa preguntará primero qué
    // ha tomado el usuario de comer: palmera, donut o pitufo. La palmera vale 1.40 € y el donut 1
    // €. En caso de tomar pitufo, el programa debe preguntar además si era con aceite o con
    // tortilla; el primero vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida:
    // zumo o café a 1’50 y 1’20 respectivamente.
    Scanner teclado = new Scanner(System.in);

    // precios
    final double preciopalmera = 1.40;
    final double preciodonut = 1.00;
    final double preciopitufoaceite = 1.20;
    final double preciopitufotortilla = 1.60;
    final double preciozumo = 1.50;
    final double preciocafe = 1.20;

    System.out.println("¿Qué ha tomado de comer? (palmera, donut o pitufo):");
    String comida = teclado.next();
    // palmera
    if (comida.equals("palmera")) {
      System.out.println("¿Qué ha tomado de beber? (zumo o café):");
      String bebida = teclado.next();
      System.out.println("Palmera: " + preciopalmera + " €");
      if (bebida.equals("zumo")) {
        System.out.println("Zumo :" + preciozumo + " €");
        System.out.println("Total desayuno: " + (preciopalmera + preciozumo + " €"));
      } else if (bebida.equals("cafe")) {
        System.out.println("Cafe :" + preciocafe + " €");
        System.out.println("Total desayuno: " + (preciopalmera + preciocafe + " €"));
      } else {
        System.out.println("Bebida incorrecta");
      }
      // donut
    } else if (comida.equals("donut")) {
      System.out.println("¿Qué ha tomado de beber? (zumo o café):");
      String bebida = teclado.next();
      System.out.println("Donut: " + preciodonut + " €");
      if (bebida.equals("zumo")) {
        System.out.println("Zumo :" + preciozumo + " €");
        System.out.println("Total desayuno: " + (preciodonut + preciozumo + " €"));
      } else if (bebida.equals("cafe")) {
        System.out.println("Cafe :" + preciocafe + " €");
        System.out.println("Total desayuno: " + (preciodonut + preciocafe + " €"));
      } else {
        System.out.println("Bebida incorrecta");
      }
      // pitufo
    } else if (comida.equals("pitufo")) {
      System.out.println("¿Con qué se ha tomado el pitufo? (aceite o tortilla):");
      String ingredientepitufo = teclado.next();
      // pitufo aceite
      if (ingredientepitufo.equals("aceite")) {
        System.out.println("¿Qué ha tomado de beber? (zumo o café):");
        String bebida = teclado.next();
        System.out.println("Pitufo con aceite: " + preciopitufoaceite + " €");
        if (bebida.equals("zumo")) {
          System.out.println("Zumo :" + preciozumo + " €");
          System.out.println("Total desayuno: " + (preciopitufoaceite + preciozumo + " €"));
        } else if (bebida.equals("cafe")) {
          System.out.println("Cafe :" + preciocafe + " €");
          System.out.println("Total desayuno: " + (preciopitufoaceite + preciocafe + " €"));
        } else {
          System.out.println("Bebida incorrecta");
        }
        // pitufo tortilla
      } else if (ingredientepitufo.equals("tortilla")) {
        System.out.println("¿Qué ha tomado de beber? (zumo o café):");
        String bebida = teclado.next();
        System.out.println("Pitufo con tortilla: " + preciopitufotortilla + " €");
        if (bebida.equals("zumo")) {
          System.out.println("Zumo :" + preciozumo + " €");
          System.out.println("Total desayuno: " + (preciopitufotortilla + preciozumo + " €"));
        } else if (bebida.equals("cafe")) {
          System.out.println("Cafe :" + preciocafe + " €");
          System.out.println("Total desayuno: " + (preciopitufotortilla + preciocafe + " €"));
        } else {
          System.out.println("Bebida incorrecta");
        }
      } else {
        System.out.println("Ingrediente pitufo incorrecto");
      }
    } else {
      System.out.println("Comida incorrecta");
    }
  }
}
