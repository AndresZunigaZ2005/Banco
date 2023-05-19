package co.edu.uniquindio.pr2.views;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import co.edu.uniquindio.pr2.model.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PrincipalFrame extends JFrame implements ActionListener, Serializable{
	
	private JButton btn1, btnAddPrinter;
	private JPanel panel;
	private JLabel lblSelectPrinter;
	private CentroImpresion centroImpresion;
	private JTextArea textArea;
	private JComboBox comboBoxListaImpresoras; 
	private JLabel lblSelectFile;
	private JButton btnPrint;
	
	public PrincipalFrame() {
		panel = new JPanel();
		setContentPane(panel);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 450);
		setLocationRelativeTo(null);
		setResizable(false);
				
		btn1 = new JButton("Seleccionar");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.showOpenDialog(null);
				File archivo = fileChooser.getSelectedFile();
				try {
					FileReader fileReader = new FileReader(archivo);
					BufferedReader br = new BufferedReader(fileReader);
					String texto = "";
					String linea = "";
					while((linea=br.readLine())!=null) {
						texto+=linea+"\n";
					}
					textArea.setText(texto);
					JOptionPane.showMessageDialog(null, "Archivo leído correctamente");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(235, 45, 159, 30);
		panel.add(btn1);
				
		comboBoxListaImpresoras = new JComboBox();
		comboBoxListaImpresoras.setModel(new DefaultComboBoxModel(new String[] {"Añadir","No pude añadir la lista"}));
		comboBoxListaImpresoras.setBounds(235, 121, 159, 22);
		panel.add(comboBoxListaImpresoras);
		
		lblSelectPrinter = new JLabel("Seleccionar Impresora");
		lblSelectPrinter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelectPrinter.setBounds(27, 114, 176, 30);
		panel.add(lblSelectPrinter);
		
		textArea = new JTextArea();
		textArea.setBounds(27, 183, 543, 175);
		panel.add(textArea);
		
		lblSelectFile = new JLabel("Seleccionar Archivo");
		lblSelectFile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelectFile.setBounds(27, 45, 176, 30);
		panel.add(lblSelectFile);
		
		btnAddPrinter = new JButton("Añadir");
		btnAddPrinter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddPrinterFrame addPrinterFrame = new AddPrinterFrame();
				addPrinterFrame.setVisible(true);
				setVisible(false);
			}
		});
		btnAddPrinter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAddPrinter.setBounds(409, 121, 92, 30);
		panel.add(btnAddPrinter);
		
		btnPrint = new JButton("Imprimir");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxListaImpresoras.getSelectedItem()!=null) {
					for (Impresora impresora : centroImpresion.getListaImpresoraConectada()) {
						if((impresora.equals(comboBoxListaImpresoras.getSelectedItem())) && 
								impresora.getEstado().equals("ACTIVA")) {
							System.out.println(textArea.getText());
						}
					}
				}else {
					JOptionPane.showMessageDialog(null, "Seleccion de impresora incorrecta");
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPrint.setBounds(426, 372, 144, 30);
		panel.add(btnPrint);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
