package co.edu.uniquindio.pr2.model;

public class ClienteNatural extends Cliente{

	/**
	 * Atributos propios de ClienteNatural
	 */
	private String apellido;
	private String cedula;
	private String estrato;

	public ClienteNatural() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo constructor
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param estrato
	 */
	public ClienteNatural(String nombre, String apellido, String cedula, String estrato) {
		super(nombre);
		this.apellido = apellido;
		this.cedula = cedula;
		this.estrato = estrato;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getEstrato() {
		return estrato;
	}

	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}

	@Override
	public String toString() {
		return "ClienteNatural [apellido=" + apellido + ", cedula=" + cedula + ", estrato=" + estrato + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteNatural other = (ClienteNatural) obj;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		return true;
	}
	/**
	 *
	 * @return
	 */
	public boolean verificarClienteNatural(String id){
		return this.cedula.equals(id);
	}

}
