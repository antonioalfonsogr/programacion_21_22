package U5.T1.A7;

public class PrincipalCaja {
  public static void main(String[] args) {
    //
    Caja c1 = new Caja(20, 20, 10, Caja.unidadesEnum.cm);

    System.out.println(c1);
    System.out.println("Volumen: " + c1.getVolumen() + c1.getUnidad() + "3");

    Caja c2 = new Caja(1, 1, 1, Caja.unidadesEnum.m);

    c2.setEtiqueta("Destinatario: Pepito Pérez, Dirección: Calle Ancha 16");

    System.out.println(c2);
    System.out.println("Volumen: " + c2.getVolumen() + c2.getUnidad() + "3");
  }
}
