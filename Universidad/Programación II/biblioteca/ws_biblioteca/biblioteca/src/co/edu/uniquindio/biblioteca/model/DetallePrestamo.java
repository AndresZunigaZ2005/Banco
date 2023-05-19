package co.edu.uniquindio.biblioteca.model;

public class DetallePrestamo {

	private String codigo;
	private double subTotal;
	private int cantidad;
	private Libro libro;
	
	public DetallePrestamo() {
		
	}
	
	/**
	 * 
	 * @param codigo
	 * @param subTotal
	 * @param cantidad
	 * @param libro
	 */
	public DetallePrestamo(String codigo, double subTotal, int cantidad, Libro libro) {
		
		this.codigo = codigo;
		this.subTotal = subTotal;
		this.cantidad = cantidad;
		this.libro = libro;
	}
	
	
}
