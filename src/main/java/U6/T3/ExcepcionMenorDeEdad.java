package U6.T3;

public class ExcepcionMenorDeEdad extends Exception {
  public ExcepcionMenorDeEdad(String msg) {
    super(msg);
  }

  static void exMenorEdad(int edad) throws ExcepcionMenorDeEdad {
    if (edad < 18) {
      throw new ExcepcionMenorDeEdad("Los clientes deben de ser mayores de edad.");
    }
  }
}
