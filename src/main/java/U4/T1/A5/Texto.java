package U4.T1.A5;

public class Texto {

  private StringBuilder cadena;
  private int capacidad;

  private static final StringBuilder vocales = new StringBuilder("aeiouAEIOU");

  public Texto(int num) {
    cadena = new StringBuilder("");
    this.capacidad = num;
  }

  public void sumaPalabra(String annadir, boolean alInicio) {

    StringBuilder annadirB = new StringBuilder(annadir);

    if (annadir.length() + cadena.length() < capacidad) {
      if (!alInicio) {
        this.cadena.append(annadirB);
      } else {
        StringBuilder aux = cadena;
        cadena = annadirB.append(aux);
      }
    } else {
      System.out.println(
          "No es posible añadir " + annadir + ", excede el tamaño máximo del objeto.");
    }

    System.out.println("El texto actual es " + cadena + ".");
    System.out.println("Hay " + fnumVocales(cadena) + " vocales en el texto.");
  }

  public void sumaCaracter(char annadirC, boolean alInicio) {

    if (cadena.length() + 1 < capacidad) {
      if (!alInicio) {
        this.cadena.append(annadirC);
      } else {
        StringBuilder aux = cadena;
        StringBuilder annadirCB = new StringBuilder("");
        annadirCB.append(annadirC);
        cadena = annadirCB.append(aux);
      }
    } else {
      System.out.println(
          "No es posible añadir " + annadirC + ", excede el tamaño máximo del objeto.");
    }

    System.out.println("El texto actual es " + cadena + ".");
    System.out.println("Hay " + fnumVocales(cadena) + " vocales en el texto.");
  }

  public int fnumVocales(StringBuilder cadena) {
    int numVocales = 0;

    for (int i = 0; i < cadena.length(); i++) {
      for (int j = 0; j < vocales.length(); j++) {
        if (cadena.charAt(i) == vocales.charAt(j)) {
          numVocales++;
        }
      }
    }

    return numVocales;
  }
}
