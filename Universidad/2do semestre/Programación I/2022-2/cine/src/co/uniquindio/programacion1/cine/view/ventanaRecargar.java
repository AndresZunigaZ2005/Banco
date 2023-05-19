package co.uniquindio.programacion1.cine.view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.uniquindio.programacion1.cine.model.cliente;


import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ventanaRecargar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtSaldo;
	JLabel lblCantidad,lblNombre,lblCedula;
	private procesosCliente miCliente;
	private JTextField txtTarjeta;
	JButton btnConsultar,btnEliminar;

	public ventanaRecargar() {
		setBounds(100, 100, 292, 235);
		getContentPane().setLayout(null);
		metodos();
	}
	private void metodos () {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblCedula = new JLabel("cedula");
		lblCedula.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCedula.setBounds(10, 11, 64, 25);
		getContentPane().add(lblCedula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(63, 14, 127, 20);
		getContentPane().add(txtCedula);
		txtCedula.setColumns(10);
		
		 lblNombre = new JLabel("nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNombre.setBounds(10, 49, 64, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(73, 47, 107, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		 lblCantidad = new JLabel("saldo");
		lblCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCantidad.setBounds(0, 85, 74, 25);
		contentPane.add(lblCantidad);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(73, 88, 120, 20);
		contentPane.add(txtSaldo);
		txtSaldo.setColumns(10);
		
		JLabel lblTarjeta = new JLabel("tarjeta");
		lblTarjeta.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTarjeta.setBounds(10, 121, 53, 14);
		contentPane.add(lblTarjeta);
		
		txtTarjeta = new JTextField();
		txtTarjeta.setBounds(63, 119, 127, 20);
		contentPane.add(txtTarjeta);
		txtTarjeta.setColumns(10);
		
		 btnConsultar = new JButton("consultar");
		btnConsultar.setBounds(177, 162, 89, 23);
		btnConsultar.addActionListener(this);
		contentPane.add(btnConsultar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(10, 162, 89, 23);
		btnEliminar.addActionListener(this);
		contentPane.add(btnEliminar);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnConsultar) {
			cliente clientes=miCliente.obtenerCliente(txtCedula.getText());
		if (clientes!=null) {
			txtNombre.setText(clientes.getNombre());
			txtCedula.setText(clientes.getCedula());
			txtSaldo.setText(clientes.getSaldo()+"");
			txtTarjeta.setText(clientes.getTarjeta());
		 }
		}
		else if (e.getSource()==btnEliminar) {
			txtNombre.setText("");
			txtCedula.setText("");
			txtSaldo.setText("");
			txtTarjeta.setText("");
		}
		
	} 
public void misProcedimientos (procesosCliente miCliente) {
	this.miCliente=miCliente;
	}
}
