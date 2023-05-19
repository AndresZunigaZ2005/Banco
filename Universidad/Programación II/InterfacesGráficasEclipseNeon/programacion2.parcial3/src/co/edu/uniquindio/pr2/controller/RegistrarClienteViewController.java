package co.edu.uniquindio.pr2.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.bank.exception.CuentaException;
import co.edu.uniquindio.bank.model.CuentaCorriente;
import co.edu.uniquindio.pr2.Exceptions.ClienteException;
import co.edu.uniquindio.pr2.Exceptions.FacturaException;
import co.edu.uniquindio.pr2.model.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class RegistrarClienteViewController implements Initializable {

	private ObservableList<Factura> facturasTable = FXCollections.observableArrayList();

	private String listaEstratos[]={"Estrato Uno","Estrato Dos","Estrato Tres",
    		"Estrato Cuatro","Estrato Cinco","Estrato Seis"};

	private EmpresaEnergia empresaEnergia;
	private Application application;
    @FXML
    private DatePicker DateFechaFactura;

    @FXML
    private Button btnAgegarFactura;

    @FXML
    private Button btnAgregarClienteJuridico;

    @FXML
    private Button btnAgregarClienteNatural;

    @FXML
    private Button btnLimpiarCamposClienteJuridico;

    @FXML
    private Button btnLimpiarcamposClienteNatural;

    @FXML
    private Button btnLimpiarcamposFactura;

    @FXML
    private ChoiceBox<String> choiceBoxEstrato;

    @FXML
    private TableColumn<?, ?> tableColumnCJNit;

    @FXML
    private TableColumn<?, ?> tableColumnCJNombre;

    @FXML
    private TableColumn<?, ?> tableColumnCJTelefono;

    @FXML
    private TableColumn<?, ?> tableColumnCJTipoEmpresa;

    @FXML
    private TableColumn<?, ?> tableColumnCNApellido;

    @FXML
    private TableColumn<?, ?> tableColumnCNCedula;

    @FXML
    private TableColumn<?, ?> tableColumnCNEstrato;

    @FXML
    private TableColumn<?, ?> tableColumnCNNombre;

    @FXML
    private TableColumn<Factura, String> tableColumnFacturasCodigo;

    @FXML
    private TableColumn<Factura, String> tableColumnFacturasFecha;

    @FXML
    private TableColumn<Factura, String> tableColumnFacturasIDCliente;

    @FXML
    private TableColumn<Factura, String> tableColumnFacturasTotal;

    @FXML
    private TableView<?> tableViewClientesJuridicos;

    @FXML
    private TableView<?> tableViewClientesNaturales;

    @FXML
    private TableView<Factura> tableViewFacturas;

    @FXML
    private TextField txtFieldApellido;

    @FXML
    private TextField txtFieldCedula;

    @FXML
    private TextField txtFieldCodigo;

    @FXML
    private TextField txtFieldIDCliente;

    @FXML
    private TextField txtFieldNit;

    @FXML
    private TextField txtFieldNombreJuridico;

    @FXML
    private TextField txtFieldNombreNatural;

    @FXML
    private TextField txtFieldTelefono;

    @FXML
    private TextField txtFieldTipoEmpresa;

    @FXML
    private TextField txtFieldTotalPagar;

    /**
     *
     * @param event
     * @throws ClienteException
     */

    @FXML
    void agregarClienteJuridico(ActionEvent event) throws ClienteException {
    	ClienteJuridico nuevoClienteJuridico = new ClienteJuridico(txtFieldNombreJuridico.getText(),
    			txtFieldNit.getText(), txtFieldTelefono.getText(), txtFieldTipoEmpresa.getText());
    	try {
			empresaEnergia.aniadirClienteJuridico(nuevoClienteJuridico);
		} catch (ClienteException e) {
			throw new ClienteException("Error al crear el cliente");
		}
    }

    @FXML
    void agregarClienteNatrual(ActionEvent event) throws ClienteException {
    	ClienteNatural nuevoClienteNatural = new ClienteNatural(txtFieldNombreNatural.getText(),
    			txtFieldApellido.getText(), txtFieldCedula.getText(), choiceBoxEstrato.getValue());
    	try {
			empresaEnergia.aniadirClienteNatural(nuevoClienteNatural);
		} catch (ClienteException e) {
			throw new ClienteException("Error al crear el cliente");
		}
    }

    @FXML
    void agregarFactura(ActionEvent event) throws FacturaException {
    	String codigo = txtFieldCodigo.getText();
    	String fecha = DateFechaFactura.getValue().toString();
    	double totalPagar = Double.parseDouble(txtFieldTotalPagar.getText());
    	String IdNit = txtFieldIDCliente.getText();
    	if((codigo!="" || fecha!="" || IdNit!="") && totalPagar!=0){

    	}
    	boolean verificarDatos = verificarIngresoDatos(saldo, tasaAnual);
    		try {
    			modelController.getBanco().crearCuentaCorriente(cuentaCorriente);
    		} catch (CuentaException e) {
   				// TODO Auto-generated catch block
    			e.printStackTrace();
    		}

    		return cuentaCorriente;
    	}

    @FXML
    void limpiarcamposClienteNatural(ActionEvent event) {

    	limpiarCamposTexto(txtFieldNombreNatural);
    	limpiarCamposTexto(txtFieldApellido);
    	limpiarCamposTexto(txtFieldCedula);
    }

    @FXML
    void LimpiarCamposClienteJuridico(ActionEvent event) {

    	limpiarCamposTexto(txtFieldNombreJuridico);
    	limpiarCamposTexto(txtFieldNit);
    	limpiarCamposTexto(txtFieldTelefono);
    	limpiarCamposTexto(txtFieldTipoEmpresa);
    }

    @FXML
    void limpiarcamposFactura(ActionEvent event) {
    	limpiarCamposTexto(txtFieldTotalPagar);
    	limpiarCamposTexto(txtFieldCodigo);
    	limpiarCamposTexto(txtFieldIDCliente);
    }

    /**
     *
     */
    public void limpiarCamposTexto(TextField campoTexto){
    	campoTexto.setText("");
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		List<Cliente> listaClientes = new ArrayList<>();
		ClienteNatural cliente1 = new ClienteNatural("Juan", "ito", "1094889063", "2");
		ClienteJuridico cliente2 = new ClienteJuridico("hola", "1234", "3218861990", "No se");
		listaClientes.add((Cliente)cliente1);
		listaClientes.add((Cliente)cliente2);

		choiceBoxEstrato.getItems().addAll(listaEstratos);

		List <Factura> listaFacturas = new ArrayList<>();
		Factura factura1 = new Factura("1", "14/05/2023", 30000, cliente1);
		Factura factura2 = new Factura("2", "14/05/2023", 100000, cliente2);
		listaFacturas.add(factura1);
		listaFacturas.add(factura2);


		empresaEnergia = EmpresaEnergia.getInstance(listaFacturas, listaClientes);

		tableViewFacturas.setItems(facturasTable);
	}


	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	/**
	 * TableView Factura
	 * @return
	 */
	/**public ObservableList<Factura> getFactura(){
		ObservableList<Factura> obsFactura = FXCollections.observableArrayList();
	}
	**/
}
