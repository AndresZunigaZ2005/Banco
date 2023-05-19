package co.edu.uniquindio.pr2.model;

public enum EstadoImp {

	ACTIVA("ACTIVA"), INACTIVA("INACTIVA"), MANTENIMIENTO("MANTENIMIENTO"), APAGADA("APAGADA");
	
	String valor;

	EstadoImp(String i) {
		this.valor= i;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
