package U7.U6U7_Examen;

import java.io.*;
import java.util.*;

public class Filmaffinity implements Serializable {

  private Set<Pelicula> conjuntoPeliculas = new HashSet<>();
  private Set<Actor> conjuntoActores = new HashSet<>();
  private Map<Pelicula, Actor> mapaKeyPeliculas = new HashMap<>();
  private Map<Actor, Pelicula> mapaKeyActores = new HashMap<>();

  public void addPeliculaActor(Pelicula p, Actor a) {
    conjuntoPeliculas.add(p);
    conjuntoActores.add(a);
    mapaKeyPeliculas.put(p, a);
    mapaKeyActores.put(a, p);
  }

  public List<Actor> getActores(Pelicula p) {
    List<Actor> listaActores = new ArrayList<>();

    for (Actor act : conjuntoActores) {
      if (mapaKeyActores.get(act).equals(p)) {
        listaActores.add(act);
      }
    }

    listaActores.sort(
        new Comparator<Actor>() {
          @Override
          public int compare(Actor a1, Actor a2) {
            return a1.getApellido().compareTo(a2.getApellido());
          }
        });

    return listaActores;
  }

  public List<Pelicula> getPeliculas(Actor a) {
    List<Pelicula> listaPeliculas = new ArrayList<>();

    for (Pelicula pel : conjuntoPeliculas) {
      if (mapaKeyPeliculas.get(pel).equals(a)) {
        listaPeliculas.add(pel);
      }
    }

    listaPeliculas.sort(
        new Comparator<Pelicula>() {
          @Override
          public int compare(Pelicula p1, Pelicula p2) {
            return -p1.getTitulo().compareTo(p2.getTitulo());
          }
        });

    return listaPeliculas;
  }

  public Pelicula getPelicula(String titulo) {
    for (Pelicula pel : conjuntoPeliculas) {
      if (pel.getTitulo().equalsIgnoreCase(titulo)) {
        return pel;
      }
    }
    return null;
  }

  public void removePelicula(String titulo) {

    conjuntoPeliculas.remove(getPelicula(titulo));

    mapaKeyPeliculas.remove(getPelicula(titulo));

    Iterator<Map.Entry<Actor, Pelicula>> it = mapaKeyActores.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<Actor, Pelicula> actPel = it.next();
      if (actPel.getValue().equals(getPelicula(titulo))) {
        it.remove();
      }
    }
  }

  public Actor getActor(String nombre, String apellido) {
    for (Actor act : conjuntoActores) {
      if (act.getNombre().equalsIgnoreCase(nombre)
          && act.getApellido().equalsIgnoreCase(apellido)) {
        return act;
      }
    }
    return null;
  }

  public void guardarDatos() {
    try {
      FileOutputStream ficheroBinario = new FileOutputStream("filmaffinity.dat");
      ObjectOutputStream out = new ObjectOutputStream(ficheroBinario);
      out.writeObject(conjuntoPeliculas);
      out.writeObject(conjuntoActores);
      out.writeObject(mapaKeyPeliculas);
      out.writeObject(mapaKeyActores);
      out.close();
    } catch (IOException ex) {
      System.out.println("Error al escribir el fichero");
    }
  }

  public void cargarDatos() {
    try {
      FileInputStream ficheroBinario = new FileInputStream("filmaffinity.dat");
      ObjectInputStream in = new ObjectInputStream(ficheroBinario);
      conjuntoPeliculas = (Set<Pelicula>) in.readObject();
      conjuntoActores = (Set<Actor>) in.readObject();
      mapaKeyPeliculas = (Map<Pelicula, Actor>) in.readObject();
      mapaKeyActores = (Map<Actor, Pelicula>) in.readObject();
      in.close();
    } catch (IOException | ClassNotFoundException ex) {
      System.out.println("Error al leer el fichero");
    }
  }

  public Set<Pelicula> getConjuntoPeliculas() {
    return conjuntoPeliculas;
  }

  public void setConjuntoPeliculas(Set<Pelicula> conjuntoPeliculas) {
    this.conjuntoPeliculas = conjuntoPeliculas;
  }

  public Set<Actor> getConjuntoActores() {
    return conjuntoActores;
  }

  public void setConjuntoActores(Set<Actor> conjuntoActores) {
    this.conjuntoActores = conjuntoActores;
  }

  public Map<Pelicula, Actor> getMapaKeyPeliculas() {
    return mapaKeyPeliculas;
  }

  public void setMapaKeyPeliculas(Map<Pelicula, Actor> mapaKeyPeliculas) {
    this.mapaKeyPeliculas = mapaKeyPeliculas;
  }

  public Map<Actor, Pelicula> getMapaKeyActores() {
    return mapaKeyActores;
  }

  public void setMapaKeyActores(Map<Actor, Pelicula> mapaKeyActores) {
    this.mapaKeyActores = mapaKeyActores;
  }
}
