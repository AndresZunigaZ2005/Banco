package vacunacionNiñosPolio;

public enum Genero {

	NIÑO(1), NIÑA(2);
	
	int valor;
	
	Genero(int i) {
		this.valor = i;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
