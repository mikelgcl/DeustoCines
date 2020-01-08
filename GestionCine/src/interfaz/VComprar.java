package interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.UIManager;



import java.awt.SystemColor;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class VComprar {
	int y;
	int x;
	public JFrame frame;
	public static int asiento;
	public static int conmum=0;
	
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
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				VCartelera nuevaVentana = new VCartelera(); 
				nuevaVentana.frame.setVisible(true);
				
				frame.dispose();
					
			}
		});
		btnCerrar.setForeground(new Color(0, 0, 0));
		btnCerrar.setBackground(new Color(204, 0, 0));
		btnCerrar.setBounds(30, 608, 95, 23);
		frame.getContentPane().add(btnCerrar);
		
	
		
		
		JLabel lblAyuda = new JLabel(VCartelera.peli);
		lblAyuda.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAyuda.setBounds(33, 111, 309, 19);
		frame.getContentPane().add(lblAyuda);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VAyuda.class.getResource("/imagenes/fondo1bueno.jpg")));
		lblNewLabel.setBounds(0, 0, 444, 93);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCineBarakaldo = new JLabel(VLugar.nomLugar);
		lblCineBarakaldo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCineBarakaldo.setBounds(33, 125, 106, 32);
		frame.getContentPane().add(lblCineBarakaldo);
		
		JLabel lblElijaSusAsientos = new JLabel("Elija sus asientos:");
		lblElijaSusAsientos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblElijaSusAsientos.setBounds(33, 168, 174, 27);
		frame.getContentPane().add(lblElijaSusAsientos);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						
				if (conmum <= 8 && conmum != 0) {
					String frase = "Subtotal de "+ conmum*8 +".00 euros, ¿Desea continuar?";
					
					int seleccion = JOptionPane.showOptionDialog(null,frase, "Confirmar selección",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,null, "opcion 2");
						if(seleccion==1 ){
							
					
						
						}
						else{
							
							VPago nuevaVentana = new VPago(); 
							nuevaVentana.frame.setVisible(true);
							
							
							
							frame.dispose();
						}
				} else if (conmum == 0) {
					JOptionPane.showMessageDialog(frame, "Tienes que elegir al menos un asiento ");
				} else {
					JOptionPane.showMessageDialog(frame, "Solo puedes comprar 8 entradas a la vez ");
				}
				
			}	
			
		});
		
		
		
		btnContinuar.setForeground(Color.WHITE);
		btnContinuar.setBackground(new Color(0, 0, 153));
		btnContinuar.setBounds(295, 608, 100, 23);
		frame.getContentPane().add(btnContinuar);
		
		JLabel label = new JLabel(VCartelera.hora);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(33, 141, 132, 43);
		frame.getContentPane().add(label);
		frame.setLocationRelativeTo(null);
		 ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() instanceof JButton) {
					 	asiento=Integer.parseInt(((JButton) e.getSource()).getText());
		                String text = ((JButton) e.getSource()).getText();
		                JOptionPane.showMessageDialog(null, text);
		                ((JButton) e.getSource()).setEnabled(false);
		                //System.out.println(asiento);
		          if (((JButton) e.getSource()).getBackground().equals(new Color(50,220,50))) {
		        	  ((JButton) e.getSource()).setBackground(new Color(255,255,255));conmum=conmum-1;
					} else {
						((JButton) e.getSource()).setBackground(new Color(50,220,50));
							conmum=conmum+1;
							System.out.println(conmum);
						}
		            }
				 
			}
		};
			
		
		JLabel lblNewLabel_1 = new JLabel("        PANTALLA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(84, 183, 258, 55);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(29, 251, 25, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label_1 = new JLabel("2");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(29, 305, 25, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(30, 365, 25, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(30, 416, 25, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_4.setBounds(30, 473, 25, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("6");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_5.setBounds(30, 533, 24, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_9 = new JLabel("1");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_9.setBounds(392, 251, 25, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("2");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_10.setBounds(392, 305, 25, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("3");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_11.setBounds(392, 365, 25, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_15 = new JLabel("6");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_15.setBounds(392, 533, 25, 14);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("5");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_16.setBounds(392, 473, 25, 14);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("4");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_17.setBounds(392, 416, 25, 14);
		frame.getContentPane().add(label_17);
		
		JButton b5 = new JButton("3");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b5.getBackground().equals(new Color(50,220,50))) {
					b5.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b5.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b5.setBackground(SystemColor.activeCaptionBorder);
		b5.setBounds(115, 296, 41, 37);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("1");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b6.getBackground().equals(new Color(50,220,50))) {
					b6.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b6.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b6.setBackground(SystemColor.activeCaptionBorder);
		b6.setBounds(166, 296, 41, 37);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("2");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b7.getBackground().equals(new Color(50,220,50))) {
					b7.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b7.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b7.setBackground(SystemColor.activeCaptionBorder);
		b7.setBounds(216, 296, 41, 37);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("4");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b8.getBackground().equals(new Color(50,220,50))) {
					b8.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b8.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b8.setBackground(SystemColor.activeCaptionBorder);
		b8.setBounds(267, 296, 41, 37);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("5");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b9.getBackground().equals(new Color(50,220,50))) {
					b9.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b9.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b9.setBackground(SystemColor.activeCaptionBorder);
		b9.setBounds(64, 353, 41, 37);
		frame.getContentPane().add(b9);
		
		JButton b10 = new JButton("3");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b10.getBackground().equals(new Color(50,220,50))) {
					b10.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b10.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b10.setBackground(SystemColor.activeCaptionBorder);
		b10.setBounds(115, 353, 41, 37);
		frame.getContentPane().add(b10);
		
		JButton b11 = new JButton("1");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b11.getBackground().equals(new Color(50,220,50))) {
					b11.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b11.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b11.setBackground(SystemColor.activeCaptionBorder);
		b11.setBounds(166, 353, 41, 37);
		frame.getContentPane().add(b11);
		
		JButton b12 = new JButton("2");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b12.getBackground().equals(new Color(50,220,50))) {
					b12.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b12.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b12.setBackground(SystemColor.activeCaptionBorder);
		b12.setBounds(216, 353, 41, 37);
		frame.getContentPane().add(b12);
		
		JButton b13 = new JButton("4");
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b13.getBackground().equals(new Color(50,220,50))) {
					b13.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b13.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b13.setBackground(SystemColor.activeCaptionBorder);
		b13.setBounds(267, 353, 41, 37);
		frame.getContentPane().add(b13);
		
		JButton b14 = new JButton("6");
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b14.getBackground().equals(new Color(50,220,50))) {
					b14.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b14.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b14.setBackground(SystemColor.activeCaptionBorder);
		b14.setBounds(318, 353, 41, 37);
		frame.getContentPane().add(b14);
		
		JButton b15 = new JButton("5");
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b15.getBackground().equals(new Color(50,220,50))) {
					b15.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b15.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b15.setBackground(SystemColor.activeCaptionBorder);
		b15.setBounds(64, 406, 41, 37);
		frame.getContentPane().add(b15);
		
		JButton b16 = new JButton("3");
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b16.getBackground().equals(new Color(50,220,50))) {
					b16.setBackground(SystemColor.activeCaptionBorder);
					
					conmum = conmum - 1;
				} else {
					b16.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b16.setBackground(SystemColor.activeCaptionBorder);
		b16.setBounds(115, 406, 41, 37);
		frame.getContentPane().add(b16);
		
		JButton b17 = new JButton("4");
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b17.getBackground().equals(new Color(50,220,50))) {
					b17.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b17.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b17.setBackground(SystemColor.activeCaptionBorder);
		b17.setBounds(267, 406, 41, 37);
		frame.getContentPane().add(b17);
		
		JButton b18 = new JButton("6");
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b18.getBackground().equals(new Color(50,220,50))) {
					b18.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b18.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b18.setBackground(SystemColor.activeCaptionBorder);
		b18.setBounds(318, 406, 41, 37);
		frame.getContentPane().add(b18);
		
		JButton b19 = new JButton("5");
		b19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b19.getBackground().equals(new Color(50,220,50))) {
					b19.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b19.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b19.setBackground(SystemColor.activeCaptionBorder);
		b19.setBounds(64, 463, 41, 37);
		frame.getContentPane().add(b19);
		
		JButton b20 = new JButton("3");
		b20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b20.getBackground().equals(new Color(50,220,50))) {
					b20.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b20.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b20.setBackground(SystemColor.activeCaptionBorder);
		b20.setBounds(115, 463, 41, 37);
		frame.getContentPane().add(b20);
		
		JButton b21 = new JButton("1");
		b21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b21.getBackground().equals(new Color(50,220,50))) {
					b21.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b21.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b21.setBackground(SystemColor.activeCaptionBorder);
		b21.setBounds(166, 463, 41, 37);
		frame.getContentPane().add(b21);
		
		JButton b22 = new JButton("2");
		b22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b22.getBackground().equals(new Color(50,220,50))) {
					b22.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b22.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b22.setBackground(SystemColor.activeCaptionBorder);
		b22.setBounds(216, 463, 41, 37);
		frame.getContentPane().add(b22);
		
		JButton b23 = new JButton("4");
		b23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b23.getBackground().equals(new Color(50,220,50))) {
					b23.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b23.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b23.setBackground(SystemColor.activeCaptionBorder);
		b23.setBounds(267, 463, 41, 37);
		frame.getContentPane().add(b23);
		
		JButton b24 = new JButton("6");
		b24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b24.getBackground().equals(new Color(50,220,50))) {
					b24.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b24.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b24.setBackground(SystemColor.activeCaptionBorder);
		b24.setBounds(318, 463, 41, 37);
		frame.getContentPane().add(b24);
		
		JButton b25 = new JButton("5");
		b25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b25.getBackground().equals(new Color(50,220,50))) {
					b25.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b25.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b25.setBackground(SystemColor.activeCaptionBorder);
		b25.setBounds(64, 520, 41, 37);
		frame.getContentPane().add(b25);
		
		JButton b26 = new JButton("3");
		b26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b26.getBackground().equals(new Color(50,220,50))) {
					b26.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b26.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b26.setBackground(SystemColor.activeCaptionBorder);
		b26.setBounds(115, 520, 41, 37);
		frame.getContentPane().add(b26);
		
		JButton b27 = new JButton("1");
		b27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b27.getBackground().equals(new Color(50,220,50))) {
					b27.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b27.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b27.setBackground(SystemColor.activeCaptionBorder);
		b27.setBounds(166, 520, 41, 37);
		frame.getContentPane().add(b27);
		
		JButton b28 = new JButton("2");
		b28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b28.getBackground().equals(new Color(50,220,50))) {
					b28.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b28.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b28.setBackground(SystemColor.activeCaptionBorder);
		b28.setBounds(216, 520, 41, 37);
		frame.getContentPane().add(b28);
		
		JButton b29 = new JButton("4");
		b29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b29.getBackground().equals(new Color(50,220,50))) {
					b29.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b29.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b29.setBackground(SystemColor.activeCaptionBorder);
		b29.setBounds(267, 520, 41, 37);
		frame.getContentPane().add(b29);
		
		JButton b30 = new JButton("6");
		b30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b30.getBackground().equals(new Color(50,220,50))) {
					b30.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b30.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b30.setBackground(SystemColor.activeCaptionBorder);
		b30.setBounds(318, 520, 41, 37);
		frame.getContentPane().add(b30);
		
		JButton b1 = new JButton("3");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b1.getBackground().equals(new Color(50,220,50))) {
					b1.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b1.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b1.setBackground(SystemColor.activeCaptionBorder);
		b1.setBounds(115, 240, 41, 37);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("1");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b2.getBackground().equals(new Color(50,220,50))) {
					b2.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b2.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		
		b2.setBackground(SystemColor.activeCaptionBorder);
		b2.setBounds(166, 240, 41, 37);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("2");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b3.getBackground().equals(new Color(50,220,50))) {
					b3.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b3.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b3.setBackground(SystemColor.activeCaptionBorder);
		b3.setBounds(216, 240, 41, 37);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b4.getBackground().equals(new Color(50,220,50))) {
					b4.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else {
					b4.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
				}
			}
		});
		b4.setBackground(SystemColor.activeCaptionBorder);
		b4.setBounds(267, 240, 41, 37);
		frame.getContentPane().add(b4);
		
		frame.setLocationRelativeTo(null);
	}

	}
