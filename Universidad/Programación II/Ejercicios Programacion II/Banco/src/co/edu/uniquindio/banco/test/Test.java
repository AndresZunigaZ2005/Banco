package co.edu.uniquindio.banco.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import co.edu.uniquindio.banco.model.Banco;
import co.edu.uniquindio.banco.model.Categoria;
import co.edu.uniquindio.banco.model.Cliente;
import co.edu.uniquindio.banco.model.CuentaBancaria;

public class Test {
	public static void main(String [] args) {
		Banco banco = new Banco("Banco UQ");
		
		CuentaBancaria cuenta1 = new CuentaBancaria("Andrés", "Zúñiga", "1", Categoria.AHORROS, 0);
		CuentaBancaria cuenta2 = new CuentaBancaria("Juan", "Noreña", "2", Categoria.CORRIENTE, 100000);
		CuentaBancaria cuenta3 = new CuentaBancaria("Carlos", "Pérez", "3", Categoria.AHORROS, 5000);
		CuentaBancaria cuenta4 = new CuentaBancaria("Robinson", "Arias", "4", Categoria.AHORROS, 20000);
		Cliente cliente1 = new Cliente("Andrés", "Zúñiga", "1234", "La casa", banco);
		
		List<CuentaBancaria> listaCuentas = new ArrayList<>();
		
		listaCuentas.add(cuenta1);
		listaCuentas.add(cuenta2);
		listaCuentas.add(cuenta3);
		listaCuentas.add(cuenta4);
		
		banco.imprimirCuentas(listaCuentas);
		
		boolean comparar = banco.compararCuentas(cuenta1, cuenta2);
		System.out.println(comparar);
		
		
		listaCuentas.stream().sorted();
		
		System.out.println();
	}
}
