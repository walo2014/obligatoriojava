package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAgregarVacuna extends JFrame {

	private JPanel contentPane;
	private ColeccionNiños coleccion;
	private JTextField textNiño;


	/**
	 * Create the frame.
	 */
	public VentanaAgregarVacuna(ColeccionNiños col) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNiño = new JTextField();
		textNiño.setBounds(52, 41, 176, 20);
		contentPane.add(textNiño);
		textNiño.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				coleccion.getDatosNiño(Integer.parseInt(textNiño.getText()));
				
				
			}
		});
		btnBuscar.setBounds(247, 40, 89, 23);
		contentPane.add(btnBuscar);
		
		JComboBox comboVacuna = new JComboBox();
		comboVacuna.setBounds(52, 83, 176, 20);
		contentPane.add(comboVacuna);
		
		JComboBox comboDosis = new JComboBox();
		comboDosis.setBounds(52, 125, 176, 20);
		contentPane.add(comboDosis);
		
		JButton btnVacunar = new JButton("Vacunar");
		btnVacunar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnVacunar.setBounds(139, 156, 89, 23);
		contentPane.add(btnVacunar);
	}
}
