package U4.T1.A5;

public class Texto {

  private StringBuilder cadena;

  private static final StringBuilder vocales = new StringBuilder("aeiou");

  public Texto(int num) {
    cadena.setLength(num);
  }

  public void sumaPalabra(StringBuilder annadir, boolean alInicio) {
    if (annadir.length() + cadena.length() < cadena.capacity()) {
      if (!alInicio) {
        this.cadena.append(annadir);
      } else {
        StringBuilder aux = cadena;
        cadena = annadir.append(aux);
      }

    } else {
      System.out.println("No es posible");
    }
  }
}
