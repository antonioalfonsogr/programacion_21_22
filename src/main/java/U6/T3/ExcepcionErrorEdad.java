package U6.T3;

public class ExcepcionErrorEdad extends Exception {
  public ExcepcionErrorEdad(String msg) {
    super(msg);
  }

  static void exErrorEdad(int edad) throws ExcepcionErrorEdad {
    if (edad < 0) {
      throw new ExcepcionErrorEdad("La edad no puede ser negativa.");
    }
  }
}
