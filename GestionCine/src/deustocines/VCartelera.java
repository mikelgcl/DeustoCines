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
import javax.swing.ImageIcon;

public class VCartelera {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VCartelera window = new VCartelera();
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
	public VCartelera() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 576, 624);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCinesDeusto = new JLabel("Cines Deusto");
		lblCinesDeusto.setForeground(UIManager.getColor("ColorChooser.background"));
		lblCinesDeusto.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		lblCinesDeusto.setBounds(149, 11, 301, 71);
		frame.getContentPane().add(lblCinesDeusto);
		
		JLabel lblNombre = new JLabel("Cine Barakaldo:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(50, 100, 121, 32);
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
		button_1.setBounds(0, -11, 566, 100);
		frame.getContentPane().add(button_1);
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				VLugar nuevaVentana = new VLugar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnAtrs.setForeground(Color.WHITE);
		btnAtrs.setBackground(SystemColor.textHighlight);
		btnAtrs.setBounds(28, 531, 100, 32);
		frame.getContentPane().add(btnAtrs);
		
		JButton btnPelcula_1 = new JButton("");
		btnPelcula_1.setIcon(new ImageIcon(VCartelera.class.getResource("/imagenes/peli2buena.jpg")));
		btnPelcula_1.setBackground(Color.LIGHT_GRAY);
		btnPelcula_1.setBounds(29, 180, 99, 143);
		frame.getContentPane().add(btnPelcula_1);
		
		JLabel lblZombieland = new JLabel("Zombieland 2");
		lblZombieland.setBounds(149, 191, 79, 14);
		frame.getContentPane().add(lblZombieland);
		
		JLabel lblM = new JLabel("M18");
		lblM.setBounds(149, 210, 34, 14);
		frame.getContentPane().add(lblM);
		
		JLabel label = new JLabel("98'");
		label.setBounds(182, 210, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnNewButton_1 = new JButton("16:40");
		btnNewButton_1.setBounds(149, 231, 34, 20);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton button = new JButton("16:40");
		button.setBounds(192, 230, 34, 20);
		frame.getContentPane().add(button);
		
		JButton button_2 = new JButton("16:40");
		button_2.setBounds(236, 230, 34, 20);
		frame.getContentPane().add(button_2);
		
		JButton button_4 = new JButton("16:40");
		button_4.setBounds(192, 262, 34, 20);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("16:40");
		button_5.setBounds(149, 263, 34, 20);
		frame.getContentPane().add(button_5);
		
		JLabel lblJoker = new JLabel("Joker");
		lblJoker.setBounds(411, 190, 79, 14);
		frame.getContentPane().add(lblJoker);
		
		JLabel label_5 = new JLabel("M18");
		label_5.setBounds(411, 209, 34, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("121'");
		label_6.setBounds(444, 209, 46, 14);
		frame.getContentPane().add(label_6);
		
		JButton button_12 = new JButton("16:40");
		button_12.setBounds(411, 230, 34, 20);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("16:40");
		button_13.setBounds(454, 229, 34, 20);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("16:40");
		button_14.setBounds(498, 229, 34, 20);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("16:40");
		button_15.setBounds(411, 262, 34, 20);
		frame.getContentPane().add(button_15);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(86, 140, 114, 20);
		comboBox.addItem("23/10/2019");
		comboBox.addItem("24/10/2019");
		comboBox.addItem("25/10/2019");
		comboBox.addItem("26/10/2019");
		comboBox.addItem("27/10/2019");
		comboBox.addItem("28/10/2019");
		comboBox.addItem("29/10/2019");
		
		frame.getContentPane().add(comboBox);
		
		JLabel lblDa = new JLabel("D\u00EDa:");
		lblDa.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDa.setBounds(50, 135, 121, 26);
		frame.getContentPane().add(lblDa);
		
		JButton btnNewButton_2 = new JButton("Ayuda");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				VAyuda nuevaVentana = new VAyuda(); 
				nuevaVentana.frame.setVisible(true);
				
				
				
			
			}
		});
		btnNewButton_2.setBounds(149, 531, 99, 32);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cerrar sesi\u00F3n");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				VInicio nuevaVentanaInicio = new VInicio(); 
				nuevaVentanaInicio.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBackground(Color.RED);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBounds(411, 531, 121, 32);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton button_24 = new JButton("");
		button_24.setIcon(new ImageIcon(VCartelera.class.getResource("/imagenes/peli1buena.jpg")));
		button_24.setBackground(Color.LIGHT_GRAY);
		button_24.setBounds(290, 180, 99, 143);
		frame.getContentPane().add(button_24);
		
		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon(VCartelera.class.getResource("/imagenes/peli3buena.jpg")));
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setBounds(29, 359, 99, 143);
		frame.getContentPane().add(button_6);
		
		JButton button_8 = new JButton("16:40");
		button_8.setBounds(149, 414, 34, 20);
		frame.getContentPane().add(button_8);
		
		JLabel lblM_1 = new JLabel("M7");
		lblM_1.setBounds(149, 393, 34, 14);
		frame.getContentPane().add(lblM_1);
		
		JLabel lblAdAstra = new JLabel("Ad Astra");
		lblAdAstra.setBounds(149, 374, 79, 14);
		frame.getContentPane().add(lblAdAstra);
		
		JButton button_9 = new JButton("16:40");
		button_9.setBounds(192, 413, 34, 20);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("16:40");
		button_10.setBounds(236, 413, 34, 20);
		frame.getContentPane().add(button_10);
		
		JButton button_19 = new JButton("");
		button_19.setIcon(new ImageIcon(VCartelera.class.getResource("/imagenes/peli4buena.jpg")));
		button_19.setBackground(Color.LIGHT_GRAY);
		button_19.setBounds(290, 359, 99, 143);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("16:40");
		button_20.setBounds(411, 409, 34, 20);
		frame.getContentPane().add(button_20);
		
		JLabel lblTp = new JLabel("TP");
		lblTp.setBounds(411, 388, 34, 14);
		frame.getContentPane().add(lblTp);
		
		JLabel lblDoraYLa = new JLabel("Dora y la ciudad perdida");
		lblDoraYLa.setBounds(411, 369, 155, 14);
		frame.getContentPane().add(lblDoraYLa);
		
		JLabel label_7 = new JLabel("102'");
		label_7.setBounds(444, 388, 46, 14);
		frame.getContentPane().add(label_7);
		
		JButton button_21 = new JButton("16:40");
		button_21.setBounds(454, 408, 34, 20);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("16:40");
		button_22.setBounds(498, 408, 34, 20);
		frame.getContentPane().add(button_22);
		
		JButton button_25 = new JButton("16:40");
		button_25.setBounds(454, 440, 34, 20);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("16:40");
		button_26.setBounds(411, 441, 34, 20);
		frame.getContentPane().add(button_26);
		
		JLabel label_1 = new JLabel("124'");
		label_1.setBounds(180, 393, 46, 14);
		frame.getContentPane().add(label_1);
		
		frame.setLocationRelativeTo(null);
	}
}
