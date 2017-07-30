package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import excepciones.ExisteNinioException;
import logica.ColeccionNiños;
import logica.Control;
import logica.Niño;
import logica.Registro;
import logica.RegistroVacuna;
import logica.Vacuna;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class VentanaAgregarControl extends JFrame {

	private JPanel contentPane;
	private JTextField textPeso;
	private JTextField textAltura;
	private JLabel lblNio;
	private JTextArea textArea;
	private JButton btnAplicar;
	private ColeccionNiños coleccion;
	private JTextField txtCedula;
	private JButton btnBuscar;
	private Niño niño;
	private JLabel lblDatos;
	private JComboBox cbxDia;
	private JComboBox cbxMes;
	private JComboBox cbxAño;

	/**
	 * Create the frame.
	 */
	public VentanaAgregarControl(ColeccionNiños col) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\OEM\\Desktop\\cruz.png"));
		setTitle("Control");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		coleccion=col;
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(20, 98, 46, 14);
		contentPane.add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(20, 129, 46, 14);
		contentPane.add(lblAltura);
		
		textPeso = new JTextField();
		textPeso.setBounds(76, 95, 86, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setBounds(76, 214, 86, 14);
		contentPane.add(lblComentarios);
		
		lblNio = new JLabel("Cedula:");
		lblNio.setBounds(10, 39, 46, 14);
		contentPane.add(lblNio);
		
		textArea = new JTextArea();
		textArea.setBounds(76, 228, 179, 75);
		contentPane.add(textArea);
		
		btnAplicar = new JButton("Aplicar");
		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//cargo variable del formulario
				
				int dia=cbxDia.getSelectedIndex()+1;
				int mes=cbxMes.getSelectedIndex()+1;
				int anio=Integer.parseInt(cbxAño.getSelectedItem().toString());
				String comentario = textArea.getText();
				Double peso = Double.parseDouble(textPeso.getText());
				Double altura = Double.parseDouble(textAltura.getText());
				int cedula=Integer.parseInt(txtCedula.getText());

				
				
				Calendar calendario=Calendar.getInstance();
				calendario.set(anio, mes, dia);
				
				//crear objeto control
			Control control = new Control(calendario, comentario, peso, altura);
			
			try {
				
			
				//agrego registro control 
				coleccion.agregarControl(cedula, calendario, comentario, peso, altura);
				JOptionPane.showMessageDialog(null, "Se registro correctamente");
			} catch (ExisteNinioException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
				
				
			}
		});
		btnAplicar.setBounds(166, 335, 89, 23);
		contentPane.add(btnAplicar);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(76, 35, 86, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarNiño();
				
				}
		});
		btnBuscar.setBounds(172, 35, 89, 23);
		contentPane.add(btnBuscar);
		
		lblDatos = new JLabel("");
		lblDatos.setBounds(76, 67, 301, 23);
		contentPane.add(lblDatos);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(10, 154, 414, 49);
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
		
		textAltura = new JTextField();
		textAltura.setBounds(76, 126, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
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
		try {
		if (txtCedula.getText().equals(""))
			JOptionPane.showMessageDialog(null, "Falto ingresar cedula");
		else{
		int cedula=Integer.parseInt(txtCedula.getText());
		niño=coleccion.getDatosNiño(cedula);
		if(niño==null){
			lblDatos.setText("No se encuentra en el sistema");		
			
		}
		else{
			lblDatos.setText(niño.toString());
		}
		}
	}catch (NumberFormatException ex) {
		lblDatos.setText("Error, la cedula debe ser numerica" );
	}{
}
}
}
