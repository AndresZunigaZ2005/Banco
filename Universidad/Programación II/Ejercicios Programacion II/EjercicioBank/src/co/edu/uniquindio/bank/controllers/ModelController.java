package co.edu.uniquindio.bank.controllers;

import co.edu.uniquindio.bank.model.Banco;
import co.edu.uniquindio.bank.model.CuentaAhorros;

public class ModelController {

	Banco banco = null;

	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelController eINSTANCE = new ModelController();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelController getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	public ModelController() {
		System.out.println("invocación clase singleton");
		inicializarDatos();
	}

	private void inicializarDatos() {
		Banco banco = new Banco("Banco UQ",null);
		CuentaAhorros ahorros1 = new CuentaAhorros(20000, 7, false);
		CuentaAhorros ahorros2 = new CuentaAhorros(5000, 4, false);
		CuentaAhorros ahorros3 = new CuentaAhorros(12000, 3, true);
		banco.getListaCuentas().add(ahorros1);
		banco.getListaCuentas().add(ahorros2);
		banco.getListaCuentas().add(ahorros3);
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
}
