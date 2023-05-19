import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ventanaPagar extends JFrame {

	private JPanel panel;
	private JTextField textFieldValorPagar;
	private JTextField textFieldIdentificacion;
	
	private double valorTotal;
	ArrayList<Integer> cantidadComida;
	ArrayList<String> nomComida;
	ArrayList <String> listaComida;
	ImageIcon carrito=ventanaConfiteria.carrito;
	
	public static double determinarValorTotal(ArrayList<String>nomComida, ArrayList<Integer> cantidadComida) {
		double valorTotal=0;
		for(int i = 0; i<nomComida.size();i++) {
			if(nomComida.get(i).equals("Crispetas pequeñas, ")) {
				valorTotal+=7500*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Crispetas medianas, ")) {
				valorTotal+=10000*cantidadComida.get(i);
				
			}
			if(nomComida.get(i).equals("Crispetas grandes, ")) {
				valorTotal+=11000*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Crispetas extragrandes, ")) {
				valorTotal+=13000*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Crispetas familiar, ")) {
				valorTotal+=14500*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Gaseosa pequeña, ")) {
				valorTotal+=2500*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Gaseosa mediana, ")) {
				valorTotal+=4000*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Gaseosa grande, ")) {
				valorTotal+=5000*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Agua, ")) {
				valorTotal+=2000*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Té, ")) {
				valorTotal+=3500*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Perro, ")) {
				valorTotal+=5000*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Sándwich, ")) {
				valorTotal+=3500*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Caja de dulces, ")) {
				valorTotal+=2000*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Combo 1, ")) {
				valorTotal+=12000*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Combo 2, ")) {
				valorTotal+=20000*cantidadComida.get(i);
				continue;
			}
			if(nomComida.get(i).equals("Combo 3, ")) {
				valorTotal+=30000*cantidadComida.get(i);
				continue;
			}
			else{
				valorTotal+=13000*cantidadComida.get(i);
				continue;
			}
		}
		return valorTotal;
	}
	
	public ventanaPagar() {
		
		setTitle("VENTANA DE PAGO");
		setBounds(100, 100, 500, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);

		setContentPane(panel);
		
		cantidadComida = VentanaCantidad.cantComida;
		nomComida = ventanaConfiteria.nomComida;
		listaComida= VentanaCantidad.listaComida;
		valorTotal=determinarValorTotal(nomComida, cantidadComida);
		
		JLabel lblPagar = new JLabel("Total a Pagar");
		lblPagar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPagar.setBounds(10, 43, 116, 35);
		panel.add(lblPagar);
		
		JLabel lblFormaPagar = new JLabel("Forma de pago");
		lblFormaPagar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFormaPagar.setBounds(10, 89, 131, 35);
		panel.add(lblFormaPagar);
		
		String formaPago[] = {"Escoja el método de pago...", "Efectivo", "Tarjeta de crédito", "Tarjeta Basic", "Tarjeta Gold", "PSE"};
		JComboBox comboBoxMetodoPago = new JComboBox(formaPago);
		comboBoxMetodoPago.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxMetodoPago.setBounds(151, 93, 230, 26);
		panel.add(comboBoxMetodoPago);
		
		JButton btnActualizarValor = new JButton("Actualizar Valor");
		btnActualizarValor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String auxiliar=(String)comboBoxMetodoPago.getSelectedItem();
				if(auxiliar.equals("Tarjeta Basic")) {
					valorTotal=valorTotal-(valorTotal*0.05);
				}
				else if(auxiliar.equals("Tarjeta Gold")) {
					valorTotal=valorTotal-(valorTotal*0.2);
				}
			}
		});
		btnActualizarValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnActualizarValor.setBounds(319, 53, 157, 26);
		panel.add(btnActualizarValor);
		
		textFieldValorPagar = new JTextField();
		textFieldValorPagar.setBounds(151, 53, 121, 20);
		textFieldValorPagar.setEditable(false);
		textFieldValorPagar.setText(valorTotal+"");
		panel.add(textFieldValorPagar);
		textFieldValorPagar.setColumns(10);
		
		JLabel lblIdentificacion = new JLabel("Identificación");
		lblIdentificacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdentificacion.setBounds(10, 143, 116, 20);
		panel.add(lblIdentificacion);
		
		
		textFieldIdentificacion = new JTextField();
		textFieldIdentificacion.setBounds(151, 146, 96, 20);
		panel.add(textFieldIdentificacion);
		textFieldIdentificacion.setColumns(10);
		
		JButton btnVentConfiteria = new JButton("Ir Atras");
		btnVentConfiteria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaConfiteria ventConfiteria = new ventanaConfiteria();
				ventConfiteria.setVisible(true);
				setVisible(false);
			}
		});
		btnVentConfiteria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVentConfiteria.setBounds(10, 317, 89, 35);
		panel.add(btnVentConfiteria);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPagar.setBounds(387, 317, 89, 35);
		panel.add(btnPagar);		
		
		JButton btnCarrito = new JButton();
		btnCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String listComida=ventanaConfiteria.mostrarArrayList(listaComida);
				if(listComida.length()>0) {
					JOptionPane.showMessageDialog(null, listComida);
				}
				else {
					JOptionPane.showMessageDialog(null, "No hay ningún objeto");
				}
			}
		});
		btnCarrito.setBounds(282, 52, 27, 23);
		btnCarrito.setIcon(new ImageIcon(carrito.getImage().getScaledInstance(btnCarrito.getWidth(), btnCarrito.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(btnCarrito);
		
	}
	
	public String strToHtml(String texto) {
		return "<html><p>"+ texto +"</p></html> ";
	}
}
