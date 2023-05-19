package centroImpresionJavaSwing;

import java.awt.EventQueue;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import co.edu.uniquindio.pr2.*;
import co.edu.uniquindio.pr2.model.CentroImpresion;
import co.edu.uniquindio.pr2.views.PrincipalFrame;

import javax.swing.JFrame;

public class Model implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException{
		
		PrincipalFrame pf = new PrincipalFrame();
		pf.setVisible(true);
		
		FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(pf); 
		objectOutputStream.close();
	}

}
