package co.uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

	private String nombre;
	private String apellido;
	private int edad;
	private String programa;
	private String estado;
	private String identificacion;
	private List<Prestamo> listaPrestamos;
	
	public Estudiante() {
		
	}
	
	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param programa
	 * @param estado
	 * @param identificacion
	 */
	public Estudiante(String nombre, String apellido, int edad, String programa, String estado, String identificacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.programa = programa;
		this.estado = estado;
		this.identificacion = identificacion;
		this.listaPrestamos = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public List<Prestamo> getListaPrestamos() {
		return listaPrestamos;
	}
	public void setListaPrestamos(List<Prestamo> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", programa=" + programa
				+ ", estado=" + estado + ", identificacion=" + identificacion + "]";
	}
	
	//---------------------------------------------------------------------------------
	/**
	 * Este metodo verifica la lista de prestamo de cada estudiante y verifica si en uno de estos
	 * prestamos hay alguien con un cargo, se va a la clase Prestamo
	 * @param cargo
	 * @return
	 */
	public boolean verificarCargo(Cargo cargo) {
		for (Prestamo prestamo : listaPrestamos) {
			if(prestamo.retornarTipoEspecifico(cargo)) {
				return true;
			}
		}
		return false;
	}
}
