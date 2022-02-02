package U4.U4_T1;

import java.util.Arrays;

public class Vivienda {

  // Enum
  public enum estanciasEnum {
    SALON,
    COCINA,
    BANNO,
    DORMITORIO,
    TERRAZA,
    VESTIBULO,
    COMEDOR,
    BALCON
  }

  // Atributos
  private String direccion;
  private Integer m2;
  private estanciasEnum[] listaEstancias;
  private int indiceEstancias;

  // Getter and Setter
  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Integer getM2() {
    return m2;
  }

  public void setM2(Integer m2) {
    this.m2 = m2;
  }

  public estanciasEnum[] getListaEstancias() {
    return listaEstancias;
  }

  public void setListaEstancias(estanciasEnum[] listaEstancias) {
    this.listaEstancias = listaEstancias;
  }

  // Constructor

  public Vivienda(String direccion, Integer m2, int numEstancias) {
    this.direccion = direccion;
    this.m2 = m2;
    this.listaEstancias = new estanciasEnum[numEstancias];
    this.indiceEstancias = 0;
  }

  // Método insertar estancia
  public void addEstancia(estanciasEnum estancia) {

    if (indiceEstancias < listaEstancias.length) {
      listaEstancias = Arrays.copyOf(listaEstancias, listaEstancias.length + 1);
    }
    listaEstancias[indiceEstancias] = estancia;
    indiceEstancias++;
  }

  // Método eliminar estancia
  public void eliminarEstancia(int indice) {

    if (indice < indiceEstancias && indice >= 0) {

      estanciasEnum[] aux = new estanciasEnum[indiceEstancias - 1];

      for (int i = 0; i < indice; i++) {
        aux[i] = listaEstancias[i];
      }
      for (int i = indice; i < indiceEstancias - 1; i++) {
        aux[i] = listaEstancias[i + 1];
      }

      listaEstancias = Arrays.copyOf(aux, aux.length);

      indice--;
    } else {
      System.out.println("ERROR: No existe esa estancia");
    }
  }

  // Método mostrar todas las estancias posibles
  public static void mostrarEstanciasPosibles() {
    System.out.println("Estancias Posibles: ");
    for (estanciasEnum estancia : estanciasEnum.values()) {
      System.out.print(estancia + " ");
    }
  }

  // Método mostrar información
  public void mostrar_informacion() {
    System.out.println("Dirección: " + this.direccion);
    System.out.println("Metros cuadrados: " + this.m2);
    System.out.println("Estancias: ");
    for (int i = 0; i < indiceEstancias; i++) {
      System.out.println(listaEstancias[i] + " ");
    }
  }
}
