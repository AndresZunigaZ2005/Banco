package co.uniquindio.edu.co.model;

public class NotFoundLoanException extends Exception {

	public NotFoundLoanException() {
		
	}
	
	public NotFoundLoanException(String msj) {
		super(msj);
	}
}
