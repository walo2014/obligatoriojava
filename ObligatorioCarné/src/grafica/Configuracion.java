package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Configuracion extends JFrame {

	private JPanel contentPane;
	private JTextField textCantMaxNiños;
	private JTextField textCantMaxRegistro;

	/**
	 * Create the frame.
	 */
	public Configuracion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\OEM\\Desktop\\cruz.png"));
		setAlwaysOnTop(true);
		setTitle("Configuraci\u00F3n");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 278, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textCantMaxNiños = new JTextField();
		textCantMaxNiños.setText("20");
		textCantMaxNiños.setBounds(180, 8, 43, 20);
		contentPane.add(textCantMaxNiños);
		textCantMaxNiños.setColumns(10);

		JLabel lblCantidadMaximaDe = new JLabel("Cantidad Maxima de Ni\u00F1os:");
		lblCantidadMaximaDe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCantidadMaximaDe.setBounds(0, 11, 170, 14);
		contentPane.add(lblCantidadMaximaDe);

		JButton btnAceptarCantNiños = new JButton("Nuevo");
		btnAceptarCantNiños.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutarAceptar();
			}
		});
		btnAceptarCantNiños.setBounds(163, 131, 89, 23);
		contentPane.add(btnAceptarCantNiños);

		JLabel lblMaximoRegistro = new JLabel("Maximo Registro");
		lblMaximoRegistro.setToolTipText("Se sugiere el minimo de registro deberia ser 40");
		lblMaximoRegistro.setBounds(42, 43, 128, 14);
		contentPane.add(lblMaximoRegistro);

		textCantMaxRegistro = new JTextField();
		textCantMaxRegistro.setText("40");
		textCantMaxRegistro.setBounds(180, 40, 43, 20);
		contentPane.add(textCantMaxRegistro);
		textCantMaxRegistro.setColumns(10);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cargarSistema();
			}
		});
		btnCargar.setBounds(10, 131, 89, 23);
		contentPane.add(btnCargar);
	}

	protected void cargarSistema() {
		ColeccionNiños coleccion = new ColeccionNiños();
		
		try{
			coleccion=coleccion.leerArchivo();
			
		}catch(Exception ex){
			coleccion = new ColeccionNiños();
			int maxNiños = 20;
			int maxRegistros = 40;
			coleccion.configurar(maxNiños, maxRegistros);
			JOptionPane.showMessageDialog(this, "Se ha creado con los valores preestablecidos");
		}
		finally{
			VentanaPrincipal ventana = new VentanaPrincipal(coleccion);
			ventana.setVisible(true);
			this.setVisible(false);
		}
		
	}

	protected void ejecutarAceptar() {
		ColeccionNiños coleccion = new ColeccionNiños();
		
		
		try
		{
		int maxNiños = Integer.parseInt(textCantMaxNiños.getText());
		int maxRegistros = Integer.parseInt(textCantMaxRegistro.getText());

		// Esta bien pero lo mas correcto para este programa esta la function
		// configuracion
		// coleccion.setMaxNiños(maxNiños);
		if (maxNiños > 0)
			if (maxRegistros > 0) {
				File fichero = new File("sistema.mml");
				boolean continuar=true;
				if(fichero.exists())
				{
					int resultado=JOptionPane.showConfirmDialog(this, "Seguro desea perder informacion anterior","Sistema...",JOptionPane.YES_NO_OPTION);
					if(resultado==JOptionPane.NO_OPTION)
						continuar=false;
				}
					
				if(continuar)	{
					coleccion.configurar(maxNiños, maxRegistros);
					VentanaPrincipal ventana = new VentanaPrincipal(coleccion);
					ventana.setVisible(true);
					this.setVisible(false);
				}
				
			}
			else{
				JOptionPane.showMessageDialog(this, "El maximo registro tiene que ser mayor a 0");
			}
		else{
			JOptionPane.showMessageDialog(this, "El maximo niños tiene que ser mayor a 0");
		}
		}catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(this, "Los datos deben ser numericos");
			textCantMaxNiños.setText("");
			textCantMaxRegistro.setText("");
			
		}
	}
}
