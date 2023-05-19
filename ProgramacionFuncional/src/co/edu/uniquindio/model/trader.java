package co.edu.uniquindio.model;

import java.util.Objects;

public class trader {
	private int traderId;
	private String nombre;
	private String ciudad;
	
	public trader() {
		super();
	}
	
	public trader(int traderId, String nombre, String ciudad) {
		super();
		this.traderId = traderId;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	public int getTraderId() {
		return traderId;
	}
	public void setTraderId(int traderId) {
		this.traderId = traderId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, nombre, traderId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		trader other = (trader) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(nombre, other.nombre)
				&& traderId == other.traderId;
	}

	@Override
	public String toString() {
		return "trader [traderId=" + traderId + ", nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}
	
}
