package co.edu.uniquindio.pr2.views;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import co.edu.uniquindio.pr2.model.*;

public class AddPrinterFrame extends JFrame{
	
	private JPanel panel;
	private JTextField textNombre;
	private JTextField textMarca;
	private JTextField textCodigo;
	private JLabel lblNombre;
	private JLabel lblMarca;
	private JLabel lblCodigo;
	private CentroImpresion ci;
	private EstadoImp ei;
	private JComboBox comboBox;
	private JLabel lblEstado;
	
	public AddPrinterFrame() {
		
		panel = new JPanel();
		setContentPane(panel);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(475, 425);
		setLocationRelativeTo(null);
		setResizable(false);
		panel.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setBounds(170, 42, 274, 37);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		textMarca = new JTextField();
		textMarca.setColumns(10);
		textMarca.setBounds(170, 109, 274, 37);
		panel.add(textMarca);
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(170, 182, 274, 37);
		panel.add(textCodigo);
		
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Impresora impresora : ci.getListaImpresoraConectada()) {
					if(textCodigo.getText().equals(impresora.getCodigo())) {
						JOptionPane.showMessageDialog(null, "Esta impresora ya existe");
					}else {						
						Impresora nuevaImpresora = new Impresora((EstadoImp)comboBox.getSelectedItem(), textNombre.getText(), textMarca.getText(), textCodigo.getText());
						List<Impresora> aux = ci.getListaImpresoraConectada();
						aux.add(nuevaImpresora);
						ci.setListaImpresoraConectada(aux);
						PrincipalFrame pf = new PrincipalFrame();
						pf.setVisible(true);
						setVisible(false);
						
					}
				}
			}
		});
		btnAñadir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAñadir.setBounds(328, 320, 116, 53);
		panel.add(btnAñadir);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setEnabled(true);
		lblNombre.setBounds(43, 38, 108, 37);
		panel.add(lblNombre);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarca.setEnabled(true);
		lblMarca.setBounds(43, 105, 108, 37);
		panel.add(lblMarca);
		
		lblCodigo = new JLabel("Código");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodigo.setEnabled(true);
		lblCodigo.setBounds(43, 178, 108, 37);
		panel.add(lblCodigo);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(170, 257, 188, 37);
		panel.add(comboBox);
		for (EstadoImp estadoImp : EstadoImp.values()) {
			comboBox.addItem(estadoImp.getValor());
		}
		
		lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstado.setEnabled(true);
		lblEstado.setBounds(43, 257, 108, 37);
		panel.add(lblEstado);
	}
}
