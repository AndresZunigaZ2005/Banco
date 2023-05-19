package congruenciaZeller;

public enum MesCongruencia {

	MARZo(0), ABRIL(1), MAYO(2), JUNIO(3), JULIO(4), AGOSTO(5), SEPTIEMBRE(6), OCTUBRE(7),
	NOVIEMBRE(8), DICIEMBRE(9), ENERO(10), FEBRERO(11);
	
	int valor;

	MesCongruencia(int i) {
		this.valor= i;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
