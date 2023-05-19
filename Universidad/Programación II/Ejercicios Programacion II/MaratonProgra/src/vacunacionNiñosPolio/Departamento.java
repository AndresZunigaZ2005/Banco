package vacunacionNiñosPolio;

import java.util.List;

public class Departamento {

	private List<Ciudad> listaCiudades;

	public Departamento(List<Ciudad> listaCiudades) {
		super();
		this.listaCiudades = listaCiudades;
	}

	public List<Ciudad> getListaCiudades() {
		return listaCiudades;
	}

	public void setListaCiudades(List<Ciudad> listaCiudades) {
		this.listaCiudades = listaCiudades;
	}
	
	public int contarInfantesDepartamento() {
		int cantidadInfantesDepartamento = 0;
		for (Ciudad ciudad : listaCiudades) {
			int aux [] = ciudad.contarNiñosYNiñasVacunados();
			cantidadInfantesDepartamento += aux[0];
			cantidadInfantesDepartamento += aux[1];
		}
		return cantidadInfantesDepartamento;
	}
	
	public int contarCiudadesVacunadas() {
		int resp = 0;
		for (Ciudad ciudad : listaCiudades) {
			if(ciudad.contarNiñosYNiñasVacunados()[0]>=1 || ciudad.contarNiñosYNiñasVacunados()[1]>=1) {
				resp+=1;
			}
		}
		return resp;
	}
}
