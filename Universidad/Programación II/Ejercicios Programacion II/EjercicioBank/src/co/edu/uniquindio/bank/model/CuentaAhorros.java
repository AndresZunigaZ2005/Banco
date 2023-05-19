package co.edu.uniquindio.bank.model;

public class CuentaAhorros extends Cuenta {
	
	private boolean isActiva;

	public CuentaAhorros(double saldo, double tasaAnual, boolean isActiva) {
		super(saldo, tasaAnual);
		if(getSaldo()<=10000) {
			setActiva(false);
		} else {
			setActiva(true);
		}
	}

	public boolean isActiva() {
		return isActiva;
	}

	public void setActiva(boolean isActiva) {
		this.isActiva = isActiva;
	}
	
	public void retirar(double dinero) throws Exception{
		if(isActiva) {	
			super.retirar(dinero);
		}
	}
	
	public void consignar(double dinero) throws Exception{
		if(isActiva) {	
			super.consignar(dinero);
		}
	}
	
	public void extractoMensual() {
		if (getNumerosRetiros() > 4) {
			setComisionMensual((getNumerosRetiros() - 4) * 1000);
		}
		super.extractoMensual(); 
		if (saldo < 10000 )
			isActiva = false;
	}
}
