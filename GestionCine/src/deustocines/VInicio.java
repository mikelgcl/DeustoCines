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

public class VInicio {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VInicio window = new VInicio();
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
	public VInicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 407, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblCinesDeusto = new JLabel("Cines Deusto");
		lblCinesDeusto.setForeground(UIManager.getColor("ColorChooser.background"));
		lblCinesDeusto.setFont(new Font("Yu Gothic UI", Font.BOLD, 45));
		lblCinesDeusto.setBounds(60, 11, 320, 71);
		frame.getContentPane().add(lblCinesDeusto);
		
		textField = new JTextField();
		textField.setBounds(125, 132, 222, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Usuario:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(39, 131, 121, 20);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContrasea.setBounds(39, 182, 160, 14);
		frame.getContentPane().add(lblContrasea);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Gadugi", Font.BOLD, 32));
		button_1.setEnabled(false);
		button_1.setBackground(SystemColor.textHighlight);
		button_1.setBounds(0, -11, 482, 101);
		frame.getContentPane().add(button_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(125, 180, 222, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblError = new JLabel("Usuario y/o contrase\u00F1a incorrectos");
		lblError.setForeground(Color.RED);
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblError.setBounds(125, 207, 171, 12);
		lblError.setVisible(false);
		frame.getContentPane().add(lblError);
		
		JButton button = new JButton("Entrar");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String pass = new String(passwordField.getPassword());
				if (textField.getText().equals("mikeljon") && pass.equals("1234")) {
					VLugar nuevaVentana = new VLugar(); 
					nuevaVentana.frame.setVisible(true);
					
					frame.dispose();
				} else {
					lblError.setVisible(true);
					passwordField.setText("");
				}
				
				
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(SystemColor.textHighlight);
		button.setBounds(39, 244, 121, 20);
		frame.getContentPane().add(button);
		
		JButton button_2 = new JButton("Nuevo Usuario");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VentanaRegistro nuevaVentana = new VentanaRegistro(); 
				nuevaVentana.setVisible(true);
				frame.dispose();
				
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBounds(176, 244, 171, 20);
		frame.getContentPane().add(button_2);
		
	
		
		JLabel label = new JLabel("");
		label.setBounds(83, 205, 46, 14);
		frame.getContentPane().add(label);
		
		frame.setLocationRelativeTo(null);
	}

	
}
