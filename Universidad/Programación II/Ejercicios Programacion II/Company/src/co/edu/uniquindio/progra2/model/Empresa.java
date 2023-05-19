package co.edu.uniquindio.progra2.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String name;
	private String nit;
	private List<Empleado> listaEmpleados;
	
	public Empresa() {
		
	}
	
	public Empresa(String name, String nit) {
		super();
		this.name = name;
		this.nit = nit;
		this.listaEmpleados = new ArrayList<Empleado>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public List<Empleado> getListaEmpleado() {
		return listaEmpleados;
	}

	public void setListaEmpleado(List<Empleado> listaEmpleado) {
		this.listaEmpleados = listaEmpleado;
	}
	
	@Override
	public String toString() {
		return "Empresa [name=" + name + ", nit=" + nit + ", listaEmpleados=" + listaEmpleados + "]";
	}

	public String crearEmpleado(String nombre, String apellidos, String id)throws Exception {
		for(Empleado empleado : listaEmpleados) {
			if(true) {
				System.out.println();
			}
		}
		return "";
	}
}
