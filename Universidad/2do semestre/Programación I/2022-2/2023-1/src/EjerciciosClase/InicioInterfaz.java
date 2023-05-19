package EjerciciosClase;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class InicioInterfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textEmail;
	private JPasswordField passwordField;
	
	ArrayList<String> correo;
	ArrayList<String> passwords;

	public static void main(String[]args) {
		InicioInterfaz inicioInterfaz = new InicioInterfaz();
		inicioInterfaz.setVisible(true);
	}
	
	public InicioInterfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		setResizable(false);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		constructor();
	}
	
	public void constructor() {
		JLabel lblTitulo = new JLabel("Bienvenidos a la biblioteca");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 32));
		lblTitulo.setBounds(113, 43, 379, 57);
		contentPane.add(lblTitulo);
		
		JLabel lblInicioSesion = new JLabel("Iniciar sesion");
		lblInicioSesion.setFont(new Font("Arial", Font.PLAIN, 18));
		lblInicioSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicioSesion.setBounds(217, 111, 136, 32);
		contentPane.add(lblInicioSesion);
		
		JLabel lblCorreo = new JLabel("Correo electrónico");
		lblCorreo.setHorizontalAlignment(SwingConstants.LEFT);
		lblCorreo.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCorreo.setBounds(94, 154, 149, 32);
		contentPane.add(lblCorreo);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setHorizontalAlignment(SwingConstants.LEFT);
		lblContraseña.setFont(new Font("Arial", Font.PLAIN, 18));
		lblContraseña.setBounds(94, 240, 149, 32);
		contentPane.add(lblContraseña);
		
		textEmail = new JTextField();
		textEmail.setBounds(89, 197, 410, 32);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JButton btnIniciarSesion = new JButton("Iniciar sesión");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				correo = RegistroEtudiantes.correo;
				passwords = RegistroEtudiantes.passwords;
				for(int i = 0; i<correo.size(); i++) {
					if(correo.get(i).equals(textEmail.getText()) && passwords.get(i).equals(getPass(passwordField))) {
						imprimir("Bienvenido a la biblioteca");
						break;
					}
					else {
						imprimir("Usuario no encontrado");
					}
				}
			}
		});
		btnIniciarSesion.setBounds(388, 315, 111, 23);
		contentPane.add(btnIniciarSesion);
		
		JButton btnResgistrarse = new JButton("Resgistrarse");
		btnResgistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroEtudiantes registro = new RegistroEtudiantes();
				registro.setVisible(true);
				setVisible(false);
			}
		});
		btnResgistrarse.setBounds(388, 349, 111, 23);
		contentPane.add(btnResgistrarse);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('X');
		passwordField.setBounds(89, 272, 410, 32);
		contentPane.add(passwordField);
	}
	
	public static void imprimir(String cadena)
	{
		JOptionPane.showMessageDialog(null, cadena);
	}
	
	public static String getPass(JPasswordField textPassword) {
		String textPass = "";
		char pssword [] = textPassword.getPassword();
		for(int i = 0; i<pssword.length; i++) {
			textPass+=pssword[i];
		}
		return textPass;
	}
}
