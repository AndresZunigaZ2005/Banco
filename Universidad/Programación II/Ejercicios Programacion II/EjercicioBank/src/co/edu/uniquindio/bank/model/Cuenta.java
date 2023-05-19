package co.edu.uniquindio.bank.model;

public abstract class Cuenta {

	protected double saldo;
	protected int numeroConsignaciones;
	protected int numerosRetiros;
	protected double tasaAnual;
	protected double comisionMensual;
	
	
	/**
	 * 
	 * @param saldo
	 * @param tasaAnual
	 */
	public Cuenta(double saldo, double tasaAnual) {
		super();
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConsignaciones() {
		return numeroConsignaciones;
	}

	public void setNumeroConsignaciones(int numeroConsignaciones) {
		this.numeroConsignaciones = numeroConsignaciones;
	}

	public int getNumerosRetiros() {
		return numerosRetiros;
	}

	public void setNumerosRetiros(int numerosRetiros) {
		this.numerosRetiros = numerosRetiros;
	}

	public double getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(double tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public double getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(double comisionMensual) {
		this.comisionMensual = comisionMensual;
	}
	
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numeroConsignaciones=" + numeroConsignaciones + ", numerosRetiros="
				+ numerosRetiros + ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}

	//----------------------------------------------------------------------------//
	public void consignar(double dinero) throws Exception{
		setSaldo(getSaldo()+dinero);
		numeroConsignaciones++;
	}
	
	public void retirar(double dinero) throws Exception{
		if(getSaldo()>dinero) {
			setSaldo(getSaldo()-dinero);
			numerosRetiros++;
		}
		else {
			throw new Exception("Saldo insufiente");
		}
	}
	
	public void calcularInteres() {
		double tasaInteres = tasaAnual / 12;
		double interesTasa = saldo * tasaInteres;
		saldo+= interesTasa;
	}
	
	public void extractoMensual() {
		setSaldo(getSaldo()-comisionMensual);
		calcularInteres();
	}
	
	public void imprimir() {
		System.out.println(toString());
	}
}
