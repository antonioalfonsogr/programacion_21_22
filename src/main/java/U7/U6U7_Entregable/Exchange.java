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

  public Set<ParCotizacion> obtenerCotizaciones(String simbolo) {
    Set<ParCotizacion> conjunto_pares = new LinkedHashSet<>();

    Iterator<Divisa> it = mapaDivisasParCotizacion.keySet().iterator();
    while (it.hasNext()) {
      Divisa base = it.next();
      if (base.getSimbolo().equals(simbolo)) {
        conjunto_pares = mapaDivisasParCotizacion.get(base);
      }
    }
    return conjunto_pares;
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

  public void mostrarCotizacionesAlAlzaUnaHora2() {
    Iterator<Map.Entry<Divisa, HashSet<ParCotizacion>>> it = mapaDivisasParCotizacion.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<Divisa, HashSet<ParCotizacion>> entrada = it.next();

      Iterator<ParCotizacion> it_cotizaciones = entrada.getValue().iterator();
      while (it_cotizaciones.hasNext()) {
        ParCotizacion par_cotizacion = it_cotizaciones.next();
        if (par_cotizacion.getVariacionPorcentualUltimaHora() > 0) {
          System.out.println(par_cotizacion);
        }
      }
    }
  }

  // Método addCotizacion(ParCotizacion cotizacion)

  public void addCotizacion(ParCotizacion cotizacion) {
    Divisa base = cotizacion.getDivisaBase();

    if (mapaDivisasParCotizacion.containsKey(base)) {
      mapaDivisasParCotizacion.get(base).add(cotizacion);
    } else {
      Set<ParCotizacion> conjunto_pares = new LinkedHashSet<>();
      conjunto_pares.add(cotizacion);
      mapaDivisasParCotizacion.put(base, (HashSet<ParCotizacion>) conjunto_pares);
    }
  }

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
