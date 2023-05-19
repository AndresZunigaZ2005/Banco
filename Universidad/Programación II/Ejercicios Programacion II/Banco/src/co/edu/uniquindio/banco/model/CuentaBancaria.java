package co.edu.uniquindio.banco.model;

import java.util.Objects;

public class CuentaBancaria {
	private String nombresTitular;
	private String apellidosTitular;
	private String numCuenta;
	private Categoria tipoCuenta;
	private double saldoCuenta;
	
	public CuentaBancaria() {
		
	}
	/**
	 * 
	 * @param nombresTitular
	 * @param apellidosTitular
	 * @param numCuenta
	 * @param tipoCuenta
	 * @param saldoCuenta
	 */

	public CuentaBancaria(String nombresTitular, String apellidosTitular, String numCuenta, Categoria tipoCuenta,
			double saldoCuenta) {
		super();
		this.nombresTitular = nombresTitular;
		this.apellidosTitular = apellidosTitular;
		this.numCuenta = numCuenta;
		this.tipoCuenta = tipoCuenta;
		this.saldoCuenta = saldoCuenta;
	}
	public String getNombresTitular() {
		return nombresTitular;
	}
	public void setNombresTitular(String nombresTitular) {
		this.nombresTitular = nombresTitular;
	}
	public String getApellidosTitular() {
		return apellidosTitular;
	}
	public void setApellidosTitular(String apellidosTitular) {
		this.apellidosTitular = apellidosTitular;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public Categoria getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(Categoria tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public double getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [nombresTitular=" + nombresTitular + ", apellidosTitular=" + apellidosTitular
				+ ", numCuenta=" + numCuenta + ", tipoCuenta=" + tipoCuenta + ", saldoCuenta=" + saldoCuenta + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellidosTitular, numCuenta);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(apellidosTitular, other.apellidosTitular) && Objects.equals(numCuenta, other.numCuenta);
	}
}
