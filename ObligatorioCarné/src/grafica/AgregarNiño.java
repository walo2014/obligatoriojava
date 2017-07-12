package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
public class AgregarNiño extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDocumento;
	private JTextField textMedicoCabecera;
	private JComboBox comboServicioMedico;
	private JCheckBox chckbxSi;
	private ColeccionNiños coleccion;
	private JTextField textDia;
	private JTextField textMes;
	private JTextField textAño;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AgregarNiño(ColeccionNiños col) {
		this.coleccion = col;
		setTitle("Agregar ni\u00F1o");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 418, 300);
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
		
		textMedicoCabecera = new JTextField();
		textMedicoCabecera.setBounds(120, 138, 151, 20);
		textMedicoCabecera.setColumns(10);
		
		chckbxSi = new JCheckBox("Si");
		chckbxSi.setBounds(124, 159, 97, 23);
		
		JButton btnAgregar = new JButton("Aceptar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Movi de lugar
				/*Calendar fechaNacimiento = Calendar.getInstance();
				
				
				String nombre = textNombre.getText();
				String documento = textDocumento.getText();
				//Cargo variables con los datos de la fecha
				int dia = Integer.parseInt(textDia.getText());
				int mes = Integer.parseInt(textMes.getText());
				int año = Integer.parseInt(textAño.getText());				
				fechaNacimiento.set(Calendar.DAY_OF_MONTH, dia);
				fechaNacimiento.set(Calendar.MONTH, mes);
				fechaNacimiento.set(Calendar.YEAR, año);
				String servicioMedico = (String)comboServicioMedico.getSelectedItem();
				String medicoCabecera = textMedicoCabecera.getText();
				boolean fonasa = chckbxSi.isSelected();
				
				Niño ni = new Niño(nombre, documento, fechaNacimiento, servicioMedico, medicoCabecera, fonasa,coleccion.getMaxRegistro());
				//pruebo objeto niño
				//System.out.println(ni.getNombre() + ni.getDocumento() + ni.getFechaNacimiento() + ni.getServicioMedico() + ni.getMedicoCabecera() + ni.isTieneFonasa());
				boolean valido=coleccion.agregar(ni);
				if(valido)
				{
					//Lo mismo que hiciste en la ColeccionNiños pero en la interfaz grafica
					JOptionPane.showMessageDialog(null, "El niño ha sido ingresado al sistema correctamente");
				}
				*/
				boolean sePudo=guardarNiño();
				if(sePudo)
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
		comboServicioMedico.setModel(new DefaultComboBoxModel(new String[] {"", "ASOCIACI\u00D3N ESPA\u00D1OLA", "CASA DE GALICIA", "CASMU", "C\u00CDRCULO CAT\u00D3LICO", "COSEM", "CUDAM", "GREMCA", "HOSPITAL EVANG\u00C9LICO", "M\u00C9DICA URUGUAYA", "SMI", "UNIVERSAL", "BLUE CROSS & BLUE SHIELD (Seguro Privado)", "HOSPITAL BRIT\u00C1NICO (Seguro Privado)", "MEDICARE (Seguro Privado)", "MP (Seguro Privado)", "PRIM\u00C9DICA (Seguro Privado)", "SEGURO AMERICANO (Seguro Privado)", "SUMMUM (Seguro Privado)", "ASSE Montevideo", "OTRO"}));
		comboServicioMedico.setBounds(120, 109, 151, 20);
		contentPane.add(comboServicioMedico);
		
		textDia = new JTextField();
		textDia.setBounds(120, 81, 32, 20);
		contentPane.add(textDia);
		textDia.setColumns(10);
		
		textMes = new JTextField();
		textMes.setBounds(162, 81, 32, 20);
		contentPane.add(textMes);
		textMes.setColumns(10);
		
		textAño = new JTextField();
		textAño.setBounds(204, 81, 67, 20);
		contentPane.add(textAño);
		textAño.setColumns(10);
		
		JButton btnNewButton = new JButton("Aplicar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean sePudo=guardarNiño();
				if(sePudo)
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
	}

	protected void limpiar() {
		textAño.setText("");
		textDia.setText("");
		textDocumento.setText("");
		textMedicoCabecera.setText("");
		textNombre.setText("");
		
		
	}

	protected boolean guardarNiño() {
		Calendar fechaNacimiento = Calendar.getInstance();
		
		
		String nombre = textNombre.getText();
		String documento = textDocumento.getText();
		//Cargo variables con los datos de la fecha
		int dia = Integer.parseInt(textDia.getText());
		int mes = Integer.parseInt(textMes.getText());
		int año = Integer.parseInt(textAño.getText());				
		fechaNacimiento.set(Calendar.DAY_OF_MONTH, dia);
		fechaNacimiento.set(Calendar.MONTH, mes);
		fechaNacimiento.set(Calendar.YEAR, año);
		String servicioMedico = (String)comboServicioMedico.getSelectedItem();
		String medicoCabecera = textMedicoCabecera.getText();
		boolean fonasa = chckbxSi.isSelected();
		
		Niño ni = new Niño(nombre, documento, fechaNacimiento, servicioMedico, medicoCabecera, fonasa,coleccion.getMaxRegistro());
		//pruebo objeto niño
		//System.out.println(ni.getNombre() + ni.getDocumento() + ni.getFechaNacimiento() + ni.getServicioMedico() + ni.getMedicoCabecera() + ni.isTieneFonasa());
		boolean valido=coleccion.agregar(ni);
		if(valido)
		{
			//Lo mismo que hiciste en la ColeccionNiños pero en la interfaz grafica
			JOptionPane.showMessageDialog(null, "El niño ha sido ingresado al sistema correctamente");
			return true;
		}
		else{
			JOptionPane.showMessageDialog(null, "Ya no puede ingresar mas niños al sistema","ERROR" ,JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
	}
}
