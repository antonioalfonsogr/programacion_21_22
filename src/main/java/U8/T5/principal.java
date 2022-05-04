package U8.T5;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class principal {
  public static void main(String[] args) {

    List<Futbolista> futbolistaList = new ArrayList<>();

    List<String> l1 = new ArrayList<>();
    l1.add("Portero");
    Futbolista f1 = new Futbolista(1, "Casilla", l1, "Real Madrid");
    futbolistaList.add(f1);

    List<String> l2 = new ArrayList<>();
    l2.add("Lateral derecho");
    l2.add("Medio centro");
    Futbolista f2 = new Futbolista(15, "Ramos", l2, "Real Madrid");
    futbolistaList.add(f2);

    List<String> l3 = new ArrayList<>();
    l3.add("Central");
    Futbolista f3 = new Futbolista(3, "Pique", l3, "FC Barcelona");
    futbolistaList.add(f3);

    List<String> l4 = new ArrayList<>();
    l4.add("Central");
    Futbolista f4 = new Futbolista(5, "Puyol", l4, "FC Barcelona");
    futbolistaList.add(f4);

    List<String> l5 = new ArrayList<>();
    l5.add("Lateral izquierdo");
    Futbolista f5 = new Futbolista(11, "Capdevila", l5, "Villareal");
    futbolistaList.add(f5);

    List<String> l6 = new ArrayList<>();
    l6.add("Defensa mediocampo");
    l6.add("Mediocampo");
    Futbolista f6 = new Futbolista(14, "Xavi Alonso", l6, "Real Madrid");
    futbolistaList.add(f6);

    List<String> l7 = new ArrayList<>();
    l7.add("Defensa mediocampo");
    Futbolista f7 = new Futbolista(16, "Busquets", l7, "FC Barcelona");
    futbolistaList.add(f7);

    List<String> l8 = new ArrayList<>();
    l8.add("Central");
    Futbolista f8 = new Futbolista(8, "Xavi Hernandez", l8, "FC Barcelona");
    futbolistaList.add(f8);

    List<String> l9 = new ArrayList<>();
    l9.add("Central");
    Futbolista f9 = new Futbolista(18, "Pedrito", l9, "FC Barcelona");
    futbolistaList.add(f9);

    List<String> l10 = new ArrayList<>();
    l10.add("Central");
    Futbolista f10 = new Futbolista(6, "Iniesta", l10, "FC Barcelona");
    futbolistaList.add(f10);

    List<String> l11 = new ArrayList<>();
    l11.add("Central");
    Futbolista f11 = new Futbolista(7, "Villa", l11, "FC Barcelona");
    futbolistaList.add(f11);

    Gson gson = new Gson();

    System.out.println(gson.toJson(futbolistaList));

    System.out.println();

    String futbolistasJson = gson.toJson(futbolistaList);

    // con Array
    List<String> posicionesRamos = new ArrayList<>();

    Futbolista[] futbolistaArray = gson.fromJson(futbolistasJson, Futbolista[].class);

    System.out.println(Arrays.toString(futbolistaArray));

    for (Futbolista f : futbolistaArray) {
      if (f.getNombre().equals("Ramos")) {
        posicionesRamos.addAll(f.getPosiciones());
      }
    }
    System.out.println(posicionesRamos);
    System.out.println();
    // con List
    List<String> posicionesRamos2 = new ArrayList<>();

    Type listType = new TypeToken<ArrayList<Futbolista>>() {}.getType();
    List<Futbolista> futbolistaArrayList = gson.fromJson(futbolistasJson, listType);

    System.out.println(futbolistaArrayList);

    futbolistaArrayList.stream()
        .filter(futbolista -> futbolista.getNombre().equals("Ramos"))
        .map(Futbolista::getPosiciones)
        .forEach(posicionesRamos2::addAll);

    System.out.println(posicionesRamos2);
  }
}
