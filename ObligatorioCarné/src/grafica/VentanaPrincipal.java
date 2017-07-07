package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
//

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNios = new JMenu("Ni\u00F1os");
		menuBar.add(mnNios);
		
		JMenuItem mntmAgregarNio = new JMenuItem("Agregar Ni\u00F1o");
		mntmAgregarNio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarNiño ventana = new AgregarNiño();
				ventana.setVisible(true);
			}
		});
		mnNios.add(mntmAgregarNio);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
