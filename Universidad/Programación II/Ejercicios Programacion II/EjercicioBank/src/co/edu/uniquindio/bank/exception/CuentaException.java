package co.edu.uniquindio.bank.exception;

import java.io.IOException;

public class CuentaException extends Exception{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public CuentaException() {

	}

	public CuentaException(String msj){
		super("Error"+msj);
	}
}
