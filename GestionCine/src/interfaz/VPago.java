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
	private JTextField textTitular;
	private JTextField textNumero;
	private JPasswordField textCodigo;
	private JPasswordField textCodigo2;

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
		
		textTitular = new JTextField();
		textTitular.setBounds(173, 140, 216, 20);
		frame.getContentPane().add(textTitular);
		textTitular.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero de tarjeta:");
		lblNewLabel_1.setBounds(46, 179, 139, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(173, 176, 216, 20);
		frame.getContentPane().add(textNumero);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo de seguridad:");
		lblNewLabel_2.setBounds(46, 213, 139, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblConfirmarCdigo = new JLabel("Confirmar c\u00F3digo:");
		lblConfirmarCdigo.setBounds(46, 244, 127, 23);
		frame.getContentPane().add(lblConfirmarCdigo);
		
		textCodigo = new JPasswordField();
		textCodigo.setBounds(173, 210, 48, 20);
		frame.getContentPane().add(textCodigo);
		
		textCodigo2 = new JPasswordField();
		textCodigo2.setBounds(173, 245, 48, 20);
		frame.getContentPane().add(textCodigo2);
		
		// Etiquetas de error

		JLabel lblErrorTitular = new JLabel("Titular de la tarjeta no v\u00E1lido");
		lblErrorTitular.setForeground(Color.RED);
		lblErrorTitular.setBounds(173, 161, 205, 14);
		lblErrorTitular.setVisible(false);
		frame.getContentPane().add(lblErrorTitular);

		JLabel lblErrorNumero = new JLabel("N\u00FAmero de tarjeta no v\u00E1lido");
		lblErrorNumero.setForeground(Color.RED);
		lblErrorNumero.setBounds(173, 196, 205, 14);
		lblErrorNumero.setVisible(false);
		frame.getContentPane().add(lblErrorNumero);

		JLabel lblErrorCodigo = new JLabel("C\u00F3digo no v\u00E1lido");
		lblErrorCodigo.setForeground(Color.RED);
		lblErrorCodigo.setBounds(173, 230, 205, 14);
		lblErrorCodigo.setVisible(false);
		frame.getContentPane().add(lblErrorCodigo);

		JLabel lblErrorCodigo2 = new JLabel("Los c\u00F3digos no coinciden");
		lblErrorCodigo2.setForeground(Color.RED);
		lblErrorCodigo2.setBounds(173, 265, 205, 14);
		lblErrorCodigo2.setVisible(false);
		frame.getContentPane().add(lblErrorCodigo2);
		
		JButton btnConfirmarCompra = new JButton("Confirmar compra");
		btnConfirmarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				char[] conc = textCodigo.getPassword(); 
				String con = " ";
				char[] conc1 = textCodigo2.getPassword(); 
				String con1 = " ";
				
				con = String.valueOf(conc);
				con1 = String.valueOf(conc1);
				
				if (textTitular.getText().length()>1) {
					lblErrorTitular.setVisible(false);
				} else {
					lblErrorTitular.setVisible(true);
				}
				
				if (textNumero.getText().length()==16) {
					lblErrorNumero.setVisible(false);
				} else {
					lblErrorNumero.setVisible(true);
				}
				
				if (con.length()==3) {
					lblErrorCodigo.setVisible(false);
				} else {
					lblErrorCodigo.setVisible(true);
				}
				
				if (con1.equals(con)) {
					lblErrorCodigo2.setVisible(false);
				} else {
					lblErrorCodigo2.setVisible(true);
				}
				
				if (con1.equals(con) && con.length() == 3 && textNumero.getText().length() == 16 && textTitular.getText().length() >1) {
					int seleccion = JOptionPane.showOptionDialog(null,"¿Está seguro de que desea realizar su compra?", "",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,null, "opcion 2");
					if(seleccion==1 ){
					//Que no pase nah
					}
					else{
						JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
						
						VCartelera nuevaVentana = new VCartelera(); 
						nuevaVentana.frame.setVisible(true);	
						frame.dispose();
					}
				}
				
			}
		});
		 btnConfirmarCompra.setForeground(new Color(255, 255, 255));
		btnConfirmarCompra.setBackground(new Color(0, 0, 204));
		btnConfirmarCompra.setBounds(243, 295, 146, 20);
		frame.getContentPane().add(btnConfirmarCompra);
		
		
		
		frame.setLocationRelativeTo(null);
	}
}
