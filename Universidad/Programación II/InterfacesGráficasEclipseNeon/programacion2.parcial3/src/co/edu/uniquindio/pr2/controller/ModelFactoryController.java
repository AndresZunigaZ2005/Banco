package co.edu.uniquindio.pr2.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.pr2.model.*;
import javafx.fxml.Initializable;

public class ModelFactoryController implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		List<Cliente> listaClientes = new ArrayList<>();
		ClienteNatural cliente1 = new ClienteNatural("Juan", "ito", "1094889063", "2");
		ClienteJuridico cliente2 = new ClienteJuridico("hola", "1234", "3218861990", "No se");
		listaClientes.add((Cliente)cliente1);
		listaClientes.add((Cliente)cliente2);

		List <Factura> listaFacturas = new ArrayList<>();
		Factura factura1 = new Factura("1", "14/05/2023", 30000, cliente1);
		Factura factura2 = new Factura("2", "14/05/2023", 100000, cliente2);
		listaFacturas.add(factura1);
		listaFacturas.add(factura2);
		EmpresaEnergia.getInstance(listaFacturas, listaClientes);
	}



}
