package U7.T1;

import java.util.ArrayList;

public class A3 {
  public static void main(String[] args) {
    // Crear una colección de 20 números enteros aleatorios menores que 10, guardarlos por orden
    // decreciente a medida que se vayan generando y mostrar la colección por pantalla.

    ArrayList<Integer> lista20menores10 = new ArrayList<>();

    int indice;

    for (int i = 0; i < 20; i++) {
      indice = 0;
      int numMenor10 = (int) (Math.random() * 10);

      for (int j = 0; j < lista20menores10.size(); j++) {
        if (numMenor10 < lista20menores10.get(j)) {
          indice++;
        } else break;
      }
      lista20menores10.add(indice, numMenor10);
    }

    System.out.println(lista20menores10);
  }
}
