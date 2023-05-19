package co.edu.uniquindio.bank.model;

import java.util.ArrayList;
import java.util.List;
import co.edu.uniquindio.bank.exception.*;

public class Banco {

	private String nombre;
	private List<Cuenta> listaCuentas = new ArrayList<Cuenta>();
	public Banco() {
		// TODO Auto-generated constructor stub
	}
	public Banco(String nombre, List<Cuenta>listaCuentas) {
		super();
		this.nombre = nombre;
		this.listaCuentas = listaCuentas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Cuenta> getListaCuentas() {
		return listaCuentas;
	}
	public void setListaCuentas(List<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}
	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", listaCuentas=" + listaCuentas + "]";
	}

	//---------------------------------------------------------------------------------------//
	/**
	 * CRUD Cuenta ahorrros
	 */
	public void crearCuentaAhorros(CuentaAhorros ahorros) throws CuentaException{
		if(verificarCuentaAhorros(ahorros)){
			throw new CuentaException("Esta cuenta ya existe");
		}
		listaCuentas.add(obtenerCuentaAhorros(ahorros));
	}
	public CuentaAhorros obtenerCuentaAhorros(CuentaAhorros ahorros) throws CuentaException{
		CuentaAhorros cuentaAhorros = null;
		cuentaAhorros = (CuentaAhorros) listaCuentas.stream().filter(c -> c.equals(ahorros));
		if(cuentaAhorros.equals(null)){
			throw new CuentaException("Esta cuenta no existe");
		}
		return cuentaAhorros;
	}

	public boolean verificarCuentaAhorros(CuentaAhorros ahorros){
		return listaCuentas.stream().anyMatch(c -> c.equals(ahorros));
	}

	/**
	 * CRUD cuentaCorriente
	 */
	public void crearCuentaCorriente(CuentaCorriente corriente) throws CuentaException{
		if(verificarCuentaCorriente(corriente)){
			throw new CuentaException("Esta cuenta ya existe");
		}
		listaCuentas.add(obtenerCuentaCorriente(corriente));
	}
	public CuentaCorriente obtenerCuentaCorriente(CuentaCorriente corriente) throws CuentaException{
		CuentaCorriente cuentaCorriente = null;
		cuentaCorriente = (CuentaCorriente) listaCuentas.stream().filter(c -> c.equals(corriente));
		if(cuentaCorriente.equals(null)){
			throw new CuentaException("Esta cuenta no existe");
		}
		return cuentaCorriente;
	}

	public boolean verificarCuentaCorriente(CuentaCorriente corriente){
		return listaCuentas.stream().anyMatch(c -> c.equals(corriente));
	}
}
