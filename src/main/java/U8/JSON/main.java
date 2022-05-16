package U8.JSON;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
  public static void main(String[] args) {

    Futbolista f1 = new Futbolista(1, "Casillas", Arrays.asList("Portero"), "Real Madrid");
    Futbolista f2 =
        new Futbolista(
            15, "Ramos", Arrays.asList("Lateral derecho", "Medio centro"), "Real Madrid");
    Futbolista f3 = new Futbolista(3, "Pique", Arrays.asList("Central"), "FC Barcelona");
    Futbolista f4 = new Futbolista(5, "Puyol", Arrays.asList("Central"), "FC Barcelona");
    Futbolista f5 =
        new Futbolista(11, "Capdevila", Arrays.asList("Lateral izquierdo"), "Villareal");
    Futbolista f6 =
        new Futbolista(
            14, "Xabi Alonso", Arrays.asList("Defensa mediocampo", "Mediocampo"), "Real Madrid");
    Futbolista f7 =
        new Futbolista(16, "Busquets", Arrays.asList("Defensa mediocampo"), "FC Barcelona");
    Futbolista f8 =
        new Futbolista(8, "Xavi Hernandez", Arrays.asList("Mediocampo"), "FC Barcelona");
    Futbolista f9 =
        new Futbolista(
            18, "Pedrito", Arrays.asList("Extremo izquierdo", "Falso extremo"), "FC Barcelona");
    Futbolista f10 =
        new Futbolista(
            6, "Iniesta", Arrays.asList("Extremo derecho", "Mediocampo"), "FC Barcelona");
    Futbolista f11 = new Futbolista(7, "Villa", Arrays.asList("Delantero centro"), "FC Barcelona");

    ArrayList<Futbolista> futbolistas = new ArrayList<>();

    futbolistas.add(f1);
    futbolistas.add(f2);
    futbolistas.add(f3);
    futbolistas.add(f4);
    futbolistas.add(f5);
    futbolistas.add(f6);
    futbolistas.add(f7);
    futbolistas.add(f8);
    futbolistas.add(f9);
    futbolistas.add(f10);
    futbolistas.add(f11);

    // Iniciamos Gson

    Gson gson = new Gson();

    // Imprimimos el array toJson

    System.out.println(gson.toJson(futbolistas));

    // Metemos en String el Json de futbolistas

    String json_completo = gson.toJson(futbolistas);

    // Metemos en Array Futbolista[] el json_completo de Futbolista[].class

    Futbolista[] nuevo_futbolistas = gson.fromJson(json_completo, Futbolista[].class);

    // Imprimimos el Array nuevo_futbolistas

    System.out.println(Arrays.toString(nuevo_futbolistas));

    // Detallitos

    ArrayList<String> posiciones_ramos = new ArrayList<>();

    for (Futbolista f : nuevo_futbolistas) {
      if (f.getNombre().equals("Ramos")) {
        posiciones_ramos.addAll(f.getPosiciones());
        System.out.println(posiciones_ramos);
      }
    }
  }
}
