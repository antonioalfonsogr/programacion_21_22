package U3.T2;

import java.util.Scanner;

public class A2_8 {
  public static void main(String[] args) {
    // Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan
    // sus frases con "Javalín, javalón", para después hacer una pausa más o menos larga (la pausa
    // se representa mediante espacios en blanco) y a continuación expresan el mensaje. Existe un
    // dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con
    // un silencio, más o menos prolongado y la coletilla "javalén, len, len". Se pide diseñar un
    // traductor que, en primer lugar, nos diga si la frase está escrita en el idioma de Javalandia
    // (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre el mensaje sin
    // muletillas.

    Scanner sc = new Scanner(System.in);

    String javalandia = "Javalín, javalón";
    String dialecto = "javalén, len, len";
    StringBuilder dialectob = new StringBuilder(dialecto).reverse();
    String dialectoAlReves = String.valueOf(dialectob);

    System.out.println("Introduzca una frase");
    String frase = sc.nextLine();

    StringBuilder fraseb = new StringBuilder(frase).reverse();
    String fraseAlReves = String.valueOf(fraseb);

    if (frase.substring(0, javalandia.length()).equals(javalandia)) {
      System.out.println("La frase esta escrita en el idioma de Javalandia");
      String fraseTraducida = frase.substring(javalandia.length());
      System.out.println(fraseTraducida.trim());

    } else if (fraseAlReves.substring(0, dialectoAlReves.length()).equals(dialectoAlReves)) {
      System.out.println("La frase esta escrita en el dialecto de Javalandia");
      String fraseTaducidaAlReves = fraseAlReves.substring(dialectoAlReves.length());
      StringBuilder fraseTaducidaAlRevesb = new StringBuilder(fraseTaducidaAlReves).reverse();
      String fraseTraducida = String.valueOf(fraseTaducidaAlRevesb);
      System.out.println(fraseTraducida.trim());

    } else {
      System.out.println("La frase no esta en idioma de Javalandia");
    }
  }
}
