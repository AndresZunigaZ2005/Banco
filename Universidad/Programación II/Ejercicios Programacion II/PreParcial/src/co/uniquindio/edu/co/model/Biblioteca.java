package co.uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {

	private String nombre;
	private String direccion;
	private String telefono;
	private List<Estudiante>listaEstudiantes;
	private List<Libro>listaLibros;
	private List<Prestamo>listaPrestamosTotal;
	private List<Empleado>listaEmpleados;
	
	public Biblioteca() {
		
	}
	
	/**
	 * 
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 */
	public Biblioteca(String nombre, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.listaEmpleados = new ArrayList<>();
		this.listaEstudiantes = new ArrayList<>();
		this.listaLibros = new ArrayList<>();
		this.listaPrestamosTotal = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}
	public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}
	public List<Libro> getListaLibros() {
		return listaLibros;
	}
	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	public List<Prestamo> getListaPrestamosTotal() {
		return listaPrestamosTotal;
	}
	public void setListaPrestamosTotal(List<Prestamo> listaPrestamosTotal) {
		this.listaPrestamosTotal = listaPrestamosTotal;
	}
	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", listaEstudiantes=" + listaEstudiantes + ", listaLibros=" + listaLibros + ", listaPrestamosTotal="
				+ listaPrestamosTotal + ", listaEmpleados=" + listaEmpleados + "]";
	}
	
	/**
	 * Metodos básicos Estudiante
	 * @param identificacion
	 * @return
	 */
	public Estudiante obtenerEstudiante(String identificacion) throws Exception{
		Estudiante estudianteEncontrado = null;
		for (Estudiante estudiante : listaEstudiantes) {
			if(estudiante.getIdentificacion().equals(identificacion)) {
				estudianteEncontrado = estudiante;
				break;
			}else {
				throw new Exception("Estudiante no encontrado");
			}
		}
		return estudianteEncontrado;
	}
	
	public boolean verificarEstudiante(String identificacion) {
		boolean estudianteEncontrado = false;
		for (Estudiante estudiante : listaEstudiantes) {
			if(estudiante.getIdentificacion().equals(identificacion)) {
				estudianteEncontrado = true;
				break;
			}
		}
		return estudianteEncontrado;
	}
	
	/**
	 * Métodos básciso libro
	 * @param isbn
	 * @return
	 */
	public Libro buscarLibro(String isbn) throws Exception{
		Libro libroEncontrado = null;
		for (Libro libro : listaLibros) {
			if(libro.getIsbn().equals(isbn)) {
				libroEncontrado = libro;
				break;
			}else {
				throw new Exception("El libro no existe");
			}
		}
		return libroEncontrado;
	}
	
	public boolean verificarLibro(String isbn) {
		boolean libroEncontrado = false;
		for (Libro libro : listaLibros) {
			if(libro.getIsbn().equals(isbn)) {
				libroEncontrado = true;
				break;
			}
		}
		return libroEncontrado;
	}
	
	/**
	 * Metodos basicos empleado
	 * @param id
	 * @return
	 */
	public Empleado buscarEmpleado(String id) {
		Empleado empleadoEncotrado = null;
		for (Empleado empleado : listaEmpleados) {
			if(empleado.getId().equals(id)) {
				empleadoEncotrado = empleado;
				break;
			}
		}
		return empleadoEncotrado;
	}
	
	public boolean verificarEmpleado(String id) {
		boolean EmpleadoEncontrado = false;
		for (Empleado empleado : listaEmpleados) {
			if(empleado.getId().equals(id)) {
				EmpleadoEncontrado = true;
				break;
			}
		}
		return EmpleadoEncontrado;
	}
	
	/**
	 * Creación de instancia estudiantes
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param programa
	 * @param estado
	 * @param identificacion
	 * @return
	 * @throws Exception
	 */
	public String crearEstudiante(String nombre, String apellido, int edad, String programa, 
			String estado, String identificacion) throws Exception{
		String mensaje = "El estudiante ha sido registrado";
		boolean buscarEstudiante = verificarEstudiante(identificacion);
		if(buscarEstudiante) {
			throw new Exception("El estudiante ya está registrado");
		}
		else {
			Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, edad, programa, estado, identificacion);
			listaEstudiantes.add(nuevoEstudiante);

		}
		return mensaje;
	}
	 /**
	  * Creación de instancias libros
	  * @param isbn
	  * @param titulo
	  * @param autor
	  * @param tipoLibro
	  * @return
	  * @throws Exception
	  */
	public String añadirLibro(String isbn, String titulo, String autor, tipoLibro tipoLibro) throws Exception {
		String mensaje = "El libro se ha añadido a la librería";
		boolean libroEncontrado = verificarLibro(isbn);
		if(libroEncontrado) {
			throw new Exception("El libro ya existe");
		}else {
			Libro libro = new Libro(isbn, titulo, autor, tipoLibro);
			listaLibros.add(libro);
		}
		return mensaje;
	}
	
	/**
	 * Crear instancias empleado
	 * @param nombre
	 * @param id
	 * @param salario
	 * @param aniosExperoencia
	 * @param cargo
	 * @return
	 */
	public String contratarEmpleado(String nombre, String id, double salario, int aniosExperoencia, 
			Cargo cargo) throws Exception{
		String mensaje = "El empleado ha sido contratado con éxito";
		boolean empleado = verificarEmpleado(id);
		if(empleado || (aniosExperoencia<=2)) {
			throw new Exception("Requisitos insuficientes o el empleado ya existe");
		}else {
			Empleado nuevoEmpleado = new Empleado(nombre, id, salario, aniosExperoencia, cargo);
			listaEmpleados.add(nuevoEmpleado);
		}
		return mensaje;
	}
	
	public String obtenerEmpleadoPrestamoIsbn(String isbn)throws NotFoundLoanException{
		String empleadoEncontrado = "";
		for (Prestamo prestamo : listaPrestamosTotal) {
			if(prestamo.buscarIsbn(isbn)) {
				empleadoEncontrado = prestamo.getEmpleadoPrestante().toString();
				return empleadoEncontrado;
			}
			throw new NotFoundLoanException("No se encontro ningún préstamo con ese isbn");
		}
		return empleadoEncontrado;
	}
	
	public String devolverPrestamoCantidad(String titulo, int limInferior, int limSuperior, int aniosExperiencia) {
		String prestamoEncontrado = "";
		for (Prestamo prestamo : listaPrestamosTotal) {
			if(prestamo.cumpleLibro(titulo, limInferior, limSuperior, 
					aniosExperiencia)) {
				prestamoEncontrado = prestamo.toString();
			}
		}
		return prestamoEncontrado;
	}
	
/*	public tipoLibro tipoMasPrestado() {
		
	}*/
	
	//---------------------------------------------------------------------------------
	/**
	 * El metodo obtenerListaEstudiantesAtendidosEmpleadoCargo verifica el cargo del empleado
	 * y devuelve el arrayList de los estudiantes atendidos por un empleado con ese cargo
	 * se va a la clase Estudiante
	 * @param cargo
	 * @return
	 */
	public List<Estudiante> obtenerListaEstudiantesAtendidosEmpleadoCargo(Cargo cargo){
		List<Estudiante> listaEstudiantesEncontrados = new ArrayList<>();
		for (Estudiante estudiante : listaEstudiantes) {
			if(estudiante.verificarCargo(cargo)) {
				listaEstudiantesEncontrados.add(estudiante);
			}
		}
		return listaEstudiantesEncontrados;
	}
}
