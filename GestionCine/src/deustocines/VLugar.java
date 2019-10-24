package deustocines;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;



import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class VLugar {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VLugar window = new VLugar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VLugar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 433, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCinesDeusto = new JLabel("Cines Deusto");
		lblCinesDeusto.setForeground(UIManager.getColor("ColorChooser.background"));
		lblCinesDeusto.setFont(new Font("Yu Gothic UI", Font.BOLD, 45));
		lblCinesDeusto.setBounds(84, 11, 294, 71);
		frame.getContentPane().add(lblCinesDeusto);
		
		JLabel lblNombre = new JLabel("Elige un cine:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNombre.setBounds(84, 115, 121, 20);
		frame.getContentPane().add(lblNombre);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Gadugi", Font.BOLD, 32));
		button_1.setEnabled(false);
		button_1.setBackground(SystemColor.textHighlight);
		button_1.setBounds(0, -11, 434, 102);
		frame.getContentPane().add(button_1);
		
		JButton button = new JButton("Entrar");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				VCartelera nuevaVentana = new VCartelera(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
				
				//Meterse en otra ventana
				
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(SystemColor.textHighlight);
		button.setBounds(84, 217, 95, 33);
		frame.getContentPane().add(button);
		
		JButton btnCerrarSesin = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VInicio nuevaVentanaInicio = new VInicio(); 
				nuevaVentanaInicio.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCerrarSesin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCerrarSesin.setBounds(189, 217, 150, 33);
		frame.getContentPane().add(btnCerrarSesin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Deusto");
		comboBox.setBounds(84, 146, 255, 27);
		comboBox.addItem("Santurtzi");
		comboBox.addItem("Getxo");
		comboBox.addItem("Barakaldo");
		comboBox.addItem("Basauri");
	
		
		frame.getContentPane().add(comboBox);
		
		frame.setLocationRelativeTo(null);
	}
}