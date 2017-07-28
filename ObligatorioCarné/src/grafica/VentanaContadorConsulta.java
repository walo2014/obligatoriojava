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
import javax.swing.UIManager;
import java.awt.Toolkit;

public class VentanaContadorConsulta extends JFrame {

	private JPanel contentPane;
	private JButton btnAplicar;
	private ColeccionNiños coleccion;
	private Niño niño;
	private JComboBox cbxDia;
	private JComboBox cbxMes;
	private JComboBox cbxAño;
	private JLabel lblCantidad;

	/**
	 * Create the frame.
	 */
	public VentanaContadorConsulta(ColeccionNiños col) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\OEM\\Desktop\\cruz.png"));
		setTitle("Consultas M\u00E9dicas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		coleccion=col;
		
		JLabel lblComentarios = new JLabel("Cantidad Total :");
		lblComentarios.setBounds(10, 101, 106, 14);
		contentPane.add(lblComentarios);
		
		btnAplicar = new JButton("Calcular");
		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//cargo variable del formulario
				
				int dia=cbxDia.getSelectedIndex()+1;
				int mes=cbxMes.getSelectedIndex();
				int anio=Integer.parseInt(cbxAño.getSelectedItem().toString());

				Calendar calendario=Calendar.getInstance();
				calendario.set(anio, mes, dia);
				
				int cantidad=coleccion.cantidadConsultasAntesFecha(calendario);
				lblCantidad.setText(""+cantidad);
			
			}});
		btnAplicar.setBounds(160, 136, 89, 23);
		contentPane.add(btnAplicar);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		panel.setBounds(10, 21, 414, 49);
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
		
		lblCantidad = new JLabel("");
		lblCantidad.setBounds(126, 101, 46, 14);
		contentPane.add(lblCantidad);
		
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
}
