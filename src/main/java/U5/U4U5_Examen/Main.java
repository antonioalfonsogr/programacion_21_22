package U5.U4U5_Examen;

public class Main {
  public static void main(String[] args) {

    Coro coro1 =
        new Coro("De flor en flor", "Julio Pardo", "Julio Pardo", "Julio Pardo", "Abejas", 3, 4);

    System.out.println(coro1);
    coro1.caminito_del_falla();
    coro1.hacer_tipo();
    coro1.cantar_la_presentacion();
    coro1.setPuntosObtenidos(100);

    System.out.println();

    Coro coro2 =
        new Coro(
            "La familia es lo primero",
            "Fali Pastrana",
            "Tino Tovar",
            "Fali Pastrana",
            "Mafiosos",
            2,
            6);

    System.out.println(coro2);
    coro2.caminito_del_falla();
    coro2.hacer_tipo();
    coro2.cantar_la_presentacion();
    coro2.setPuntosObtenidos(90);

    System.out.println();

    Comparsa comparsa1 =
        new Comparsa(
            "La Resistencia",
            "Joaquin Quiñones",
            "El Lacio",
            "Joaquin Quiñones",
            "Soldados Ucranianos",
            "CopyArte");

    System.out.println(comparsa1);
    comparsa1.caminito_del_falla();
    comparsa1.hacer_tipo();
    comparsa1.cantar_la_presentacion();
    comparsa1.setPuntosObtenidos(120);

    System.out.println();

    Comparsa comparsa2 =
        new Comparsa(
            "La Serenata",
            "Martenez Ares",
            "Martenez Ares",
            "Martenez Aress",
            "Nadie lo entiende",
            "Pepi Mayo");

    System.out.println(comparsa2);
    comparsa2.caminito_del_falla();
    comparsa2.hacer_tipo();
    comparsa2.cantar_la_presentacion();
    comparsa2.setPuntosObtenidos(110);

    System.out.println();

    Chirigota chirigota1 =
        new Chirigota(
            "Los que no paran de toser",
            "El Sheriff",
            "El Sheriff",
            "La Agrupación",
            "Personas que tosen mucho pero no tienen el COVID",
            7);

    System.out.println(chirigota1);
    chirigota1.caminito_del_falla();
    chirigota1.hacer_tipo();
    chirigota1.cantar_la_presentacion();
    chirigota1.setPuntosObtenidos(130);
    chirigota1.amo_a_escucha();

    System.out.println();

    Chirigota chirigota2 =
        new Chirigota("Mayor que tu", "El Selu", "El Noli", "El Selu", "De Ancianos", 8);

    System.out.println(chirigota2);
    chirigota2.caminito_del_falla();
    chirigota2.hacer_tipo();
    chirigota2.cantar_la_presentacion();
    chirigota2.setPuntosObtenidos(105);
    chirigota2.amo_a_escucha();

    System.out.println();

    Cuarteto cuarteto1 =
        new Cuarteto(
            "Los numeros 1",
            "El Gago",
            "Su primo",
            "El Gago",
            "De numero 1 pero que quedan segundos",
            4);

    System.out.println(cuarteto1);
    cuarteto1.caminito_del_falla();
    cuarteto1.hacer_tipo();
    cuarteto1.cantar_la_presentacion();
    cuarteto1.setPuntosObtenidos(140);
    cuarteto1.amo_a_escucha();

    System.out.println();

    Cuarteto cuarteto2 =
        new Cuarteto(
            "Aju que corgahera",
            "El Morera",
            "El Melenas",
            "El Morera",
            "De programadores en lenguaje ensamblador",
            5);

    System.out.println(cuarteto2);
    cuarteto2.caminito_del_falla();
    cuarteto2.hacer_tipo();
    cuarteto2.cantar_la_presentacion();
    cuarteto2.setPuntosObtenidos(130);
    cuarteto2.amo_a_escucha();

    System.out.println();

    Romancero romancero1 =
        new Romancero(
            "El indio",
            "Manolin Santander",
            "Manolin Santander",
            "Manolin Santander",
            "De indio de la india",
            "Esta en hindi y no se entiende");

    System.out.println(romancero1);
    romancero1.hacer_tipo();
    romancero1.cantar_la_presentacion();
    romancero1.amo_a_escucha();

    System.out.println();

    Romancero romancero2 =
        new Romancero(
            "El Cani",
            "Desconocido",
            "Desconocido",
            "Desconocido",
            "En chandal",
            "De motos y cosas to guapas");

    System.out.println(romancero2);
    romancero2.hacer_tipo();
    romancero2.cantar_la_presentacion();
    romancero2.amo_a_escucha();

    System.out.println();

    COAC coac2022 = new COAC(4);

    coac2022.inscribir_agrupacion(coro1);
    coac2022.inscribir_agrupacion(chirigota1);
    coac2022.inscribir_agrupacion(comparsa1);
    coac2022.inscribir_agrupacion(cuarteto1);

    System.out.println(coac2022);
    System.out.println();

    coac2022.ordenar_por_autor();
    System.out.println(coac2022);
    System.out.println();

    coac2022.ordenar_por_nombre();
    System.out.println(coac2022);
    System.out.println();

    coac2022.ordenar_por_puntos();
    System.out.println(coac2022);
    System.out.println();

    coac2022.eliminar_agrupacion(cuarteto1);

    System.out.println(coac2022);
  }
}
