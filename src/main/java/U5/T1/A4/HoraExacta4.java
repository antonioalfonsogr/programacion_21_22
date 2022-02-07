package U5.T1.A4;

import U5.T1.A1.Hora;

import java.util.Objects;

public class HoraExacta4 extends Hora {

  // Atributos
  protected Integer segundos;

  // Constructor
  public HoraExacta4(Integer horas, Integer minutos, Integer segundos) {
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

  // Método comparar
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof HoraExacta4)) return false;
    HoraExacta4 that = (HoraExacta4) o;
    return Objects.equals(segundos, that.segundos)
        && Objects.equals(minutos, that.minutos)
        && Objects.equals(horas, that.horas);
  }

  @Override
  public int hashCode() {
    return 0;
  }
}
