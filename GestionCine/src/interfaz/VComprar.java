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
		lblElijaSusAsientos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblElijaSusAsientos.setBounds(33, 168, 132, 27);
		frame.getContentPane().add(lblElijaSusAsientos);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						
				if (conmum <= 8 && conmum != 0) {
					String frase = "Subtotal de "+ conmum*8 +".00 euros, ¿Desea continuar?";
					
					int seleccion = JOptionPane.showOptionDialog(null,frase, "Confirmar selección",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,null, "opcion 2");
						if(seleccion==1 ){
							
						conmum = 0;
						
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
		
		JPanel panel = new JPanel();
		panel.setBounds(49, 239, 331, 315);
		frame.getContentPane().add(panel);
		frame.setLocationRelativeTo(null);
		 ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() instanceof JButton) {
					 	asiento=Integer.parseInt(((JButton) e.getSource()).getText());
		                String text = ((JButton) e.getSource()).getText();
		                JOptionPane.showMessageDialog(null, text);
		                ((JButton) e.getSource()).setEnabled(false);
		                System.out.println(asiento);
		          if (((JButton) e.getSource()).getBackground().equals(new Color(50,220,50))) {
		        	  ((JButton) e.getSource()).setBackground(new Color(255,255,255));conmum=conmum-1;
					} else {
						((JButton) e.getSource()).setBackground(new Color(50,220,50));
							conmum=conmum+1;
						}
		            }
				 
			}
		};
		
		x=4;
		y=4;
		panel.setLayout (new GridLayout (x,y));  // 3 filas y 3 columnas
		JButton sala[]=crearSala();
		for (int i=0;i<x*y;i++) {
		    panel.add (sala[i]);  // Añade los botones de 1 en 1.
		    sala[i].addActionListener(listener);
		
		
		
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
	public JButton[] crearSala(){
		JButton boton[] = new JButton[x*y];
		for (int i=0;i<x*y;i++) {
		   boton[i] = new JButton(Integer.toString(i));
		}
		return boton;
	}
	}
