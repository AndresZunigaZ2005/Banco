package co.edu.uniquindio.pr2.model;

public class Cliente {

	protected String nombre;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 *
	 * @param buscarClienteNatural
	 * @return
	 */
	public boolean verificarClienteNatural(ClienteNatural buscarClienteNatural){
		return buscarClienteNatural.verificarClienteNatural(buscarClienteNatural.getCedula());
	}
	/**
	 *
	 * @param buscarClienteJuridico
	 * @return
	 */
	public boolean verificarClienteJuridico(ClienteJuridico buscarClienteJuridico){
		return buscarClienteJuridico.verificarClienteNatural(buscarClienteJuridico.getNit());
	}
}
