package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class AgregarNiño extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDocumento;
	private JTextField textServicioMedico;
	private JTextField textMedicoCabecera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarNiño frame = new AgregarNiño();
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
	public AgregarNiño() {
		setTitle("Agregar ni\u00F1o");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(10, 30, 103, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDocumento.setBounds(10, 55, 103, 14);
		contentPane.add(lblDocumento);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaDeNacimiento.setBounds(10, 80, 103, 14);
		contentPane.add(lblFechaDeNacimiento);
		
		JLabel lblServicioMedico = new JLabel("Servicio Medico:");
		lblServicioMedico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblServicioMedico.setBounds(10, 105, 103, 14);
		contentPane.add(lblServicioMedico);
		
		JLabel lblMedicoDeCabecera = new JLabel("Medico de Cabecera:");
		lblMedicoDeCabecera.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMedicoDeCabecera.setBounds(10, 130, 103, 14);
		contentPane.add(lblMedicoDeCabecera);
		
		JLabel lblFonasa = new JLabel("Fonasa:");
		lblFonasa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFonasa.setBounds(10, 159, 103, 14);
		contentPane.add(lblFonasa);
		
		textNombre = new JTextField();
		textNombre.setBounds(121, 27, 151, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(121, 52, 151, 20);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		textServicioMedico = new JTextField();
		textServicioMedico.setBounds(123, 102, 149, 20);
		contentPane.add(textServicioMedico);
		textServicioMedico.setColumns(10);
		
		textMedicoCabecera = new JTextField();
		textMedicoCabecera.setBounds(123, 127, 149, 20);
		contentPane.add(textMedicoCabecera);
		textMedicoCabecera.setColumns(10);
		
		JCheckBox chckbxSi = new JCheckBox("Si");
		chckbxSi.setBounds(119, 155, 97, 23);
		contentPane.add(chckbxSi);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(183, 185, 89, 23);
		contentPane.add(btnAgregar);
	}
}
