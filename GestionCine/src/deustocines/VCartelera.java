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
		frame.setBounds(100, 100, 582, 569);
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
		btnAtrs.setBounds(50, 467, 89, 32);
		frame.getContentPane().add(btnAtrs);
		
		JButton btnNewButton = new JButton("Pel\u00EDcula 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(50, 186, 89, 110);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPelcula_1 = new JButton("Pel\u00EDcula 3");
		btnPelcula_1.setBackground(Color.LIGHT_GRAY);
		btnPelcula_1.setEnabled(false);
		btnPelcula_1.setBounds(50, 327, 89, 110);
		frame.getContentPane().add(btnPelcula_1);
		
		JButton btnPelcula = new JButton("Pel\u00EDcula 2");
		btnPelcula.setBackground(Color.LIGHT_GRAY);
		btnPelcula.setEnabled(false);
		btnPelcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPelcula.setBounds(300, 186, 89, 110);
		frame.getContentPane().add(btnPelcula);
		
		JButton btnPelcula_2 = new JButton("Pel\u00EDcula 4");
		btnPelcula_2.setBackground(Color.LIGHT_GRAY);
		btnPelcula_2.setEnabled(false);
		btnPelcula_2.setBounds(300, 327, 89, 110);
		frame.getContentPane().add(btnPelcula_2);
		
		JLabel lblZombieland = new JLabel("TerraZombi 32");
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
		
		JButton button_3 = new JButton("16:40");
		button_3.setBounds(236, 262, 34, 20);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("16:40");
		button_4.setBounds(192, 262, 34, 20);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("16:40");
		button_5.setBounds(149, 263, 34, 20);
		frame.getContentPane().add(button_5);
		
		JLabel lblFrozen = new JLabel("La hielos");
		lblFrozen.setBounds(149, 331, 79, 14);
		frame.getContentPane().add(lblFrozen);
		
		JLabel lblM_1 = new JLabel("M3");
		lblM_1.setBounds(149, 350, 34, 14);
		frame.getContentPane().add(lblM_1);
		
		JLabel label_3 = new JLabel("84'");
		label_3.setBounds(182, 350, 46, 14);
		frame.getContentPane().add(label_3);
		
		JButton button_6 = new JButton("16:40");
		button_6.setBounds(149, 371, 34, 20);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("16:40");
		button_7.setBounds(192, 370, 34, 20);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("16:40");
		button_8.setBounds(236, 370, 34, 20);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("16:40");
		button_9.setBounds(149, 403, 34, 20);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("16:40");
		button_10.setBounds(192, 402, 34, 20);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("16:40");
		button_11.setBounds(236, 402, 34, 20);
		frame.getContentPane().add(button_11);
		
		JLabel lblJoker = new JLabel("El bromas");
		lblJoker.setBounds(399, 191, 79, 14);
		frame.getContentPane().add(lblJoker);
		
		JLabel label_5 = new JLabel("M18");
		label_5.setBounds(399, 210, 34, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("121'");
		label_6.setBounds(432, 210, 46, 14);
		frame.getContentPane().add(label_6);
		
		JButton button_12 = new JButton("16:40");
		button_12.setBounds(399, 231, 34, 20);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("16:40");
		button_13.setBounds(442, 230, 34, 20);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("16:40");
		button_14.setBounds(486, 230, 34, 20);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("16:40");
		button_15.setBounds(399, 263, 34, 20);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("16:40");
		button_16.setBounds(442, 262, 34, 20);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("16:40");
		button_17.setBounds(486, 262, 34, 20);
		frame.getContentPane().add(button_17);
		
		JLabel lblLosAvengadores = new JLabel("Los Avengadores");
		lblLosAvengadores.setBounds(399, 331, 99, 14);
		frame.getContentPane().add(lblLosAvengadores);
		
		JLabel lblM_2 = new JLabel("M13");
		lblM_2.setBounds(399, 350, 34, 14);
		frame.getContentPane().add(lblM_2);
		
		JLabel label_9 = new JLabel("178'");
		label_9.setBounds(432, 350, 46, 14);
		frame.getContentPane().add(label_9);
		
		JButton button_18 = new JButton("16:40");
		button_18.setBounds(399, 371, 34, 20);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("16:40");
		button_19.setBounds(442, 370, 34, 20);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("16:40");
		button_20.setBounds(486, 370, 34, 20);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("16:40");
		button_21.setBounds(399, 403, 34, 20);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("16:40");
		button_22.setBounds(442, 402, 34, 20);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("16:40");
		button_23.setBounds(486, 402, 34, 20);
		frame.getContentPane().add(button_23);
		
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
		btnNewButton_2.setBounds(149, 467, 99, 32);
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
		btnNewButton_3.setBounds(300, 467, 220, 32);
		frame.getContentPane().add(btnNewButton_3);
		
		frame.setLocationRelativeTo(null);
	}
}
