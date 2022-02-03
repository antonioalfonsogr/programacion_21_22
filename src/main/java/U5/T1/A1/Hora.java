package U5.T1.A1;

public class Hora {

  // Atributos
  protected Integer horas;
  protected Integer minutos;

  // Constructor
  public Hora(Integer horas, Integer minutos) {
    setHoras(horas);
    setMinutos(minutos);
  }

  // Constructor vacío
  // public Hora() {}

  // Método inc(), que incrementa la hora en un minuto
  protected void inc() {
    if (this.minutos < 59) {
      this.minutos++;
    } else {
      this.minutos = 0;
      if (horas < 23) {
        horas++;
      } else {
        horas = 0;
      }
    }
  }

  // Método toString(), que devuelve un String con la representación del reloj.
  @Override
  public String toString() {
    return horas + ":" + minutos;
  }

  // Getter & Setter
  public Integer getHoras() {
    return horas;
  }

  public void setHoras(Integer horas) {
    if (horas >= 0 && horas < 24) {
      this.horas = horas;
    } else {
      System.out.println("La hora tiene que ser menor a 24");
    }
  }

  public Integer getMinutos() {
    return minutos;
  }

  public void setMinutos(Integer minutos) {
    if (minutos >= 0 && minutos < 60) {
      this.minutos = minutos;
    } else {
      System.out.println("Los minutos tienen que ser menor a 60");
    }
  }
}
