package U1.T5II;

import java.util.Scanner;

// Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo
// infiel. El programa irá haciendo preguntas que el usuario contestará con verdadero o falso. Cada
// pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman
// puntos. A continuación se listan las preguntas del test.
//
//
// 1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.
// 2. Ha aumentado sus gastos de vestuario
// 3. Ha perdido el interés que mostraba anteriormente por ti
// 4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se
// asea con más frecuencia (si es mujer)
// 5. No te deja que mires la agenda de su teléfono móvil
// 6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante
// 7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
// 8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo
// 9. Has notado que últimamente se perfuma más
// 10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo
//
// A continuación se muestran los mensajes que deberá dar el programa según la puntuación obtenida.
//
//
// • Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.
// • Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su vida o en su mente,
// aunque seguramente será algo sin importancia. No bajes la guardia.
// • Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un romance
// con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando
// por su cabeza.

public class E5II_15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int puntuacion = 0;
    System.out.println("Contesta las siguientes preguntas con true o false");
    System.out.println(
        "Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    boolean pregunta1 = teclado.nextBoolean();
    if (pregunta1 == true) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("Ha aumentado sus gastos de vestuario.");
    boolean pregunta2 = teclado.nextBoolean();
    if (pregunta2 == true) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("Ha perdido el interés que mostraba anteriormente por ti.");
    boolean pregunta3 = teclado.nextBoolean();
    if (pregunta3 == true) {
      puntuacion = puntuacion + 3;
    }
    System.out.println(
        "Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
    boolean pregunta4 = teclado.nextBoolean();
    if (pregunta4 == true) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("No te deja que mires la agenda de su teléfono móvil.");
    boolean pregunta5 = teclado.nextBoolean();
    if (pregunta5 == true) {
      puntuacion = puntuacion + 3;
    }
    System.out.println(
        "A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
    boolean pregunta6 = teclado.nextBoolean();
    if (pregunta6 == true) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
    boolean pregunta7 = teclado.nextBoolean();
    if (pregunta7 == true) {
      puntuacion = puntuacion + 3;
    }
    System.out.println(
        "Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
    boolean pregunta8 = teclado.nextBoolean();
    if (pregunta8 == true) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("Has notado que últimamente se perfuma más.");
    boolean pregunta9 = teclado.nextBoolean();
    if (pregunta9 == true) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
    boolean pregunta10 = teclado.nextBoolean();
    if (pregunta10 == true) {
      puntuacion = puntuacion + 3;
    }
    if (puntuacion <= 10) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if (puntuacion <= 22) {
      System.out.println(
          "Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else {
      System.out.println(" ");
      System.out.println(
          "Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
  }
}
