package U1.T4;

// El tipo short permite almacenar valores comprendidos entre -32768 y 32767. Realiza un programa
// que muestre si el rango de valores de un tipo se comporta de forma cíclica. Es decir, que muestre
// el valor máximo de una variable de tipo short, y muestre también qué ocurre si sumamos 1 a esa
// variable.

public class E4_1 {
  public static void main(String[] args) {
    short num1 = Short.MAX_VALUE;
    System.out.println(num1);
    num1++;
    System.out.println(num1);
  }
}
