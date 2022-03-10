package U7.T1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A4 {
  public static void main(String[] args) {
    // Introducir por consola una frase que conste exclusivamente de palabras separadas por
    // espacios. Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por
    // pantalla las palabras que estén repetidas. A continuación, mostrar las que no lo estén.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca una frase:");
    String frase = sc.nextLine();

    String[] arrayPalabrasFrase = frase.split("\\s");

    ArrayList<String> listaPalabrasFrase = new ArrayList<>(Arrays.asList(arrayPalabrasFrase));

    System.out.println(listaPalabrasFrase);

    ArrayList<String> palabrasRepetidas = new ArrayList<>();
    ArrayList<String> palabrasSinRepetir = new ArrayList<>();

    for (int i = 0; i < listaPalabrasFrase.size(); i++) {
      if (0 == Collections.frequency(palabrasSinRepetir, listaPalabrasFrase.get(i))) {
        palabrasSinRepetir.add(listaPalabrasFrase.get(i));
      } else {
        palabrasRepetidas.add(listaPalabrasFrase.get(i));
        palabrasSinRepetir.removeAll(palabrasRepetidas);
      }
    }

    System.out.println(palabrasRepetidas);
    System.out.println(palabrasSinRepetir);
  }
}
