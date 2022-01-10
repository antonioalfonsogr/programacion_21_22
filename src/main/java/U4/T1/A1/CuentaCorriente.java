package U4.T1.A1;

public class CuentaCorriente {

   private int saldo;
   private int limiteDescubierto;
   private String nombre;
   private String dni;

   public CuentaCorriente(String nombre, String dni){

     this.nombre = nombre;
     this.dni = dni;
     this.saldo = 0;
     this.limiteDescubierto = -50;
   }

   public boolean sacarDinero(int aSacar){

       if (this.saldo-aSacar>this.limiteDescubierto){
           this.saldo = this.saldo - aSacar;

           return true;
       }else {
           return false;
       }

   }
}
