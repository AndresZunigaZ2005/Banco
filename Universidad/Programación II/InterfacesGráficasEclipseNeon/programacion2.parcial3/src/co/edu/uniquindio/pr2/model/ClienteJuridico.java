package co.edu.uniquindio.pr2.model;

public class ClienteJuridico extends Cliente{

	/*
	 * Variables de una factura
	 */
	private String nit;
	private String telefono;
	private String tipoEmpresa;

	public ClienteJuridico() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo contructor
	 * @param nombre
	 * @param nit
	 * @param telefono
	 * @param tipoEmpresa
	 */
	public ClienteJuridico(String nombre, String nit, String telefono, String tipoEmpresa) {
		super(nombre);
		this.nit = nit;
		this.telefono = telefono;
		this.tipoEmpresa = tipoEmpresa;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	@Override
	public String toString() {
		return "ClienteJuridico [nit=" + nit + ", telefono=" + telefono + ", tipoEmpresa=" + tipoEmpresa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nit == null) ? 0 : nit.hashCode());
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
		ClienteJuridico other = (ClienteJuridico) obj;
		if (nit == null) {
			if (other.nit != null)
				return false;
		} else if (!nit.equals(other.nit))
			return false;
		return true;
	}

	public boolean verificarClienteNatural(String nit){
		return this.nit.equals(nit);
	}
}
