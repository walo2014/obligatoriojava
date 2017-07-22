package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAgregarControl extends JFrame {

	private JPanel contentPane;
	private JTextField textPeso;
	private JTextField textAltura;
	private JLabel lblNio;
	private JTextArea textArea;
	private JButton btnAplicar;
	private ColeccionNiños coleccion;
	private JTextField textCedula;
	private JButton btnBuscar;

	/**
	 * Create the frame.
	 */
	public VentanaAgregarControl(ColeccionNiños col) {
		setTitle("Control");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(10, 70, 46, 14);
		contentPane.add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(10, 95, 46, 14);
		contentPane.add(lblAltura);
		
		textPeso = new JTextField();
		textPeso.setBounds(76, 67, 86, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.setBounds(76, 92, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JLabel lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setBounds(76, 123, 74, 14);
		contentPane.add(lblComentarios);
		
		lblNio = new JLabel("Cedula:");
		lblNio.setBounds(10, 39, 46, 14);
		contentPane.add(lblNio);
		
		textArea = new JTextArea();
		textArea.setBounds(76, 139, 179, 75);
		contentPane.add(textArea);
		
		btnAplicar = new JButton("Aplicar");
		btnAplicar.setBounds(166, 225, 89, 23);
		contentPane.add(btnAplicar);
		
		textCedula = new JTextField();
		textCedula.setBounds(76, 36, 86, 20);
		contentPane.add(textCedula);
		textCedula.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				}
		});
		btnBuscar.setBounds(172, 35, 89, 23);
		contentPane.add(btnBuscar);
		
		
	}
}
