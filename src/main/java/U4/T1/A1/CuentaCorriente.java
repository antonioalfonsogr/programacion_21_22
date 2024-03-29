package U4.T1.A1;

public class CuentaCorriente {

  private int saldo;
  private int limiteDescubierto;
  private String nombre;
  private String dni;

  public CuentaCorriente(String nombre, String dni) {

    this.nombre = nombre;
    this.dni = dni;
    this.saldo = 0;
    this.limiteDescubierto = -50;
  }

  public boolean sacarDinero(int aSacar) {

    if (this.saldo - aSacar > this.limiteDescubierto) {
      this.saldo = this.saldo - aSacar;
      System.out.println();
      System.out.println("Ha retirado " + aSacar + " € correctamente");
      System.out.println();
      return true;
    } else {
      System.out.println();
      System.out.println(
          "No es posible realizar la operación, porque sobrepasa su limite de descubierto");
      System.out.println();
      return false;
    }
  }

  public void ingresarDinero(int aIngresar) {

    this.saldo += aIngresar;
  }

  public void mostrarInformacion() {
    System.out.println();
    System.out.println("Titular: " + this.nombre);
    System.out.println("DNI: " + this.dni);
    System.out.println("Saldo: " + this.saldo);
    System.out.println("Limite de Descubierto: " + this.limiteDescubierto);
    System.out.println();
  }

  public int getSaldo() {
    return saldo;
  }

  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }
}
