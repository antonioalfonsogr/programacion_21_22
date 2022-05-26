package U9.U8U9_Examen.Ejercicio3;

import com.google.gson.Gson;

public class Ejercicio3 {
  public static void main(String[] args) {

    Gson gson = new Gson();

    String json_completo = gson.toJson(Consultas.MostrarEmpleados());

    System.out.println(json_completo);

    ConexionBD.close();
  }
}
