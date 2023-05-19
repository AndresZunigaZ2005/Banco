package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;

public class Prestamo {
	
	private String fecha;
	private double total;
	private Integer tiempoEntrega;
	private String codigo;
	private ArrayList<DetallePrestamo> listaDetallePrestamo;
	
	public Prestamo() {
		
	}
	
/**
 * Constructor
 * @param fecha
 * @param total
 * @param tiempoEntrega
 * @param codigo
 */
	
	public Prestamo(String fecha, double total, Integer tiempoEntrega, String codigo) {
		this.fecha = fecha;
		this.total = total;
		this.tiempoEntrega = tiempoEntrega;
		this.codigo = codigo;
		this.listaDetallePrestamo = new ArrayList<DetallePrestamo>();
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
	
	public Integer getTiempoEntrega() {
		return tiempoEntrega;
	}
	
	public void setTiempoEntrega(Integer tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public ArrayList<DetallePrestamo> getListaDetallePrestamo() {
		return listaDetallePrestamo;
	}

	public void setListaDetallePrestamo(ArrayList<DetallePrestamo> listaDetallePrestamo) {
		this.listaDetallePrestamo = listaDetallePrestamo;
	}
	
}
