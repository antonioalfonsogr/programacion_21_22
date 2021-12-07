package U3.Entregable_2021_Tarde;

public class Ej2 {
  public static void main(String[] args) {
    // Crea una función con la siguiente cabecera:
    //
    // public String convierteEnMorse(int n)
    //
    // Esta función convierte el número n al sistema Morse y lo devuelve en una
    // cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
    // Morse. Utiliza esta función en un programa para comprobar que funciona bien.
    // Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
    // desde el programa principal.
    //
    // 1 . _ _ _ _ 6 _ . . . .
    // 2 . . _ _ _ 7 _ _ . . .
    // 3 . . . _ _ 8 _ _ _ . .
    // 4 . . . . _ 9 _ _ _ _ .
    // 5 . . . . . 0 _ _ _ _ _

    int num = 213;

    System.out.println(convierteEnMorse(num));
  }

  public static String convierteEnMorse(int n) {
    String numMorse = "";

    int divisor = n;
    int resto;
    int numAlReves = 0;

    while (divisor != 0) {
      resto = divisor % 10;
      divisor = divisor / 10;
      numAlReves = numAlReves * 10 + resto;
    }

    divisor = numAlReves;

    while (divisor != 0) {
      resto = divisor % 10;
      divisor = divisor / 10;

      switch (resto) {
        case 1:
          numMorse += ". _ _ _ _";
          break;
        case 2:
          numMorse += ". . _ _ _ ";
          break;
        case 3:
          numMorse += ". . . _ _";
          break;
        case 4:
          numMorse += ". . . . _";
          break;
        case 5:
          numMorse += ". . . . .";
          break;
        case 6:
          numMorse += "_ . . . .";
          break;
        case 7:
          numMorse += "_ _ . . .";
          break;
        case 8:
          numMorse += "_ _ _ . .";
          break;
        case 9:
          numMorse += "_ _ _ _ .";
          break;
        case 0:
          numMorse += "_ _ _ _ _";
          break;
      }
    }

    return numMorse;
  }
}
