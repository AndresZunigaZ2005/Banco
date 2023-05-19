package EjerciciosClase;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class RegistroEtudiantes extends JFrame {

	private JPanel showPaneRegister;
	private JTextField textMail;
	private JPasswordField textPassword;
	private JPasswordField textConfirmPass;
	private JLabel lblTitleRegistration;
	private JButton btnAcceptRegistration;
	
	public static ArrayList<String> correo = new ArrayList<String>();
	public static ArrayList<String> passwords = new ArrayList<String>();
	private JButton btnAtrs;
	
	public RegistroEtudiantes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		showPaneRegister = new JPanel();
		showPaneRegister.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(showPaneRegister);
		setResizable(false);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		constructor();
	}
	
	public void constructor() {
		JLabel lblNewLabel = new JLabel("Correo electrónico");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(50, 79, 159, 58);
		showPaneRegister.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setFont(new Font("Arial", Font.PLAIN, 18));
		lblContrasea.setBounds(50, 159, 159, 58);
		showPaneRegister.add(lblContrasea);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar contraseña");
		lblConfirmarContrasea.setFont(new Font("Arial", Font.PLAIN, 18));
		lblConfirmarContrasea.setBounds(50, 247, 174, 58);
		showPaneRegister.add(lblConfirmarContrasea);
		
		textMail = new JTextField();
		textMail.setFont(new Font("Arial", Font.PLAIN, 14));
		textMail.setBounds(234, 91, 269, 39);
		showPaneRegister.add(textMail);
		textMail.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setEchoChar('X');
		textPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		textPassword.setColumns(10);
		textPassword.setBounds(234, 171, 269, 39);
		showPaneRegister.add(textPassword);
		
		textConfirmPass = new JPasswordField();
		textConfirmPass.setEchoChar('X');
		textConfirmPass.setFont(new Font("Arial", Font.PLAIN, 14));
		textConfirmPass.setColumns(10);
		textConfirmPass.setBounds(234, 259, 269, 39);
		showPaneRegister.add(textConfirmPass);
		
		lblTitleRegistration = new JLabel("Registro");
		lblTitleRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleRegistration.setFont(new Font("Arial", Font.PLAIN, 42));
		lblTitleRegistration.setBounds(124, 11, 290, 58);
		showPaneRegister.add(lblTitleRegistration);
		
		btnAcceptRegistration = new JButton("Registrarse");
		btnAcceptRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnAcceptRegistration) {
					if(getPass(textPassword).equals(getPass(textConfirmPass))) {
						correo.add(textMail.getText());
						passwords.add(getPass(textPassword));
						imprimir("Registro exitoso");
						InicioInterfaz inicioIntefaz = new InicioInterfaz();
						inicioIntefaz.setVisible(true);
						setVisible(false);
					}
					else {
						imprimir("Registro fallido \ncontraseña incorrecta");
					}
				}
			}
		});
		btnAcceptRegistration.setFont(new Font("Arial", Font.PLAIN, 24));
		btnAcceptRegistration.setBounds(327, 339, 176, 46);
		showPaneRegister.add(btnAcceptRegistration);
		
		btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioInterfaz inicioIntefaz = new InicioInterfaz();
				inicioIntefaz.setVisible(true);
				setVisible(false);
			}
		});
		btnAtrs.setFont(new Font("Arial", Font.PLAIN, 24));
		btnAtrs.setBounds(20, 339, 102, 46);
		showPaneRegister.add(btnAtrs);
	}
	
	public static String getPass(JPasswordField textPassword) {
		String textPass = "";
		char pssword [] = textPassword.getPassword();
		for(int i = 0; i<pssword.length; i++) {
			textPass+=pssword[i];
		}
		return textPass;
	}
	
	public static void imprimir(String cadena)
	{
		JOptionPane.showMessageDialog(null, cadena);
	}
}
