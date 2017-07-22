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
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

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
		
		JMenuItem mntmVerNios = new JMenuItem("Ver Ni\u00F1os");
		mnNios.add(mntmVerNios);
		
		JMenu mnRegistros = new JMenu("Registros");
		menuBar.add(mnRegistros);
		
		JMenuItem mntmVerNios_1 = new JMenuItem("Ver Registros Ni\u00F1os");
		mntmVerNios_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verregistro();
				
			}
		});
		mnRegistros.add(mntmVerNios_1);
		
		JMenuItem mntmVacunarNio = new JMenuItem("Vacunar Ni\u00F1o");
		mntmVacunarNio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarVacunar();
			}
		});
		mnRegistros.add(mntmVacunarNio);
		
		JMenuItem mntmConsultaNio = new JMenuItem("Consulta Ni\u00F1o");
		mntmConsultaNio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarConsulta();
			}
		});
		mnRegistros.add(mntmConsultaNio);
		
		JMenuItem mntmControl = new JMenuItem("Control Ni\u00F1o");
		mntmControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarControl();
			}
		});
		mnRegistros.add(mntmControl);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

	}

	protected void verregistro() {
		ListadoVacunasDadas ventana=new ListadoVacunasDadas(coleccion);
		ventana.setVisible(true);
		
	}

	//Invocacion de ventanas
	protected void mostrarAgregarNiño() 
	{
		AgregarNiño ventAgregar = new AgregarNiño(coleccion);
		ventAgregar.setVisible(true);
		
	}
	
	protected void mostrarVacunar()
	{
		VentanaVacuna ventVacuna = new VentanaVacuna(coleccion);
		ventVacuna.setVisible(true);
	}
	
	protected void mostrarControl()
	{
		VentanaAgregarControl ventControl = new VentanaAgregarControl(coleccion);
		ventControl.setVisible(true);
	}
	
	protected void mostrarConsulta()
	{
		VentanaAgregarConsulta ventConsulta = new VentanaAgregarConsulta(coleccion);
		ventConsulta.setVisible(true);
	}
}
