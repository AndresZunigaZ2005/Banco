package co.edu.uniquindio.model;

public enum PrioridadDoc {

	ALTA(1), MEDIA(2), BAJO(3);
	
	int prioridad;
	
	PrioridadDoc(int i) {
		this.prioridad = i;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	
}
