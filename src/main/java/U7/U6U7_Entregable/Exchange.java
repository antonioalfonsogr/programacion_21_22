package U7.U6U7_Entregable;

import java.io.*;
import java.util.*;

public class Exchange implements Serializable {

  // Atributos

  private Map<Divisa, HashSet<ParCotizacion>> mapaDivisasParCotizacion;
  private HashSet<ParCotizacion> paresCotizacionExchange;

  // Constructor

  public Exchange() {
    this.mapaDivisasParCotizacion = new HashMap<>();
    this.paresCotizacionExchange = new HashSet<>();
  }

  // Método mostrarDivisasOrdenadas()

  public void mostrarDivisasOrdenadas() {
    TreeSet<Divisa> conjuntoDivisas = (TreeSet) mapaDivisasParCotizacion.keySet();
    System.out.println(conjuntoDivisas);
  }

  // Método obtenerCotizaciones(String simbolo)

  public HashSet<ParCotizacion> obtenerCotizaciones(String simbolo) {

    return new HashSet<>();
  }

  // Método mostrarCotizacionesAlAlzaUnaHora()

  public void mostrarCotizacionesAlAlzaUnaHora() {

    TreeSet<Divisa> conjuntoDivisas = (TreeSet) mapaDivisasParCotizacion.keySet();

    HashSet<ParCotizacion> todosParesCotizacion = new HashSet<>();

    for (Divisa div : conjuntoDivisas) {
      todosParesCotizacion.addAll((Collection<? extends ParCotizacion>) div);
    }

    for (ParCotizacion pc : todosParesCotizacion) {
      if (pc.getVariacionPorcentualUltimaHora() > 0) {
        System.out.println(pc);
      }
    }
  }

  // Método addCotizacion(ParCotizacion cotizacion)

  public void addCotizacion() {}

  // Método guardarCotizaciones()

  public void guardarCotizaciones() {
    try {
      FileOutputStream ficheroBinario = new FileOutputStream("cotizaciones.dat");
      ObjectOutputStream out = new ObjectOutputStream(ficheroBinario);
      out.writeObject(mapaDivisasParCotizacion);
      out.close();
    } catch (IOException ex) {
      System.out.println("Error al escribir el fichero");
    }
  }

  // recuperarCotizaciones()

  public void recuperarCotizaciones() {
    try {
      FileInputStream ficheroBinario = new FileInputStream("cotizaciones.dat");
      ObjectInputStream in = new ObjectInputStream(ficheroBinario);
      mapaDivisasParCotizacion = (Map<Divisa, HashSet<ParCotizacion>>) in.readObject();
      in.close();
    } catch (IOException | ClassNotFoundException ex) {
      System.out.println("Error al leer el fichero");
    }
  }

  // toString

  @Override
  public String toString() {
    return "Exchange{" + "mapaDivisasParCotizacion=" + mapaDivisasParCotizacion + '}';
  }

  // equals

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Exchange)) return false;
    Exchange exchange = (Exchange) o;
    return Objects.equals(mapaDivisasParCotizacion, exchange.mapaDivisasParCotizacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapaDivisasParCotizacion);
  }

  // Getter & Setter

  public Map<Divisa, HashSet<ParCotizacion>> getMapaDivisasParCotizacion() {
    return mapaDivisasParCotizacion;
  }

  public void setMapaDivisasParCotizacion(
      Map<Divisa, HashSet<ParCotizacion>> mapaDivisasParCotizacion) {
    this.mapaDivisasParCotizacion = mapaDivisasParCotizacion;
  }
}
