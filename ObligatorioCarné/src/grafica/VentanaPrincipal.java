package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;


import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private ColeccionNiños coleccion;
	

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal(ColeccionNiños coleccion) {
		this.coleccion = coleccion;
		
		//Consulto si la cantidad de niños es mayor a 0
		/*
		int cantNiños = coleccion.getMaxNiños();
		if (cantNiños == 0)
		{
		
			Configuracion conf = new Configuracion();
			conf.setVisible(true);					
		}
		*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 328);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNios = new JMenu("Ni\u00F1os");
		menuBar.add(mnNios);
		
		
		
		JMenuItem mntmAgregarNio = new JMenuItem("Agregar Ni\u00F1o");
		mntmAgregarNio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								//Cambio de posicion
				/*AgregarNiño ventana = new AgregarNiño(coleccion);
				ventana.setVisible(true);*/
				
				mostrarAgregarNiño();
				
			}
		});
		mnNios.add(mntmAgregarNio);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

	}


	protected void mostrarAgregarNiño() {
		AgregarNiño ventana = new AgregarNiño(coleccion);
		ventana.setVisible(true);
		
	}
}
