package U1.T5II;

import java.util.Scanner;

// Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en
// el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación
// obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal
// andan de conocimientos en las diferentes asignaturas del curso.

public class E5II_11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    byte nota = 0;
    // Pregunta 1
    System.out.println(
        "Cual de las siguientes opciones corresponden a tipos de Sistemas Operativos Existentes en el mercado.");
    System.out.println("1: Windows, Mac Os, Linux");
    System.out.println("2: Office, Word, Excel");
    System.out.println("3: Mother Board, Mouse, Teclado");
    System.out.println("4: Internet, Servidor, Conexión FTP");
    byte respuesta1 = teclado.nextByte();
    if (respuesta1 == 1) {
      nota++;
    }
    // Pregunta 2
    System.out.println("Que programa de ofimática utilizamos para escribir cartas?");
    System.out.println("1: Word");
    System.out.println("2: Excel");
    System.out.println("3: Internet");
    System.out.println("4: Pluma y papel");
    byte respuesta2 = teclado.nextByte();
    if (respuesta2 == 1) {
      nota++;
    }
    // Pregunta 3
    System.out.println("HTML es");
    System.out.println("1: Un lenguaje informatico que se usa para detectar virus");
    System.out.println("2: Todas las opciones son incorrectas");
    System.out.println("3: Un lenguaje para hacer paginas web");
    System.out.println("4: Es la extensión de una hoja de calculo");
    byte respuesta3 = teclado.nextByte();
    if (respuesta3 == 3) {
      nota++;
    }
    // Pregunta 4
    System.out.println("Que teclas debes pulsar para pegar un texto seleccionado");
    System.out.println("1: Ctrl+X");
    System.out.println("2: Ctrl+V");
    System.out.println("3: Ctrl+C");
    System.out.println("4: Alt+V");
    byte respuesta4 = teclado.nextByte();
    if (respuesta4 == 2) {
      nota++;
    }
    // Pregunta 5
    System.out.println("Como se llama el navegador web de google");
    System.out.println("1: Safari");
    System.out.println("2: Firefox");
    System.out.println("3: Explorer");
    System.out.println("4: Chrome");
    byte respuesta5 = teclado.nextByte();
    if (respuesta5 == 4) {
      nota++;
    }
    System.out.println("Tu nota es " + nota);
  }
}
