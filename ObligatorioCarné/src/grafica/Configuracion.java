package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Configuracion extends JFrame {

	private JPanel contentPane;
	private JTextField textCantMaxNiños;

	

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
		
		textCantMaxNiños = new JTextField();
		textCantMaxNiños.setBounds(180, 8, 43, 20);
		contentPane.add(textCantMaxNiños);
		textCantMaxNiños.setColumns(10);
		
		JLabel lblCantidadMaximaDe = new JLabel("Cantidad Maxima de Ni\u00F1os:");
		lblCantidadMaximaDe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCantidadMaximaDe.setBounds(0, 11, 170, 14);
		contentPane.add(lblCantidadMaximaDe);
		
		JButton btnAceptarCantNiños = new JButton("Aceptar");
		btnAceptarCantNiños.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ColeccionNiños coleccion = new ColeccionNiños();
								
				int maxNiños = Integer.parseInt(textCantMaxNiños.getText());				
				coleccion.setMaxNiños(maxNiños);
				
								
				
			}
		});
		btnAceptarCantNiños.setBounds(134, 39, 89, 23);
		contentPane.add(btnAceptarCantNiños);
	}
}
