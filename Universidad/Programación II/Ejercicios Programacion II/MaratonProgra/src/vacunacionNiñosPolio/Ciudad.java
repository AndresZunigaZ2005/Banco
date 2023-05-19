package vacunacionNiñosPolio;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {

	private List<Infante> listaInfantes;
	
	public Ciudad(List<Infante> listaInfantes) {
		super();
		this.listaInfantes = listaInfantes;
	}

	public List<Infante> getListaInfantes() {
		return listaInfantes;
	}

	public void setListaInfantes(List<Infante> listaInfantes) {
		this.listaInfantes = listaInfantes;
	}
	
	public int contarTotalInfantes() {
		int totalInf = 0;
		for (int i = 0; i<listaInfantes.size(); i++) {
			totalInf++;
		}
		return totalInf;
	}
	
	//Niños estan en la posicion 0 y niñas en la posicion 1
	public int[] contarNiñosYNiñasVacunados() {
		int niniosYNinias[] = new int[2];
		int contarNinios = 0;
		int contarNinias = 0;
		for (Infante infante : contarInfantesVacunados()) {
			if(infante.getGenero().getValor() == 1) {
				contarNinios++;
			}
			else {
				contarNinias++;
			}
		}
		niniosYNinias[0] = contarNinios;
		niniosYNinias[0] = contarNinias;
		return niniosYNinias;
	}
	
	public List<Infante> contarInfantesVacunados(){
		List<Infante> listaInfantesVacunados = new ArrayList<>();
		for (Infante infante : listaInfantes) {
			if(infante.getIsVacunado()) {
				listaInfantesVacunados.add(infante);
			}
		}
		return listaInfantesVacunados;
	}
}
