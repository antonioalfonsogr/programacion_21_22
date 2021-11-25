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

    String[] esColor = new String[0];
    String[] noEsColor = new String[0];
    int indEsColor = 0;
    int indNoEsColor = 0;
    int j;
    boolean bEsColor = false;

    for (int i = 0; i < palabrasUsuario.length; i++) {
      for (j = 0; j < colores.length; j++) {
        bEsColor = false;
        if (palabrasUsuario[i].equals(colores[j])) {
          bEsColor = true;
          break;
        }
      }
      if (bEsColor) {
        esColor = Arrays.copyOf(esColor, esColor.length + 1);
        esColor[indEsColor++] = palabrasUsuario[i];
      } else {
        noEsColor = Arrays.copyOf(noEsColor, noEsColor.length + 1);
        noEsColor[indNoEsColor++] = palabrasUsuario[i];
      }
    }

    String[] arResultado = new String[esColor.length + noEsColor.length];

    System.arraycopy(esColor, 0, arResultado, 0, esColor.length);
    System.arraycopy(noEsColor, 0, arResultado, esColor.length, noEsColor.length);

    System.out.println(Arrays.toString(arResultado));
  }
}
