package U5.T1.A2;

public class PrincipalHora12 {
  public static void main(String[] args) {

    Hora12 hd1 = new Hora12(12, 58, Hora12.franjasHorariasEnum.AM);
    System.out.println(hd1);
    hd1.inc();
    System.out.println(hd1);
    hd1.inc();
    System.out.println(hd1);
    hd1.inc();
    System.out.println(hd1);

    System.out.println();

    Hora12 hd2 = new Hora12(12, 58, Hora12.franjasHorariasEnum.PM);
    System.out.println(hd2);
    hd2.inc();
    System.out.println(hd2);
    hd2.inc();
    System.out.println(hd2);
    hd2.inc();
    System.out.println(hd2);
  }
}
