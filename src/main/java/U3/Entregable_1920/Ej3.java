package U3.Entregable_1920;

import java.util.Arrays;

public class Ej3 {
  public static void main(String[] args) {
    // Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
    // lo que se especifica en los comentarios:
    //
    // public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
    //                                 // que contienen el 7 (por ej. 7, 27, 782)
    //                                 // que se encuentren en otro array que se
    //                                 // pasa como parámetro. El tamaño del array
    //                                 // que se devuelve será menor o igual al
    //                                // que se pasa como parámetro.
    //
    // Utiliza esta función en un programa para comprobar que funcionan bien. Para
    // que el ejercicio resulte más fácil, las repeticiones de números que contienen
    // 7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
    // el array devuelto también estará repetido 3 veces. Si no existe ningún número
    // que contiene 7 en el array x, se devuelve un array con el número -1 como único
    // elemento.

    int[] matriz = new int[10];

    for (int i = 0; i <matriz.length; i++) {
      matriz[i]= (int) (Math.random()*1000);
    }

    System.out.println(Arrays.toString(matriz));
    System.out.println();

    System.out.println(Arrays.toString(filtrarCon7(matriz)));

  }
  public static int[] filtrarCon7(int x[]){
    int y[] = new int[0];

    boolean contiene7 = false;
    int divisor;
    int resto;
    int indice = 0;

    for (int i = 0; i < x.length; i++) {

      contiene7=false;

      divisor = x[i];

      while (divisor!=0){

        if (divisor==7) {
          contiene7 = true;
          break;}

        resto=divisor%10;

        if (resto==7) {
          contiene7 = true;
          break;}

        divisor = divisor/10;
      }

      if (contiene7) {
        y= Arrays.copyOf(y,y.length+1);
        y[indice]=x[i];
        indice++;
      }
    }


    if (y.length==0) {
      y= Arrays.copyOf(y,y.length+1);
      y[0]=-1;
    }

    return y;
  }
}
