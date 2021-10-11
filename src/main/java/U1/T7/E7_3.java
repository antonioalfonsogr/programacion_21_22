package U1.T7;

public class E7_3 {
  public static void main(String[] args) {
    // Realiza un programa que genere una letra minúscula de forma aleatoria. Investiga el uso de la
    // función Math.random(). Investiga también sobre el sistema de codificación ASCII y ten en
    // cuenta que las letras minúsculas se corresponden con los números del 97 al 122.
    int num = (int) (97 + Math.random() * 25);
    char letra_aleatoria = (char) num;
    System.out.println("La letra aleatoria es: " + letra_aleatoria);
  }
}
