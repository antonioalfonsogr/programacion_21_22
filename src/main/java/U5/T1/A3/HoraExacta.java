package U5.T1.A3;

import U5.T1.A1.Hora;

public class HoraExacta extends Hora {

  // Atributos
  protected Integer segundos;

  // Constructor
  public HoraExacta(Integer horas, Integer minutos, Integer segundos) {
    super(horas, minutos);
    this.segundos = segundos;
  }

  // Getter & Setter
  public Integer getSegundos() {
    return segundos;
  }

  public void setSegundos(Integer segundos) {
    if (segundos >= 0 && segundos < 60) {
      this.segundos = segundos;
    } else {
      System.out.println("Los segundos tienen que ser menor a 60");
    }
  }

  // inc() Polimórfico
  @Override
  protected void inc() {
    if (this.segundos < 59) {
      segundos++;
    } else {
      segundos = 0;
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
  }

  // toString Polimórfico
  @Override
  public String toString() {
    return super.toString() + ":" + this.segundos;
  }
}
