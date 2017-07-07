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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

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
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(15, 30, 103, 14);
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(15, 55, 103, 14);
		lblDocumento.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaDeNacimiento.setBounds(15, 84, 103, 14);
		lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblServicioMedico = new JLabel("Servicio Medico:");
		lblServicioMedico.setBounds(15, 109, 103, 14);
		lblServicioMedico.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblMedicoDeCabecera = new JLabel("Medico de Cabecera:");
		lblMedicoDeCabecera.setBounds(15, 138, 103, 14);
		lblMedicoDeCabecera.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblFonasa = new JLabel("Fonasa:");
		lblFonasa.setBounds(15, 163, 103, 14);
		lblFonasa.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textNombre = new JTextField();
		textNombre.setBounds(120, 30, 151, 20);
		textNombre.setColumns(10);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(120, 55, 151, 20);
		textDocumento.setColumns(10);
		
		textServicioMedico = new JTextField();
		textServicioMedico.setBounds(120, 109, 151, 20);
		textServicioMedico.setColumns(10);
		
		textMedicoCabecera = new JTextField();
		textMedicoCabecera.setBounds(120, 138, 151, 20);
		textMedicoCabecera.setColumns(10);
		
		JCheckBox chckbxSi = new JCheckBox("Si");
		chckbxSi.setBounds(124, 159, 97, 23);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(182, 189, 89, 23);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(120, 81, 151, 20);
		contentPane.setLayout(null);
		contentPane.add(lblNombre);
		contentPane.add(lblDocumento);
		contentPane.add(lblFechaDeNacimiento);
		contentPane.add(lblServicioMedico);
		contentPane.add(lblMedicoDeCabecera);
		contentPane.add(lblFonasa);
		contentPane.add(textNombre);
		contentPane.add(textDocumento);
		contentPane.add(textServicioMedico);
		contentPane.add(textMedicoCabecera);
		contentPane.add(chckbxSi);
		contentPane.add(btnAgregar);
		contentPane.add(dateChooser);
	}
}
