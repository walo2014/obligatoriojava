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

public class ListadoRegistro extends JFrame {

	private JPanel contentPane;



	private ColeccionNiños coleccion;
	private JTextField txtCedula;
	private JList lstVacunas;
	
	public ListadoRegistro(ColeccionNiños coleccion) {
		setTitle("Listado de registros");
		setBounds(100, 100, 600, 468);
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
		
		JButton btnBuscar = new JButton("buscar");
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
		lstVacunas.setBounds(20, 75, 542, 343);
		contentPane.add(lstVacunas);
		lstVacunas.setModel(new AbstractListModel() {
			String[] values = new String[] {""};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.coleccion=coleccion;
	}

	protected void buscarNiño() {
		int cedula=Integer.parseInt(txtCedula.getText());
		Niño niño=coleccion.getDatosNiño(cedula);
		if(niño==null){
			JOptionPane.showMessageDialog(null, "El niño no esta registrado");
			
		}
		else{
			lstVacunas.setListData(niño.listadoRegistro());
		}
		
	}
}
