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
import javax.swing.DefaultComboBoxModel;

public class VCarteleraFalsa {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VCarteleraFalsa window = new VCarteleraFalsa();
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
	public VCarteleraFalsa() {
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
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				VLugar nuevaVentana = new VLugar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnAtrs.setForeground(Color.WHITE);
		btnAtrs.setBackground(new Color(0, 0, 153));
		btnAtrs.setBounds(28, 531, 100, 32);
		frame.getContentPane().add(btnAtrs);
		
		JButton btnPelcula_1 = new JButton("");
		btnPelcula_1.setIcon(new ImageIcon(VCarteleraFalsa.class.getResource("/imagenes/peli1buena.jpg")));
		btnPelcula_1.setBackground(Color.LIGHT_GRAY);
		btnPelcula_1.setBounds(29, 180, 99, 143);
		frame.getContentPane().add(btnPelcula_1);
		
		JLabel lblZombieland = new JLabel("Joker");
		lblZombieland.setBounds(149, 191, 79, 14);
		frame.getContentPane().add(lblZombieland);
		
		JLabel lblM = new JLabel("M18");
		lblM.setBounds(149, 210, 34, 14);
		frame.getContentPane().add(lblM);
		
		JLabel label = new JLabel("121'");
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
		
		JLabel lblJoker = new JLabel("Ad Astra");
		lblJoker.setBounds(411, 190, 79, 14);
		frame.getContentPane().add(lblJoker);
		
		JLabel lblM_2 = new JLabel("M7");
		lblM_2.setBounds(411, 209, 34, 14);
		frame.getContentPane().add(lblM_2);
		
		JLabel label_6 = new JLabel("124'");
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
		button_15.setBounds(236, 261, 34, 20);
		frame.getContentPane().add(button_15);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem() == "23/10/2019") {
					
					VCartelera nuevaVentana = new VCartelera(); 
					nuevaVentana.frame.setVisible(true);
					frame.dispose();
					
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"28/10/2019", "23/10/2019", "24/10/2019", "25/10/2019", "26/10/2019", "27/10/2019", "29/10/2019"}));
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
		btnNewButton_3.setBackground(new Color(204, 0, 0));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBounds(411, 531, 121, 32);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton button_24 = new JButton("");
		button_24.setIcon(new ImageIcon(VCarteleraFalsa.class.getResource("/imagenes/peli3buena.jpg")));
		button_24.setBackground(Color.LIGHT_GRAY);
		button_24.setBounds(290, 180, 99, 143);
		frame.getContentPane().add(button_24);
		
		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon(VCarteleraFalsa.class.getResource("/imagenes/peli5buena.jpg")));
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setBounds(29, 359, 99, 143);
		frame.getContentPane().add(button_6);
		
		JButton button_8 = new JButton("16:40");
		button_8.setBounds(149, 414, 34, 20);
		frame.getContentPane().add(button_8);
		
		JLabel lblM_1 = new JLabel("M7");
		lblM_1.setBounds(149, 393, 34, 14);
		frame.getContentPane().add(lblM_1);
		
		JLabel lblAdAstra = new JLabel("La familia Addams");
		lblAdAstra.setBounds(149, 374, 121, 14);
		frame.getContentPane().add(lblAdAstra);
		
		JButton button_9 = new JButton("16:40");
		button_9.setBounds(192, 413, 34, 20);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("16:40");
		button_10.setBounds(236, 413, 34, 20);
		frame.getContentPane().add(button_10);
		
		JLabel label_1 = new JLabel("87'");
		label_1.setBounds(180, 393, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 0, 153));
		lblNewLabel.setIcon(new ImageIcon(VCartelera.class.getResource("/imagenes/fondo1bueno.jpg")));
		lblNewLabel.setBounds(0, 0, 566, 93);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button_1 = new JButton("16:40");
		button_1.setBounds(149, 448, 34, 20);
		frame.getContentPane().add(button_1);
		
		frame.setLocationRelativeTo(null);
	}
}