package U3.Examen_U3;

import java.util.Arrays;

public class Ej4 {
  public static void main(String[] args) {
    // Crea una función con la siguiente cabecera:
    //
    // public String convierteEnPalabras(int n)
    // Esta función convierte los dígitos del número n en las correspondientes palabras y lo
    // devuelve todo en una cadena de caracteres. Por ejemplo, el 470213 convertido a palabras
    // sería:
    //
    // cuatro, siete, cero, dos, uno, tres
    // Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se
    // debe mostrar nada por pantalla, solo se debe usar print desde el programa principal. Fíjate
    // que hay una coma detrás de cada palabra salvo al final.


    int num = 470213;

    System.out.println(convierteEnPalabras(num));
  }

  public static String  convierteEnPalabras(int n) {
    int divisor = n;
    int resto;

    int[]numeros = new int[0];
    int idnumeros = 0;

    while (divisor != 0) {
      resto = divisor % 10;
      divisor = divisor / 10;
      numeros = Arrays.copyOf(numeros, numeros.length +1);
      numeros[idnumeros]=resto;
      idnumeros++;
    }

    int [] alReves = new int[numeros.length];

    for (int i = 0; i < alReves.length; i++) {
      alReves[i]= numeros[alReves.length-1-i];
    }

    String[] enLetras = new String[alReves.length];

    for (int i = 0; i < enLetras.length; i++) {
      enLetras[i]= fNumEnLetras(alReves[i]);
    }

    return Arrays.toString(enLetras);
  }
  public static String fNumEnLetras (int num){

    String enLetra = "";

    switch (num){
      case 0: enLetra = "cero";
        break;
      case 1: enLetra = "uno";
        break;
      case 2: enLetra = "dos";
        break;
      case 3: enLetra = "tres";
        break;
      case 4: enLetra = "cuatro";
        break;
      case 5: enLetra = "cinco";
        break;
      case 6: enLetra = "seis";
        break;
      case 7: enLetra = "siete";
        break;
      case 8: enLetra = "ocho";
        break;
      case 9: enLetra = "nueve";
        break;
    }
    return enLetra;
  }
}
