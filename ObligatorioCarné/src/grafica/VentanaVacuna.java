package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNi�os;
import logica.Ni�o;
import logica.RegistroVacuna;
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
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class VentanaVacuna extends JFrame {

	private JPanel contentPane;
	private ColeccionNi�os coleccion;
	private Ni�o ni�o;
	private JTextField txtCedula;
	private JLabel lblDatos;
	private JComboBox cbxVacuna;
	private JComboBox comboVacuna;
	

	/**
	 * Create the frame.
	 */
	public VentanaVacuna(ColeccionNi�os col) {
		setTitle("Vacunas");
		coleccion=col;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNi�o = new JLabel("Ni\u00F1o:");
		lblNi�o.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNi�o.setBounds(10, 29, 44, 14);
		contentPane.add(lblNi�o);
		
		JLabel lblNewLabel_1 = new JLabel("Vacuna:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 133, 44, 14);
		contentPane.add(lblNewLabel_1);
		
		
		cbxVacuna = new JComboBox();
		cbxVacuna.setBounds(64, 130, 122, 20);
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
		txtrFdvsf.setBounds(65, 211, 267, 67);
		contentPane.add(txtrFdvsf);
		
		JLabel lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setBounds(64, 186, 112, 14);
		contentPane.add(lblComentarios);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(62, 29, 127, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		ni�o=null;
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buscarNi�o();
				
			}
		});
		btnBuscar.setBounds(220, 25, 89, 23);
		contentPane.add(btnBuscar);
		
		lblDatos = new JLabel("");
		lblDatos.setBounds(60, 54, 364, 23);
		contentPane.add(lblDatos);
		
		comboVacuna = new JComboBox();
		comboVacuna.setModel(new DefaultComboBoxModel(new String[] {"BCG", "Pentavante"}));
		comboVacuna.setBounds(64, 81, 122, 20);
		contentPane.add(comboVacuna);
		
		JButton btnVacunar = new JButton("Vacunar");
		btnVacunar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calendar fecha = Calendar.getInstance();
				//String comentario = txtrFdvsf.getText(); 
				
				//HAY QUE HACER UN OBJETO VACUNA PARA AGREGAR AL ARREGLO DE REGISTROS DEL NI�O?
				
				//Vacuna vac = 
			//Registro reg = new RegistroVacuna(fecha, comentario, vacuna);
			
			}
			
		});
		btnVacunar.setBounds(220, 80, 89, 23);
		contentPane.add(btnVacunar);
		
		
	}
	
	protected void buscarNi�o() {
		int cedula=Integer.parseInt(txtCedula.getText());
		ni�o=coleccion.getDatosNi�o(cedula);
		if(ni�o==null){
			lblDatos.setText("No se encuentra en el sistema");		
			
		}
		else{
			lblDatos.setText(ni�o.toString());
Vacuna[] vacunas=ni�o.listadoVacunas(coleccion.listadoVacunas());
			
			for(int i=0;i<vacunas.length;i++){
				cbxVacuna.addItem(vacunas[i]);
			}
		}
	}
}
