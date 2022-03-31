package U7.U6U7_Examen;

public class Main {
  public static void main(String[] args) {

    Pelicula p1 = new Pelicula("La Película Uno", "01/01/2011", "España", "Terror", "Director Uno");
    Pelicula p2 =
        new Pelicula("La Película Dos", "02/02/2012", "Italia", "Suspense", "Director Dos");
    Pelicula p3 =
        new Pelicula("La Película Tres", "03/03/2013", "Francia", "Comedia", "Director Tres");
    Pelicula p4 =
        new Pelicula("La Película Cuatro", "04/04/2014", "España", "Comedia", "Director Cuatro");
    Pelicula p5 =
        new Pelicula("La Película Cinco", "05/05/2015", "Portugal", "Romantica", "Director Cienco");

    Actor a1 = new Actor("Pepe", "Prieto", "Español");
    Actor a2 = new Actor("Ana", "Aguilar", "Española");
    Actor a3 = new Actor("Luigi", "Rossi", "Italiano");
    Actor a4 = new Actor("Danielle", "Didier", "Francesa");
    Actor a5 = new Actor("Renata", "Ferreira", "Portuguesa");

    Filmaffinity ff1 = new Filmaffinity();

    ff1.addPeliculaActor(p1, a1);
    ff1.addPeliculaActor(p1, a2);
    ff1.addPeliculaActor(p1, a3);

    ff1.addPeliculaActor(p2, a4);
    ff1.addPeliculaActor(p2, a5);
    ff1.addPeliculaActor(p2, a1);

    ff1.addPeliculaActor(p3, a2);
    ff1.addPeliculaActor(p3, a3);
    ff1.addPeliculaActor(p3, a4);

    ff1.addPeliculaActor(p4, a5);
    ff1.addPeliculaActor(p4, a1);
    ff1.addPeliculaActor(p4, a2);

    ff1.addPeliculaActor(p5, a3);
    ff1.addPeliculaActor(p5, a4);
    ff1.addPeliculaActor(p5, a5);

    System.out.println();

    System.out.println(ff1.getActores(p1).toString());
    System.out.println();

    System.out.println(ff1.getPeliculas(a1).toString());
    System.out.println();

    System.out.println(ff1.getPelicula("La Película Uno"));
    System.out.println();

    System.out.println(ff1.getConjuntoPeliculas());
    System.out.println(ff1.getMapaKeyActores());
    System.out.println(ff1.getMapaKeyPeliculas());
    System.out.println();
    ff1.removePelicula("La Película Uno");
    System.out.println(ff1.getConjuntoPeliculas());
    System.out.println(ff1.getMapaKeyActores());
    System.out.println(ff1.getMapaKeyPeliculas());
    System.out.println();

    System.out.println(ff1.getActor("Pepe", "Prieto"));

    ff1.guardarDatos();

    ff1.cargarDatos();
  }
}
