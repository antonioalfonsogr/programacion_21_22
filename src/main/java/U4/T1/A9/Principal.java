package U4.T1.A9;

import U4.T1.A9.Maquinaria.Locomotoras;
import U4.T1.A9.Maquinaria.Trenes;
import U4.T1.A9.Personal.JefesEstacion;
import U4.T1.A9.Personal.Maquinistas;
import U4.T1.A9.Personal.Mecanicos;

public class Principal {
  public static void main(String[] args) {

    // Maquinistas

    Maquinistas mac1 = new Maquinistas("Leandro Alcazar Barbero", "61544563J", 1427.20, "Oficial");
    Maquinistas mac2 =
        new Maquinistas("Angela Paniagua Montero", "14083044Y", 1236.90, "Comandante");
    Maquinistas mac3 = new Maquinistas("Marcos Manzano Roldan", "79182990Q", 1100.50, "Aspirante");

    // Mecánicos

    Mecanicos mec1 =
        new Mecanicos("Violeta Galvez González", 630800926, Mecanicos.Especialidades.frenos);
    Mecanicos mec2 =
        new Mecanicos("Eugenia Paez Sola", 749205233, Mecanicos.Especialidades.hidraulica);
    Mecanicos mec3 =
        new Mecanicos(
            "Aurelio Ballesteros Olmedo", 762190003, Mecanicos.Especialidades.electronica);

    // Jefes de Estación

    JefesEstacion jef1 = new JefesEstacion("Ion Amaya Carballo", "763944327");
    JefesEstacion jef2 = new JefesEstacion("Ander Velasco Salas,", "68411498E");
    JefesEstacion jef3 = new JefesEstacion("Vanesa Bernal Roldan", "66525934K");

    // Locomotoras

    Locomotoras loc1 = new Locomotoras("1456MLD", 470, 1990, mec1);
    Locomotoras loc2 = new Locomotoras("8467DFG", 580, 2015, mec2);
    Locomotoras loc3 = new Locomotoras("3455SDF", 512, 2019, mec3);

    // Trenes

    Trenes tren1 = new Trenes(loc1);
    Trenes tren2 = new Trenes(loc2);
    Trenes tren3 = new Trenes(loc3);

    // Añado vagones al tren1

    tren1.annadirVagon(8000, 2000, "Arroz");
    tren1.annadirVagon(4000, 1500, "Harina");
    tren1.annadirVagon(6000, 5900, "Patatas");
    tren1.annadirVagon(8000, 100, "Tomates");
    tren1.annadirVagon(6000, 3000, "Galletas");
    tren1.annadirVagon(10000, 0, "Vacío");
  }
}
