package U4.U4_T1;

public class ManoDeObra {

  // Atributos
  private String nombreEmpresa;
  private String descripcionTrabajo;
  private Integer horasRealizadas;
  private Integer cantidadObreros;

  // Getter and Setter
  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }

  public String getDescripcionTrabajo() {
    return descripcionTrabajo;
  }

  public void setDescripcionTrabajo(String descripcionTrabajo) {
    this.descripcionTrabajo = descripcionTrabajo;
  }

  public Integer getHorasRealizadas() {
    return horasRealizadas;
  }

  public void setHorasRealizadas(Integer horasRealizadas) {
    this.horasRealizadas = horasRealizadas;
  }

  public Integer getCantidadObreros() {
    return cantidadObreros;
  }

  public void setCantidadObreros(Integer cantidadObreros) {
    this.cantidadObreros = cantidadObreros;
  }

  // Constructor
  public ManoDeObra(
      String nombreEmpresa,
      String descripcionTrabajo,
      Integer horasRealizadas,
      Integer cantidadObreros) {
    this.nombreEmpresa = nombreEmpresa;
    this.descripcionTrabajo = descripcionTrabajo;
    this.horasRealizadas = horasRealizadas;
    this.cantidadObreros = cantidadObreros;
  }

  // Método mostrar información
  public void mostrar_informacion() {
    System.out.println("Nombre de Empresa: " + this.nombreEmpresa);
    System.out.println("Descripción del trabajo realizado: " + this.descripcionTrabajo);
    System.out.println("Horas realizadas: " + this.horasRealizadas);
    System.out.println("Cantidad de obreros implicados: " + this.cantidadObreros);
  }
}
