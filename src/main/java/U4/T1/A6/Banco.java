package U4.T1.A6;

public class Banco {

  private final String nombre;
  private float capital;
  private String direccionCentral;

  public Banco(String nombre, float capital, String direccionCentral) {
    this.nombre = nombre;
    this.capital = capital;
    this.direccionCentral = direccionCentral;
  }

  public Banco(String nombre, String direccionCentral) {
    this.nombre = nombre;
    this.capital = 5200000;
    this.direccionCentral = direccionCentral;
  }

  public String getNombre() {
    return nombre;
  }

  public float getCapital() {
    return capital;
  }

  public void setCapital(float capital) {
    this.capital = capital;
  }
}
