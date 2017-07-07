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
	private JTextField textCantNiños;
	private JTextField textCantRegistros;


	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 328);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNios = new JMenu("Ni\u00F1os");
		menuBar.add(mnNios);
		
		
		
		JMenuItem mntmAgregarNio = new JMenuItem("Agregar Ni\u00F1o");
		mntmAgregarNio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				AgregarNiño ventana = new AgregarNiño(coleccion);
				ventana.setVisible(true);
				
			}
		});
		mnNios.add(mntmAgregarNio);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Cantidad maxima de ni\u00F1os:");
		label.setBounds(241, 185, 151, 14);
		contentPane.add(label);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel label_1 = new JLabel("Cantidad maxima de registros:");
		label_1.setBounds(241, 213, 151, 14);
		contentPane.add(label_1);
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textCantNiños = new JTextField();
		textCantNiños.setBounds(399, 182, 49, 20);
		contentPane.add(textCantNiños);
		textCantNiños.setColumns(10);
		
		textCantRegistros = new JTextField();
		textCantRegistros.setBounds(399, 209, 49, 20);
		contentPane.add(textCantRegistros);
		textCantRegistros.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cantNiños = Integer.parseInt(textCantNiños.getText());
				int cantRegistros = Integer.parseInt(textCantRegistros.getText());
				
				//Defino la cantidad de niños
				int maxNiños = Integer.parseInt(textCantNiños.getText());
				ColeccionNiños col = new ColeccionNiños();
			}
		});
		btnAceptar.setBounds(359, 234, 89, 23);
		contentPane.add(btnAceptar);
		
		JLabel lblConfiguracion = new JLabel("Configuraci\u00F3n:");
		lblConfiguracion.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfiguracion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConfiguracion.setBounds(240, 164, 208, 14);
		contentPane.add(lblConfiguracion);
	}
}
