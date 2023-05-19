package co.uniquindio.programacion1.cine.model;

public class cliente {

	
	String nombre="";
	String cedula="";
	String tarjeta="";
	double saldo=0;
    int idadaAlCine=0;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}
	public double getSaldo() {
		return saldo;
	}
	public  void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getIdadaAlCine() {
		return idadaAlCine;
	}
	public void setIdadaAlCine(int idadaAlCine) {
		this.idadaAlCine = idadaAlCine;
	}
	@Override
	public String toString() {
		return "cliente [nombre=" + nombre + ", cedula=" + cedula + ", tarjeta=" + tarjeta + ", saldo=" + saldo
				+ ", idadaAlCine=" + idadaAlCine + "]";
	}
    
	
	
    
	 
}
