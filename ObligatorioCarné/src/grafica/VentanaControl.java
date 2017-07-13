package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VentanaControl extends JFrame {

	private JPanel contentPane;
	private JTextField textPeso;
	private JTextField textAltura;
	private JComboBox comboNiño;
	private JLabel lblNio;
	private JTextArea textArea;
	private JButton btnAplicar;

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
		
		comboNiño = new JComboBox();
		comboNiño.setBounds(76, 36, 86, 20);
		contentPane.add(comboNiño);
		
		lblNio = new JLabel("Ni\u00F1o:");
		lblNio.setBounds(10, 39, 46, 14);
		contentPane.add(lblNio);
		
		textArea = new JTextArea();
		textArea.setBounds(76, 139, 179, 75);
		contentPane.add(textArea);
		
		btnAplicar = new JButton("Aplicar");
		btnAplicar.setBounds(166, 225, 89, 23);
		contentPane.add(btnAplicar);
	}
}
