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
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class VInfoPeli {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VInfoPeli window = new VInfoPeli();
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
	public VInfoPeli() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 430, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCinesDeusto = new JLabel("Cines Deusto");
		lblCinesDeusto.setForeground(UIManager.getColor("ColorChooser.background"));
		lblCinesDeusto.setFont(new Font("Yu Gothic UI", Font.BOLD, 45));
		lblCinesDeusto.setBounds(75, 11, 294, 71);
		frame.getContentPane().add(lblCinesDeusto);
		
		JButton btnAtras = new JButton("Cerrar");
		btnAtras.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
			
				frame.dispose();
					
			}
		});
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBackground(new Color(0, 0, 153));
		btnAtras.setBounds(30, 439, 95, 23);
		frame.getContentPane().add(btnAtras);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VAyuda.class.getResource("/imagenes/fondo1bueno.jpg")));
		lblNewLabel.setBounds(0, 0, 475, 93);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VInfoPeli.class.getResource("/imagenes/peli2buena2.jpg")));
		lblNewLabel_1.setBounds(30, 170, 160, 237);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblZombieland = new JLabel("Zombieland2");
		lblZombieland.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblZombieland.setBounds(30, 136, 155, 23);
		frame.getContentPane().add(lblZombieland);
		
		JLabel lblM = new JLabel("M-16");
		lblM.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblM.setBounds(220, 138, 58, 23);
		frame.getContentPane().add(lblM);
		
		JLabel lblNewLabel_2 = new JLabel("98'");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(296, 142, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextArea txtrLaSecuelaVuelve = new JTextArea();
		txtrLaSecuelaVuelve.setText("  \r\n  La secuela vuelve a reu-\r\n  nir al brillante reparto\r\n  original para luchar con-\r\n  tra nuevos tipos de zom-\r\n  bis que han evolucionado\r\n desde la primera pel\u00EDcula,\r\n  as\u00ED como nuevos super-\r\n  vivientes humanos. Pero \r\n  por encima de todo, se \r\n  tendr\u00E1n que enfrentar a \r\n  los problemas de su alo-\r\n  cada e improvisada familia.");
		txtrLaSecuelaVuelve.setBounds(213, 172, 172, 220);
		frame.getContentPane().add(txtrLaSecuelaVuelve);
		
		frame.setLocationRelativeTo(null);
	}
}
