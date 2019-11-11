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
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b1.getBackground().equals(new Color(50,220,50))) {
					b1.setBackground(new Color(255,255,255));
				} else {
					b1.setBackground(new Color(50,220,50));
				}
			}
		});
		b1.setBackground(new Color(255, 255, 255));
		b1.setBounds(84, 251, 25, 23);
		frame.getContentPane().add(b1);
		
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
				int seleccion = JOptionPane.showOptionDialog(null,"Subtotal de 24.40 euros, ¿Desea continuar?", "Confirmar selección",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,null, "opcion 2");
					if(seleccion==1 ){
					//Que no pase nah
					}
					else{
						VPago nuevaVentana = new VPago(); 
						nuevaVentana.frame.setVisible(true);
						
						frame.dispose();
					}
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
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b2.getBackground().equals(new Color(50,220,50))) {
					b2.setBackground(new Color(255,255,255));
				} else {
					b2.setBackground(new Color(50,220,50));
				}
			}
		});
		b2.setBackground(new Color(255, 255, 255));
		b2.setBounds(116, 251, 25, 23);
		frame.getContentPane().add(b2);
		
		JButton b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b4.getBackground().equals(new Color(50,220,50))) {
					b4.setBackground(new Color(255,255,255));
				} else {
					b4.setBackground(new Color(50,220,50));
				}
			}
		});
		b4.setBackground(new Color(255, 255, 255));
		b4.setBounds(183, 251, 25, 23);
		frame.getContentPane().add(b4);
		
		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b3.getBackground().equals(new Color(50,220,50))) {
					b3.setBackground(new Color(255,255,255));
				} else {
					b3.setBackground(new Color(50,220,50));
				}
			}
		});
		b3.setBackground(new Color(255, 255, 255));
		b3.setBounds(151, 251, 25, 23);
		frame.getContentPane().add(b3);
		
		JButton b8 = new JButton("");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b8.getBackground().equals(new Color(50,220,50))) {
					b8.setBackground(new Color(255,255,255));
				} else {
					b8.setBackground(new Color(50,220,50));
				}
			}
		});
		b8.setBackground(new Color(255, 255, 255));
		b8.setBounds(317, 251, 25, 23);
		frame.getContentPane().add(b8);
		
		JButton b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b7.getBackground().equals(new Color(50,220,50))) {
					b7.setBackground(new Color(255,255,255));
				} else {
					b7.setBackground(new Color(50,220,50));
				}
			}
		});
		b7.setBackground(new Color(255, 255, 255));
		b7.setBounds(285, 251, 25, 23);
		frame.getContentPane().add(b7);
		
		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b6.getBackground().equals(new Color(50,220,50))) {
					b6.setBackground(new Color(255,255,255));
				} else {
					b6.setBackground(new Color(50,220,50));
				}
			}
		});
		b6.setBackground(new Color(255, 255, 255));
		b6.setBounds(250, 251, 25, 23);
		frame.getContentPane().add(b6);
		
		JButton b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b5.getBackground().equals(new Color(50,220,50))) {
					b5.setBackground(new Color(255,255,255));
				} else {
					b5.setBackground(new Color(50,220,50));
				}
			}
		});
		b5.setBackground(new Color(255, 255, 255));
		b5.setBounds(218, 251, 25, 23);
		frame.getContentPane().add(b5);
		
		JButton b10 = new JButton("");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b10.getBackground().equals(new Color(50,220,50))) {
					b10.setBackground(new Color(255,255,255));
				} else {
					b10.setBackground(new Color(50,220,50));
				}
			}
		});
		b10.setBackground(new Color(255, 255, 255));
		b10.setBounds(84, 285, 25, 23);
		frame.getContentPane().add(b10);
		
		JButton b11 = new JButton("");
		b11.setBackground(new Color(255, 255, 255));
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b11.getBackground().equals(new Color(50,220,50))) {
					b11.setBackground(new Color(255,255,255));
				} else {
					b11.setBackground(new Color(50,220,50));
				}
			}
		});
		b11.setBounds(116, 285, 25, 23);
		frame.getContentPane().add(b11);
		
		JButton b13 = new JButton("");
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b13.getBackground().equals(new Color(50,220,50))) {
					b13.setBackground(new Color(255,255,255));
				} else {
					b13.setBackground(new Color(50,220,50));
				}
			}
		});
		b13.setBackground(new Color(255, 255, 255));
		b13.setBounds(183, 285, 25, 23);
		frame.getContentPane().add(b13);
		
		JButton b12 = new JButton("");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b12.getBackground().equals(new Color(50,220,50))) {
					b12.setBackground(new Color(255,255,255));
				} else {
					b12.setBackground(new Color(50,220,50));
				}
			}
		});
		b12.setBackground(new Color(255, 255, 255));
		b12.setBounds(151, 285, 25, 23);
		frame.getContentPane().add(b12);
		
		JButton b15 = new JButton("");
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b15.getBackground().equals(new Color(50,220,50))) {
					b15.setBackground(new Color(255,255,255));
				} else {
					b15.setBackground(new Color(50,220,50));
				}
			}
		});
		b15.setBackground(new Color(255, 255, 255));
		b15.setBounds(250, 285, 25, 23);
		frame.getContentPane().add(b15);
		
		JButton b14 = new JButton("");
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b14.getBackground().equals(new Color(50,220,50))) {
					b14.setBackground(new Color(255,255,255));
				} else {
					b14.setBackground(new Color(50,220,50));
				}
			}
		});
		b14.setBackground(new Color(255, 255, 255));
		b14.setBounds(218, 285, 25, 23);
		frame.getContentPane().add(b14);
		
		JButton b17 = new JButton("");
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b17.getBackground().equals(new Color(50,220,50))) {
					b17.setBackground(new Color(255,255,255));
				} else {
					b17.setBackground(new Color(50,220,50));
				}
			}
		});
		b17.setBackground(new Color(255, 255, 255));
		b17.setBounds(317, 285, 25, 23);
		frame.getContentPane().add(b17);
		
		JButton b16 = new JButton("");
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b16.getBackground().equals(new Color(50,220,50))) {
					b16.setBackground(new Color(255,255,255));
				} else {
					b16.setBackground(new Color(50,220,50));
				}
			}
		});
		b16.setBackground(new Color(255, 255, 255));
		b16.setBounds(285, 285, 25, 23);
		frame.getContentPane().add(b16);
		
		JButton b37 = new JButton("");
		b37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b37.getBackground().equals(new Color(50,220,50))) {
					b37.setBackground(new Color(255,255,255));
				} else {
					b37.setBackground(new Color(50,220,50));
				}
			}
		
		});
		b37.setBackground(new Color(255, 255, 255));
		b37.setBounds(317, 353, 25, 23);
		frame.getContentPane().add(b37);
		
		JButton b20 = new JButton("");
		b20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b20.getBackground().equals(new Color(50,220,50))) {
					b20.setBackground(new Color(255,255,255));
				} else {
					b20.setBackground(new Color(50,220,50));
				}
			}
		});
		b20.setBackground(new Color(255, 255, 255));
		b20.setBounds(84, 319, 25, 23);
		frame.getContentPane().add(b20);
		
		JButton b21 = new JButton("");
		b21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b21.getBackground().equals(new Color(50,220,50))) {
					b21.setBackground(new Color(255,255,255));
				} else {
					b21.setBackground(new Color(50,220,50));
				}
			}
		});
		b21.setBackground(new Color(255, 255, 255));
		b21.setBounds(116, 319, 25, 23);
		frame.getContentPane().add(b21);
		
		JButton b30 = new JButton("");
		b30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b30.getBackground().equals(new Color(50,220,50))) {
					b30.setBackground(new Color(255,255,255));
				} else {
					b30.setBackground(new Color(50,220,50));
				}
			}
		});
		b30.setBackground(new Color(255, 255, 255));
		b30.setBounds(84, 353, 25, 23);
		frame.getContentPane().add(b30);
		
		JButton b31 = new JButton("");
		b31.setBackground(new Color(255, 51, 51));
		b31.setBounds(116, 353, 25, 23);
		frame.getContentPane().add(b31);
		
		JButton b22 = new JButton("");
		b22.setBackground(new Color(255, 51, 51));
		b22.setBounds(151, 319, 25, 23);
		frame.getContentPane().add(b22);
		
		JButton b32 = new JButton("");
		b32.setBackground(new Color(255, 51, 51));
		b32.setForeground(new Color(255, 51, 51));
		b32.setBounds(151, 353, 25, 23);
		frame.getContentPane().add(b32);
		
		JButton b23 = new JButton("");
		b23.setBackground(new Color(255, 51, 51));
		b23.setBounds(183, 319, 25, 23);
		frame.getContentPane().add(b23);
		
		JButton b33 = new JButton("");
		b33.setBackground(new Color(255, 51, 51));
		b33.setBounds(183, 353, 25, 23);
		frame.getContentPane().add(b33);
		
		JButton b24 = new JButton("");
		b24.setBackground(new Color(255, 51, 51));
		b24.setBounds(218, 319, 25, 23);
		frame.getContentPane().add(b24);
		
		JButton b34 = new JButton("");
		b34.setBackground(new Color(255, 51, 51));
		b34.setBounds(218, 353, 25, 23);
		frame.getContentPane().add(b34);
		
		JButton b25 = new JButton("");
		b25.setBackground(new Color(255, 51, 51));
		b25.setBounds(250, 319, 25, 23);
		frame.getContentPane().add(b25);
		
		JButton b35 = new JButton("");
		b35.setBackground(new Color(255, 51, 51));
		b35.setBounds(250, 353, 25, 23);
		frame.getContentPane().add(b35);
		
		JButton b36 = new JButton("");
		b36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b36.getBackground().equals(new Color(50,220,50))) {
					b36.setBackground(new Color(255,255,255));
				} else {
					b36.setBackground(new Color(50,220,50));
				}
			}
		});
		b36.setBackground(new Color(255, 255, 255));
		b36.setBounds(285, 353, 25, 23);
		frame.getContentPane().add(b36);
		
		JButton b26 = new JButton("");
		b26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b26.getBackground().equals(new Color(50,220,50))) {
					b26.setBackground(new Color(255,255,255));
				} else {
					b26.setBackground(new Color(50,220,50));
				}
			}
		});
		b26.setBackground(new Color(255, 255, 255));
		b26.setBounds(285, 319, 25, 23);
		frame.getContentPane().add(b26);
		
		JButton b27 = new JButton("");
		b27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b27.getBackground().equals(new Color(50,220,50))) {
					b27.setBackground(new Color(255,255,255));
				} else {
					b27.setBackground(new Color(50,220,50));
				}
			}
		});
		b27.setBackground(new Color(255, 255, 255));
		b27.setBounds(317, 319, 25, 23);
		frame.getContentPane().add(b27);
		
		JButton b70 = new JButton("");
		b70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b70.getBackground().equals(new Color(50,220,50))) {
					b70.setBackground(new Color(255,255,255));
				} else {
					b70.setBackground(new Color(50,220,50));
				}
			}
		});
		b70.setBackground(new Color(255, 255, 255));
		b70.setBounds(317, 486, 25, 23);
		frame.getContentPane().add(b70);
		
		JButton b69 = new JButton("");
		b69.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b69.getBackground().equals(new Color(50,220,50))) {
					b69.setBackground(new Color(255,255,255));
				} else {
					b69.setBackground(new Color(50,220,50));
				}
			}
		});
		b69.setBackground(new Color(255, 255, 255));
		b69.setBounds(285, 486, 25, 23);
		frame.getContentPane().add(b69);
		
		JButton b68 = new JButton("");
		b68.setBackground(new Color(255, 255, 255));
		b68.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b68.getBackground().equals(new Color(50,220,50))) {
					b68.setBackground(new Color(255,255,255));
				} else {
					b68.setBackground(new Color(50,220,50));
				}
			}
		});
		b68.setBounds(250, 486, 25, 23);
		frame.getContentPane().add(b68);
		
		JButton b58 = new JButton("");
		b58.setBackground(new Color(255, 51, 51));
		b58.setBounds(250, 452, 25, 23);
		frame.getContentPane().add(b58);
		
		JButton b57 = new JButton("");
		b57.setBackground(new Color(255, 51, 51));
		b57.setBounds(218, 452, 25, 23);
		frame.getContentPane().add(b57);
		
		JButton b67 = new JButton("");
		b67.setBackground(new Color(255, 255, 255));
		b67.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b67.getBackground().equals(new Color(50,220,50))) {
					b67.setBackground(new Color(255,255,255));
				} else {
					b67.setBackground(new Color(50,220,50));
				}
			}
		});
		b67.setBounds(218, 486, 25, 23);
		frame.getContentPane().add(b67);
		
		JButton b59 = new JButton("");
		b59.setBackground(new Color(255, 51, 51));
		b59.setBounds(285, 452, 25, 23);
		frame.getContentPane().add(b59);
		
		JButton b60 = new JButton("");
		b60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b60.getBackground().equals(new Color(50,220,50))) {
					b60.setBackground(new Color(255,255,255));
				} else {
					b60.setBackground(new Color(50,220,50));
				}
			}
		});
		b60.setBackground(new Color(255, 255, 255));
		b60.setBounds(317, 452, 25, 23);
		frame.getContentPane().add(b60);
		
		JButton b50 = new JButton("");
		b50.setBackground(new Color(255, 51, 51));
		b50.setBounds(317, 418, 25, 23);
		frame.getContentPane().add(b50);
		
		JButton b43 = new JButton("");
		b43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b43.getBackground().equals(new Color(50,220,50))) {
					b43.setBackground(new Color(255,255,255));
				} else {
					b43.setBackground(new Color(50,220,50));
				}
			}
		});
		b43.setBackground(new Color(255, 255, 255));
		b43.setBounds(317, 384, 25, 23);
		frame.getContentPane().add(b43);
		
		JButton b42 = new JButton("");
		b42.setBackground(new Color(255, 51, 51));
		b42.setBounds(285, 384, 25, 23);
		frame.getContentPane().add(b42);
		
		JButton b49 = new JButton("");
		b49.setBackground(new Color(255, 51, 51));
		b49.setBounds(285, 418, 25, 23);
		frame.getContentPane().add(b49);
		
		JButton b41 = new JButton("");
		b41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b41.getBackground().equals(new Color(50,220,50))) {
					b41.setBackground(new Color(255,255,255));
				} else {
					b41.setBackground(new Color(50,220,50));
				}
			}
		});
		b41.setBackground(new Color(255, 255, 255));
		b41.setBounds(116, 384, 25, 23);
		frame.getContentPane().add(b41);
		
		JButton b48 = new JButton("");
		b48.setBackground(new Color(255, 51, 51));
		b48.setBounds(116, 418, 25, 23);
		frame.getContentPane().add(b48);
		
		JButton b47 = new JButton("");
		b47.setBackground(new Color(255, 51, 51));
		b47.setBounds(84, 418, 25, 23);
		frame.getContentPane().add(b47);
		
		JButton b40 = new JButton("");
		b40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b40.getBackground().equals(new Color(50,220,50))) {
					b40.setBackground(new Color(255,255,255));
				} else {
					b40.setBackground(new Color(50,220,50));
				}
			}
		});
		b40.setBackground(new Color(255, 255, 255));
		b40.setBounds(84, 384, 25, 23);
		frame.getContentPane().add(b40);
		
		JButton b53 = new JButton("");
		b53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b53.getBackground().equals(new Color(50,220,50))) {
					b53.setBackground(new Color(255,255,255));
				} else {
					b53.setBackground(new Color(50,220,50));
				}
			}
		});
		b53.setBackground(new Color(255, 255, 255));
		b53.setBounds(84, 452, 25, 23);
		frame.getContentPane().add(b53);
		
		JButton b63 = new JButton("");
		b63.setBackground(new Color(255, 51, 51));
		b63.setBounds(84, 486, 25, 23);
		frame.getContentPane().add(b63);
		
		JButton b64 = new JButton("");
		b64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b64.getBackground().equals(new Color(50,220,50))) {
					b64.setBackground(new Color(255,255,255));
				} else {
					b64.setBackground(new Color(50,220,50));
				}
			}
		});
		b64.setBackground(new Color(255, 255, 255));
		b64.setBounds(116, 486, 25, 23);
		frame.getContentPane().add(b64);
		
		JButton b54 = new JButton("");
		b54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b54.getBackground().equals(new Color(50,220,50))) {
					b54.setBackground(new Color(255,255,255));
				} else {
					b54.setBackground(new Color(50,220,50));
				}
			}
		});
		b54.setBackground(new Color(255, 255, 255));
		b54.setBounds(116, 452, 25, 23);
		frame.getContentPane().add(b54);
		
		JButton b55 = new JButton("");
		b55.setBackground(new Color(255, 51, 51));
		b55.setBounds(151, 452, 25, 23);
		frame.getContentPane().add(b55);
		
		JButton b65 = new JButton("");
		b65.setBackground(new Color(255, 255, 255));
		b65.setBounds(151, 486, 25, 23);
		b65.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (b65.getBackground().equals(new Color(50,220,50))) {
					b65.setBackground(new Color(255,255,255));
				} else {
					b65.setBackground(new Color(50,220,50));
				}
					
			}
		});
		
		frame.getContentPane().add(b65);
		
		JButton b56 = new JButton("");
		b56.setBackground(new Color(255, 51, 51));
		b56.setBounds(183, 452, 25, 23);
		frame.getContentPane().add(b56);
		
		JButton b66 = new JButton("");
		b66.setBackground(new Color(255, 255, 255));
		b66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b66.getBackground().equals(new Color(50,220,50))) {
					b66.setBackground(new Color(255,255,255));
				} else {
					b66.setBackground(new Color(50,220,50));
				}
			}
		});
		b66.setBounds(183, 486, 25, 23);
		frame.getContentPane().add(b66);
		
		JButton b73 = new JButton("");
		b73.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b73.getBackground().equals(new Color(50,220,50))) {
					b73.setBackground(new Color(255,255,255));
				} else {
					b73.setBackground(new Color(50,220,50));
				}
			}
		});
		b73.setBackground(new Color(255, 255, 255));
		b73.setBounds(84, 520, 25, 23);
		frame.getContentPane().add(b73);
		
		JButton b74 = new JButton("");
		b74.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b74.getBackground().equals(new Color(50,220,50))) {
					b74.setBackground(new Color(255,255,255));
				} else {
					b74.setBackground(new Color(50,220,50));
				}
			}
		});
		b74.setBackground(new Color(255, 255, 255));
		b74.setBounds(116, 520, 25, 23);
		frame.getContentPane().add(b74);
		
		JButton b75 = new JButton("");
		b75.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b75.getBackground().equals(new Color(50,220,50))) {
					b75.setBackground(new Color(255,255,255));
				} else {
					b75.setBackground(new Color(50,220,50));
				}
			}
		});
		b75.setBackground(new Color(255, 255, 255));
		b75.setBounds(151, 520, 25, 23);
		frame.getContentPane().add(b75);
		
		JButton b76 = new JButton("");
		b76.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b76.getBackground().equals(new Color(50,220,50))) {
					b76.setBackground(new Color(255,255,255));
				} else {
					b76.setBackground(new Color(50,220,50));
				}
			}
		});
		b76.setBackground(new Color(255, 255, 255));
		b76.setBounds(183, 520, 25, 23);
		frame.getContentPane().add(b76);
		
		JButton b77 = new JButton("");
		b77.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b77.getBackground().equals(new Color(50,220,50))) {
					b77.setBackground(new Color(255,255,255));
				} else {
					b77.setBackground(new Color(50,220,50));
				}
			}
		});
		b77.setBackground(new Color(255, 255, 255));
		b77.setBounds(218, 520, 25, 23);
		frame.getContentPane().add(b77);
		
		JButton b78 = new JButton("");
		b78.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b78.getBackground().equals(new Color(50,220,50))) {
					b78.setBackground(new Color(255,255,255));
				} else {
					b78.setBackground(new Color(50,220,50));
				}
			}
		});
		b78.setBackground(new Color(255, 255, 255));
		b78.setBounds(250, 520, 25, 23);
		frame.getContentPane().add(b78);
		
		JButton b79 = new JButton("");
		b79.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b79.getBackground().equals(new Color(50,220,50))) {
					b79.setBackground(new Color(255,255,255));
				} else {
					b79.setBackground(new Color(50,220,50));
				}
			}
		});
		b79.setBackground(new Color(255, 255, 255));
		b79.setBounds(285, 520, 25, 23);
		frame.getContentPane().add(b79);
		
		JButton b80 = new JButton("");
		b80.setBackground(new Color(255, 51, 51));
		b80.setBounds(317, 520, 25, 23);
		frame.getContentPane().add(b80);
		
		JButton b9 = new JButton("");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b9.getBackground().equals(new Color(50,220,50))) {
					b9.setBackground(new Color(255,255,255));
				} else {
					b9.setBackground(new Color(50,220,50));
				}
			}
		});
		b9.setBackground(new Color(255, 255, 255));
		b9.setBounds(49, 285, 25, 23);
		frame.getContentPane().add(b9);
		
		JButton b19 = new JButton("");
		b19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b19.getBackground().equals(new Color(50,220,50))) {
					b19.setBackground(new Color(255,255,255));
				} else {
					b19.setBackground(new Color(50,220,50));
				}
			}
		});
		b19.setBackground(new Color(255, 255, 255));
		b19.setBounds(49, 319, 25, 23);
		frame.getContentPane().add(b19);
		
		JButton b29 = new JButton("");
		b29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b29.getBackground().equals(new Color(50,220,50))) {
					b29.setBackground(new Color(255,255,255));
				} else {
					b29.setBackground(new Color(50,220,50));
				}
			}
		});
		b29.setBackground(new Color(255, 255, 255));
		b29.setBounds(49, 353, 25, 23);
		frame.getContentPane().add(b29);
		
		JButton b39 = new JButton("");
		b39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( b39.getBackground().equals(new Color(50,220,50))) {
					 b39.setBackground(new Color(255,255,255));
				} else {
					 b39.setBackground(new Color(50,220,50));
				}
			}
		});
		b39.setBackground(new Color(255, 255, 255));
		b39.setBounds(49, 384, 25, 23);
		frame.getContentPane().add(b39);
		
		JButton b45 = new JButton("");
		b45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b45.getBackground().equals(new Color(50,220,50))) {
					b45.setBackground(new Color(255,255,255));
				} else {
					b45.setBackground(new Color(50,220,50));
				}
			}
		});
		b45.setBackground(new Color(255, 255, 255));
		b45.setBounds(49, 418, 25, 23);
		frame.getContentPane().add(b45);
		
		JButton b52 = new JButton("");
		b52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b52.getBackground().equals(new Color(50,220,50))) {
					b52.setBackground(new Color(255,255,255));
				} else {
					b52.setBackground(new Color(50,220,50));
				}
			}
		});
		b52.setBackground(new Color(255, 255, 255));
		b52.setBounds(49, 452, 25, 23);
		frame.getContentPane().add(b52);
		
		JButton b62 = new JButton("");
		b62.setBackground(new Color(255, 51, 51));
		b62.setBounds(49, 486, 25, 23);
		frame.getContentPane().add(b62);
		
		JButton b72 = new JButton("");
		b72.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b72.getBackground().equals(new Color(50,220,50))) {
					b72.setBackground(new Color(255,255,255));
				} else {
					b72.setBackground(new Color(50,220,50));
				}
			}
		});
		b72.setBackground(new Color(255, 255, 255));
		b72.setBounds(49, 520, 25, 23);
		frame.getContentPane().add(b72);
		
		JButton b18 = new JButton("");
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b18.getBackground().equals(new Color(50,220,50))) {
					b18.setBackground(new Color(255,255,255));
				} else {
					b18.setBackground(new Color(50,220,50));
				}
			}
		});
		b18.setBackground(new Color(255, 255, 255));
		b18.setBounds(352, 285, 25, 23);
		frame.getContentPane().add(b18);
		
		JButton b28 = new JButton("");
		b28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b28.getBackground().equals(new Color(50,220,50))) {
					b28.setBackground(new Color(255,255,255));
				} else {
					b28.setBackground(new Color(50,220,50));
				}
			}
		});
		b28.setBackground(new Color(255, 255, 255));
		b28.setBounds(352, 319, 25, 23);
		frame.getContentPane().add(b28);
		
		JButton b38 = new JButton("");
		b38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b38.getBackground().equals(new Color(50,220,50))) {
					b38.setBackground(new Color(255,255,255));
				} else {
					b38.setBackground(new Color(50,220,50));
				}
			}
		});
		b38.setBackground(new Color(255, 255, 255));
		b38.setBounds(352, 353, 25, 23);
		frame.getContentPane().add(b38);
		
		JButton b44 = new JButton("");
		b44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b44.getBackground().equals(new Color(50,220,50))) {
					b44.setBackground(new Color(255,255,255));
				} else {
					b44.setBackground(new Color(50,220,50));
				}
			}
		});
		b44.setBackground(new Color(255, 255, 255));
		b44.setBounds(352, 384, 25, 23);
		frame.getContentPane().add(b44);
		
		JButton b51 = new JButton("");
		b51.setBackground(new Color(255, 51, 51));
		b51.setBounds(352, 418, 25, 23);
		frame.getContentPane().add(b51);
		
		JButton b61 = new JButton("");
		b61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b61.getBackground().equals(new Color(50,220,50))) {
					b61.setBackground(new Color(255,255,255));
				} else {
					b61.setBackground(new Color(50,220,50));
				}
			}
		});
		b61.setBackground(new Color(255, 255, 255));
		b61.setBounds(352, 452, 25, 23);
		frame.getContentPane().add(b61);
		
		JButton b71 = new JButton("");
		b71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b71.getBackground().equals(new Color(50,220,50))) {
					b71.setBackground(new Color(255,255,255));
				} else {
					b71.setBackground(new Color(50,220,50));
				}
			}
		});
		b71.setBackground(new Color(255, 255, 255));
		b71.setBounds(352, 486, 25, 23);
		frame.getContentPane().add(b71);
		
		JLabel lblNewLabel_1 = new JLabel("        PANTALLA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(84, 206, 258, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton b81 = new JButton("");
		b81.setBackground(new Color(255, 51, 51));
		b81.setBounds(352, 520, 25, 23);
		frame.getContentPane().add(b81);
		
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
