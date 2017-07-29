package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNi�os;
import logica.Ni�o;

import javax.swing.JList;

public class VentanaVerNi�os extends JFrame {

	private JPanel contentPane;
	private ColeccionNi�os coleccion;
	private JList lstNi�os;


	/**
	 * Create the frame.
	 */
	public VentanaVerNi�os(ColeccionNi�os coleccion) {
		
		setTitle("Ni\u00F1os del sistema");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 749, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.coleccion = coleccion;
		lstNi�os = new JList();
		lstNi�os.setBounds(10, 21, 713, 219);
		contentPane.add(lstNi�os);
		
	
		
		listarNi�os();
	}
	
	public void listarNi�os(){
		
		DefaultListModel lista = new DefaultListModel();
		lstNi�os.setModel(lista);
		

		Ni�o ni�os[] = coleccion.listarNi�os();
		
		for (int i = 0; i < ni�os.length;i++)
		{
			
			String registro = "Documento: " + ni�os[i].getDocumento() + " Nombre: " + ni�os[i].getNombre() + " Fecha Nacimiento: " + ni�os[i].getFechaNacimientoString() + "Servicio Medico: " + ni�os[i].getServicioMedico();
			lista.addElement(registro);
		}
		
	}
	
		

	    
			
		
}
