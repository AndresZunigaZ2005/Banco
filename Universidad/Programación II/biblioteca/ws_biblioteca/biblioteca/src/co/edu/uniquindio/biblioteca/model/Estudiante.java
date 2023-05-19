package co.edu.uniquindio.biblioteca.model;

public class Estudiante {

	
	//Atributos
	private String nombres;
	private String apellidos;
	private Integer edad;
	private String programa;
	private String estado;
	private String identificacion;

	
	public Estudiante() {
	}

	/**
	 * 
	 * @param nombres
	 * @param apellidos
	 * @param edad
	 * @param programa
	 * @param estado
	 * @param identificacion
	 */
	public Estudiante(String nombres, String apellidos, Integer edad, String programa, String estado,
			String identificacion) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.programa = programa;
		this.estado = estado;
		this.identificacion = identificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
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

	@Override
	public String toString() {
		return "Estudiante [nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", programa="
				+ programa + ", estado=" + estado + ", identificacion=" + identificacion + "]";
	}

	public boolean verificarEdad(int edadEstudiante) {
		return getEdad()>=edadEstudiante;
	}
	
	


}
