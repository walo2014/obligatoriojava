package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;
import logica.Niño;

import javax.swing.JList;

public class VentanaVerNiños extends JFrame {

	private JPanel contentPane;
	private ColeccionNiños coleccion;
	private JList lstNiños;


	/**
	 * Create the frame.
	 */
	public VentanaVerNiños(ColeccionNiños coleccion) {
		
		setTitle("Ni\u00F1os del sistema");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 749, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.coleccion = coleccion;
		lstNiños = new JList();
		lstNiños.setBounds(10, 21, 713, 219);
		contentPane.add(lstNiños);
		
	
		
		listarNiños();
	}
	
	public void listarNiños(){
		
		DefaultListModel lista = new DefaultListModel();
		lstNiños.setModel(lista);
		

		Niño niños[] = coleccion.listarNiños();
		
		for (int i = 0; i < niños.length;i++)
		{
			
			String registro = "Documento: " + niños[i].getDocumento() + " Nombre: " + niños[i].getNombre() + " Fecha Nacimiento: " + niños[i].getFechaNacimientoString() + "Servicio Medico: " + niños[i].getServicioMedico();
			lista.addElement(registro);
		}
		
	}
	
		

	    
			
		
}
