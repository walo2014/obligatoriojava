package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import excepciones.ExisteNinioException;
import logica.ColeccionNiños;
import logica.Consulta;
import logica.Niño;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Dimension;

public class VentanaAgregarConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField txtMedico;
	private JTextField txtDiagnostico;
	private JTextField txtRecomendaciones;
	private ColeccionNiños coleccion;
	private JTextField txtCedula;
	private Niño niño;
	private JLabel lblDatos;
	private JComboBox cbxDia;
	private JComboBox cbxMes;
	private JComboBox cbxAño;
	private JTextArea txtComentario;
	/**
	 * Create the frame.
	 */
	public VentanaAgregarConsulta(ColeccionNiños col) {
		setTitle("Consulta");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		coleccion = col;
		
		JLabel lblMedico = new JLabel("Medico:");
		lblMedico.setBounds(78, 162, 46, 14);
		contentPane.add(lblMedico);
		
		JLabel lblDiagnostico = new JLabel("Diagnostico:");
		lblDiagnostico.setBounds(54, 187, 75, 14);
		contentPane.add(lblDiagnostico);
		
		JLabel lblRecomendaciones = new JLabel("Recomendaciones:");
		lblRecomendaciones.setBounds(27, 221, 97, 14);
		contentPane.add(lblRecomendaciones);
		
		txtMedico = new JTextField();
		txtMedico.setBounds(127, 159, 117, 20);
		contentPane.add(txtMedico);
		txtMedico.setColumns(10);
		
		txtDiagnostico = new JTextField();
		txtDiagnostico.setBounds(127, 187, 117, 20);
		contentPane.add(txtDiagnostico);
		txtDiagnostico.setColumns(10);
		
		txtRecomendaciones = new JTextField();
		txtRecomendaciones.setBounds(127, 218, 117, 20);
		contentPane.add(txtRecomendaciones);
		txtRecomendaciones.setColumns(10);
		
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Cargo variables del formulario
			String medico = txtMedico.getText();
			String diagnostico = txtDiagnostico.getText();
			String recomendaciones = txtRecomendaciones.getText();
			String comentario = txtComentario.getText();
			int cedula= Integer.parseInt(txtCedula.getText());
			int dia=cbxDia.getSelectedIndex()+1;
			int mes=cbxMes.getSelectedIndex();
			int anio=Integer.parseInt(cbxAño.getSelectedItem().toString());
			Calendar calendario=Calendar.getInstance();
			calendario.set(anio, mes, dia);
			
			//creo objeto consulta
			Consulta consulta = new Consulta(calendario, comentario, medico, diagnostico, recomendaciones);
			
			//Agrego registro consulta
			
			try {
				
				//agrego registro vacuna
				coleccion.agregarConsulta(cedula, calendario, comentario, medico, diagnostico, recomendaciones);
				JOptionPane.showMessageDialog(null, "Se registro correctamente");
			} catch (ExisteNinioException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
			
			}
		});
		btnAplicar.setBounds(345, 316, 89, 23);
		contentPane.add(btnAplicar);
		
		JLabel lblNio = new JLabel("Cedula");
		lblNio.setBounds(71, 35, 46, 14);
		contentPane.add(lblNio);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(128, 32, 117, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buscarNiño();
				
			}
		});
		btnBuscar.setBounds(255, 31, 89, 23);
		contentPane.add(btnBuscar);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.RED);
		panel.setBounds(27, 99, 414, 49);
		contentPane.add(panel);
		
		cbxDia = new JComboBox();
		cbxDia.setBounds(36, 11, 60, 20);
		panel.add(cbxDia);
		
		JLabel label = new JLabel("Dia");
		label.setBounds(10, 14, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Mes");
		label_1.setBounds(133, 14, 46, 14);
		panel.add(label_1);
		
		cbxMes = new JComboBox(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"});
		cbxMes.setBounds(169, 11, 66, 20);
		panel.add(cbxMes);
		
		JLabel label_2 = new JLabel("A\u00F1o");
		label_2.setBounds(276, 14, 29, 14);
		panel.add(label_2);
		
		cbxAño = new JComboBox();
		cbxAño.setBounds(305, 11, 82, 20);
		panel.add(cbxAño);
		
		for(int dia=1;dia<=31;dia++)
		{
			cbxDia.addItem(dia);
		}
		int anio=(new Date().getYear()+1900)-15;
		for(int a=anio;a<=anio+15;a++)
		{
			cbxAño.addItem(a);
		}
		
		
		lblDatos = new JLabel("");
		lblDatos.setBounds(54, 65, 355, 23);
		contentPane.add(lblDatos);
		
		txtComentario = new JTextArea();
		txtComentario.setSize(new Dimension(3, 3));
		txtComentario.setRows(50);
		txtComentario.setLineWrap(true);
		txtComentario.setBounds(41, 264, 270, 75);
		contentPane.add(txtComentario);
		
		JLabel lblComentario = new JLabel("Comentarios:");
		lblComentario.setBounds(59, 246, 112, 14);
		contentPane.add(lblComentario);
	}
	protected void buscarNiño() {
		int cedula=Integer.parseInt(txtCedula.getText());
		niño=coleccion.getDatosNiño(cedula);
		if(niño==null){
			lblDatos.setText("No se encuentra en el sistema");		
			
		}
		else{
			lblDatos.setText(niño.toString());
		}
}
}