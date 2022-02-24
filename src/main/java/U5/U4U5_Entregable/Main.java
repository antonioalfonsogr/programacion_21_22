package U5.U4U5_Entregable;

public class Main {
  public static void main(String[] args) {

    System.out.println();

    // Creación de películas
    Pelicula p1 =
        new Pelicula(
            "The Matrix", 1999, "hermanas Wachowski", 136, "Warner Bros", "Estados Unidos");

    Pelicula p2 =
        new Pelicula("Titanic", 1997, "James Cameron", 194, "Paramount Pictures", "Estados Unidos");

    Pelicula p3 =
        new Pelicula(
            "El Señor de los Anillos",
            2001,
            "Peter Jackson",
            178,
            "New Line Cinema",
            "Nueva Zelanda");

    // Finalizo la p2.
    p2.dar_por_finalizado();
    System.out.println();

    // Imprimo por consola las 3 películas
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println();

    // play, pause, stop peliculas
    p1.play();
    p2.pause();
    p3.stop();
    System.out.println();

    // Creación de libros
    Libro l1 = new Libro("Harry Potter", 1997, "J. K. Rowling", "Salamandra", "18691", 255);

    Libro l2 =
        new Libro("El nombre del viento", 2007, "Patrick Rothfuss", "DAW Books", "92210", 873);

    Libro l3 = new Libro("Juego de tronos", 1996, "R. R. Martin", "Bantam Spectra", "71539", 694);

    // Finalizo el l1
    l1.dar_por_finalizado();
    System.out.println();

    // Imprimo los libros
    System.out.println(l1);
    System.out.println(l2);
    System.out.println(l3);

    // Creación de series y add capítulos
    Serie s1 = new Serie("Los Simpson", 1989, "Matt Groening", 33, 3);
    s1.add_capitulo("S01E01");
    s1.add_capitulo("S01E02");
    s1.add_capitulo("S01E03");

    Serie s2 = new Serie("Friends", 1994, "Marta Kauffman", 10, 3);
    s2.add_capitulo("S02E01");
    s2.add_capitulo("S02E02");
    s2.add_capitulo("S02E03");

    Serie s3 = new Serie("The Big Bang Theory", 2007, "Chuck Lorre", 12, 3);
    s3.add_capitulo("S03E01");
    s3.add_capitulo("S03E02");
    s3.add_capitulo("S03E03");

    // finalizo serie s3
    s3.dar_por_finalizado();
    System.out.println();

    // Imprimo series
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println();

    // Elimino capitulo S3E3
    s3.eliminar_capitulo("S03E03");
    System.out.println(s3);
    System.out.println();

    s1.play();
    s2.pause();
    s3.stop();
    System.out.println();

    Catalogo c1 = new Catalogo();
    c1.add_multimedia(p1);
    c1.add_multimedia(s1);
    c1.add_multimedia(l1);
    c1.add_multimedia(l2);
    c1.add_multimedia(l2);
    c1.add_multimedia(l2);

    System.out.println(c1);

    c1.eliminar_multimedia(s1);
    System.out.println(c1);

    c1.ordenar_por_id();
    c1.ordenar_por_anyo();
    c1.ordenar_por_titulo();

    c1.numero_de_elementos();
  }
}
