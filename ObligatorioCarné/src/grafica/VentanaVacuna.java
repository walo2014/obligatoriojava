package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaVacuna extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaVacuna frame = new VentanaVacuna();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaVacuna() {
		setTitle("Vacunas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		lblNewLabel_1.setBounds(10, 67, 44, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboNiño = new JComboBox();
		comboNiño.setBounds(63, 26, 122, 20);
		contentPane.add(comboNiño);
		
		JComboBox comboVacuna = new JComboBox();
		comboVacuna.setBounds(64, 64, 122, 20);
		contentPane.add(comboVacuna);
		
		JButton btnAceptar = new JButton("Aplicar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAceptar.setBounds(241, 227, 89, 23);
		contentPane.add(btnAceptar);
		
		JTextArea txtrFdvsf = new JTextArea();
		txtrFdvsf.setSize(new Dimension(3, 3));
		txtrFdvsf.setRows(1);
		txtrFdvsf.setLineWrap(true);
		txtrFdvsf.setBounds(63, 149, 267, 67);
		contentPane.add(txtrFdvsf);
		
		JComboBox comboDosis = new JComboBox();
		comboDosis.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboDosis.setBounds(63, 100, 122, 20);
		contentPane.add(comboDosis);
		
		JLabel lblDosis = new JLabel("Dosis:");
		lblDosis.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDosis.setBounds(8, 103, 46, 14);
		contentPane.add(lblDosis);
		
		JLabel lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setBounds(63, 131, 112, 14);
		contentPane.add(lblComentarios);
	}
}
