package U1.T7;

import java.util.Scanner;

public class E7_2 {
  public static void main(String[] args) {
    // Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos". Necesitamos
    // almacenar en la variable booleana "jasp" el valor:
    // verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los
    // ingresos superan los 28000 (euros).
    // falso. En caso contrario.
    // escribe el código necesario para inicializar "jasp" en una línea.
    Scanner teclado = new Scanner(System.in);
    int edad;
    int nivel_de_estudios;
    int ingresos;
    System.out.println("Introduce edad");
    edad = teclado.nextInt();
    System.out.println("Introduce nivel de estudio en número");
    nivel_de_estudios = teclado.nextInt();
    System.out.println("Introduce ingresos");
    ingresos = teclado.nextInt();
    boolean jasp = (edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000);
    System.out.println(jasp);
  }
}
