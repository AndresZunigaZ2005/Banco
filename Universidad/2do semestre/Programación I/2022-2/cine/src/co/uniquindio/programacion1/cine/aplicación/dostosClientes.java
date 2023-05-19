package co.uniquindio.programacion1.cine.aplicación;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.uniquindio.programacion1.cine.model.cliente;
import co.uniquindio.programacion1.cine.view.procesosCliente;
import co.uniquindio.programacion1.cine.view.recargar;
import co.uniquindio.programacion1.cine.view.ventanaRecargar;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class dostosClientes extends JFrame implements ActionListener {
	
	procesosCliente miCliente = new procesosCliente ();
	recargar miRecarga = new recargar ();

	private JPanel contentPane;
	private JTextField txtCliente;
	private JTextField txtDocumento;
	private JTextField txtBoletas;
	JComboBox cboFormasDePago;
	JButton btnConsultar;
	JLabel lblCantidaBoletas,lblCedula,lblNameCliente;
	private JButton btnAgregar,btnEliminar;
	private JTextField txtRecarga;

	
	
	public dostosClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		metodos();
	}
	
	private  void metodos() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblNameCliente = new JLabel("cliente");
		lblNameCliente.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNameCliente.setBounds(10, 24, 46, 14);
		contentPane.add(lblNameCliente);
		
		txtCliente = new JTextField();
		txtCliente.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtCliente.setBounds(54, 22, 141, 20);
		contentPane.add(txtCliente);
		txtCliente.setColumns(10);
		
		 lblCedula = new JLabel("cc");
		lblCedula.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCedula.setBounds(10, 66, 39, 14);
		contentPane.add(lblCedula);
		
		txtDocumento = new JTextField();
		txtDocumento.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtDocumento.setBounds(54, 64, 141, 20);
		contentPane.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		 lblCantidaBoletas = new JLabel("cantida boletas");
		lblCantidaBoletas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCantidaBoletas.setBounds(10, 112, 105, 14);
		contentPane.add(lblCantidaBoletas);
		
		txtBoletas = new JTextField();
		txtBoletas.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtBoletas.setBounds(109, 110, 74, 20);
		contentPane.add(txtBoletas);
		txtBoletas.setColumns(10);
		
		 cboFormasDePago = new JComboBox();
		 cboFormasDePago.setModel(new DefaultComboBoxModel(new String[] {" forma de pago", "pse", "puntos", "efectivo", "saldo de la tarjeta"}));
		 cboFormasDePago.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		cboFormasDePago.setToolTipText("");
		cboFormasDePago.setBounds(21, 159, 147, 22);
		cboFormasDePago.addActionListener(this);
		contentPane.add(cboFormasDePago);
		
	     btnConsultar = new JButton("consultar");
		btnConsultar.setBounds(345, 239, 89, 23);
		 btnConsultar.addActionListener(this);
		contentPane.add(btnConsultar);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnAgregar.setBounds(10, 238, 82, 23);
		btnAgregar.addActionListener(this);
		contentPane.add(btnAgregar);
		
		 btnEliminar = new JButton("eliminar");
		 btnEliminar.setHorizontalAlignment(SwingConstants.LEFT);
		btnEliminar.setBounds(107, 239, 76, 23);
		btnEliminar.addActionListener(this);
		contentPane.add(btnEliminar);
		
		txtRecarga = new JTextField();
		txtRecarga.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtRecarga.setBounds(348, 0, 86, 20);
		contentPane.add(txtRecarga);
		txtRecarga.setColumns(10);}

	@Override
	public void actionPerformed(ActionEvent e) {
	    	 if (e.getSource()==btnAgregar) {
	    		 calcularCliente();
	    	 }
	    	 else if (e.getSource()==btnConsultar) {
	    	ventanaRecargar recargar= new ventanaRecargar();
	    		 recargar.misProcedimientos(miCliente);
	    		 recargar.setVisible(true);
	    	 }
	    	 else if (e.getSource()==btnEliminar) {
	    		txtDocumento.setText("");
	    		txtCliente.setText("");
	    		txtDocumento.setText("");
	    		txtBoletas.setText("");
	    	 }
	}
	     
	     private void calcularCliente () {
	    	 cliente cliente=new cliente();
	    	 Double  x=0.0;
	    	 cliente.setCedula(txtDocumento.getText());
	    	 cliente.setNombre(txtCliente.getText());
	    	 cliente.setTarjeta(txtDocumento.getText());
	    	 cliente.setIdadaAlCine(miCliente.idasAlCine(1));
	    	 x=Double.parseDouble(txtRecarga.getText());
	    	 cliente.setSaldo(x);
	    	 miCliente.registrarEnBD(cliente);
	}
	     
}
