package U4.T1.A9.Maquinaria;

import U4.T1.A9.Personal.Mecanicos;

public class Locomotoras {

  private String matricula;
  private int potenciaMotorCV;
  private int añoFabricación;
  private Mecanicos mec;

  public Locomotoras(String matricula, int potenciaMotorCV, int añoFabricación, Mecanicos mec) {

    this.matricula = matricula;
    this.potenciaMotorCV = potenciaMotorCV;
    this.añoFabricación = añoFabricación;
    this.mec = mec;
  }
}
