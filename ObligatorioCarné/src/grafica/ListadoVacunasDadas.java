package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNi�os;
import logica.Ni�o;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListadoVacunasDadas extends JFrame {

	private JPanel contentPane;



	private ColeccionNi�os coleccion;
	private JTextField txtCedula;
	private JList lstVacunas;
	
	public ListadoVacunasDadas(ColeccionNi�os coleccion) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lstVacunas = new JList();
		lstVacunas.setBounds(38, 75, 370, 343);
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
				buscarNi�o();
			}
		});
		btnBuscar.setBounds(230, 36, 89, 23);
		contentPane.add(btnBuscar);
		this.coleccion=coleccion;
	}

	protected void buscarNi�o() {
		int cedula=Integer.parseInt(txtCedula.getText());
		Ni�o ni�o=coleccion.getDatosNi�o(cedula);
		if(ni�o==null){
			JOptionPane.showMessageDialog(null, "El ni�o no esta registrado");
			
		}
		else{
			lstVacunas.setListData(ni�o.listadoVacunas());
		}
		
	}
}
