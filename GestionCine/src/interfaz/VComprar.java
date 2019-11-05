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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class VComprar {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VComprar window = new VComprar();
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
	public VComprar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 443, 695);
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
				
				VCartelera nuevaVentana = new VCartelera(); 
				nuevaVentana.frame.setVisible(true);
				
				frame.dispose();
					
			}
		});
		btnAtras.setForeground(new Color(0, 0, 0));
		btnAtras.setBackground(new Color(204, 0, 0));
		btnAtras.setBounds(30, 608, 95, 23);
		frame.getContentPane().add(btnAtras);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(84, 251, 25, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblAyuda = new JLabel("Zombieland 2");
		lblAyuda.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAyuda.setBounds(33, 111, 132, 14);
		frame.getContentPane().add(lblAyuda);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VAyuda.class.getResource("/imagenes/fondo1bueno.jpg")));
		lblNewLabel.setBounds(0, 0, 444, 93);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCineBarakaldo = new JLabel("Cine Barakaldo");
		lblCineBarakaldo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCineBarakaldo.setBounds(33, 125, 106, 32);
		frame.getContentPane().add(lblCineBarakaldo);
		
		JLabel lblElijaSusAsientos = new JLabel("Elija sus asientos:");
		lblElijaSusAsientos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblElijaSusAsientos.setBounds(33, 168, 132, 27);
		frame.getContentPane().add(lblElijaSusAsientos);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnContinuar.setForeground(Color.WHITE);
		btnContinuar.setBackground(new Color(0, 0, 153));
		btnContinuar.setBounds(295, 608, 100, 23);
		frame.getContentPane().add(btnContinuar);
		
		JLabel label = new JLabel("16:20");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(33, 141, 132, 43);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("");
		button.setBounds(116, 251, 25, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(183, 251, 25, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(151, 251, 25, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(317, 251, 25, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBounds(285, 251, 25, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBounds(250, 251, 25, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBounds(218, 251, 25, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBounds(84, 285, 25, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_8.setBounds(116, 285, 25, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(183, 285, 25, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setBounds(151, 285, 25, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(250, 285, 25, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBounds(218, 285, 25, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBounds(317, 285, 25, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(285, 285, 25, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setBounds(317, 353, 25, 23);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setBounds(84, 319, 25, 23);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setBounds(116, 319, 25, 23);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBounds(84, 353, 25, 23);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBackground(new Color(255, 51, 51));
		button_19.setBounds(116, 353, 25, 23);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.setBackground(new Color(255, 51, 51));
		button_20.setBounds(151, 319, 25, 23);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.setBackground(new Color(255, 51, 51));
		button_21.setForeground(new Color(255, 51, 51));
		button_21.setBounds(151, 353, 25, 23);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setBackground(new Color(255, 51, 51));
		button_22.setBounds(183, 319, 25, 23);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBackground(new Color(255, 51, 51));
		button_23.setBounds(183, 353, 25, 23);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("");
		button_24.setBackground(new Color(255, 51, 51));
		button_24.setBounds(218, 319, 25, 23);
		frame.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBackground(new Color(255, 51, 51));
		button_25.setBounds(218, 353, 25, 23);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setBackground(new Color(255, 51, 51));
		button_26.setBounds(250, 319, 25, 23);
		frame.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("");
		button_27.setBackground(new Color(255, 51, 51));
		button_27.setBounds(250, 353, 25, 23);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("");
		button_28.setBounds(285, 353, 25, 23);
		frame.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.setBounds(285, 319, 25, 23);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("");
		button_30.setBounds(317, 319, 25, 23);
		frame.getContentPane().add(button_30);
		
		JButton button_31 = new JButton("");
		button_31.setBounds(317, 486, 25, 23);
		frame.getContentPane().add(button_31);
		
		JButton button_32 = new JButton("");
		button_32.setBounds(285, 486, 25, 23);
		frame.getContentPane().add(button_32);
		
		JButton button_33 = new JButton("");
		button_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_33.setBackground(new Color(50,220,50));
			}
		});
		button_33.setBounds(250, 486, 25, 23);
		frame.getContentPane().add(button_33);
		
		JButton button_34 = new JButton("");
		button_34.setBackground(new Color(255, 51, 51));
		button_34.setBounds(250, 452, 25, 23);
		frame.getContentPane().add(button_34);
		
		JButton button_35 = new JButton("");
		button_35.setBackground(new Color(255, 51, 51));
		button_35.setBounds(218, 452, 25, 23);
		frame.getContentPane().add(button_35);
		
		JButton button_36 = new JButton("");
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_36.setBackground(new Color(50,220,50));
			}
		});
		button_36.setBounds(218, 486, 25, 23);
		frame.getContentPane().add(button_36);
		
		JButton button_37 = new JButton("");
		button_37.setBackground(new Color(255, 51, 51));
		button_37.setBounds(285, 452, 25, 23);
		frame.getContentPane().add(button_37);
		
		JButton button_38 = new JButton("");
		button_38.setBounds(317, 452, 25, 23);
		frame.getContentPane().add(button_38);
		
		JButton button_39 = new JButton("");
		button_39.setBackground(new Color(255, 51, 51));
		button_39.setBounds(317, 418, 25, 23);
		frame.getContentPane().add(button_39);
		
		JButton button_40 = new JButton("");
		button_40.setBounds(317, 384, 25, 23);
		frame.getContentPane().add(button_40);
		
		JButton button_41 = new JButton("");
		button_41.setBackground(new Color(255, 51, 51));
		button_41.setBounds(285, 384, 25, 23);
		frame.getContentPane().add(button_41);
		
		JButton button_42 = new JButton("");
		button_42.setBackground(new Color(255, 51, 51));
		button_42.setBounds(285, 418, 25, 23);
		frame.getContentPane().add(button_42);
		
		JButton button_51 = new JButton("");
		button_51.setBounds(116, 384, 25, 23);
		frame.getContentPane().add(button_51);
		
		JButton button_52 = new JButton("");
		button_52.setBackground(new Color(255, 51, 51));
		button_52.setBounds(116, 418, 25, 23);
		frame.getContentPane().add(button_52);
		
		JButton button_53 = new JButton("");
		button_53.setBackground(new Color(255, 51, 51));
		button_53.setBounds(84, 418, 25, 23);
		frame.getContentPane().add(button_53);
		
		JButton button_54 = new JButton("");
		button_54.setBounds(84, 384, 25, 23);
		frame.getContentPane().add(button_54);
		
		JButton button_55 = new JButton("");
		button_55.setBounds(84, 452, 25, 23);
		frame.getContentPane().add(button_55);
		
		JButton button_56 = new JButton("");
		button_56.setBackground(new Color(255, 51, 51));
		button_56.setBounds(84, 486, 25, 23);
		frame.getContentPane().add(button_56);
		
		JButton button_57 = new JButton("");
		button_57.setBounds(116, 486, 25, 23);
		frame.getContentPane().add(button_57);
		
		JButton button_58 = new JButton("");
		button_58.setBounds(116, 452, 25, 23);
		frame.getContentPane().add(button_58);
		
		JButton button_59 = new JButton("");
		button_59.setBackground(new Color(255, 51, 51));
		button_59.setBounds(151, 452, 25, 23);
		frame.getContentPane().add(button_59);
		
		JButton button_60 = new JButton("");
		button_60.setBounds(151, 486, 25, 23);
		button_60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_60.setBackground(new Color(50,220,50));
			}
		});
		frame.getContentPane().add(button_60);
		
		JButton button_61 = new JButton("");
		button_61.setBackground(new Color(255, 51, 51));
		button_61.setBounds(183, 452, 25, 23);
		frame.getContentPane().add(button_61);
		
		JButton button_62 = new JButton("");
		button_62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_62.setBackground(new Color(50,220,50));
			}
		});
		button_62.setBounds(183, 486, 25, 23);
		frame.getContentPane().add(button_62);
		
		JButton button_63 = new JButton("");
		button_63.setBounds(84, 520, 25, 23);
		frame.getContentPane().add(button_63);
		
		JButton button_64 = new JButton("");
		button_64.setBounds(116, 520, 25, 23);
		frame.getContentPane().add(button_64);
		
		JButton button_65 = new JButton("");
		button_65.setBounds(151, 520, 25, 23);
		frame.getContentPane().add(button_65);
		
		JButton button_66 = new JButton("");
		button_66.setBounds(183, 520, 25, 23);
		frame.getContentPane().add(button_66);
		
		JButton button_67 = new JButton("");
		button_67.setBounds(218, 520, 25, 23);
		frame.getContentPane().add(button_67);
		
		JButton button_68 = new JButton("");
		button_68.setBounds(250, 520, 25, 23);
		frame.getContentPane().add(button_68);
		
		JButton button_69 = new JButton("");
		button_69.setBounds(285, 520, 25, 23);
		frame.getContentPane().add(button_69);
		
		JButton button_70 = new JButton("");
		button_70.setBackground(new Color(255, 51, 51));
		button_70.setBounds(317, 520, 25, 23);
		frame.getContentPane().add(button_70);
		
		JButton button_71 = new JButton("");
		button_71.setBounds(49, 285, 25, 23);
		frame.getContentPane().add(button_71);
		
		JButton button_72 = new JButton("");
		button_72.setBounds(49, 319, 25, 23);
		frame.getContentPane().add(button_72);
		
		JButton button_73 = new JButton("");
		button_73.setBounds(49, 353, 25, 23);
		frame.getContentPane().add(button_73);
		
		JButton button_74 = new JButton("");
		button_74.setBounds(49, 384, 25, 23);
		frame.getContentPane().add(button_74);
		
		JButton button_75 = new JButton("");
		button_75.setBounds(49, 418, 25, 23);
		frame.getContentPane().add(button_75);
		
		JButton button_76 = new JButton("");
		button_76.setBounds(49, 452, 25, 23);
		frame.getContentPane().add(button_76);
		
		JButton button_77 = new JButton("");
		button_77.setBackground(new Color(255, 51, 51));
		button_77.setBounds(49, 486, 25, 23);
		frame.getContentPane().add(button_77);
		
		JButton button_78 = new JButton("");
		button_78.setBounds(49, 520, 25, 23);
		frame.getContentPane().add(button_78);
		
		JButton button_79 = new JButton("");
		button_79.setBounds(352, 285, 25, 23);
		frame.getContentPane().add(button_79);
		
		JButton button_80 = new JButton("");
		button_80.setBounds(352, 319, 25, 23);
		frame.getContentPane().add(button_80);
		
		JButton button_81 = new JButton("");
		button_81.setBounds(352, 353, 25, 23);
		frame.getContentPane().add(button_81);
		
		JButton button_82 = new JButton("");
		button_82.setBounds(352, 384, 25, 23);
		frame.getContentPane().add(button_82);
		
		JButton button_83 = new JButton("");
		button_83.setBackground(new Color(255, 51, 51));
		button_83.setBounds(352, 418, 25, 23);
		frame.getContentPane().add(button_83);
		
		JButton button_84 = new JButton("");
		button_84.setBounds(352, 452, 25, 23);
		frame.getContentPane().add(button_84);
		
		JButton button_85 = new JButton("");
		button_85.setBounds(352, 486, 25, 23);
		frame.getContentPane().add(button_85);
		
		JLabel lblNewLabel_1 = new JLabel("        PANTALLA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(84, 206, 258, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton button_86 = new JButton("");
		button_86.setBackground(new Color(255, 51, 51));
		button_86.setBounds(352, 520, 25, 23);
		frame.getContentPane().add(button_86);
		
		JLabel lblNewLabel_2 = new JLabel("1");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(29, 251, 25, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label_1 = new JLabel("2");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(29, 285, 25, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(29, 319, 25, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(29, 353, 25, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(29, 384, 25, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("6");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(29, 418, 25, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("7");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(29, 452, 25, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("8");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(29, 486, 25, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("9");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setBounds(29, 520, 25, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("1");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_9.setBounds(392, 251, 25, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("2");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setBounds(392, 285, 25, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("3");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_11.setBounds(392, 319, 25, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("9");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_12.setBounds(392, 520, 25, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("8");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_13.setBounds(392, 486, 25, 14);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("7");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_14.setBounds(392, 452, 25, 14);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("6");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_15.setBounds(392, 418, 25, 14);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("5");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_16.setBounds(392, 384, 25, 14);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("4");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_17.setBounds(392, 353, 25, 14);
		frame.getContentPane().add(label_17);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(10, 204, 407, 376);
		frame.getContentPane().add(btnNewButton);
		
		frame.setLocationRelativeTo(null);
	}
}
