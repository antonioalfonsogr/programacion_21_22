package U4.U4_T1;

import java.util.Arrays;
import java.util.Calendar;

public class Obra {

  // Atributos
  private Vivienda viviendaObra;
  private Material[] listaMaterialesObra;
  private ManoDeObra cuadrillaObra;
  private Vivienda.estanciasEnum estanciaObra;
  private Calendar fechaObra;
  private int indiceMateriales;

  // Getter and Setter

  public Vivienda getViviendaObra() {
    return viviendaObra;
  }

  public void setViviendaObra(Vivienda viviendaObra) {
    this.viviendaObra = viviendaObra;
  }

  public Material[] getListaMaterialesObra() {
    return listaMaterialesObra;
  }

  public void setListaMaterialesObra(Material[] listaMaterialesObra) {
    this.listaMaterialesObra = listaMaterialesObra;
  }

  public ManoDeObra getCuadrillaObra() {
    return cuadrillaObra;
  }

  public void setCuadrillaObra(ManoDeObra cuadrillaObra) {
    this.cuadrillaObra = cuadrillaObra;
  }

  public Vivienda.estanciasEnum getEstanciaObra() {
    return estanciaObra;
  }

  public void setEstanciaObra(Vivienda.estanciasEnum estanciaObra) {
    this.estanciaObra = estanciaObra;
  }

  public Calendar getFechaObra() {
    return fechaObra;
  }

  public void setFechaObra(Calendar fechaObra) {
    this.fechaObra = fechaObra;
  }

  // Constructor
  public Obra(
      Vivienda viviendaObra,
      ManoDeObra cuadrillaObra,
      Vivienda.estanciasEnum estanciaObra,
      int numMateriales) {
    this.viviendaObra = viviendaObra;
    this.cuadrillaObra = cuadrillaObra;
    this.estanciaObra = estanciaObra;
    this.fechaObra = Calendar.getInstance();
    this.listaMaterialesObra = new Material[numMateriales];
    this.indiceMateriales = 0;
  }

  // Método insertar material
  public void addMaterial(Material mat) {

    if (indiceMateriales < listaMaterialesObra.length) {
      listaMaterialesObra = Arrays.copyOf(listaMaterialesObra, listaMaterialesObra.length + 1);
    }
    listaMaterialesObra[indiceMateriales] = mat;
    indiceMateriales++;
  }

  // Método eliminar material
  public void eliminarMaterial(int indice) {

    if (indice < indiceMateriales && indice >= 0) {

      Material[] aux = new Material[indiceMateriales - 1];

      for (int i = 0; i < indice; i++) {
        aux[i] = listaMaterialesObra[i];
      }
      for (int i = indice; i < indiceMateriales - 1; i++) {
        aux[i] = listaMaterialesObra[i + 1];
      }

      listaMaterialesObra = Arrays.copyOf(aux, aux.length);

      indice--;
    } else {
      System.out.println("ERROR: No existe ese material");
    }
  }

  // Método mostrar fecha
  public void mostrarFecha() {
    String dia, mes, annio;

    dia = Integer.toString(fechaObra.get(Calendar.DATE));
    mes = Integer.toString(fechaObra.get(Calendar.MONTH));
    annio = Integer.toString(fechaObra.get(Calendar.YEAR));

    System.out.println("Fecha: " + dia + "/" + mes + "/" + annio);
  }

  // Método mostrar información
  public void mostrar_informacion() {
    System.out.println("Vivienda: ");
    this.viviendaObra.mostrar_informacion();
    System.out.println("Materiales: ");
    for (int i = 0; i < indiceMateriales; i++) {
      listaMaterialesObra[i].mostrar_informacion();
    }
    System.out.println("Mano de Obra: ");
    this.cuadrillaObra.mostrar_informacion();
    System.out.println("Estancia donde se ha realizado la obra: " + getEstanciaObra());
    mostrarFecha();
  }
}
