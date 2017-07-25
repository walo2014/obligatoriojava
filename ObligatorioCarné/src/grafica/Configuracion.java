package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNi�os;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Configuracion extends JFrame {

	private JPanel contentPane;
	private JTextField textCantMaxNi�os;
	private JTextField textCantMaxRegistro;

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
		textCantMaxNi�os.setText("20");
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
				ejecutarAceptar();
			}
		});
		btnAceptarCantNi�os.setBounds(134, 100, 89, 23);
		contentPane.add(btnAceptarCantNi�os);

		JLabel lblMaximoRegistro = new JLabel("Maximo Registro");
		lblMaximoRegistro.setBounds(42, 43, 128, 14);
		contentPane.add(lblMaximoRegistro);

		textCantMaxRegistro = new JTextField();
		textCantMaxRegistro.setText("40");
		textCantMaxRegistro.setBounds(180, 40, 43, 20);
		contentPane.add(textCantMaxRegistro);
		textCantMaxRegistro.setColumns(10);
	}

	protected void ejecutarAceptar() {
		ColeccionNi�os coleccion = new ColeccionNi�os();
		
		
		try
		{
		int maxNi�os = Integer.parseInt(textCantMaxNi�os.getText());
		int maxRegistros = Integer.parseInt(textCantMaxRegistro.getText());

		// Esta bien pero lo mas correcto para este programa esta la function
		// configuracion
		// coleccion.setMaxNi�os(maxNi�os);
		if (maxNi�os > 0)
			if (maxRegistros > 0) {

				coleccion.configurar(maxNi�os, maxRegistros);
				VentanaPrincipal ventana = new VentanaPrincipal(coleccion);
				ventana.setVisible(true);
				this.setVisible(false);
				
			}
			else{
				JOptionPane.showMessageDialog(this, "El maximo registro tiene que ser mayor a 0");
			}
		else{
			JOptionPane.showMessageDialog(this, "El maximo ni�os tiene que ser mayor a 0");
		}
		}catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(this, "Los datos deben ser numericos");
			textCantMaxNi�os.setText("");
			textCantMaxRegistro.setText("");
			
		}
	}
}
