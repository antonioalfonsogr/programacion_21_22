package U1.T4;

import java.time.LocalTime;

// Escribe un programa que muestre la hora actual

public class E4_5 {
  public static void main(String[] args) {
    LocalTime hora = LocalTime.now();

    System.out.println("Son las " + hora);
  }
}
