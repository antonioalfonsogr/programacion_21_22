package U1.Entregable_2021_Tarde;

import java.util.Scanner;

public class E_2021T_3 {
  public static void main(String[] args) {
    // Escribe un programa que sea capaz de insertar un dígito dentro de un número
    // indicando la posición. El nuevo dígito se colocará en la posición indicada y el
    // resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
    // izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
    // correctamente los datos. Se recomienda usar long en lugar de int ya que el
    // primero admite números más largos.
    //
    // Ejemplo:
    // Por favor, introduzca un número entero positivo: 406783
    // Introduzca la posición donde quiere insertar: 3
    // Introduzca el dígito que quiere insertar: 5
    // El número resultante es 4056783.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Por favor, introduzca un número entero positivo:");
    long numIntroducido = teclado.nextLong();

    System.out.println("Introduzca la posición donde quiere insertar:");
    int posicionInsertar = teclado.nextInt();

    System.out.println("Introduzca el dígito que quiere insertar:");
    int digitoInsertar = teclado.nextInt();

    long numParaDigitos = numIntroducido;
    int contadorDigitos = 0;

    while (numParaDigitos > 10) {
      numParaDigitos = numParaDigitos / 10;
      contadorDigitos++;
    }

    long cociente = numIntroducido;
    long resto;
    long numResultante = 0;
    int multiplicador = 0;

    for (int i = 0; cociente > 0; i++) {

      if (i != ((contadorDigitos - posicionInsertar)) + 1) {
        resto = cociente % 10;
        cociente = cociente / 10;
        numResultante = (long) (numResultante + resto * Math.pow(10, multiplicador));
        multiplicador++;
      } else {
        resto = cociente % 10;
        cociente = cociente / 10;
        numResultante = (long) (numResultante + resto * Math.pow(10, multiplicador));
        multiplicador++;

        numResultante = (long) (numResultante + digitoInsertar * Math.pow(10, multiplicador));
        multiplicador++;
      }
    }
    System.out.println("El número resultante es " + numResultante);
  }
}
