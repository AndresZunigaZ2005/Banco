package co.edu.uniquindio.bank.model;

public class CuentaCorriente extends Cuenta{
	
	private double sobreGiro;

	public CuentaCorriente(double saldo, double tasaAnual) {
		super(saldo, tasaAnual);
		sobreGiro = 0;
	}

	public double getSobreGiro() {
		return sobreGiro;
	}

	public void setSobreGiro(double sobreGiro) {
		this.sobreGiro = sobreGiro;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [sobreGiro=" + sobreGiro + "]";
	}
	
	public void retirar(double dinero) throws Exception{
		if(dinero>getSaldo()) {
			sobreGiro = sobreGiro - getSaldo()-dinero;
			setSaldo(0);
		}else {
			super.retirar(dinero);
		}
	}
	
	public void consignar(double dinero) throws Exception{
		if(sobreGiro>0) {
			if(sobreGiro-dinero>0) {
				sobreGiro = 0;
				saldo = sobreGiro-dinero;
			}else {
				sobreGiro = sobreGiro-dinero;
				saldo = 0;
			}
		} else {
			super.consignar(dinero);
		}
	}
	
	public void extractoMensual() {
		super.extractoMensual();
	}
}
