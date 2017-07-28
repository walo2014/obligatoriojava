package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import excepciones.NoHayLugarException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import logica.ColeccionNiños;
import logica.Niño;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;

public class AgregarNiño extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDocumento;
	private JTextField textMedicoCabecera;
	private JComboBox comboServicioMedico;
	private JCheckBox chckbxSi;
	private ColeccionNiños coleccion;
	private JComboBox comboDia;
	private JComboBox comboMes;
	private JComboBox comboAño;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AgregarNiño(ColeccionNiños col) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\OEM\\Desktop\\cruz.png"));
		this.coleccion = col;
		setTitle("Agregar ni\u00F1o");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 432, 306);
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
		lblFechaDeNacimiento.setBounds(-27, 82, 153, 18);
		lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblServicioMedico = new JLabel("Servicio Medico:");
		lblServicioMedico.setBounds(4, 109, 114, 14);
		lblServicioMedico.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblMedicoDeCabecera = new JLabel("Medico de Cabecera:");
		lblMedicoDeCabecera.setBounds(4, 141, 124, 14);
		lblMedicoDeCabecera.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblFonasa = new JLabel("Fonasa:");
		lblFonasa.setBounds(15, 163, 103, 14);
		lblFonasa.setHorizontalAlignment(SwingConstants.RIGHT);

		textNombre = new JTextField();
		textNombre.setBounds(138, 27, 153, 20);
		textNombre.setColumns(10);

		textDocumento = new JTextField();
		textDocumento.setBounds(138, 52, 153, 20);
		textDocumento.setColumns(10);

		textMedicoCabecera = new JTextField();
		textMedicoCabecera.setBounds(138, 138, 153, 20);
		textMedicoCabecera.setColumns(10);

		chckbxSi = new JCheckBox("Si");
		chckbxSi.setBounds(124, 159, 97, 23);

		JButton btnAgregar = new JButton("Aceptar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				boolean sePudo = guardar();
				if (sePudo)
					dispose();

			}
		});
		btnAgregar.setBounds(177, 208, 89, 23);
		contentPane.setLayout(null);
		contentPane.add(lblNombre);
		contentPane.add(lblDocumento);
		contentPane.add(lblFechaDeNacimiento);
		contentPane.add(lblServicioMedico);
		contentPane.add(lblMedicoDeCabecera);
		contentPane.add(lblFonasa);
		contentPane.add(textNombre);
		contentPane.add(textDocumento);
		contentPane.add(textMedicoCabecera);
		contentPane.add(chckbxSi);
		contentPane.add(btnAgregar);

		comboServicioMedico = new JComboBox();
		comboServicioMedico.setModel(new DefaultComboBoxModel(new String[] { "", "ASOCIACI\u00D3N ESPA\u00D1OLA",
				"CASA DE GALICIA", "CASMU", "C\u00CDRCULO CAT\u00D3LICO", "COSEM", "CUDAM", "GREMCA",
				"HOSPITAL EVANG\u00C9LICO", "M\u00C9DICA URUGUAYA", "SMI", "UNIVERSAL",
				"BLUE CROSS & BLUE SHIELD (Seguro Privado)", "HOSPITAL BRIT\u00C1NICO (Seguro Privado)",
				"MEDICARE (Seguro Privado)", "MP (Seguro Privado)", "PRIM\u00C9DICA (Seguro Privado)",
				"SEGURO AMERICANO (Seguro Privado)", "SUMMUM (Seguro Privado)", "ASSE Montevideo", "OTRO" }));
		comboServicioMedico.setBounds(138, 106, 153, 20);
		contentPane.add(comboServicioMedico);

		JButton btnNewButton = new JButton("Aplicar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean sePudo = guardar();
				if (sePudo)
					limpiar();
			}
		});
		btnNewButton.setBounds(289, 208, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
			}
		});
		btnCancelar.setBounds(63, 208, 89, 23);
		contentPane.add(btnCancelar);

		comboDia = new JComboBox();
		comboDia.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		comboDia.setBounds(138, 81, 41, 20);
		contentPane.add(comboDia);

		comboMes = new JComboBox();
		comboMes.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboMes.setBounds(189, 81, 41, 20);
		contentPane.add(comboMes);

		// Genero array con listado de años desde el actual hasta 1950
		ArrayList<String> years_tmp = new ArrayList<String>();
		for (int years = Calendar.getInstance().get(Calendar.YEAR); years >= 1950; years--) {
			years_tmp.add(years + "");
		}

		comboAño = new JComboBox(years_tmp.toArray());
		comboAño.setBounds(232, 81, 59, 20);
		contentPane.add(comboAño);
	}

	protected boolean guardar() {
		boolean sePudo = false;
		try {
			if (textDocumento.getText().equals(""))
				JOptionPane.showMessageDialog(null, "Falto ingresar cedula");
			else if (comboServicioMedico.getSelectedIndex() == 0)
				JOptionPane.showMessageDialog(null, "Falto seleccionar la sociedad");
			else {
				if (textNombre.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Falto ingresar nombre");
				else {
					sePudo = guardarNiño();

				}
			}

		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "La cedula tiene que ser numero");
		}
		return sePudo;
	}

	protected void limpiar() {
		comboDia.setSelectedIndex(0);
		comboMes.setSelectedIndex(0);
		comboAño.setSelectedIndex(0);
		textDocumento.setText("");
		textMedicoCabecera.setText("");
		textNombre.setText("");
		comboServicioMedico.setSelectedIndex(0);

	}

	protected boolean guardarNiño() {
		try {
			Calendar fechaNacimiento = Calendar.getInstance();

			String nombre = textNombre.getText();
			int documento = Integer.parseInt(textDocumento.getText());
			// Cargo variables con los datos de la fecha
			int dia = Integer.parseInt((String) comboDia.getSelectedItem());
			int mes = Integer.parseInt((String) comboMes.getSelectedItem());
			int año = Integer.parseInt((String) comboAño.getSelectedItem());
			fechaNacimiento.set(Calendar.DAY_OF_MONTH, dia);
			fechaNacimiento.set(Calendar.MONTH, mes);
			fechaNacimiento.set(Calendar.YEAR, año);
			String servicioMedico = (String) comboServicioMedico.getSelectedItem();
			String medicoCabecera = textMedicoCabecera.getText();
			boolean fonasa = chckbxSi.isSelected();

			Niño ni = new Niño(nombre, documento, fechaNacimiento, servicioMedico, medicoCabecera, fonasa,
					coleccion.getMaxRegistro());
			// pruebo objeto niño
			// System.out.println(ni.getNombre() + ni.getDocumento() +
			// ni.getFechaNacimiento() + ni.getServicioMedico() +
			// ni.getMedicoCabecera() + ni.isTieneFonasa());
			boolean valido = coleccion.agregar(ni);
			if (valido) {
				// Lo mismo que hiciste en la ColeccionNiños pero en la interfaz
				// grafica
				JOptionPane.showMessageDialog(null, "El niño ha sido ingresado al sistema correctamente");
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Ya no puede ingresar mas niños al sistema", "ERROR",
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "La cedula tiene que ser numero");
		} catch (NoHayLugarException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return false;
	}
}
