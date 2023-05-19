package co.edu.uniquindio.banco.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Comparable<Cliente>{
	private String nombre;
	private String apellido;
	private String documento;
	private String direccion;
	private List<CuentaBancaria> listaCuentas;
	private Banco banco;
	
	public Cliente() {
		
	}
	/**
	 * 
	 * @param documento
	 * @param direccion
	 * @param cuenta
	 */
	public Cliente(String nombre, String apellido, String documento, String direccion, Banco banco) {
		super();
		this.documento = documento;
		this.direccion = direccion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.banco = banco;
		this.listaCuentas = new ArrayList<>();
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", direccion="
				+ direccion + ", listaCuentas=" + listaCuentas + ", banco=" + banco + "]";
	}
	@Override
	public int compareTo(Cliente cliente) {
		
		return this.getDocumento().compareTo(cliente.getDocumento());
	}
}
