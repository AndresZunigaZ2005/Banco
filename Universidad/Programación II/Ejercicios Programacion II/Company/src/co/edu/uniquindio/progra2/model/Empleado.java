package co.edu.uniquindio.progra2.model;

import java.util.Objects;

public class Empleado {

	private String nombre;
	private String apellidos;
	private String id;
	
	public Empleado(String nombre, String apellidos, String id) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(id, other.id);
	}

	private boolean verificarEmpleado(String nombre, String apellidos, String id) {
		boolean empleadoEncontrado = false;
		return empleadoEncontrado;
	}
}
