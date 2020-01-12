package interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;

import baseDeDatos.ZBaseDeDatos;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class VComprar {
	int y;
	int x;
	public JFrame frame;
	public static int asiento;
	public static String asientos="";
	public static int conmum=0;
	ZBaseDeDatos zb=new ZBaseDeDatos();
	
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
		Connection con=zb.initBD();
		frame = new JFrame();
		frame.setBounds(100, 100, 449, 695);
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
		
	
		String c=null;
		if(VCartelera2.peli!=null) {
		c=VCartelera2.peli;
		}
		if(VCartelera3.peli!=null) {
			c=VCartelera3.peli;
			}
		if(VCartelera.peli!=null) {
			c=VCartelera.peli;
			}
		JLabel lblAyuda = new JLabel(c);
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
		btnContinuar.setBounds(310, 608, 100, 23);
		frame.getContentPane().add(btnContinuar);
		String h=null;
		if(VCartelera2.hora!=null) {
		h=VCartelera2.hora;
		}
		if(VCartelera3.hora!=null) {
			h=VCartelera3.hora;
			}
		if(VCartelera.hora!=null) {
			h=VCartelera.hora;
			}
		JLabel label = new JLabel(h);
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
		label_9.setBounds(398, 251, 25, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("2");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_10.setBounds(398, 305, 25, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("3");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_11.setBounds(398, 365, 25, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_15 = new JLabel("6");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_15.setBounds(398, 533, 25, 14);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("5");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_16.setBounds(398, 473, 25, 14);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("4");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_17.setBounds(398, 416, 25, 14);
		frame.getContentPane().add(label_17);
		
		JButton b5 = new JButton("5");
		if(zb.getasiento(con, "5")==1) {
			b5.setBackground(new Color(254,000,000));
		}else  {
			b5.setBackground(SystemColor.activeCaptionBorder);
		}
		
		b5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b5.getBackground().equals(new Color(50,220,50))) {
					
					zb.updateasiento(con,0, "5");
					b5.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else if(b5.getBackground().equals(SystemColor.activeCaptionBorder)) {
					
					zb.updateasiento(con, 1, "5");
					b5.setBackground(new Color(50,220,50));
					asientos=asientos+" "+b5.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b5.setBounds(115, 296, 50, 37);
		frame.getContentPane().add(b5);
		
		
		JButton b6 = new JButton("6");
		if(zb.getasiento(con, "6")==1) {
			b6.setBackground(new Color(254,000,000));
		}else  {
			b6.setBackground(SystemColor.activeCaptionBorder);
		}
		b6.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b6.getBackground().equals(new Color(50,220,50))) {
					b6.setBackground(SystemColor.activeCaptionBorder);
					
					zb.updateasiento(con,0, "6");
					conmum = conmum - 1;
				} else if(b6.getBackground().equals(SystemColor.activeCaptionBorder)){
					b6.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "6");
					asientos=asientos+" "+b6.getText();
					
					conmum = conmum + 1;
				}
			}
		});
		
		b6.setBounds(166, 296, 50, 37);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("7");
		if(zb.getasiento(con, "7")==1) {
			b7.setBackground(new Color(254,000,000));
		}else  {
			b7.setBackground(SystemColor.activeCaptionBorder);
		}
		b7.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b7.getBackground().equals(new Color(50,220,50))) {
					b7.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "7");
					conmum = conmum - 1;
				} else if(b7.getBackground().equals(SystemColor.activeCaptionBorder)){
					b7.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
					zb.updateasiento(con, 1, "7");
					asientos=asientos+" "+b7.getText();
				}
			}
		});
		
		b7.setBounds(216, 296, 50, 37);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		if(zb.getasiento(con, "8")==1) {
			b8.setBackground(new Color(254,000,000));
		}else  {
			b8.setBackground(SystemColor.activeCaptionBorder);
		}
		b8.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b8.getBackground().equals(new Color(50,220,50))) {
					b8.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "8");
					conmum = conmum - 1;
				} else if(b8.getBackground().equals(SystemColor.activeCaptionBorder)){
					b8.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "8");
					asientos=asientos+" "+b8.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b8.setBounds(267, 296, 50, 37);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		if(zb.getasiento(con, "9")==1) {
			b9.setBackground(new Color(254,000,000));
		}else  {
			b9.setBackground(SystemColor.activeCaptionBorder);
		}
		b9.setFont(new Font("Tahoma", Font.PLAIN, 9));
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b9.getBackground().equals(new Color(50,220,50))) {
					zb.updateasiento(con,0, "9");
					b9.setBackground(SystemColor.activeCaptionBorder);
					conmum = conmum - 1;
				} else if(b9.getBackground().equals(SystemColor.activeCaptionBorder)){
					b9.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "9");
					asientos=asientos+" "+b9.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b9.setBounds(64, 353, 50, 37);
		frame.getContentPane().add(b9);
		
		JButton b10 = new JButton("10");
		if(zb.getasiento(con, "10")==1) {
			b10.setBackground(new Color(254,000,000));
		}else  {
			b10.setBackground(SystemColor.activeCaptionBorder);
		}
		b10.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b10.getBackground().equals(new Color(50,220,50))) {
					b10.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "10");
					conmum = conmum - 1;
				} else if(b10.getBackground().equals(SystemColor.activeCaptionBorder)){
					b10.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "10");
					asientos=asientos+" "+b10.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b10.setBounds(115, 353, 50, 37);
		frame.getContentPane().add(b10);
		
		JButton b11 = new JButton("11");
		if(zb.getasiento(con, "11")==1) {
			b11.setBackground(new Color(254,000,000));
		}else  {
			b11.setBackground(SystemColor.activeCaptionBorder);
		}
		b11.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b11.getBackground().equals(new Color(50,220,50))) {
					b11.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "11");
					conmum = conmum - 1;
				} else if(b11.getBackground().equals(SystemColor.activeCaptionBorder)){
					b11.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "11");
					asientos=asientos+" "+b11.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b11.setBounds(166, 353, 50, 37);
		frame.getContentPane().add(b11);
		
		JButton b12 = new JButton("12");
		if(zb.getasiento(con, "12")==1) {
			b12.setBackground(new Color(254,000,000));
		}else  {
			b12.setBackground(SystemColor.activeCaptionBorder);
		}
		b12.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b12.getBackground().equals(new Color(50,220,50))) {
					b12.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "12");
					conmum = conmum - 1;
					
				} else if(b12.getBackground().equals(SystemColor.activeCaptionBorder)){
					b12.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "12");
					asientos=asientos+" "+b12.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b12.setBounds(216, 353, 50, 37);
		frame.getContentPane().add(b12);
		
		JButton b13 = new JButton("13");
		if(zb.getasiento(con, "13")==1) {
			b13.setBackground(new Color(254,000,000));
		}else  {
			b13.setBackground(SystemColor.activeCaptionBorder);
		}
		b13.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b13.getBackground().equals(new Color(50,220,50))) {
					b13.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "13");
					conmum = conmum - 1;
				} else if(b13.getBackground().equals(SystemColor.activeCaptionBorder)){
					b13.setBackground(new Color(50,220,50));
					conmum = conmum + 1;
					asientos=asientos+" "+b13.getText();
					zb.updateasiento(con, 1, "13");
				}
			}
		});
		
		b13.setBounds(267, 353, 50, 37);
		frame.getContentPane().add(b13);
		
		JButton b14 = new JButton("14");
		if(zb.getasiento(con, "14")==1) {
			b14.setBackground(new Color(254,000,000));
		}else  {
			b14.setBackground(SystemColor.activeCaptionBorder);
		}
		b14.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b14.getBackground().equals(new Color(50,220,50))) {
					b14.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "14");
					conmum = conmum - 1;
				} else if(b14.getBackground().equals(SystemColor.activeCaptionBorder)){
					b14.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "14");
					asientos=asientos+" "+b14.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b14.setBounds(318, 353, 50, 37);
		frame.getContentPane().add(b14);
		
		JButton b15 = new JButton("15");
		if(zb.getasiento(con, "15")==1) {
			b15.setBackground(new Color(254,000,000));
		}else  {
			b15.setBackground(SystemColor.activeCaptionBorder);
		}
		b15.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b15.getBackground().equals(new Color(50,220,50))) {
					b15.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "15");
					conmum = conmum - 1;
				} else if(b15.getBackground().equals(SystemColor.activeCaptionBorder)){
					b15.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "15");
					asientos=asientos+" "+b15.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b15.setBounds(64, 406, 50, 37);
		frame.getContentPane().add(b15);
		
		JButton b16 = new JButton("16");
		if(zb.getasiento(con, "16")==1) {
			b16.setBackground(new Color(254,000,000));
		}else  {
			b16.setBackground(SystemColor.activeCaptionBorder);
		}
		b16.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b16.getBackground().equals(new Color(50,220,50))) {
					b16.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "16");
					conmum = conmum - 1;
				} else if(b16.getBackground().equals(SystemColor.activeCaptionBorder)){
					b16.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "16");
					asientos=asientos+" "+b16.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b16.setBounds(115, 406, 50, 37);
		frame.getContentPane().add(b16);
		
		JButton b17 = new JButton("17");
		if(zb.getasiento(con, "17")==1) {
			b17.setBackground(new Color(254,000,000));
		}else  {
			b17.setBackground(SystemColor.activeCaptionBorder);
		}
		b17.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b17.getBackground().equals(new Color(50,220,50))) {
					b17.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "17");
					conmum = conmum - 1;
				} else if(b17.getBackground().equals(SystemColor.activeCaptionBorder)){
					b17.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "17");
					asientos=asientos+" "+b17.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b17.setBounds(267, 406, 50, 37);
		frame.getContentPane().add(b17);
		
		JButton b18 = new JButton("18");
		if(zb.getasiento(con, "18")==1) {
			b18.setBackground(new Color(254,000,000));
		}else  {
			b18.setBackground(SystemColor.activeCaptionBorder);
		}
		b18.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b18.getBackground().equals(new Color(50,220,50))) {
					b18.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "18");
					conmum = conmum - 1;
				} else if(b18.getBackground().equals(SystemColor.activeCaptionBorder)){
					b18.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "18");
					asientos=asientos+" "+b18.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b18.setBounds(318, 406, 50, 37);
		frame.getContentPane().add(b18);
		
		JButton b19 = new JButton("19");
		if(zb.getasiento(con, "19")==1) {
			b19.setBackground(new Color(254,000,000));
		}else  {
			b19.setBackground(SystemColor.activeCaptionBorder);
		}
		b19.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b19.getBackground().equals(new Color(50,220,50))) {
					b19.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "19");
					conmum = conmum - 1;
				} else if(b19.getBackground().equals(SystemColor.activeCaptionBorder)){
					b19.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "19");
					asientos=asientos+" "+b19.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b19.setBounds(64, 463, 50, 37);
		frame.getContentPane().add(b19);
		
		JButton b20 = new JButton("20");
		if(zb.getasiento(con, "20")==1) {
			b20.setBackground(new Color(254,000,000));
		}else  {
			b20.setBackground(SystemColor.activeCaptionBorder);
		}
		b20.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b20.getBackground().equals(new Color(50,220,50))) {
					b20.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "20");
					conmum = conmum - 1;
				} else if(b20.getBackground().equals(SystemColor.activeCaptionBorder)){
					b20.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "20");
					asientos=asientos+" "+b20.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b20.setBounds(115, 463, 50, 37);
		frame.getContentPane().add(b20);
		
		JButton b21 = new JButton("21");
		if(zb.getasiento(con, "21")==1) {
			b21.setBackground(new Color(254,000,000));
		}else  {
			b21.setBackground(SystemColor.activeCaptionBorder);
		}
		b21.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b21.getBackground().equals(new Color(50,220,50))) {
					b21.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "21");
					conmum = conmum - 1;
				} else if(b21.getBackground().equals(SystemColor.activeCaptionBorder)){
					b21.setBackground(new Color(50,220,50));
					asientos=asientos+" "+b21.getText();
					zb.updateasiento(con, 1, "21");
					conmum = conmum + 1;
				}
			}
		});
		
		b21.setBounds(166, 463, 50, 37);
		frame.getContentPane().add(b21);
		
		JButton b22 = new JButton("22");
		if(zb.getasiento(con, "22")==1) {
			b22.setBackground(new Color(254,000,000));
		}else  {
			b22.setBackground(SystemColor.activeCaptionBorder);
		}
		b22.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b22.getBackground().equals(new Color(50,220,50))) {
					b22.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "22");
					conmum = conmum - 1;
				} else if(b22.getBackground().equals(SystemColor.activeCaptionBorder)){
					b22.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "22");
					asientos=asientos+" "+b22.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b22.setBounds(216, 463, 50, 37);
		frame.getContentPane().add(b22);
		
		JButton b23 = new JButton("23");
		if(zb.getasiento(con, "23")==1) {
			b23.setBackground(new Color(254,000,000));
		}else  {
			b23.setBackground(SystemColor.activeCaptionBorder);
		}
		b23.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b23.getBackground().equals(new Color(50,220,50))) {
					b23.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "23");
					conmum = conmum - 1;
				} else if(b23.getBackground().equals(SystemColor.activeCaptionBorder)){
					b23.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "23");
					asientos=asientos+b23.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b23.setBounds(267, 463, 50, 37);
		frame.getContentPane().add(b23);
		
		JButton b24 = new JButton("24");
		if(zb.getasiento(con, "24")==1) {
			b24.setBackground(new Color(254,000,000));
		}else  {
			b24.setBackground(SystemColor.activeCaptionBorder);
		}
		b24.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b24.getBackground().equals(new Color(50,220,50))) {
					b24.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "24");
					conmum = conmum - 1;
				} else if(b24.getBackground().equals(SystemColor.activeCaptionBorder)){
					b24.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "24");
					asientos=asientos+" "+b24.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b24.setBounds(318, 463, 50, 37);
		frame.getContentPane().add(b24);
		
		JButton b25 = new JButton("25");
		if(zb.getasiento(con, "25")==1) {
			b25.setBackground(new Color(254,000,000));
		}else  {
			b25.setBackground(SystemColor.activeCaptionBorder);
		}
		b25.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b25.getBackground().equals(new Color(50,220,50))) {
					b25.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "25");
					conmum = conmum - 1;
				} else if(b25.getBackground().equals(SystemColor.activeCaptionBorder)){
					b25.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "25");
					asientos=asientos+" "+b25.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b25.setBounds(64, 520, 50, 37);
		frame.getContentPane().add(b25);
		
		JButton b26 = new JButton("26");
		if(zb.getasiento(con, "26")==1) {
			b26.setBackground(new Color(254,000,000));
		}else  {
			b26.setBackground(SystemColor.activeCaptionBorder);
		}
		b26.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b26.getBackground().equals(new Color(50,220,50))) {
					b26.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "26");
					conmum = conmum - 1;
				} else if(b26.getBackground().equals(SystemColor.activeCaptionBorder)){
					b26.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "26");
					asientos=asientos+" "+b26.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b26.setBounds(115, 520, 50, 37);
		frame.getContentPane().add(b26);
		
		JButton b27 = new JButton("27");
		if(zb.getasiento(con, "27")==1) {
			b27.setBackground(new Color(254,000,000));
		}else  {
			b27.setBackground(SystemColor.activeCaptionBorder);
		}
		b27.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b27.getBackground().equals(new Color(50,220,50))) {
					b27.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "27");
					conmum = conmum - 1;
				} else if(b27.getBackground().equals(SystemColor.activeCaptionBorder)){
					b27.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "27");
					asientos=asientos+" "+b27.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b27.setBounds(166, 520, 50, 37);
		frame.getContentPane().add(b27);
		
		JButton b28 = new JButton("28");
		if(zb.getasiento(con, "28")==1) {
			b28.setBackground(new Color(254,000,000));
		}else  {
			b28.setBackground(SystemColor.activeCaptionBorder);
		}
		b28.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b28.getBackground().equals(new Color(50,220,50))) {
					b28.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "28");
					conmum = conmum - 1;
				} else if(b28.getBackground().equals(SystemColor.activeCaptionBorder)){
					b28.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "28");
					asientos=asientos+" "+b28.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b28.setBounds(216, 520, 50, 37);
		frame.getContentPane().add(b28);
		
		JButton b29 = new JButton("29");
		if(zb.getasiento(con, "29")==1) {
			b29.setBackground(new Color(254,000,000));
		}else  {
			b29.setBackground(SystemColor.activeCaptionBorder);
		}
		b29.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b29.getBackground().equals(new Color(50,220,50))) {
					b29.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "29");
					conmum = conmum - 1;
				} else if(b29.getBackground().equals(SystemColor.activeCaptionBorder)){
					b29.setBackground(new Color(50,220,50));
					asientos=asientos+" "+b29.getText();
					zb.updateasiento(con, 1, "29");
					conmum = conmum + 1;
				}
			}
		});
		
		b29.setBounds(267, 520, 50, 37);
		frame.getContentPane().add(b29);
		
		JButton b30 = new JButton("30");
		if(zb.getasiento(con, "30")==1) {
			b30.setBackground(new Color(254,000,000));
		}else  {
			b30.setBackground(SystemColor.activeCaptionBorder);
		}
		b30.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b30.getBackground().equals(new Color(50,220,50))) {
					b30.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "30");
					conmum = conmum - 1;
				} else if(b30.getBackground().equals(SystemColor.activeCaptionBorder)){
					b30.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "30");
					asientos=asientos+" "+b30.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b30.setBounds(318, 520, 50, 37);
		frame.getContentPane().add(b30);
		
		JButton b1 = new JButton("1");
		if(zb.getasiento(con, "1")==1) {
			b1.setBackground(new Color(254,000,000));
		}else  {
			b1.setBackground(SystemColor.activeCaptionBorder);
		}
		b1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (b1.getBackground().equals(new Color(50,220,50))) {
					b1.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "1");
					conmum = conmum - 1;
				} else if(b1.getBackground().equals(SystemColor.activeCaptionBorder)){
					b1.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "1");
					asientos=asientos+" "+b1.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b1.setBounds(115, 240, 50, 37);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		if(zb.getasiento(con, "2")==1) {
			b2.setBackground(new Color(254,000,000));
		}else  {
			b2.setBackground(SystemColor.activeCaptionBorder);
		}
		b2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b2.getBackground().equals(new Color(50,220,50))) {
					b2.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "2");
					conmum = conmum - 1;
				} else if(b2.getBackground().equals(SystemColor.activeCaptionBorder)){
					b2.setBackground(new Color(50,220,50));
					asientos=asientos+" "+b2.getText();
					zb.updateasiento(con, 1, "2");
					conmum = conmum + 1;
				}
			}
		});
		
		
		b2.setBounds(166, 240, 50, 37);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		if(zb.getasiento(con, "3")==1) {
			b3.setBackground(new Color(254,000,000));
		}else  {
			b3.setBackground(SystemColor.activeCaptionBorder);
		}
		b3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b3.getBackground().equals(new Color(50,220,50))) {
					b3.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "3");
					conmum = conmum - 1;
				} else if(b3.getBackground().equals(SystemColor.activeCaptionBorder)){
					b3.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "3");
					asientos=asientos+" "+b3.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b3.setBounds(216, 240, 50, 37);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("4");
		if(zb.getasiento(con, "3")==1) {
			b4.setBackground(new Color(254,000,000));
		}else  {
			b4.setBackground(SystemColor.activeCaptionBorder);
		}
		b4.setFont(new Font("Tahoma", Font.PLAIN, 8));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b4.getBackground().equals(new Color(50,220,50))) {
					b4.setBackground(SystemColor.activeCaptionBorder);
					zb.updateasiento(con,0, "4");
					conmum = conmum - 1;
				} else if(b4.getBackground().equals(SystemColor.activeCaptionBorder)){
					b4.setBackground(new Color(50,220,50));
					zb.updateasiento(con, 1, "4");
					asientos=asientos+" "+b4.getText();
					conmum = conmum + 1;
				}
			}
		});
		
		b4.setBounds(267, 240, 50, 37);
		frame.getContentPane().add(b4);
		
		frame.setLocationRelativeTo(null);
	}

	}
