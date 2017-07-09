package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNi�os;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Configuracion extends JFrame {

	private JPanel contentPane;
	private JTextField textCantMaxNi�os;

	

	/**
	 * Create the frame.
	 */
	public Configuracion() {
		setAlwaysOnTop(true);
		setTitle("Configuraci\u00F3n");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 278, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCantMaxNi�os = new JTextField();
		textCantMaxNi�os.setBounds(180, 8, 43, 20);
		contentPane.add(textCantMaxNi�os);
		textCantMaxNi�os.setColumns(10);
		
		JLabel lblCantidadMaximaDe = new JLabel("Cantidad Maxima de Ni\u00F1os:");
		lblCantidadMaximaDe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCantidadMaximaDe.setBounds(0, 11, 170, 14);
		contentPane.add(lblCantidadMaximaDe);
		
		JButton btnAceptarCantNi�os = new JButton("Aceptar");
		btnAceptarCantNi�os.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ColeccionNi�os coleccion = new ColeccionNi�os();
								
				int maxNi�os = Integer.parseInt(textCantMaxNi�os.getText());				
				coleccion.setMaxNi�os(maxNi�os);
				
								
				
			}
		});
		btnAceptarCantNi�os.setBounds(134, 39, 89, 23);
		contentPane.add(btnAceptarCantNi�os);
	}
}
