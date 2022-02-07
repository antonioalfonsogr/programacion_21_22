package U5.T1.A6;

import U5.T1.A5.Instrumento;

public class PrincipalA6 {
  public static void main(String[] args) {
    //
    Piano p1 = new Piano("Solista");
    p1.add(Instrumento.notasEnum.Do);
    p1.add(Instrumento.notasEnum.Re);
    p1.add(Instrumento.notasEnum.Mi);
    p1.add(Instrumento.notasEnum.Fa);
    p1.add(Instrumento.notasEnum.Sol);
    p1.add(Instrumento.notasEnum.La);
    p1.add(Instrumento.notasEnum.Si);

    p1.interpretar();

    Campana c1 = new Campana();
    c1.add(Instrumento.notasEnum.Si);
    c1.add(Instrumento.notasEnum.La);
    c1.add(Instrumento.notasEnum.Sol);
    c1.add(Instrumento.notasEnum.Fa);
    c1.add(Instrumento.notasEnum.Mi);
    c1.add(Instrumento.notasEnum.Re);
    c1.add(Instrumento.notasEnum.Do);

    c1.interpretar();
  }
}
