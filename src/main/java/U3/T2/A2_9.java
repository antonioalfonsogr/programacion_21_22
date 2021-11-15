package U3.T2;

public class A2_9 {
  public static void main(String[] args) {
    // Realizar un programa que haga lo siguiente:
    //
    // a) Crear un StringBuilder con la cadena "Alabí Alixar" y mostrarla por consola.
    // b) Mostrar por consola su capacidad y longitud.
    // c) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena
    // para que pase a ser "Chicharrones de Chiclana" y mostrarla por consola.
    // d) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena
    // para que pase a ser "Hay 5000 Chicharrones" y mostrarla por consola. El número entero 5000
    // debe estar almacenado en un int inicialmente.
    // e) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena
    // para que pase a ser "Hay 5000 Chicharrones en Chiclana" y mostrarla por consola.
    // f) Almacenar en un String los últimos 4 carácteres del StringBuilder resultante y mostrar ese
    // String por consola.
    // g) Mostrar por consola la capacidad y longitud del StringBuilder final.
    // h) Realizar el mismo ejercicio con la clase StringBuffer.

    StringBuilder stringB = new StringBuilder("Alabí Alixar");
    System.out.println(stringB.capacity());
    System.out.println(stringB.length());
    stringB.replace(0, stringB.length(), "Chicharrones de Chiclana");
    System.out.println(stringB);
    int num = 5000;
    stringB.insert(0, "Hay " + num + " ");
    System.out.println(stringB);
    stringB.replace(22, 24, "en");
    System.out.println(stringB);
    String cuatroUltimos = stringB.substring(stringB.length() - 4);
    System.out.println(cuatroUltimos);
  }
}
