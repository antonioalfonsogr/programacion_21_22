package U5.T1.A8;

public class PrincipalCajaCarton {
  public static void main(String[] args) {
    //
    CajaCarton cc1 = new CajaCarton(200, 100, 100);
    cc1.setEtiqueta(3245345);
    System.out.println(cc1);
    System.out.println("Volumen: " + cc1.getVolumen() + cc1.getUnidad() + "3");
    System.out.println(CajaCarton.getSuperficieTotal() + " cm2");
  }
}
