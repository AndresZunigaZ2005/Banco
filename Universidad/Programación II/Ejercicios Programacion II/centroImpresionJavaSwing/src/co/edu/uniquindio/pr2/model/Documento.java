package co.edu.uniquindio.pr2.model;

public class Documento {

	private EstadoDoc estado;
	private PrioridadDoc prioridad;
	
	public Documento(EstadoDoc estado, PrioridadDoc prioridad) {
		super();
		this.estado = estado;
		this.prioridad = prioridad;
	}

	public EstadoDoc getEstado() {
		return estado;
	}

	public void setEstado(EstadoDoc estado) {
		this.estado = estado;
	}

	public PrioridadDoc getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(PrioridadDoc prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public String toString() {
		return "Documento [estado=" + estado + ", prioridad=" + prioridad + "]";
	}
	
	
}
