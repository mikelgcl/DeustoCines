package interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;

import baseDeDatos.Usuario;
import baseDeDatos.ZBaseDeDatos;

import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class VInicio {
	
	
	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private final JLabel label_1 = new JLabel("");
	public static String correo ;
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
		ZBaseDeDatos c=new ZBaseDeDatos();
		frame.setBounds(100, 100, 407, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblCinesDeusto = new JLabel("Cines Deusto");
		lblCinesDeusto.setForeground(UIManager.getColor("ColorChooser.background"));
		lblCinesDeusto.setFont(new Font("Yu Gothic UI", Font.BOLD, 45));
		lblCinesDeusto.setBounds(61, 11, 320, 71);
		frame.getContentPane().add(lblCinesDeusto);
		
		textField = new JTextField();
		textField.setBounds(132, 132, 215, 20);
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
		
		passwordField = new JPasswordField();
		passwordField.setBounds(132, 180, 215, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblError = new JLabel("Usuario y/o contrase\u00F1a incorrectos");
		lblError.setForeground(Color.RED);
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblError.setBounds(132, 207, 171, 12);
		lblError.setVisible(false);
		frame.getContentPane().add(lblError);
		
		JButton button = new JButton("Entrar");
		Connection conn=c.initBD("DeustoCines");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String pass = new String(passwordField.getPassword());
				String cor=new String(textField.getText());
				Usuario u=c.iniciarSesion(conn, cor);
				if (u.getCorreo().equals(cor) && u.getContrasenya().equals(pass)) {
					VLugar nuevaVentana = new VLugar(); 
					nuevaVentana.frame.setVisible(true);
					 
					 
					frame.dispose();
					correo=cor;
				} else {
					lblError.setVisible(true);
					passwordField.setText("");
				}
				
				
			
			}
			
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0, 0, 153));
		button.setBounds(39, 244, 121, 20);
		frame.getContentPane().add(button);
		
		JButton button_2 = new JButton("Nuevo Usuario");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VRegistro nuevaVentana = new VRegistro(); 
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
		label_1.setIcon(new ImageIcon(VInicio.class.getResource("/imagenes/fondo1bueno.jpg")));
		label_1.setBounds(0, 0, 391, 98);
		frame.getContentPane().add(label_1);
		
		frame.setLocationRelativeTo(null);
	}

	
}
