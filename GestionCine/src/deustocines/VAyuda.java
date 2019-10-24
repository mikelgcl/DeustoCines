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

public class VAyuda {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VAyuda window = new VAyuda();
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
	public VAyuda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCinesDeusto = new JLabel("Cines Deusto");
		lblCinesDeusto.setForeground(UIManager.getColor("ColorChooser.background"));
		lblCinesDeusto.setFont(new Font("Yu Gothic UI", Font.BOLD, 45));
		lblCinesDeusto.setBounds(84, 11, 294, 71);
		frame.getContentPane().add(lblCinesDeusto);
		
		JButton btnAtras = new JButton("Cerrar");
		btnAtras.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
			
				frame.dispose();
					
			}
		});
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBackground(new Color(0, 0, 153));
		btnAtras.setBounds(46, 401, 95, 23);
		frame.getContentPane().add(btnAtras);
		
		JLabel lblMakina = new JLabel("EN PROCESO");
		lblMakina.setFont(new Font("Consolas", Font.BOLD, 50));
		lblMakina.setBounds(84, 146, 320, 65);
		frame.getContentPane().add(lblMakina);
		
		JLabel lblAyuda = new JLabel("Ayuda:");
		lblAyuda.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAyuda.setBounds(46, 118, 58, 14);
		frame.getContentPane().add(lblAyuda);
		
		JLabel label = new JLabel("EN PROCESO");
		label.setFont(new Font("Consolas", Font.BOLD, 50));
		label.setBounds(84, 192, 320, 65);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("EN PROCESO");
		label_1.setFont(new Font("Consolas", Font.BOLD, 50));
		label_1.setBounds(84, 237, 320, 65);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("EN PROCESO");
		label_2.setFont(new Font("Consolas", Font.BOLD, 50));
		label_2.setBounds(84, 282, 320, 65);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("EN PROCESO");
		label_3.setFont(new Font("Consolas", Font.BOLD, 50));
		label_3.setBounds(84, 325, 320, 65);
		frame.getContentPane().add(label_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VAyuda.class.getResource("/imagenes/fondo1bueno.jpg")));
		lblNewLabel.setBounds(0, 0, 444, 93);
		frame.getContentPane().add(lblNewLabel);
		
		frame.setLocationRelativeTo(null);
	}
}
