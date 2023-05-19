package co.uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Empleado {

	private String nombre;
	private String id;
	private double salario;
	private Cargo cargo;
	private int aniosExperiencia;
	private List<Prestamo> listaPrestamosAsociados;
	
	public Empleado() {
		
	}
	
	/**
	 * 
	 * @param nombre
	 * @param salario
	 * @param cargo
	 */
	public Empleado(String nombre, String id, double salario, int aniosExperoencia, Cargo cargo) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.salario = salario;
		this.cargo = cargo;
		this.aniosExperiencia = aniosExperoencia;
		this.listaPrestamosAsociados = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public List<Prestamo> getListaPrestamosAsociados() {
		return listaPrestamosAsociados;
	}

	public void setListaPrestamosAsociados(List<Prestamo> listaPrestamosAsociados) {
		this.listaPrestamosAsociados = listaPrestamosAsociados;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", id=" + id + ", salario=" + salario + ", cargo=" + cargo
				+ ", aniosExperiencia=" + aniosExperiencia + "]";
	}
	
	//---------------------------------------------------------------------------------
	/**
	 * Este metodo verifica el cargo del empleado
	 * @param cargo
	 * @return
	 */
	public boolean verificarCargo(Cargo cargo) {
		boolean bandera = false;
		if(getCargo().equals(cargo)) {
			bandera = true;
		}
		return bandera;
	}
}
