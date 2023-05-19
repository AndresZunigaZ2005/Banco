package co.uniquindio.programacion1.cine.view;

public class recargar {

  double saldo1=0;
  double saldo=0;
  
   public double completarSaldo (double saldo) {
	   this.saldo=saldo+saldo;
	   return saldo;}
   public double saldoRestante (double descontar) {
	   saldo1=saldo-descontar;
	   return saldo1;
   }
}
