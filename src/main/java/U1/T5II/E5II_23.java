package U1.T5II;

import java.util.Scanner;

public class E5II_23 {
  public static void main(String[] args) {
    // Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. El
    // programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o
    // chocolate.
    //
    // La tarta de manzana vale 18 euros y la de fresa 16. En caso de seleccionar la tarta de
    // chocolate, el programa debe preguntar además si el chocolate es negro o blanco; la primera
    // opción vale 14 euros y la segunda 15. Por último se pregunta si se añade nata y si se
    // personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.
    Scanner teclado = new Scanner(System.in);
    final double precionata = 2.50;
    final double precionombre = 2.75;
    double preciototal = 0.0;
    System.out.println("Elija un sabor (manzana, fresa o chocolate):");
    String sabor = teclado.next();
    // manzana
    if (sabor.equals("manzana")) {
      final double preciomanzana = 18.00;
      System.out.println("¿Quiere nata? (si o no):");
      String nata = teclado.next();
      if (nata.equals("si")) {
        preciototal = preciomanzana + precionata;
        System.out.println("¿Quiere ponerle un nombre? (si o no):");
        String nombre = teclado.next();
        System.out.println("Tarta de " + sabor + ": " + preciomanzana + " €");
        if (nombre.equals("si")) {
          preciototal = preciototal + precionombre;
          System.out.println("Con nombre: " + precionombre + " €");
        } else if (nombre.equals("no")) {
        } else {
          System.out.println("No ha intruduzido si quiere la ecritura del nombre correctamente");
        }
        System.out.println("Con nata: " + precionata + " €");
        System.out.println("Total: " + preciototal + " €");
      } else if (nata.equals("no")) {
        preciototal = preciomanzana;
        System.out.println("¿Quiere ponerle un nombre? (si o no):");
        String nombre = teclado.next();
        System.out.println("Tarta de " + sabor + ": " + preciomanzana + " €");
        if (nombre.equals("si")) {
          preciototal = preciototal + precionombre;
          System.out.println("Con nombre: " + precionombre + " €");
        } else if (nombre.equals("no")) {
        } else {
          System.out.println("No ha intruduzido si quiere la ecritura del nombre correctamente");
        }
        System.out.println("Total: " + preciototal + " €");
      } else {
        System.out.println("No ha introducido si quiere nata correctamente");
      }
    }
    // fresa
    else if (sabor.equals("fresa")) {
      final double preciofresa = 16.00;
      System.out.println("¿Quiere nata? (si o no):");
      String nata = teclado.next();
      if (nata.equals("si")) {
        preciototal = preciofresa + precionata;
        System.out.println("¿Quiere ponerle un nombre? (si o no):");
        String nombre = teclado.next();
        System.out.println("Tarta de " + sabor + ": " + preciofresa + " €");
        if (nombre.equals("si")) {
          preciototal = preciototal + precionombre;
          System.out.println("Con nombre: " + precionombre + " €");
        } else if (nombre.equals("no")) {
        } else {
          System.out.println("No ha intruduzido si quiere la ecritura del nombre correctamente");
        }
        System.out.println("Con nata: " + precionata + " €");
        System.out.println("Total: " + preciototal + " €");
      } else if (nata.equals("no")) {
        preciototal = preciofresa;
        System.out.println("¿Quiere ponerle un nombre? (si o no):");
        String nombre = teclado.next();
        System.out.println("Tarta de " + sabor + ": " + preciofresa + " €");
        if (nombre.equals("si")) {
          preciototal = preciototal + precionombre;
          System.out.println("Con nombre: " + precionombre + " €");
        } else if (nombre.equals("no")) {
        } else {
          System.out.println("No ha intruduzido si quiere la ecritura del nombre correctamente");
        }
        System.out.println("Total: " + preciototal + " €");
      } else {
        System.out.println("No ha introducido si quiere nata correctamente");
      }
      // chocolate
    } else if (sabor.equals("chocolate")) {
      System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco):");
      String tipochocolate = teclado.next();
      // chocolate negro
      if (tipochocolate.equals("negro")) {
        final double preciochocolatenegro = 14.00;
        System.out.println("¿Quiere nata? (si o no):");
        String nata = teclado.next();
        if (nata.equals("si")) {
          preciototal = preciochocolatenegro + precionata;
          System.out.println("¿Quiere ponerle un nombre? (si o no):");
          String nombre = teclado.next();
          System.out.println(
              "Tarta de " + sabor + " " + tipochocolate + ": " + preciochocolatenegro + " €");
          if (nombre.equals("si")) {
            preciototal = preciototal + precionombre;
            System.out.println("Con nombre: " + precionombre + " €");
          } else if (nombre.equals("no")) {
          } else {
            System.out.println("No ha intruduzido si quiere la ecritura del nombre correctamente");
          }
          System.out.println("Con nata: " + precionata + " €");
          System.out.println("Total: " + preciototal + " €");
        } else if (nata.equals("no")) {
          preciototal = preciochocolatenegro;
          System.out.println("¿Quiere ponerle un nombre? (si o no):");
          String nombre = teclado.next();
          System.out.println(
              "Tarta de " + sabor + " " + tipochocolate + ": " + preciochocolatenegro + " €");
          if (nombre.equals("si")) {
            preciototal = preciototal + precionombre;
            System.out.println("Con nombre: " + precionombre + " €");
          } else if (nombre.equals("no")) {
          } else {
            System.out.println("No ha intruduzido si quiere la ecritura del nombre correctamente");
          }
          System.out.println("Total: " + preciototal + " €");
        } else {
          System.out.println("No ha introducido si quiere nata correctamente");
        }
        // chocolate blanco
      } else if (tipochocolate.equals("blanco")) {
        final double preciochocolateblanco = 15.00;
        System.out.println("¿Quiere nata? (si o no):");
        String nata = teclado.next();
        if (nata.equals("si")) {
          preciototal = preciochocolateblanco + precionata;
          System.out.println("¿Quiere ponerle un nombre? (si o no):");
          String nombre = teclado.next();
          System.out.println(
              "Tarta de " + sabor + " " + tipochocolate + ": " + preciochocolateblanco + " €");
          if (nombre.equals("si")) {
            preciototal = preciototal + precionombre;
            System.out.println("Con nombre: " + precionombre + " €");
          } else if (nombre.equals("no")) {
          } else {
            System.out.println("No ha intruduzido si quiere la ecritura del nombre correctamente");
          }
          System.out.println("Con nata: " + precionata + " €");
          System.out.println("Total: " + preciototal + " €");
        } else if (nata.equals("no")) {
          preciototal = preciochocolateblanco;
          System.out.println("¿Quiere ponerle un nombre? (si o no):");
          String nombre = teclado.next();
          System.out.println(
              "Tarta de " + sabor + " " + tipochocolate + ": " + preciochocolateblanco + " €");
          if (nombre.equals("si")) {
            preciototal = preciototal + precionombre;
            System.out.println("Con nombre: " + precionombre + " €");
          } else if (nombre.equals("no")) {
          } else {
            System.out.println("No ha intruduzido si quiere la ecritura del nombre correctamente");
          }
          System.out.println("Total: " + preciototal + " €");
        } else {
          System.out.println("No ha introducido si quiere nata correctamente");
        }
      } else {
        System.out.println("Tipo de chocolate introduccido incorrectamente");
      }
    } else {
      System.out.println("Sabor introduccido incorrectamente");
    }
  }
}
