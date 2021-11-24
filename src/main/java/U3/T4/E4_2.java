package U3.T4;

import java.util.Arrays;
import java.util.Scanner;

public class E4_2 {
  public static void main(String[] args) {
    // Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las
    // palabras correspondientes a colores se deben almacenar al comienzo y las que no son colores a
    // continuación. Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce
    // el
    // programa deben estar en otro array y son los siguientes: verde, rojo, azul, amarillo,
    // naranja, rosa, negro, blanco y morado.

    Scanner sc = new Scanner(System.in);

    String[] palabrasUsuario = new String[8];
    String[] colores = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
    };

    for (int i = 0; i < palabrasUsuario.length; i++) {
      System.out.println("Escriba una palabra:");
      palabrasUsuario[i] = sc.next();
    }

    System.out.println(Arrays.toString(palabrasUsuario));
    System.out.println(Arrays.toString(colores));

    String[] esColor = new String[0];
    String[] noEsColor = new String[0];

    for (int i = 0; i < palabrasUsuario.length; i++) {
      for (int j = 0; j < colores.length; j++) {
        if (palabrasUsuario[i] == colores[j]) {}
      }
    }
  }
}
