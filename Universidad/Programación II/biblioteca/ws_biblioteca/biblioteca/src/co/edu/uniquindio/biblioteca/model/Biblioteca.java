package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class Biblioteca {

	
	//ATRIBUTOS
	private String nombre;
	private String direccion;
	private String telefono;
	private ArrayList<Estudiante> listaEstudiantes;
	private ArrayList<Empleado> listaEmpleados;
	private ArrayList<Libro> listaLibro;
	private ArrayList<Prestamo> listaPrestamos;
	
	public Biblioteca() {
	
	}
	/**
	 * Constructor
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 */
	public Biblioteca(String nombre, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.listaEstudiantes = new ArrayList<Estudiante>();;
		this.listaEmpleados = new ArrayList<Empleado>();
		this.listaLibro = new ArrayList<Libro>();
		this.listaPrestamos = new ArrayList<Prestamo>();
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

	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}

	public ArrayList<Libro> getListaLibro() {
		return listaLibro;
	}

	public void setListaLibro(ArrayList<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	public ArrayList<Prestamo> getListaPrestamos() {
		return listaPrestamos;
	}
	public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
	}
	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + "]";
	}

	/**
	 * Este metodo permite crear un estudiante
	 * @param nombres
	 * @param apellidos
	 * @param edad
	 * @param programa
	 * @param estado
	 * @param identificacion
	 * @throws Exception 
	 */
	public String crearEstudiante(String nombres, String apellidos, Integer edad, String programa, String estado,
			String identificacion) throws Exception{
		
		String mensaje = "El estudiante ha sido registrado";
		boolean estudianteEncontrado = verificarEstudiante(identificacion);
		if( estudianteEncontrado == true){
			throw new Exception("El estudiante ya existe");
		}else{
			Estudiante nuevoEstudiante = new Estudiante(nombres, apellidos, edad, programa, estado, identificacion);
			listaEstudiantes.add(nuevoEstudiante);
		}
		return mensaje;
	}

	/**
	 * Obtener un estudiante
	 * @param identificacion
	 * @return
	 */
	public Estudiante obtenerEstudiante (String identificacion){
		
		Estudiante estudianteEncontrado = null;
		
		for (Estudiante estudiante : listaEstudiantes) {
			if(estudiante.getIdentificacion().equals(identificacion)){
				estudianteEncontrado = estudiante;
			}
		}
		return estudianteEncontrado;
	}
	
	/**
	 * Elimina estudiantes
	 * @param identificacion
	 * @throws Exception
	 */
	
	public void eliminarEstudiante(String identificacion) throws Exception
	{
		if(verificarEstudiante(identificacion)==false)
		{
			throw new Exception("El estudiante no esta registrado");
		}
		else
		{
			for(int i=0; i<listaEstudiantes.size();i++)
			{
				if(listaEstudiantes.get(i).getIdentificacion().equals(identificacion))
				{
					listaEstudiantes.remove(i);
				}
			}
		}
	}
	
	
	public void eliminarEstudiante2(String identificacion) throws Exception
	{
		Estudiante estudianteEncontrado = obtenerEstudiante(identificacion);
		if(estudianteEncontrado == null){
			throw new Exception("El estudiante no esta registrado");
		}
		listaEstudiantes.remove(estudianteEncontrado);
	}
	
	public String actualizarEstudiante(String nombres , String apellidos , String identificacion, Integer edad) throws Exception{
		Estudiante estudianteEncontrado = obtenerEstudiante(identificacion);
		if(estudianteEncontrado == null){
			throw new Exception("El estudiante no esta registrado");
		}
       estudianteEncontrado.setNombres(nombres);
       estudianteEncontrado.setApellidos(apellidos);
     
       estudianteEncontrado.setEdad(edad);
       
       return " El estudiante ha sido actualizado " ;
	}
	
	public ArrayList<Estudiante> obtenerEstudiaunteMayor (int edad){
		ArrayList<Estudiante> listaEstudiantesEncotrados = new ArrayList<Estudiante>();
		for (Estudiante estudiante : listaEstudiantes) {
			if(estudiante.verificarEdad(edad)) {
				listaEstudiantesEncotrados.add(estudiante);
			}
		}
		return listaEstudiantesEncotrados;
	}
	
	public void ordenarLibrosPorISBN() {
        Collections.sort(listaEstudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante estudiante1, Estudiante estudiante2) {
                return estudiante1.getIdentificacion().compareTo(estudiante2.getIdentificacion());
            }
        });
    }
	
	
	
	/**
	 * Verifica estudiantes
	 * @param identificacion
	 * @return
	 */
	private boolean verificarEstudiante(String identificacion) {
		boolean verificado = false;		
		for (Estudiante estudianteaux : listaEstudiantes) {
			if(estudianteaux.getIdentificacion().equals(identificacion)){
				verificado = true;
				return verificado;
			}
		}
		return verificado;
	}
	
	public boolean verificarLibro(String titulo, String autor, String editorial) {
		boolean verificado = false;		
		for (Libro libroAux : listaLibro) {
			if(libroAux.getTitulo().equals(titulo) && libroAux.getAutor().equals(autor) && libroAux.getEditorial().equals(editorial)){
				verificado = true;
				return verificado;
			}
		}
		return verificado;
	}
	
	public Libro obtenerLibro (String titulo, String autor,String editorial){
		
		Libro libroEncontrado = null;
		
		for (Libro libroAux : listaLibro) {
			if(libroAux.getTitulo().equals(titulo) && libroAux.getAutor().equals(autor) && libroAux.getEditorial().equals(editorial)){
				libroEncontrado = libroAux;
			}
		}
		return libroEncontrado;
	}
	
	public String añadirLibro(String titulo, String autor, String editorial){
		
		String mensaje = "El libro ha sido añadido a la biblioteca";
		Libro nuevoLibro = new Libro(titulo, autor, editorial);
		listaLibro.add(nuevoLibro);
		return mensaje;
	}
	
	public void eliminarLibro(String titulo, String autor, String editorial) throws Exception{
		Libro libroEncontrado = obtenerLibro(titulo, autor, editorial);
		if(libroEncontrado == null){
			throw new Exception("El libro no existe");
		}
		listaLibro.remove(libroEncontrado);
	}
	
	
}
