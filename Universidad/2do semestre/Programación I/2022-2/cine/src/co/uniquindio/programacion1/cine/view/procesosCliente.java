package co.uniquindio.programacion1.cine.view;

import java.util.ArrayList;
import java.util.List;

import co.uniquindio.programacion1.cine.model.cliente;
import promedio.persona;


public class procesosCliente {
	int numero=0;
	double saldo1=0;
	  double saldo=0;
	
     ArrayList<cliente> listaPersonas;
	public  procesosCliente() {
		listaPersonas= new ArrayList<cliente>();
	}
	public void registrarEnBD(cliente cliente) {
	System.out.println("Guardado en BD");
	listaPersonas.add(cliente);			
	}
	public void imprimirCliente () {
		for (cliente s:listaPersonas)
			System.out.println(s);
	}
	 public int idasAlCine (int numero) {
		 this.numero=numero+numero;
		 return numero;
	 }
	 public double completarSaldo (double saldo) {
		   this.saldo=saldo+saldo;
		   return saldo;
		   }
	 
	   public double saldoRestante (double descontar) {
		   saldo1=saldo-descontar;
		   return saldo1;
	   }
		public cliente obtenerCliente(String doc) {
			cliente p=null;
			for (cliente persona:listaPersonas) {
				if (persona.getCedula().equals(doc)) {
					p=persona;
				}
				
			}
			
		return p;
		}

}

