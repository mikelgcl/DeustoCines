package interfaz;
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

	public static String nomLugar;
	public JFrame frame;
	public static String cine;
	public static String correo2;
	
	

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
		
		JComboBox comboBoxLugar = new JComboBox();
		comboBoxLugar.addItem("Deusto");
		comboBoxLugar.setBounds(84, 146, 255, 27);
		comboBoxLugar.addItem("Santurtzi");
		comboBoxLugar.addItem("Getxo");
		comboBoxLugar.addItem("Barakaldo");
		comboBoxLugar.addItem("Basauri");
	
		
		frame.getContentPane().add(comboBoxLugar);
		
		
		
		//Prueba
		JButton btnEmpezar = new JButton("Empezar");
		btnEmpezar.setForeground(SystemColor.text);
		btnEmpezar.setBackground(new Color(0, 0, 153));
		btnEmpezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nomLugar = comboBoxLugar.getSelectedItem().toString();
				
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
								//cine=(String) comboBox.getSelectedItem();
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
		
		JButton buttonCerrar = new JButton("Cerrar sesi\u00F3n");
		buttonCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VInicio nuevaVentanaInicio = new VInicio(); 
				nuevaVentanaInicio.frame.setVisible(true);
				frame.dispose();
			}
		});
		buttonCerrar.setForeground(Color.BLACK);
		buttonCerrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonCerrar.setBackground(new Color(204, 0, 0));
		buttonCerrar.setBounds(189, 201, 150, 32);
		frame.getContentPane().add(buttonCerrar);
		
		
	
		
		JButton AdminAnadir = new JButton("+++");
		//AdminAnadir.setVisible(false);
		 if (VInicio.v== true) {
			AdminAnadir.setVisible(true);
		}else {
			AdminAnadir.setVisible(false);
		} 
		AdminAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		AdminAnadir.setBackground(new Color(0, 204, 51));
		AdminAnadir.setFont(new Font("Tahoma", Font.BOLD, 12));
		AdminAnadir.setBounds(10, 148, 64, 23);
		frame.getContentPane().add(AdminAnadir);
		
		
		JButton AdminQuitar = new JButton("---");
		//AdminQuitar.setVisible(false);
		if (VInicio.v == true) {
			AdminQuitar.setVisible(true);
		}else {
			AdminQuitar.setVisible(false);
		}
		AdminQuitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AdminQuitar.setFont(new Font("Tahoma", Font.BOLD, 12));
		AdminQuitar.setBackground(new Color(0, 204, 51));
		AdminQuitar.setBounds(349, 148, 58, 23);
		frame.getContentPane().add(AdminQuitar);
		
		frame.setLocationRelativeTo(null);
	}
}
