import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;


public class VentanaCantidad extends JFrame {

	public JButton btnAgregar;
	private JPanel Panel;
	private JTextField textCantidad;
	public static ArrayList<Integer> cantComida = new ArrayList<Integer>();
	public static ArrayList <String> listaComida = new ArrayList <String>();
	ArrayList<String> nomComida = ventanaConfiteria.nomComida;

	public VentanaCantidad() {
		setTitle("CANTIDAD");
		setBounds(100, 100, 450, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		Panel = new JPanel();
		Panel.setBackground(new Color(255, 255, 255));
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Panel);
		Panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(70, 105, 75, 35);
		Panel.add(lblNewLabel);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(155, 114, 96, 20);
		Panel.add(textCantidad);
		textCantidad.setText("0");
		textCantidad.setColumns(10);
		
		cantComida=new ArrayList<>();
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(261, 113, 89, 23);
		btnAgregar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(Integer.parseInt(textCantidad.getText())!=0 && !textCantidad.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Agregado al carrito");
				cantComida.add(Integer.parseInt(textCantidad.getText()));
				listaComida.add(nomComida.get(nomComida.size()-1)+cantComida.get(cantComida.size()-1)+" Unidad/es\n");
				setVisible(false);
				ventanaConfiteria ventConfiteria = new ventanaConfiteria();
				ventConfiteria.setVisible(true);
			}
			else {
				JOptionPane.showMessageDialog(null, "No se ha ingresado ninguna cantidad, intetelo de nuevo");
			}
			}		
		});
		Panel.add(btnAgregar);		
		
		JButton btnAtras = new JButton("Ir atrás");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.remove(nomComida.size()-1);
				ventanaConfiteria ventConfiteria = new ventanaConfiteria();
				ventConfiteria.setVisible(true);
				setVisible(false);
			}
		});
		btnAtras.setBounds(10, 229, 89, 23);
		Panel.add(btnAtras);
	}
}
