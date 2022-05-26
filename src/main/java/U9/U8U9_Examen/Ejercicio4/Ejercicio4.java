package U9.U8U9_Examen.Ejercicio4;

import U9.U8U9_Examen.Ejercicio3.ConexionBD;

public class Ejercicio4 {
  public static void main(String[] args) {

    Transaciones.insertarLineaProducto();

    ConexionBD.close();
  }
}
