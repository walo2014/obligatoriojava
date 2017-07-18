package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;
import logica.Niño;
import logica.Vacuna;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaVacuna extends JFrame {

	private JPanel contentPane;
	private ColeccionNiños coleccion;
	private Niño niño;
	private JTextField txtCedula;
	private JLabel lblDatos;
	private JComboBox cbxVacuna;
	

	/**
	 * Create the frame.
	 */
	public VentanaVacuna(ColeccionNiños col) {
		setTitle("Vacunas");
		coleccion=col;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNiño = new JLabel("Ni\u00F1o:");
		lblNiño.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNiño.setBounds(10, 29, 44, 14);
		contentPane.add(lblNiño);
		
		JLabel lblNewLabel_1 = new JLabel("Vacuna:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 103, 44, 14);
		contentPane.add(lblNewLabel_1);
		
		
		cbxVacuna = new JComboBox();
		cbxVacuna.setBounds(67, 100, 122, 20);
		contentPane.add(cbxVacuna);
		
		JButton btnAceptar = new JButton("Aplicar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAceptar.setBounds(335, 280, 89, 23);
		contentPane.add(btnAceptar);
		
		JTextArea txtrFdvsf = new JTextArea();
		txtrFdvsf.setSize(new Dimension(3, 3));
		txtrFdvsf.setRows(50);
		txtrFdvsf.setLineWrap(true);
		txtrFdvsf.setBounds(64, 186, 267, 67);
		contentPane.add(txtrFdvsf);
		
		JLabel lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setBounds(60, 161, 112, 14);
		contentPane.add(lblComentarios);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(62, 29, 127, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		niño=null;
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buscarNiño();
				
			}
		});
		btnBuscar.setBounds(220, 25, 89, 23);
		contentPane.add(btnBuscar);
		
		lblDatos = new JLabel("");
		lblDatos.setBounds(60, 54, 364, 23);
		contentPane.add(lblDatos);
		
		
	}
	
	protected void buscarNiño() {
		int cedula=Integer.parseInt(txtCedula.getText());
		niño=coleccion.getDatosNiño(cedula);
		if(niño==null){
			lblDatos.setText("No se encuentra en el sistema");
			
			
		}
		else{
			lblDatos.setText(niño.toString());
Vacuna[] vacunas=niño.listadoVacunas(coleccion.listadoVacunas());
			
			for(int i=0;i<vacunas.length;i++){
				cbxVacuna.addItem(vacunas[i]);
			}
		}
	}
}
