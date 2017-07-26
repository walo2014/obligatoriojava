package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import excepciones.ExisteNinioException;
import logica.ColeccionNiños;
import logica.Niño;
import logica.Registro;
import logica.RegistroVacuna;
import logica.Vacuna;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Color;

public class VentanaVacuna extends JFrame {

	private JPanel contentPane;
	private ColeccionNiños coleccion;
	private Niño niño;
	private JTextField txtCedula;
	private JLabel lblDatos;
	private JComboBox cbxVacuna;
	private JComboBox cbxDia;
	private JComboBox cbxMes;
	private JComboBox cbxAño;
	private JCheckBox ckxObligatorio;
	private JTextArea txtComentario;
	

	/**
	 * Create the frame.
	 */
	public VentanaVacuna(ColeccionNiños col) {
		setTitle("Vacunas");
		coleccion=col;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNiño = new JLabel("Cedula:");
		lblNiño.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNiño.setBounds(10, 29, 44, 14);
		contentPane.add(lblNiño);
		
		JLabel lblNewLabel_1 = new JLabel("Vacuna:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(0, 84, 54, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnAceptar = new JButton("Aplicar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//cargo variables del formulario
				int dia=cbxDia.getSelectedIndex()+1;
				int mes=cbxMes.getSelectedIndex();
				int anio=Integer.parseInt(cbxAño.getSelectedItem().toString());
				int cedula=Integer.parseInt(txtCedula.getText());
				Calendar calendario=Calendar.getInstance();
				calendario.set(anio, mes, dia);
				
				//creo objeto vacuna
				Vacuna vacuna=new Vacuna(cbxVacuna.getSelectedItem().toString(), ckxObligatorio.isSelected());
				
				
				try {
					
					//agrego registro vacuna
					coleccion.agregarVacuna(cedula, vacuna, calendario, txtComentario.getText());
					JOptionPane.showMessageDialog(null, "Se registro correctamente");
					txtComentario.setText("");
				} catch (ExisteNinioException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
			}
		);
		btnAceptar.setBounds(335, 331, 89, 23);
		contentPane.add(btnAceptar);
		
		txtComentario = new JTextArea();
		txtComentario.setSize(new Dimension(3, 3));
		txtComentario.setRows(50);
		txtComentario.setLineWrap(true);
		txtComentario.setBounds(10, 211, 414, 109);
		contentPane.add(txtComentario);
		
		JLabel lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setBounds(10, 186, 112, 14);
		contentPane.add(lblComentarios);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(62, 29, 136, 20);
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
		
		cbxVacuna = new JComboBox();
		cbxVacuna.setModel(new DefaultComboBoxModel(new String[] {"BCG", "Pentavalente (DPT, HB/Hib)", "Antipolio", "Neumococo13", "Tripe Viral (SRP)", "Varicela", "Hepatitis A"}));
		cbxVacuna.setBounds(64, 81, 134, 20);
		contentPane.add(cbxVacuna);
		
		JButton btnVacunar = new JButton("Vacunar");
		btnVacunar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					//cargo variables del formulario
				int dia=cbxDia.getSelectedIndex()+1;
				int mes=cbxMes.getSelectedIndex();
				int anio=Integer.parseInt(cbxAño.getSelectedItem().toString());
				int cedula=Integer.parseInt(txtCedula.getText());
				Calendar calendario=Calendar.getInstance();
				calendario.set(anio, mes, dia);
				
				//creo objeto vacuna
				Vacuna vacuna=new Vacuna(cbxVacuna.getSelectedItem().toString(), ckxObligatorio.isSelected());
				
				
				try {
					
					//agrego registro vacuna
					coleccion.agregarVacuna(cedula, vacuna, calendario, txtComentario.getText());
					JOptionPane.showMessageDialog(null, "Se registro correctamente");
					setVisible(false);
				} catch (ExisteNinioException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
			
		});
		btnVacunar.setBounds(10, 331, 89, 23);
		contentPane.add(btnVacunar);
		
		ckxObligatorio = new JCheckBox("Obligatorio");
		ckxObligatorio.setBounds(231, 80, 97, 23);
		contentPane.add(ckxObligatorio);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(10, 123, 414, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		
		cbxDia = new JComboBox();
		cbxDia.setBounds(36, 11, 60, 20);
		panel.add(cbxDia);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(10, 14, 46, 14);
		panel.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(133, 14, 46, 14);
		panel.add(lblMes);
		
		cbxMes = new JComboBox();
		cbxMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"}));
		cbxMes.setBounds(169, 11, 66, 20);
		panel.add(cbxMes);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(276, 14, 29, 14);
		panel.add(lblAo);
		
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
