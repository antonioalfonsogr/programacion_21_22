package U1.T8;

public class E8_7 {
  public static void main(String[] args) {
    // Diseñar un programa que muestre el producto de los 10 primeros números impares.
    int resultado = 1;
    for (int i = 1; i < 10; i++) {
      if (i % 2 != 0) {
        resultado = resultado * i;
      }
    }
    System.out.println(resultado);
  }
}
