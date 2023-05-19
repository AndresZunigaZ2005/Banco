import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class ventanaConfiteria extends JFrame {

	private JPanel panel;	
	private JButton btnCrispPeq, btnCrispMed, btnCrispGra, btnGaseosaPeq, btnTe, btnAgua, btnGaseosaMed, 
	btnGaseosaGran, btnCrispExtra, btnCrispFam, btnPerro, btnSandwich, btnDulces, btnCombo1, btnCombo2, 
	btnCombo3, btnCombo4, btnAtras;
	
	public static ArrayList<String> nomComida = new ArrayList<String>();
	public static ImageIcon carrito = new ImageIcon("Imagenes/carritoCompras.png");
	
	ArrayList<Integer> cantidadComida = VentanaCantidad.cantComida;
	ArrayList <String> listaComida= VentanaCantidad.listaComida;
	
	private ImageIcon fondo= new ImageIcon("Imagenes/Crispetas.png");
	private String listComida="";
	private JButton btnEliminarUltimoElemento;

	
	public ventanaConfiteria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 650);
		setTitle("CONFITERÍA");
		setLocationRelativeTo(null);
		
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		setResizable(false);
		
		JLabel lblTitulo = new JLabel("Presione un botón para agregar ");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 11, 1166, 34);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel.add(lblTitulo);
		
		JLabel lblCrispeta = new JLabel("Crispetas");
		lblCrispeta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCrispeta.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrispeta.setBounds(10, 98, 220, 20);
		panel.add(lblCrispeta);
		
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setHorizontalAlignment(SwingConstants.CENTER);
		lblBebidas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBebidas.setBounds(240, 98, 188, 21);
		panel.add(lblBebidas);
		
		JLabel lblOtrasComidas = new JLabel("Otras comidas");
		lblOtrasComidas.setHorizontalAlignment(SwingConstants.CENTER);
		lblOtrasComidas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOtrasComidas.setBounds(438, 98, 188, 21);
		panel.add(lblOtrasComidas);
		
		JLabel lblCombos = new JLabel("Combos");
		lblCombos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCombos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCombos.setBounds(831, 98, 188, 21);
		panel.add(lblCombos);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hola");
				ventanaPagar ventPagar= new ventanaPagar();
				ventPagar.setVisible(true);
				setVisible(false);
			}
		});
		btnContinuar.setBounds(975, 502, 201, 73);
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel.add(btnContinuar);
		
		btnCrispPeq = new JButton("Crispetas Pequeñas: $7500");
		btnCrispPeq.setForeground(new Color(255, 255, 255));
		btnCrispPeq.setBackground(new Color(0, 0, 0));
		btnCrispPeq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				nomComida.add("Crispetas pequeñas, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnCrispPeq.setBounds(10, 129, 220, 58);
		panel.add(btnCrispPeq);
		
		btnCrispMed = new JButton("Crispetas mediana: $10000");
		btnCrispMed.setBackground(new Color(0, 0, 0));
		btnCrispMed.setForeground(new Color(255, 255, 255));
		btnCrispMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Crispetas medianas, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnCrispMed.setBounds(10, 227, 220, 58);
		panel.add(btnCrispMed);
		
		btnCrispGra = new JButton("Crispetas grandes: $11000");
		btnCrispGra.setForeground(new Color(255, 255, 255));
		btnCrispGra.setBackground(new Color(0, 0, 0));
		btnCrispGra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Crispetas grandes, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
				
			}
		});
		btnCrispGra.setBounds(10, 327, 220, 58);
		panel.add(btnCrispGra);
		
		btnCrispExtra = new JButton("Crispetas extragrandes: $13000");
		btnCrispExtra.setBackground(new Color(0, 0, 0));
		btnCrispExtra.setForeground(new Color(255, 255, 255));
		btnCrispExtra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Crispetas extragrandes, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnCrispExtra.setBounds(10, 421, 220, 58);
		panel.add(btnCrispExtra);
		
		btnCrispFam = new JButton("Crispetas familiar: $14500");
		btnCrispFam.setForeground(new Color(255, 255, 255));
		btnCrispFam.setBackground(new Color(0, 0, 0));
		btnCrispFam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Crispetas familiar, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnCrispFam.setBounds(10, 516, 220, 58);
		panel.add(btnCrispFam);
		
		btnGaseosaPeq = new JButton("Gaseosa pequeña: $2500");
		btnGaseosaPeq.setBackground(new Color(0, 0, 0));
		btnGaseosaPeq.setForeground(new Color(255, 255, 255));
		btnGaseosaPeq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Gaseosa pequeña, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnGaseosaPeq.setBounds(240, 129, 188, 58);
		panel.add(btnGaseosaPeq);
		
		btnGaseosaMed = new JButton("Gaseosa Mediana: $4000");
		btnGaseosaMed.setBackground(new Color(0, 0, 0));
		btnGaseosaMed.setForeground(new Color(255, 255, 255));
		btnGaseosaMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Gaseosa mediana, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnGaseosaMed.setBounds(240, 227, 188, 58);
		panel.add(btnGaseosaMed);
		
		btnGaseosaGran = new JButton("Gaseosa Grande: $5000");
		btnGaseosaGran.setForeground(new Color(255, 255, 255));
		btnGaseosaGran.setBackground(new Color(0, 0, 0));
		btnGaseosaGran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Gaseosa grande, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnGaseosaGran.setBounds(240, 327, 188, 58);
		panel.add(btnGaseosaGran);
		
		btnTe = new JButton("Té: $3500");
		btnTe.setBackground(new Color(0, 0, 0));
		btnTe.setForeground(new Color(255, 255, 255));
		btnTe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Té, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnTe.setBounds(240, 421, 188, 58);
		panel.add(btnTe);
		
		btnAgua = new JButton("Agua: $2000");
		btnAgua.setForeground(new Color(255, 255, 255));
		btnAgua.setBackground(new Color(0, 0, 0));
		btnAgua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Agua, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnAgua.setBounds(240, 516, 188, 58);
		panel.add(btnAgua);
		
		btnPerro = new JButton("Perro: $5000");
		btnPerro.setBackground(new Color(0, 0, 0));
		btnPerro.setForeground(new Color(255, 255, 255));
		btnPerro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Perro, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnPerro.setBounds(438, 129, 188, 58);
		panel.add(btnPerro);
		
		btnSandwich = new JButton("Sandwich: $3500");
		btnSandwich.setForeground(new Color(255, 255, 255));
		btnSandwich.setBackground(new Color(0, 0, 0));
		btnSandwich.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Sándwich, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnSandwich.setBounds(438, 227, 188, 58);
		panel.add(btnSandwich);
		
		btnDulces = new JButton("Caja de dulces: $2000");
		btnDulces.setForeground(new Color(255, 255, 255));
		btnDulces.setBackground(new Color(0, 0, 0));
		btnDulces.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Caja de dulces, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnDulces.setBounds(438, 327, 188, 58);
		panel.add(btnDulces);
		
		btnCombo1 = new JButton(strToHtml("Combo 1: Crispetas pequeñas, perro, gaseosa pequeña: $12000"));
		btnCombo1.setForeground(new Color(255, 255, 255));
		btnCombo1.setBackground(new Color(0, 0, 0));
		btnCombo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Combo 1, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnCombo1.setBounds(682, 129, 231, 99);
		panel.add(btnCombo1);
		
		btnCombo2 = new JButton(strToHtml("Combo 2:  Crispetas medianas, 2 gaseosas pequeñas, 2 perros: $20000"));
		btnCombo2.setForeground(new Color(255, 255, 255));
		btnCombo2.setBackground(new Color(0, 0, 0));
		btnCombo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Combo 2, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnCombo2.setBounds(945, 129, 231, 99);
		panel.add(btnCombo2);
		
		btnCombo3 = new JButton(strToHtml("Combo 3: Crispeta familiar, 3 gaseosas grandes, 3 perros: $30000"));
		btnCombo3.setForeground(new Color(255, 255, 255));
		btnCombo3.setBackground(new Color(0, 0, 0));
		btnCombo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Combo 3, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnCombo3.setBounds(682, 286, 231, 99);
		panel.add(btnCombo3);
		
		btnCombo4 = new JButton(strToHtml("Combo 4: Crispetas pequeñas, gaseosa pequeña, sandwich, caja de dulces: $13000"));
		btnCombo4.setForeground(new Color(255, 255, 255));
		btnCombo4.setBackground(new Color(0, 0, 0));
		btnCombo4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.add("Combo 4, ");
				VentanaCantidad ventCant = new VentanaCantidad();
				ventCant.setVisible(true);
				setVisible(false);
			}
		});
		btnCombo4.setBounds(945, 286, 231, 99);
		panel.add(btnCombo4);
		
		JButton btnCarrito = new JButton();
		btnCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listaComida.size()>0) {
					listComida=mostrarArrayList(listaComida);
					JOptionPane.showMessageDialog(null, listComida);
				}else {
					JOptionPane.showMessageDialog(null, "No se ha añadido nada al carrito");
				}
			}
		});
		btnCarrito.setBounds(494, 432, 220, 143);
		btnCarrito.setIcon(new ImageIcon(carrito.getImage().getScaledInstance(btnCarrito.getWidth(), btnCarrito.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(btnCarrito);
				
		btnAtras = new JButton("Ir Atras");
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnAtras.setBounds(756, 502, 201, 73);
		panel.add(btnAtras);
		
		btnEliminarUltimoElemento = new JButton("Eliminar Elemento");
		btnEliminarUltimoElemento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomComida.remove(nomComida.size()-1);
				cantidadComida.remove(cantidadComida.size()-1);
				listaComida.remove(listaComida.size()-1);

			}
		});
		btnEliminarUltimoElemento.setBounds(494, 579, 142, 23);
		panel.add(btnEliminarUltimoElemento);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setBounds(0, 0, 1186, 623);
		lblFondo.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(lblFondo);
			
	}
	
	public String strToHtml(String texto) {
		return "<html><p>"+ texto +"</p></html> ";
	}
	
	public static String mostrarArrayList(ArrayList <String> lista) {
		String respuesta="";
		for(int i = 0; i<lista.size(); i++) {
			if(i<lista.size()-1) {
				respuesta+=lista.get(i)+"\n";
			}
			else {
				respuesta+=lista.get(i);
			}
		}
		return respuesta;
	}
}
