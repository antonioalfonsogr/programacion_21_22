package U6.T4;

public class RegistroLibros {

  // Atributos
  private Libro[] librosArrays;
  private static Integer numLibrosRegistrados = 0;

  // Constructor

  public RegistroLibros(Integer maxLibrosRegistrables) {
    this.librosArrays = new Libro[maxLibrosRegistrables];
    numLibrosRegistrados++;
  }

  // Método añadir libro
  public void addLibro(Libro libro) {
    librosArrays[numLibrosRegistrados] = libro;
  }

  // Método buscar libro
  public boolean buscarLibro(String titulo) {

    return false;
  }

  // Método cargar registros desde fichero

  // Método cargar registro a fichero
}
