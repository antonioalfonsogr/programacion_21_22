package U7.T1;

import java.util.TreeSet;

public class A5 {
  public static void main(String[] args) {
    // Crear una colección de 20 números enteros aleatorios distintos menores que 100, guardarlos
    // por orden decreciente a medida que se vayan generando, y mostrar la colección por pantalla.

    TreeSet<Integer> enteros20 = new TreeSet<>(new OrdenaAlReves());

    while (enteros20.size() != 20) {
      enteros20.add((int) (Math.random() * 100));
    }

    System.out.println(enteros20);
  }
}
