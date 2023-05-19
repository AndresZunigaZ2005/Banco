package cadena;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.StringTokenizer;



public class Test {

	public static void main(String[] args) {
		String nombre = "Dieguito";
		nombre = nombre.replace("i", "h");
		System.out.println(nombre);

		cambiarCadena(nombre);
		System.out.println(nombre);
		
		Persona persona = new Persona();
		persona.setNombre("Luis");
		cambiarNombre(persona);
		System.out.println(persona.getNombre());
		
		StringBuilder cadena1 = new StringBuilder();
		cadena1.append("Robinson");
		cambiarCadena1(cadena1);
		System.out.println(cadena1.toString());
		
		String cadena2 = "Hoy es miercoles";
		String split [] = cadena2.split("");
		
		StringTokenizer tokens = new StringTokenizer("juan#1234", "#");
		String arreglo [] = new String[tokens.countTokens()];
		int contador = 0;
		while (tokens.hasMoreElements()) {
			arreglo[contador] = tokens.nextToken();
			contador++;
		}
		System.out.println();
		
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		Persona p1 = new Persona("Juan");
		Persona p2 = new Persona("Luis");
		Persona p3 = new Persona("Jiego");
		Persona p4 = new Persona("Juan");
		
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		listaPersonas.add(p4);
		
		eliminarPersona(listaPersonas);
		
		listaPersonas.forEach(x -> System.out.println(x.getNombre().equals("Juan")));//Lenguaje declarativo
		System.out.println("\n");
		
		ListIterator<Persona> listIterator = listaPersonas.listIterator();
		
		while(listIterator.hasNext()) {
			Persona person = listIterator.next();
			persona.getNombre();
		}
		Iterator <Persona> iterator = listaPersonas.iterator(); 
		
		while(iterator.hasNext()){
			Persona person = iterator.next();
			persona.getNombre();
		}
		
		Robinson<String> robinson = new Robinson<>();
		robinson.empacar("pantalon");
		
		robinson.escanear(null);
	}

	private static void eliminarPersona(ArrayList<Persona> listaPersonas) {
		// TODO Auto-generated method stub
		/*for (int i = 0; i < listaPersonas.size(); i++) {
			Persona p = listaPersonas.get(i);
			if(p.getNombre().startsWith("J")) {
				listaPersonas.remove(p);
			}
		}*/
		while(listaPersonas.iterator().hasNext()) {
			Persona aux = listaPersonas.iterator().next();
			if(aux.getNombre().startsWith("J")) {
				listaPersonas.iterator().remove();
			}
		}
	}

	private static void cambiarCadena1(StringBuilder cadena) {
		// TODO Auto-generated method stub
		cadena.append("Juan");
		
	}

	private static void cambiarNombre(Persona persona) {
		// TODO Auto-generated method stub
		Persona aux = new Persona();
		aux.setNombre("Mario");
		persona = aux;
		persona.setNombre("Juan");
	}

	private static void cambiarCadena(String nombre) {
		// TODO Auto-generated method stub
		nombre = "Juan";
		
	}

}
