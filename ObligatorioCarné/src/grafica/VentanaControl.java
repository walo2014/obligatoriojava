package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class VentanaControl extends JFrame {

	private JPanel contentPane;
	private JTextField text_nombre;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaControl frame = new VentanaControl();
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
	public VentanaControl() {
		setTitle("Control");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 26, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(10, 52, 46, 14);
		contentPane.add(lblEdad);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(10, 86, 46, 14);
		contentPane.add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(10, 111, 46, 14);
		contentPane.add(lblAltura);
		
		text_nombre = new JTextField();
		text_nombre.setBounds(76, 23, 86, 20);
		contentPane.add(text_nombre);
		text_nombre.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 49, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 83, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 108, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 148, 46, 14);
		contentPane.add(lblFecha);
		
		JLabel lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setBounds(10, 173, 74, 14);
		contentPane.add(lblComentarios);
		
		textField_4 = new JTextField();
		textField_4.setBounds(76, 145, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(76, 170, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}
}
