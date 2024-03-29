package U7.T3b;

public class A4 {
  public static void main(String[] args) {
    // Crea una clase llamada Traductor, que contenga un atributo llamado "diccionario" de tipo
    // HashMap y se comporte de esta forma:
    // Al crear el objeto Traductor, el atributo diccionario debe ser cargado con la información de
    // un archivo de texto cuyo nombre se le pasará por parámetro al constructor. Este archivo debe
    // contener varias palabras en español y su traducción al inglés, de tal forma que las palabras
    // en español sean la clave, y las que estén en inglés, el valor. Por ejemplo:
    // hola, hello
    // mundo, world
    // gracias, thanks
    // adios, bye
    // Crear un método que reciba una palabra o una frase, y devuelva la cadena traducida al inglés.

    Traductor t1 = new Traductor("/home/graa/Escritorio/PROG/FicherosTexto/diccionario.txt");

    System.out.println(t1);

    String frase1 = "hola mundo";
    String frase2 = "gracias adios";

    System.out.println(t1.traduceString(frase1));
    System.out.println(t1.traduceString(frase2));
  }
}
