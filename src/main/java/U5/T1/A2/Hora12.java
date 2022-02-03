package U5.T1.A2;

import U5.T1.A1.Hora;

public class Hora12 extends Hora {

  // Enum
  protected enum franjasHorariasEnum {
    PM,
    AM
  }

  // Atributos
  protected franjasHorariasEnum franjaHoraria;

  // Constructor
  public Hora12(Integer horas, Integer minutos, franjasHorariasEnum franjaHoraria) {
    super(horas, minutos);
    this.franjaHoraria = franjaHoraria;
  }

  // Getter & Setter
  public franjasHorariasEnum getFranjaHoraria() {
    return franjaHoraria;
  }

  public void setFranjaHoraria(franjasHorariasEnum franjaHoraria) {
    this.franjaHoraria = franjaHoraria;
  }

  // Setter Polimórfico
  @Override
  public void setHoras(Integer horas) {
    if (horas >= 0 && horas < 13) {
      this.horas = horas;
    } else {
      System.out.println("La hora tiene que ser menor a 13");
    }
  }

  // inc() Polimórfico
  @Override
  protected void inc() {
    if (this.minutos < 59) {
      this.minutos++;
    } else {
      this.minutos = 0;
      if (horas < 12) {
        horas++;
      } else {
        horas = 1;
        if (franjaHoraria == franjasHorariasEnum.AM) {
          franjaHoraria = franjasHorariasEnum.PM;
        } else {
          franjaHoraria = franjasHorariasEnum.AM;
        }
      }
    }
  }

  // toString Polimórfico
  @Override
  public String toString() {
    return super.toString() + " " + franjaHoraria;
  }
}
