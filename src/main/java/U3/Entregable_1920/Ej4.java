package U3.Entregable_1920;

public class Ej4 {
  public static void main(String[] args) {
    // Define la función convierteArrayEnString con la siguiente cabecera:
    // public static String convierteArrayEnString(int[] a)
    // Esta función toma como parámetro un array que contiene números y devuelve
    // una cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
    // vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
    // devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
    // “62501”.

    int[] a = {};
    int[] b = {8};
    int[] c = {6, 2, 5, 0, 1};

    String sa = convierteArrayEnString(a);
    String sb = convierteArrayEnString(b);
    String sc = convierteArrayEnString(c);

    System.out.println(sa);
    System.out.println(sb);
    System.out.println(sc);
  }

  public static String convierteArrayEnString(int[] a) {
    String cadena = "";

    for (int i = 0; i < a.length; i++) {
      cadena += a[i];
    }

    return cadena;
  }
}
