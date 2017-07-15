package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConsulta frame = new VentanaConsulta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaConsulta() {
		setTitle("Consulta");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMedico = new JLabel("Medico:");
		lblMedico.setBounds(25, 31, 46, 14);
		contentPane.add(lblMedico);
		
		JLabel lblDiagnostico = new JLabel("Diagnostico:");
		lblDiagnostico.setBounds(25, 68, 75, 14);
		contentPane.add(lblDiagnostico);
		
		JLabel lblRecomendaciones = new JLabel("Recomendaciones:");
		lblRecomendaciones.setBounds(25, 106, 97, 14);
		contentPane.add(lblRecomendaciones);
		
		textField = new JTextField();
		textField.setBounds(128, 28, 117, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 65, 106, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 103, 117, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.setBounds(156, 134, 89, 23);
		contentPane.add(btnAplicar);
	}
}
