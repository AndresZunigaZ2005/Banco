package vacunacionNiñosPolio;

import java.util.List;

public class Pais {

	private List<Departamento> listaDepartamentos;

	public Pais(List<Departamento> listaDepartamentos) {
		super();
		this.listaDepartamentos = listaDepartamentos;
	}

	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}
	
	public int contarInfantesPais() {
		int cantidadInfantesPais = 0;
		for (Departamento departamento : listaDepartamentos) {
			cantidadInfantesPais= departamento.contarInfantesDepartamento();
		}
		return cantidadInfantesPais;
	}
}
