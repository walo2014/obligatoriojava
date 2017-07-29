package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;
import logica.Niño;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.ListSelectionModel;

public class ListadoRegistro extends JFrame {

	private JPanel contentPane;

	private ColeccionNiños coleccion;
	private JTextField txtCedula;
	private JList lstVacunas;
	private JLabel lblNombre;
	private JLabel lblFecha;
	private JLabel label;
	private JLabel lblServicio;
	private JLabel lblMedicoCabecera;
	private JLabel lblMensaje;

	public ListadoRegistro(ColeccionNiños coleccion) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\OEM\\Desktop\\cruz.png"));
		setTitle("Listado de registros");
		setBounds(100, 100, 714, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtCedula = new JTextField();
		txtCedula.setBounds(128, 37, 86, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);

		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setBounds(52, 40, 46, 14);
		contentPane.add(lblCedula);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarNiño();
			}
		});
		btnBuscar.setBounds(230, 36, 89, 23);
		contentPane.add(btnBuscar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(158, 192, 2, 2);
		contentPane.add(scrollPane);

		lstVacunas = new JList();
		lstVacunas.setBounds(20, 172, 665, 240);
		contentPane.add(lstVacunas);
		lstVacunas.setModel(new AbstractListModel() {
			String[] values = new String[] { "" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});

		lblNombre = new JLabel("");
		lblNombre.setBounds(20, 68, 237, 23);
		contentPane.add(lblNombre);

		lblFecha = new JLabel("");
		lblFecha.setBounds(20, 102, 237, 23);
		contentPane.add(lblFecha);

		label = new JLabel("");
		label.setBounds(20, 136, 237, 23);
		contentPane.add(label);

		lblServicio = new JLabel("");
		lblServicio.setBounds(283, 70, 237, 23);
		contentPane.add(lblServicio);

		lblMedicoCabecera = new JLabel("");
		lblMedicoCabecera.setBounds(283, 102, 237, 23);
		contentPane.add(lblMedicoCabecera);

		lblMensaje = new JLabel("");
		lblMensaje.setBounds(344, 37, 185, 30);
		contentPane.add(lblMensaje);
		this.coleccion = coleccion;
	}

	protected void buscarNiño() {
		//buscar ingresar cedula, que no sea numerica

		try {
			if (txtCedula.getText().equals(""))
				JOptionPane.showMessageDialog(null, "Falto ingresar cedula");
			else {
				int cedula = Integer.parseInt(txtCedula.getText());

				
				Niño niño = coleccion.getDatosNiño(cedula);
				
				if (niño == null) {
					JOptionPane.showMessageDialog(null, "El niño no esta registrado");

				} else {
					lstVacunas.setListData(niño.listadoRegistro());
					

					lblNombre.setText("Nombre: " + niño.getNombre());
					lblFecha.setText("Fecha de Nacimiento: " + niño.getFechaNacimientoString());
					lblServicio.setText("Servicio Medico: " + niño.getServicioMedico());
					lblMedicoCabecera.setText("Medico de Cabecera: " + niño.getMedicoCabecera());
				}
			}
		} catch (NumberFormatException ex) {
			lblMensaje.setText("Error, la cedula debe ser numerica" );
		}
	}
}