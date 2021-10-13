package U1.T8;

import java.util.Scanner;

public class E8_2 {
  public static void main(String[] args) {
    // Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos
    // estadísticos de los alumnos. Se introducirán las edades de los elumnos hasta que una de ellas
    // sea negativa. La aplicación mostrará la suma de las edades, la media, de cuántos alumnos
    // hemos introducido su edad, y cuántos alumnos son mayores de edad.
    Scanner teclado = new Scanner(System.in);
    System.out.println(
        "Introduce la edad de los alumnos de una en una, para finalizar introduzca una edad negativa");
    // variables
    int sumaEdad = 0;
    double media = 0;
    int numAlumMayorEdad = 0;
    int numAlum = 0;
    int edad = 0;

    do {
      edad = teclado.nextInt();
      if (edad >= 0) {
        sumaEdad += edad;
        numAlum++;
        if (edad >= 18) {
          numAlumMayorEdad++;
        }
      } else numAlum = 1;
    } while (edad >= 0);
    media = sumaEdad / (numAlum);
    System.out.println("La suma de las edades es " + sumaEdad);
    System.out.println("La media de las edades es " + media);
    System.out.println("Numero de alumnos introducido es " + numAlum);
    System.out.println("Numero de alumnos mayores de edad " + numAlumMayorEdad);
  }
}
