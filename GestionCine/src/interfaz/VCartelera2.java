package interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;

import baseDeDatos.Pelicula;
import baseDeDatos.ZBaseDeDatos;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class VCartelera2 {

	public JFrame frame;
	public static Date fecha;
	public static String hora;
	public static String peli;
	ZBaseDeDatos bd=new ZBaseDeDatos();
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VCartelera2 window = new VCartelera2();
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
	public VCartelera2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Connection con=bd.initBD();
		Pelicula p=bd.getpelicula(con, 1);
		frame = new JFrame();
		frame.setBounds(100, 100, 642, 624);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCinesDeusto = new JLabel("Cines Deusto");
		lblCinesDeusto.setForeground(UIManager.getColor("ColorChooser.background"));
		lblCinesDeusto.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		lblCinesDeusto.setBounds(171, 11, 301, 71);
		frame.getContentPane().add(lblCinesDeusto);
		
		JLabel lblNombre = new JLabel("Cine "+ VLugar.nomLugar + ":");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(50, 100, 121, 32);
		frame.getContentPane().add(lblNombre);
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				VLugar nuevaVentana = new VLugar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBackground(new Color(0, 0, 153));
		btnAtras.setBounds(28, 531, 100, 32);
		frame.getContentPane().add(btnAtras);
		
		JButton btnPelcula_1 = new JButton("");
		btnPelcula_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VInfoPeli nuevaVentana = new VInfoPeli(); 
				nuevaVentana.frame.setVisible(true);
				
				
			}
		});
		btnPelcula_1.setIcon(new ImageIcon(VCartelera.class.getResource(p.getImagen())));
		btnPelcula_1.setBackground(Color.LIGHT_GRAY);
		btnPelcula_1.setBounds(318, 180, 99, 143);
		frame.getContentPane().add(btnPelcula_1);
		
		JLabel lblZombieland = new JLabel(p.getTitulo());
		lblZombieland.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblZombieland.setBounds(438, 190, 99, 14);
		frame.getContentPane().add(lblZombieland);
		
		JLabel lblM = new JLabel(p.getEdad());
		lblM.setBounds(438, 210, 34, 14);
		frame.getContentPane().add(lblM);
		
		JLabel label = new JLabel(p.getDuracion());
		label.setBounds(463, 210, 54, 14);
		frame.getContentPane().add(label);



String string = p.getHoras();

