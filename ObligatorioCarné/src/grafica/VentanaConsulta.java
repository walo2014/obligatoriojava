package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class VentanaConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private ColeccionNiños coleccion;

	/**
	 * Create the frame.
	 */
	public VentanaConsulta(ColeccionNiños col) {
		setTitle("Consulta");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMedico = new JLabel("Medico:");
		lblMedico.setBounds(71, 60, 46, 14);
		contentPane.add(lblMedico);
		
		JLabel lblDiagnostico = new JLabel("Diagnostico:");
		lblDiagnostico.setBounds(46, 91, 75, 14);
		contentPane.add(lblDiagnostico);
		
		JLabel lblRecomendaciones = new JLabel("Recomendaciones:");
		lblRecomendaciones.setBounds(25, 122, 97, 14);
		contentPane.add(lblRecomendaciones);
		
		textField = new JTextField();
		textField.setBounds(128, 57, 117, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 88, 117, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 119, 117, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.setBounds(164, 194, 89, 23);
		contentPane.add(btnAplicar);
		
		JLabel lblNio = new JLabel("Ni\u00F1o:");
		lblNio.setBounds(71, 35, 46, 14);
		contentPane.add(lblNio);
		
		JComboBox comboNiño = new JComboBox(col.listarNombres());
		comboNiño.setBounds(128, 26, 117, 20);
		contentPane.add(comboNiño);
	}
}
