package U6.T2;

import U4.T1.A9.Maquinaria.Locomotoras;
import U4.T1.A9.Maquinaria.Trenes;
import U4.T1.A9.Personal.Mecanicos;

import java.io.*;

public class A9 {
  public static void main(String[] args) {
    // Crear un fichero binario e insertar varios objetos de tipo Tren. Cerrar el fichero y leerlo a
    // continuación, mostrándo los objetos por pantalla.

    Mecanicos mec1 =
        new Mecanicos("Violeta Galvez González", 630800926, Mecanicos.Especialidades.frenos);
    Mecanicos mec2 =
        new Mecanicos("Eugenia Paez Sola", 749205233, Mecanicos.Especialidades.hidraulica);
    Mecanicos mec3 =
        new Mecanicos(
            "Aurelio Ballesteros Olmedo", 762190003, Mecanicos.Especialidades.electronica);

    Locomotoras loc1 = new Locomotoras("1456MLD", 470, 1990, mec1);
    Locomotoras loc2 = new Locomotoras("8467DFG", 580, 2015, mec2);
    Locomotoras loc3 = new Locomotoras("3455SDF", 512, 2019, mec3);

    Trenes tren1 = new Trenes(loc1);
    Trenes tren2 = new Trenes(loc2);
    Trenes tren3 = new Trenes(loc3);

    try {
      FileOutputStream fb = new FileOutputStream("FicherosBinarios/A9.dat");
      ObjectOutputStream out = new ObjectOutputStream(fb);
      out.writeObject(tren1);
      out.writeObject(tren2);
      out.writeObject(tren3);
      out.close();

    } catch (IOException ex) {
      System.out.println("ERROR al escribir el fichero");
    }

    try {
      FileInputStream fb = new FileInputStream("FicherosBinarios/A9.dat");
      ObjectInputStream in = new ObjectInputStream(fb);
      System.out.println(in.readObject());
      System.out.println(in.readObject());
      System.out.println(in.readObject());
      in.close();

    } catch (IOException ex) {
      System.out.println("ERROR al leer el fichero");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
