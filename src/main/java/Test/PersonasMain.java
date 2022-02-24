package Test;

public class PersonasMain {
  public static void main(String[] args) {

    System.out.println();

    Persona p1 = new Persona("Adrian", true, 31);
    Persona p2 = new Persona("Antonio", true, 31);
    Persona p3 = new Persona("Juana", false, 18);
    Persona p4 = new Persona("Pepe", false, 40);
    Persona p5 = new Persona("Maria", true, 37);
    Persona p6 = new Persona("Jose", true, 16);
    Persona p7 = new Persona("Juana", false, 16);

    Personas ps1 = new Personas();

    ps1.addPersona(p1);
    ps1.addPersona(p2);
    ps1.addPersona(p3);
    ps1.addPersona(p4);
    ps1.addPersona(p5);

    System.out.println(ps1);
    System.out.println();

    ps1.eliminarPersona(2);

    System.out.println(ps1);
    System.out.println();

    ps1.addPersona(p6);
    ps1.addPersona(p7);

    System.out.println(ps1);
    System.out.println();

    ps1.elimnaPersonaEdad(40);

    System.out.println(ps1);
    System.out.println();

    ps1.elimnaPersonaEdad(31);

    System.out.println(ps1);
    System.out.println();
  }
}