String[] parts = string.split(",");
String part1 = parts[0]; 
 
		JButton btn1420 = new JButton(part1);
		btn1420.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn1420.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hora=btn1420.getText();
				peli=lblZombieland. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btn1420.setBounds(438, 238, 65, 32);
		frame.getContentPane().add(btn1420);
		
		JLabel lblJoker = new JLabel("Bad Boys");
		lblJoker.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJoker.setBounds(149, 359, 79, 14);
		frame.getContentPane().add(lblJoker);
		
		JLabel lblTp_1 = new JLabel("M18");
		lblTp_1.setBounds(149, 389, 34, 14);
		frame.getContentPane().add(lblTp_1);
		
		JLabel label_6 = new JLabel("121'");
		label_6.setBounds(182, 389, 46, 14);
		frame.getContentPane().add(label_6);
		
		JComboBox<String> comboBoxFecha = new JComboBox<String>();
		comboBoxFecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBoxFecha.getSelectedItem() == "17/01/2020") {
					
					VCartelera nuevaVentana = new VCartelera(); 
					nuevaVentana.frame.setVisible(true);
					frame.dispose();
					
				} else if (comboBoxFecha.getSelectedItem() == "19/01/2020"){
					
					VCartelera3 nuevaVentana = new VCartelera3(); 
					nuevaVentana.frame.setVisible(true);
					frame.dispose();
				}
			}
		});
		
	
		
		
		comboBoxFecha.setBounds(86, 140, 114, 20);
		comboBoxFecha.addItem("18/01/2020");
		comboBoxFecha.addItem("17/01/2020");
		comboBoxFecha.addItem("19/01/2020");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String c=(String) comboBoxFecha.getSelectedItem();
		try {
			fecha=sdf.parse(c);
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		}
		frame.getContentPane().add(comboBoxFecha);
		
		JLabel lblDa = new JLabel("D\u00EDa:");
		lblDa.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDa.setBounds(50, 135, 121, 26);
		frame.getContentPane().add(lblDa);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				VAyuda nuevaVentana = new VAyuda(); 
				nuevaVentana.frame.setVisible(true);
				
				
				
			
			}
		});
		btnAyuda.setBounds(149, 531, 99, 32);
		frame.getContentPane().add(btnAyuda);
		
		JButton btnCerrar = new JButton("Cerrar sesi\u00F3n");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				VInicio nuevaVentanaInicio = new VInicio(); 
				nuevaVentanaInicio.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCerrar.setBackground(new Color(204, 0, 0));
		btnCerrar.setForeground(Color.BLACK);
		btnCerrar.setBounds(438, 531, 139, 32);
		frame.getContentPane().add(btnCerrar);
		
		JButton button_24 = new JButton("");
		button_24.setIcon(new ImageIcon(VCartelera2.class.getResource("/imagenes/cats (1).jpg")));
		button_24.setBackground(Color.LIGHT_GRAY);
		button_24.setBounds(318, 359, 99, 143);
		frame.getContentPane().add(button_24);
		
		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon(VCartelera2.class.getResource("/imagenes/blackwidow3.jpg")));
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setBounds(29, 180, 99, 143);
		frame.getContentPane().add(button_6);
		
		JLabel lblM_1 = new JLabel("M7");
		lblM_1.setBounds(149, 204, 34, 20);
		frame.getContentPane().add(lblM_1);
		
		JLabel lblAdAstra = new JLabel("Black Widow");
		lblAdAstra.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdAstra.setBounds(149, 180, 140, 14);
		frame.getContentPane().add(lblAdAstra);
		
		JButton button_19 = new JButton("");
		button_19.setIcon(new ImageIcon(VCartelera2.class.getResource("/imagenes/badboys2.jpg")));
		button_19.setBackground(Color.LIGHT_GRAY);
		button_19.setBounds(28, 359, 99, 143);
		frame.getContentPane().add(button_19);
		
		JLabel lblTp = new JLabel("TP");
		lblTp.setBounds(438, 389, 34, 14);
		frame.getContentPane().add(lblTp);
		
		JLabel lblDoraYLa = new JLabel("Cats");
		lblDoraYLa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDoraYLa.setBounds(438, 359, 155, 19);
		frame.getContentPane().add(lblDoraYLa);
		
		JLabel label_7 = new JLabel("132'");
		label_7.setBounds(463, 389, 54, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_1 = new JLabel("164'");
		label_1.setBounds(171, 204, 46, 20);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VCartelera.class.getResource("/imagenes/fondo1grande.jpg")));
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setBounds(0, 0, 626, 93);
		frame.getContentPane().add(lblNewLabel);
		
		
		JButton button = new JButton("00:30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hora=button.getText();
				peli=lblZombieland. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 9));
		button.setBounds(513, 238, 65, 32);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("19:30");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_1.getText();
				peli=lblZombieland. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_1.setBounds(438, 281, 65, 32);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("20:30");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_2.getText();
				peli=lblZombieland. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_2.setBounds(513, 281, 65, 32);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("17:30");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_3.getText();
				peli=lblAdAstra. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_3.setBounds(149, 232, 65, 32);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("18:00");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_4.getText();
				peli=lblAdAstra. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_4.setBounds(224, 232, 65, 32);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("19:45");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_5.getText();
				peli=lblAdAstra. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_5.setBounds(149, 275, 65, 32);
		frame.getContentPane().add(button_5);
		
		JButton button_7 = new JButton("15:30");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_7.getText();
				peli=lblJoker. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_7.setBounds(149, 414, 65, 32);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("17:00");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_8.getText();
				peli=lblJoker. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_8.setBounds(224, 414, 65, 32);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("20:50");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_9.getText();
				peli=lblJoker. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_9.setBounds(149, 457, 65, 32);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("16:00");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			hora=button_10.getText();
			peli=lblDoraYLa. getText();
			VComprar nuevaVentana = new VComprar(); 
			nuevaVentana.frame.setVisible(true);
			frame.dispose();
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_10.setBounds(438, 414, 65, 32);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("18:15");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_11.getText();
				peli=lblDoraYLa. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_11.setBounds(512, 414, 65, 32);
		frame.getContentPane().add(button_11);
		
		JButton btnAadirPelcula = new JButton("A\u00F1adir pel\u00EDcula");
		btnAadirPelcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String respuesta = JOptionPane.showInputDialog("Nombre de la película que quieres añadir:");
			}
		});

		btnAadirPelcula.setBackground(new Color(0, 204, 51));
		btnAadirPelcula.setBounds(318, 107, 121, 23);
		 if (VInicio.v== true) {
			 btnAadirPelcula.setVisible(true);
			}else {
				btnAadirPelcula.setVisible(false);
			} 
		frame.getContentPane().add(btnAadirPelcula);
		
		JButton btnQuitarPelcula = new JButton("Quitar pel\u00EDcula");
		btnQuitarPelcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String[] peliculas = {
				            "Zombieland 2",
				            "Joker",
				            "Ad Astra",
				            "Dora la exploradora",
				           
				        };
				   
				  
				  String resp = (String) JOptionPane.showInputDialog(null, "Seleccione la película a eliminar",
				  "Película", JOptionPane.DEFAULT_OPTION, null, peliculas, peliculas[0]);
			}
		});
		btnQuitarPelcula.setBackground(new Color(0, 204, 51));
		btnQuitarPelcula.setBounds(456, 107, 121, 23);
		 if (VInicio.v== true) {
			 btnQuitarPelcula.setVisible(true);
			}else {
			 btnQuitarPelcula.setVisible(false);
			} 
		frame.getContentPane().add(btnQuitarPelcula);
		
		JButton btnAadirHora = new JButton("A\u00F1adir hora");
		btnAadirHora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String[] peliculas = {
				            "Zombieland 2",
				            "Joker",
				            "Ad Astra",
				            "Dora la exploradora",
				           
				        };
				      
				  String resp = (String) JOptionPane.showInputDialog(null, "¿De qué película quieres eliminar una hora?",
				  "Película", JOptionPane.DEFAULT_OPTION, null, peliculas, peliculas[0]);
				  System.out.println(resp);
				  String respuesta = JOptionPane.showInputDialog("¿Qué hora quieres añadir?");
				if(respuesta != null) {
					String anadirh=string +","+ respuesta;
					 System.out.println(anadirh);
					  bd.updatehoras(con, anadirh, resp);
				}
				  
				
			}
		});
		btnAadirHora.setBackground(new Color(0, 204, 51));
		btnAadirHora.setBounds(318, 139, 121, 23);
		 if (VInicio.v== true) {
			 btnAadirHora.setVisible(true);
			}else {
				btnAadirHora.setVisible(false);
			} 
		frame.getContentPane().add(btnAadirHora);
		
		JButton btnQuitarHora = new JButton("Quitar hora");
		btnQuitarHora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String[] peliculas = {
				            "Zombieland 2",
				            "Joker",
				            "Ad Astra",
				            "Dora la exploradora",
				           
				        };
				      
				  String resp = (String) JOptionPane.showInputDialog(null, "¿De qué película quieres eliminar una hora?",
				  "Película", JOptionPane.DEFAULT_OPTION, null, peliculas, peliculas[0]);
				  
					
					  String respo = (String) JOptionPane.showInputDialog(null, "Seleccione la película a eliminar",
					  "Película", JOptionPane.DEFAULT_OPTION, null, parts, parts[0]);
					  String[] se=new String[parts.length-1];
					  for (int i = 0; i < parts.length; i++) {
				            if (parts[i] != respo) {
				                for (int j = 0; j < se.length; j++) {
				                    se[j] = parts[i];
				              System.out.println(se[j]+"ff");
				                }
				            }}
				String quitarh=String.join(",",se);
				;
				bd.deletehoras(con, quitarh, resp);
			}
		});
		btnQuitarHora.setBackground(new Color(0, 204, 51));
		btnQuitarHora.setBounds(456, 139, 121, 23);
		 if (VInicio.v== true) {
			 btnQuitarHora.setVisible(true);
			}else {
				btnQuitarHora.setVisible(false);
			} 
		frame.getContentPane().add(btnQuitarHora);
		
		frame.setLocationRelativeTo(null);
	}
}
