package co.edu.uniquindio.bank.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Labeled;

import java.net.URL;
import java.util.Observable;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Main;
import co.edu.uniquindio.bank.exception.CuentaException;
import co.edu.uniquindio.bank.model.CuentaAhorros;
import co.edu.uniquindio.bank.model.CuentaCorriente;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CuentaAhorrosController {

	ModelController modelController = ModelController.getInstance();

	private ObservableList<CuentaAhorros> listaCuentaAhorros = FXCollections.observableArrayList();
	private ObservableList<CuentaCorriente> listaCuentaCorriente = FXCollections.observableArrayList();

	private Application application;
	private Stage stage;
    @FXML
    private Button btnBorrarCuentaCorriente;

    @FXML
    private Button btnBorrarDatosAhorros;

    @FXML
    private Button btnCrearCuentaAhorros;

    @FXML
    private Button btnCrearCuentaCorriente;

    @FXML
    private Button btnLimpiarCamposAhorros;

    @FXML
    private Button btnLimpiarCamposCorriente;

    @FXML
    private TableView<CuentaAhorros> tablaContenidoAhorros;

    @FXML
    private TableView<CuentaCorriente> tablaContenidoCorriente;

    @FXML
    private TableColumn<CuentaAhorros, String> tbActivaAhorros;

    @FXML
    private TableColumn<CuentaAhorros, String> tbSaldoAhorros;

    @FXML
    private TableColumn<CuentaCorriente, String> tbSaldoCorriente;

    @FXML
    private TableColumn<CuentaAhorros, String> tbTasaAnualAhorros;

    @FXML
    private TableColumn<CuentaCorriente, String> tbTasaAnualCorriente;

    @FXML
    private PasswordField txtSaldoAhorros;

    @FXML
    private TextField txtSaldoCorriente;

    @FXML
    private PasswordField txtTasaAnualAhorros;

    @FXML
    private TextField txtTasaAnualCorriente;

    @FXML
    void CrearCuentaAhorros(ActionEvent event) throws CuentaException {
    	listaCuentaAhorros.add(crearCuenta());
    	tablaContenidoAhorros.setItems(listaCuentaAhorros);
    	tablaContenidoAhorros.refresh();
    	borrarDatosFields(txtSaldoAhorros, txtTasaAnualAhorros);
    }

    @FXML
    void crearCuentaCorriente(ActionEvent event) throws CuentaException {
    	listaCuentaCorriente.add(crearCuentaCorriente());
    	tablaContenidoCorriente.setItems(listaCuentaCorriente);
    	tablaContenidoCorriente.refresh();
    	borrarDatosFields(txtSaldoCorriente, txtTasaAnualCorriente);
    }

    @FXML
    void borrarCuentaCorriente(ActionEvent event) {
    	listaCuentaCorriente.remove(listaCuentaCorriente.size()-1);
    	tablaContenidoCorriente.setItems(listaCuentaCorriente);
    	tablaContenidoCorriente.refresh();
    }

    @FXML
    void eliminarDatosAhorros(ActionEvent event) {
    	listaCuentaAhorros.remove(listaCuentaAhorros.size()-1);
    	tablaContenidoAhorros.setItems(listaCuentaAhorros);
    	tablaContenidoAhorros.refresh();
    }

    @FXML
    void limpiarCamposAhorros(ActionEvent event) {
    	borrarDatosFields(txtSaldoAhorros, txtTasaAnualAhorros);
    }

    @FXML
    void limpiarCamposCorriente(ActionEvent event) {
    	borrarDatosFields(txtSaldoCorriente, txtTasaAnualCorriente);
    }

	private CuentaAhorros crearCuenta(){
		double saldo = Double.parseDouble(txtSaldoAhorros.getText());
		double tasaAnual = Double.parseDouble(txtTasaAnualAhorros.getText());
		boolean verificarDatos = verificarIngresoDatos(saldo, tasaAnual);
		if(verificarDatos) {
			CuentaAhorros cuentaAhorros = new CuentaAhorros(saldo, tasaAnual, false);
			try {
				modelController.getBanco().crearCuentaAhorros(cuentaAhorros);
			} catch (CuentaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			mostrarMensajeConfirmacion("La cuenta se ha creado con éxito");
			return cuentaAhorros;
		}
		mostrarMensaje("Error al crear la cuenta", "Datos inválidos", "Revise los datos ingresados", AlertType.ERROR);
		return null;
	}

	private CuentaCorriente crearCuentaCorriente()  {
		double saldo = Double.parseDouble(txtSaldoCorriente.getText());
		double tasaAnual = Double.parseDouble(txtTasaAnualCorriente.getText());
		boolean verificarDatos = verificarIngresoDatos(saldo, tasaAnual);
		if(verificarDatos) {
			CuentaCorriente cuentaCorriente = new CuentaCorriente(saldo, tasaAnual);
			try {
				modelController.getBanco().crearCuentaCorriente(cuentaCorriente);
			} catch (CuentaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			mostrarMensajeConfirmacion("La cuenta se ha creado con éxito");
			return cuentaCorriente;
		}
		mostrarMensaje("Error al crear la cuenta", "Datos inválidos", "Revise los datos ingresados", AlertType.ERROR);
		return null;
	}

	private boolean verificarIngresoDatos(double saldo, double tasaAnual) {
		if(saldo==0 && tasaAnual==0){
			mostrarMensaje("Datos erroneos", "Datos inválido", "Vuelva a ingresar los datos", AlertType.ERROR);
			return false;
		}else {
			return true;
		}
	}

	private void borrarDatosFields(TextField txtSaldo, TextField txtTasaAnual) {
		txtSaldo.setText("");
		txtTasaAnual.setText("");
	}

	private boolean mostrarMensajeConfirmacion(String mensaje) {

	   	Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    	alert.setTitle("Confirmación");
    	alert.setHeaderText(null);
    	alert.setContentText(mensaje);

    	Optional<ButtonType> action = alert.showAndWait();

    	if(action.get() == ButtonType.OK){
    		return true;
    	}else{
    		return false;
    	}
	}
    public void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {

    	Alert alert = new Alert(alertType);
    	alert.setTitle(titulo);
    	alert.setHeaderText(header);
    	alert.setContentText(contenido);
    	alert.showAndWait();
	}

	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}

	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
}
