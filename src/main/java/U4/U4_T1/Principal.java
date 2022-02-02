package U4.U4_T1;

public class Principal {
  public static void main(String[] args) {

    // Creación de Mano de Obra
    ManoDeObra cuadrillaUno = new ManoDeObra("Manos a la Obra", "Alicatado", 13, 2);
    ManoDeObra cuadrillaDos = new ManoDeObra("Mario & Luigi", "Fontanería", 7, 2);
    ManoDeObra cuadrillaTres = new ManoDeObra("Hermandad", "Electricista", 9, 1);
    cuadrillaUno.mostrar_informacion();
    System.out.println();
    cuadrillaDos.mostrar_informacion();
    System.out.println();
    cuadrillaTres.mostrar_informacion();
    System.out.println();

    // Mostrar tipos estancias
    Vivienda.mostrarEstanciasPosibles();

    // Creación de Viviendas
    Vivienda casaUno = new Vivienda("Carlos Haya 3", 80, 4);
    Vivienda casaDos = new Vivienda("La niña 44", 44, 3);
    Vivienda casaTres = new Vivienda("La Montera 1", 95, 5);

    // Añadir Habitaciones casa1
    casaUno.addEstancia(Vivienda.estanciasEnum.COCINA);
    casaUno.addEstancia(Vivienda.estanciasEnum.BANNO);
    casaUno.addEstancia(Vivienda.estanciasEnum.SALON);
    casaUno.addEstancia(Vivienda.estanciasEnum.DORMITORIO);
    casaUno.mostrar_informacion();
    System.out.println();

    // Añadir Habitaciones casa2
    casaDos.addEstancia(Vivienda.estanciasEnum.COCINA);
    casaDos.addEstancia(Vivienda.estanciasEnum.BANNO);
    casaDos.addEstancia(Vivienda.estanciasEnum.DORMITORIO);
    casaDos.mostrar_informacion();
    System.out.println();

    // Añadir y quitar Habitaciones casa3
    casaTres.addEstancia(Vivienda.estanciasEnum.COCINA);
    casaTres.addEstancia(Vivienda.estanciasEnum.BANNO);
    casaTres.addEstancia(Vivienda.estanciasEnum.BANNO);
    casaTres.addEstancia(Vivienda.estanciasEnum.SALON);
    casaTres.addEstancia(Vivienda.estanciasEnum.DORMITORIO);
    casaTres.mostrar_informacion();
    System.out.println();
    // casaTres.eliminarEstancia(3);
    // casaTres.mostrar_informacion();
    // System.out.println();

    // Materiales

    Material azulejo = new Material("Azulejo Azul", 50, 5.2);
    Material tuberias = new Material("Tuberia PVC", 8, 9.99);
    Material juntas = new Material("Juntas Separadas", 20, 1.05);
    azulejo.mostrar_informacion();
    System.out.println();
    tuberias.mostrar_informacion();
    System.out.println();
    juntas.mostrar_informacion();
    System.out.println();

    // Obra 1
    Obra primera = new Obra(casaUno, cuadrillaUno, Vivienda.estanciasEnum.BANNO, 2);
    primera.addMaterial(azulejo);
    primera.addMaterial(tuberias);
    primera.mostrar_informacion();

    // Cambio de IVA
    Material.setIva(0.22);

    // Obra 2
    Obra segunda = new Obra(casaDos, cuadrillaDos, Vivienda.estanciasEnum.BANNO, 2);
    segunda.addMaterial(azulejo);
    segunda.addMaterial(juntas);
    segunda.mostrar_informacion();

    // Obra 3
    Obra tercera = new Obra(casaTres, cuadrillaTres, Vivienda.estanciasEnum.BANNO, 2);
    tercera.addMaterial(tuberias);
    tercera.addMaterial(juntas);
    tercera.mostrar_informacion();
  }
}
