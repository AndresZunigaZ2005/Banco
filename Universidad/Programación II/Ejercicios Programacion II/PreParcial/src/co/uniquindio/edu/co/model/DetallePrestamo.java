package co.uniquindio.edu.co.model;

public class DetallePrestamo {
	
	private int cantidad;
	private String subCodigo;
	private double subTotal;
	private Libro libro;
	
	public DetallePrestamo() {
		
	}
	
	/**
	 * 
	 * @param isbn
	 * @param subCodigo
	 * @param subTotal
	 * @param libro
	 */
	public DetallePrestamo(int cantidad, String subCodigo, double subTotal, Libro libro) {
		super();
		this.cantidad = cantidad;
		this.subCodigo = subCodigo;
		this.subTotal = subTotal;
		this.libro = libro;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int catidad) {
		this.cantidad = catidad;
	}

	public String getSubCodigo() {
		return subCodigo;
	}

	public void setSubCodigo(String subCodigo) {
		this.subCodigo = subCodigo;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "DetallePrestamo [cantidad=" + cantidad + ", subCodigo=" + subCodigo + ", subTotal=" + subTotal + ", libro="
				+ libro + "]";
	}
	
	public boolean cumpleIsbn(String isbn) {
		if(libro.getIsbn().equals(isbn)) {
			return true;
		}
		return false;
	}

	public boolean cumpleLibro(String titulo, int limInferior, int limSuperior) {
		boolean cumpleNombre = verificarNombre(titulo);
		boolean cumpleCantidad = verificarRango(limInferior, limSuperior);
		if(cumpleNombre && cumpleCantidad) {
			return true;
		}
		return false;
	}

	private boolean verificarRango(int limInferior, int limSuperior) {
		if(getCantidad()>=limInferior && getCantidad()<limSuperior) {
			return true;
		}
		return false;
	}

	private boolean verificarNombre(String titulo) {
		if(libro.getTitulo().equals(titulo)) {
			return true;
		}
		return false;
	}
}
