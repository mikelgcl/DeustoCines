package interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class VPago {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VPago window = new VPago();
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
	public VPago() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCinesDeusto = new JLabel("Cines Deusto");
		lblCinesDeusto.setForeground(UIManager.getColor("ColorChooser.background"));
		lblCinesDeusto.setFont(new Font("Yu Gothic UI", Font.BOLD, 45));
		lblCinesDeusto.setBounds(84, 11, 294, 71);
		frame.getContentPane().add(lblCinesDeusto);
		
		JButton btnAtras = new JButton("Cancelar");
		btnAtras.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				int seleccion = JOptionPane.showOptionDialog(null,"¿Está seguro de que desea cancelar su compra?", "",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,null, "opcion 2");
				if(seleccion==1 ){
				//Que no pase nah
				}
				else{
					VCartelera nuevaVentana = new VCartelera(); 
					nuevaVentana.frame.setVisible(true);
					
					frame.dispose();
				}
			
				
					
			}
		});
		btnAtras.setForeground(new Color(0, 0, 0));
		btnAtras.setBackground(new Color(204, 0, 0));
		btnAtras.setBounds(46, 295, 95, 20);
		frame.getContentPane().add(btnAtras);
		
		JLabel lblAyuda = new JLabel("Introduzca sus datos:");
		lblAyuda.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAyuda.setBounds(46, 114, 343, 14);
		frame.getContentPane().add(lblAyuda);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VAyuda.class.getResource("/imagenes/fondo1bueno.jpg")));
		lblNewLabel.setBounds(0, 0, 444, 93);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTitularDeLa = new JLabel("Titular de la tarjeta:");
		lblTitularDeLa.setBounds(46, 143, 139, 14);
		frame.getContentPane().add(lblTitularDeLa);
		
		textField = new JTextField();
		textField.setBounds(173, 140, 216, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero de tarjeta:");
		lblNewLabel_1.setBounds(46, 179, 139, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(173, 176, 216, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo de seguridad:");
		lblNewLabel_2.setBounds(46, 213, 139, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblConfirmarCdigo = new JLabel("Confirmar c\u00F3digo:");
		lblConfirmarCdigo.setBounds(46, 244, 127, 23);
		frame.getContentPane().add(lblConfirmarCdigo);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(173, 210, 48, 20);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(173, 245, 48, 20);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnConfirmarCompra = new JButton("Confirmar compra");
		btnConfirmarCompra.setForeground(new Color(255, 255, 255));
		btnConfirmarCompra.setBackground(new Color(0, 0, 204));
		btnConfirmarCompra.setBounds(243, 295, 146, 20);
		frame.getContentPane().add(btnConfirmarCompra);
		
		frame.setLocationRelativeTo(null);
	}
}
