package U4.T1.A10;

public class Hora {

  private int horas;
  private int minutos;
  private int segundos;
  public boolean horasBien = true;
  public boolean minutosBien = true;
  public boolean segundosBien = true;

  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    if (horas >= 0 && horas <= 24) {
      this.horas = horas;
      horasBien = true;
    } else {
      System.out.println("La hora tiene que ser menor o igual a 24");
      horasBien = false;
    }
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    if (minutos >= 0 && minutos <= 60) {
      this.minutos = minutos;
      minutosBien = true;
    } else {
      System.out.println("Los minutos tienen que ser menor o igual a 60");
      minutosBien = false;
    }
  }

  public int getSegundos() {
    return segundos;
  }

  public void setSegundos(int segundos) {
    if (segundos >= 0 && segundos <= 60) {
      this.segundos = segundos;
      segundosBien = true;
    } else {
      System.out.println("Los segundos tienen que ser menor o igual a 60");
      segundosBien = false;
    }
  }

  public Hora(int horas, int minutos, int segundos) {
    setHoras(horas);
    setMinutos(minutos);
    setSegundos(segundos);
  }

  public String mostrasHora() {
    return "La hora introducida es " + horas + ":" + minutos + ":" + segundos;
  }

  public void annadirSegundos(int n) {

    segundos += n;

    while (segundos > 59) {
      segundos -= 60;
      minutos++;
      if (minutos > 59) {
        minutos = 0;
        horas++;
        if (horas > 23) {
          horas = 0;
          minutos = 0;
        }
      }
    }
  }
}
