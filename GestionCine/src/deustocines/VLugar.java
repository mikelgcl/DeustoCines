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
import javax.swing.JProgressBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

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
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		progressBar.setBackground(UIManager.getColor("FormattedTextField.inactiveBackground"));
		progressBar.setBounds(-11, 257, 434, 23);
		progressBar.setValue(0);
		frame.getContentPane().add(progressBar);
		
		JLabel lblCinesDeusto = new JLabel("Cines Deusto");
		lblCinesDeusto.setForeground(UIManager.getColor("ColorChooser.background"));
		lblCinesDeusto.setFont(new Font("Yu Gothic UI", Font.BOLD, 45));
		lblCinesDeusto.setBounds(85, 11, 294, 71);
		frame.getContentPane().add(lblCinesDeusto);
		
		JLabel lblNombre = new JLabel("Elige un cine:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(84, 115, 121, 20);
		frame.getContentPane().add(lblNombre);
		
	
		
		JButton btnCerrarSesin = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VInicio nuevaVentanaInicio = new VInicio(); 
				nuevaVentanaInicio.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCerrarSesin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCerrarSesin.setBounds(189, 200, 150, 33);
		frame.getContentPane().add(btnCerrarSesin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Deusto");
		comboBox.setBounds(84, 146, 255, 27);
		comboBox.addItem("Santurtzi");
		comboBox.addItem("Getxo");
		comboBox.addItem("Barakaldo");
		comboBox.addItem("Basauri");
	
		
		frame.getContentPane().add(comboBox);
		
		//Prueba
		JButton btnEmpezar = new JButton("Empezar");
		btnEmpezar.setForeground(SystemColor.text);
		btnEmpezar.setBackground(new Color(0, 0, 153));
		btnEmpezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Thread hilito = new Thread(new Runnable() {

					@Override
					public void run() {
						for (int i = 0; i <= 1000000; i++) {
							int progreso = 0;
							i = i + i/150000;
							
							progreso = (int)i/10000;
							System.out.println();
							progressBar.setValue(progreso);
							if (progreso == 100) {
								VCartelera nuevaVentana = new VCartelera(); 
								nuevaVentana.frame.setVisible(true);
								frame.dispose();
							}
						}
						
					}
					
				}); 
				hilito.start();
	
			}
		});
		btnEmpezar.setBounds(84, 200, 95, 33);
		frame.getContentPane().add(btnEmpezar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VLugar.class.getResource("/imagenes/fondo1bueno.jpg")));
		lblNewLabel.setBounds(0, 0, 417, 95);
		frame.getContentPane().add(lblNewLabel);
		
		frame.setLocationRelativeTo(null);
	}
}
