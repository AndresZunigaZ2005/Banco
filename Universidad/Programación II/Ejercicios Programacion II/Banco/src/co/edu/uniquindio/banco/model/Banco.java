package co.edu.uniquindio.banco.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Banco {
	private String nombre;
	private List<CuentaBancaria> listaCuentas;
	private List<Cliente> listaClientes;
	
	public Banco(String nombre) {
		super();
		this.nombre = nombre;
		this.listaCuentas = new ArrayList<>();
		this.listaClientes = new ArrayList<>();
	}

	public Banco(String nombre, List<CuentaBancaria> listaCuentas) {
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

	public List<CuentaBancaria> getListaCuentas() {
		return listaCuentas;
	}

	public void setListaCuentas(List<CuentaBancaria> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + "]";
	}
		
	public CuentaBancaria obtenerCuenta (String numCuenta){
		
		CuentaBancaria cuentaEncontrado = null;
		
		for (CuentaBancaria cuenta : listaCuentas) {
			if(cuenta.getNumCuenta().equals(numCuenta)){
				cuentaEncontrado = cuenta;
			}
		}
		return cuentaEncontrado;
	}
	
	public void imprimirCuentas(List<CuentaBancaria> cuentas) {
		for (CuentaBancaria cuentaBancaria : cuentas) {
			System.out.println(cuentaBancaria.toString());
		}
	}
	
	public void consultarSaldo(List<CuentaBancaria> cuentas, String numCuenta) {
		
	}
	
	public void consignarDinero(String nombresTitular, String apellidosTitular, 
			String numCuenta, double dineroIngresar) {
		CuentaBancaria verificarCuenta = obtenerCuenta(numCuenta);
		for (CuentaBancaria cuentaBancaria : listaCuentas) {
			if(cuentaBancaria.equals(verificarCuenta)) {
				if(cuentaBancaria.getNombresTitular().equals(nombresTitular) && 
						cuentaBancaria.getApellidosTitular().equals(apellidosTitular) &&
						cuentaBancaria.getNumCuenta().equals(numCuenta)) {
					cuentaBancaria.setSaldoCuenta(dineroIngresar);
				}
			}
		}
	}
	
	public boolean compararCuentas(CuentaBancaria cuenta1, CuentaBancaria cuenta2) {
		boolean respuesta = false;
		if(cuenta1.getSaldoCuenta()>cuenta2.getSaldoCuenta()) {
			respuesta=true;
		}
		return respuesta;
	}
	
	public void transferir(CuentaBancaria cuentaEnvia, CuentaBancaria cuentaRecibe, double cantidad) {
		double aux = cuentaEnvia.getSaldoCuenta()+ cantidad;
		cuentaEnvia.setSaldoCuenta(aux);
		double aux1 = cuentaRecibe.getSaldoCuenta()+cantidad;
		cuentaRecibe.setSaldoCuenta(aux1);
	}
}
