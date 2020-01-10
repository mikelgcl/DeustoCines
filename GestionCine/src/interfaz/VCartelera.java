package interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;

import baseDeDatos.Cine;
import baseDeDatos.Pelicula;
import baseDeDatos.ZBaseDeDatos;

import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class VCartelera {

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
		Connection con=bd.initBD();
		Pelicula p=bd.getpelicula(con, 1);
		Pelicula p1=bd.getpelicula(con, 2);
		Pelicula p2=bd.getpelicula(con, 3);
		Pelicula p3=bd.getpelicula(con, 4);
		
		
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
		btnPelcula_1.setBounds(29, 180, 99, 143);
		frame.getContentPane().add(btnPelcula_1);
		
		JLabel lblZombieland = new JLabel(p.getTitulo());
		lblZombieland.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblZombieland.setBounds(149, 191, 99, 14);
		frame.getContentPane().add(lblZombieland);
		
		JLabel lblM = new JLabel(p.getEdad());
		lblM.setBounds(149, 210, 34, 14);
		frame.getContentPane().add(lblM);
		
		JLabel label = new JLabel(p.getDuracion());
		label.setBounds(182, 210, 46, 14);
		frame.getContentPane().add(label);



String string = p.getHoras();
System.out.println(p.getHoras());
String[] parts = string.split(",");
String part1 = parts[0]; 
String part2 = parts[1]; 
String part3 = parts[2]; 
String part4 = parts[3]; 

String string1 = p1.getHoras();
String[] parts1 = string1.split(",");
String part11 = parts1[0]; 
String part21 = parts1[1]; 



String string2 = p2.getHoras();
String[] parts2 = string2.split(",");
String part12 = parts2[0]; 
String part22 = parts2[1]; 
String part32 = parts2[2]; 



String string3 = p3.getHoras();
String[] parts3 = string3.split(",");
String part13 = parts3[0]; 
String part23 = parts3[1]; 
String part33 = parts3[2]; 

 
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
		btn1420.setBounds(149, 232, 65, 32);
		frame.getContentPane().add(btn1420);
		
		JLabel lblJoker = new JLabel(p3.getTitulo());
		lblJoker.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJoker.setBounds(438, 191, 79, 14);
		frame.getContentPane().add(lblJoker);
		
		JLabel lblTp_1 = new JLabel(p3.getEdad());
		lblTp_1.setBounds(438, 210, 34, 14);
		frame.getContentPane().add(lblTp_1);
		
		JLabel label_6 = new JLabel(p3.getDuracion());
		label_6.setBounds(471, 210, 46, 14);
		frame.getContentPane().add(label_6);
		
		JComboBox comboBoxFecha = new JComboBox();
		comboBoxFecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBoxFecha.getSelectedItem() == "18/01/2020") {
					
					VCartelera2 nuevaVentana = new VCartelera2(); 
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
		comboBoxFecha.addItem("17/01/2020");
		comboBoxFecha.addItem("18/01/2020");
		comboBoxFecha.addItem("19/01/2020");
		comboBoxFecha.addItem("20/01/2020");
		comboBoxFecha.addItem("21/01/2020");
		comboBoxFecha.addItem("22/01/2020");
		comboBoxFecha.addItem("23/01/2020");
		
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
		button_24.setIcon(new ImageIcon(VCartelera.class.getResource(p1.getImagen())));
		button_24.setBackground(Color.LIGHT_GRAY);
		button_24.setBounds(318, 359, 99, 143);
		frame.getContentPane().add(button_24);
		
		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon(VCartelera.class.getResource(p2.getImagen())));
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setBounds(29, 359, 99, 143);
		frame.getContentPane().add(button_6);
		
		JLabel lblM_1 = new JLabel(p2.getEdad());
		lblM_1.setBounds(149, 393, 34, 14);
		frame.getContentPane().add(lblM_1);
		
		JLabel lblAdAstra = new JLabel(p2.getTitulo());
		lblAdAstra.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdAstra.setBounds(149, 374, 79, 14);
		frame.getContentPane().add(lblAdAstra);
		
		JButton button_19 = new JButton("");
		button_19.setIcon(new ImageIcon(VCartelera.class.getResource(p3.getImagen())));
		button_19.setBackground(Color.LIGHT_GRAY);
		button_19.setBounds(318, 180, 99, 143);
		frame.getContentPane().add(button_19);
		
		JLabel lblTp = new JLabel(p1.getEdad());
		lblTp.setBounds(438, 389, 34, 14);
		frame.getContentPane().add(lblTp);
		
		JLabel lblDoraYLa = new JLabel(p1.getTitulo());
		lblDoraYLa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDoraYLa.setBounds(438, 370, 155, 14);
		frame.getContentPane().add(lblDoraYLa);
		
		JLabel label_7 = new JLabel(p1.getDuracion());
		label_7.setBounds(471, 389, 46, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_1 = new JLabel(p2.getDuracion());
		label_1.setBounds(180, 393, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VCartelera.class.getResource("/imagenes/fondo1grande.jpg")));
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setBounds(0, 0, 626, 93);
		frame.getContentPane().add(lblNewLabel);
		
		
		JButton button = new JButton(part2);
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
		button.setBounds(224, 232, 65, 32);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton(part3);
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
		button_1.setBounds(149, 275, 65, 32);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton(part4);
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
		button_2.setBounds(224, 275, 65, 32);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton(part13);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_3.getText();
				peli=lblJoker. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_3.setBounds(438, 238, 65, 32);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton(part23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_4.getText();
				peli=lblJoker. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_4.setBounds(512, 238, 65, 32);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton(part33);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_5.getText();
				peli=lblJoker. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_5.setBounds(438, 281, 65, 32);
		frame.getContentPane().add(button_5);
		
		JButton button_7 = new JButton(part12);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_7.getText();
				peli=lblAdAstra. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_7.setBounds(149, 414, 65, 32);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton(part22);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_8.getText();
				peli=lblAdAstra. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_8.setBounds(224, 414, 65, 32);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton(part32);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hora=button_9.getText();
				peli=lblAdAstra. getText();
				VComprar nuevaVentana = new VComprar(); 
				nuevaVentana.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_9.setBounds(149, 457, 65, 32);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton(part11);
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
		
		JButton button_11 = new JButton(part21);
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
				Pelicula pelicula=new Pelicula();
				pelicula.setTitulo(respuesta);
				bd.insertDatosPelicula(con, pelicula);
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
				System.out.println(quitarh);
				//System.out.println(quitarh);
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
