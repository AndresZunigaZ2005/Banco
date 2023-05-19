package co.edu.uniquindio.model;

public class Impresora {

	private EstadoImp estado;
	private String nombre;
	private String marca;
	private String codigo;
	
	public Impresora(EstadoImp estado, String nombre, String marca, String codigo) {
		super();
		this.estado = estado;
		this.nombre = nombre;
		this.marca = marca;
		this.codigo = codigo;
	}
	public EstadoImp getEstado() {
		return estado;
	}
	public void setEstado(EstadoImp estado) {
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Impresora [estado=" + estado + ", nombre=" + nombre + ", marca=" + marca + "]";
	}
	
	
}
