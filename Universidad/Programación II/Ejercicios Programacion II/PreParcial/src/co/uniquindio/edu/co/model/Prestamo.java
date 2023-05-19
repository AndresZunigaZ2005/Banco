package co.uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {

	private String fecha;
	private double total;
	private int tiempoEntrega;
	private List<DetallePrestamo> listaDetallesPrestamos;
	private Empleado empleadoPrestante;
	
	public Prestamo() {
		
	}
	
	/**
	 * 
	 * @param fecha
	 * @param total
	 * @param tiempoEntrega
	 * @param empleadoPrestante
	 */
	public Prestamo(String fecha, double total, int tiempoEntrega, Empleado empleadoPrestante) {
		super();
		this.fecha = fecha;
		this.total = total;
		this.tiempoEntrega = tiempoEntrega;
		this.listaDetallesPrestamos = new ArrayList<>();
		this.empleadoPrestante = empleadoPrestante;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getTiempoEntrega() {
		return tiempoEntrega;
	}

	public void setTiempoEntrega(int tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}

	public List<DetallePrestamo> getListaDetallesPrestamos() {
		return listaDetallesPrestamos;
	}

	public void setListaDetallesPrestamos(List<DetallePrestamo> listaDetallesPrestamos) {
		this.listaDetallesPrestamos = listaDetallesPrestamos;
	}

	public Empleado getEmpleadoPrestante() {
		return empleadoPrestante;
	}

	public void setEmpleadoPrestante(Empleado empleadoPrestante) {
		this.empleadoPrestante = empleadoPrestante;
	}

	@Override
	public String toString() {
		return "Prestamo [fecha=" + fecha + ", total=" + total + ", tiempoEntrega=" + tiempoEntrega
				+ ", listaDetallesPrestamos=" + listaDetallesPrestamos + ", empleadoPrestante=" + empleadoPrestante
				+ "]";
	}
	
	public boolean buscarIsbn(String isbn) {
		boolean resultado = false;
		for (DetallePrestamo detallePrestamo : listaDetallesPrestamos) {
			if(detallePrestamo.cumpleIsbn(isbn)) {
				resultado = true;
			}
		}
		return resultado;
	}

/*	public boolean cumpleLibro(String titulo, int limInferior, int limSuperior, int aniosExperiencia) {
		for (DetallePrestamo detallePrestamo : listaDetallesPrestamos) {
			if(detallePrestamo.cumpleLibro(titulo, limInferior, limSuperior, aniosExperiencia)) {
				return true;
			}
		}
		return false;
	}*/
	
	//---------------------------------------------------------------------------------
	/**
	 * Este metodo verifica el cargo del empleado que esta relacionado al prestamo,
	 * se va a la clase Empleado
	 * @param cargo
	 * @return
	 */
	public boolean retornarTipoEspecifico(Cargo cargo) {
		boolean bandera = false;
		if(empleadoPrestante.verificarCargo(cargo)) {
			bandera = true;
		}
		return bandera;
	}
	
}
