package interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;

import baseDeDatos.Reserva;
import baseDeDatos.ZBaseDeDatos;

import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

public class VPago {

	public JFrame frame;
	private static JTextField textTitular;
	private static JTextField textNumero;
	private static JPasswordField textCodigo;
	private static JPasswordField textCodigo2;
	
	Logger logger=Logger.getLogger(VPago.class.getName());
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VPago window = new VPago();
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
	public VPago() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ZBaseDeDatos c=new ZBaseDeDatos();
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCinesDeusto = new JLabel("Cines Deusto");
		lblCinesDeusto.setForeground(UIManager.getColor("ColorChooser.background"));
		lblCinesDeusto.setFont(new Font("Yu Gothic UI", Font.BOLD, 45));
		lblCinesDeusto.setBounds(84, 11, 294, 71);
		frame.getContentPane().add(lblCinesDeusto);
		
		JButton btnAtras = new JButton("Cancelar");
		btnAtras.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				int seleccion = JOptionPane.showOptionDialog(null,"¿Está seguro de que desea cancelar su compra?", "",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,null, "opcion 2");
				if(seleccion==1 ){
				//Que no pase nah
				}
				else{
					VCartelera nuevaVentana = new VCartelera(); 
					nuevaVentana.frame.setVisible(true);
					VComprar.conmum = 0;
					
					frame.dispose();
				}
			
				
					
			}
		});
		btnAtras.setForeground(new Color(0, 0, 0));
		btnAtras.setBackground(new Color(204, 0, 0));
		btnAtras.setBounds(47, 547, 95, 20);
		frame.getContentPane().add(btnAtras);
		
		JLabel lblAyuda = new JLabel("Introduzca sus datos:");
		lblAyuda.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAyuda.setBounds(47, 366, 343, 14);
		frame.getContentPane().add(lblAyuda);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VAyuda.class.getResource("/imagenes/fondo1bueno.jpg")));
		lblNewLabel.setBounds(0, 0, 444, 93);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTitularDeLa = new JLabel("Titular de la tarjeta:");
		lblTitularDeLa.setBounds(47, 395, 139, 14);
		frame.getContentPane().add(lblTitularDeLa);
		
		textTitular = new JTextField();
		textTitular.setBounds(174, 392, 216, 20);
		frame.getContentPane().add(textTitular);
		textTitular.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero de tarjeta:");
		lblNewLabel_1.setBounds(47, 431, 139, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(174, 428, 216, 20);
		frame.getContentPane().add(textNumero);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo de seguridad:");
		lblNewLabel_2.setBounds(47, 465, 139, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblConfirmarCdigo = new JLabel("Confirmar c\u00F3digo:");
		lblConfirmarCdigo.setBounds(47, 496, 127, 23);
		frame.getContentPane().add(lblConfirmarCdigo);
		
		textCodigo = new JPasswordField();
		textCodigo.setBounds(174, 462, 48, 20);
		frame.getContentPane().add(textCodigo);
		
		textCodigo2 = new JPasswordField();
		textCodigo2.setBounds(174, 497, 48, 20);
		frame.getContentPane().add(textCodigo2);
		
		// Etiquetas de error

		JLabel lblErrorTitular = new JLabel("Titular de la tarjeta no v\u00E1lido");
		lblErrorTitular.setForeground(Color.RED);
		lblErrorTitular.setBounds(174, 413, 205, 14);
		lblErrorTitular.setVisible(false);
		frame.getContentPane().add(lblErrorTitular);

		JLabel lblErrorNumero = new JLabel("N\u00FAmero de tarjeta no v\u00E1lido");
		lblErrorNumero.setForeground(Color.RED);
		lblErrorNumero.setBounds(174, 448, 205, 14);
		lblErrorNumero.setVisible(false);
		frame.getContentPane().add(lblErrorNumero);

		JLabel lblErrorCodigo = new JLabel("C\u00F3digo no v\u00E1lido");
		lblErrorCodigo.setForeground(Color.RED);
		lblErrorCodigo.setBounds(174, 482, 205, 14);
		lblErrorCodigo.setVisible(false);
		frame.getContentPane().add(lblErrorCodigo);

		JLabel lblErrorCodigo2 = new JLabel("Los c\u00F3digos no coinciden");
		lblErrorCodigo2.setForeground(Color.RED);
		lblErrorCodigo2.setBounds(174, 517, 205, 14);
		lblErrorCodigo2.setVisible(false);
		frame.getContentPane().add(lblErrorCodigo2);
		
		JLabel labelEmail = new JLabel(VInicio.correo);
		labelEmail.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelEmail.setBounds(174, 162, 197, 14);
		frame.getContentPane().add(labelEmail);
		
		JLabel labelCine = new JLabel(VLugar.nomLugar);
		labelCine.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelCine.setBounds(174, 194, 197, 14);
		frame.getContentPane().add(labelCine);
		String c1=null;
		String h=null;
		if(VCartelera2.peli!=null && VCartelera2.hora!=null) {
			c1=VCartelera2.peli;
			h=VCartelera2.hora;
			}
			if(VCartelera3.peli!=null && VCartelera3.hora!=null) {
				c1=VCartelera3.peli;
				h=VCartelera3.hora;
				}
			if(VCartelera.peli!=null && VCartelera2.hora!=null) {
				c1=VCartelera.peli;
				h=VCartelera.hora;
				}
		JLabel labelPelicula = new JLabel(c1);
		labelPelicula.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelPelicula.setBounds(174, 229, 197, 14);
		frame.getContentPane().add(labelPelicula);
		
		JLabel labelHora = new JLabel(h);
		labelHora.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelHora.setBounds(174, 264, 197, 14);
		frame.getContentPane().add(labelHora);
		
		String numEntradas = "" + VComprar.conmum;
		
		JLabel labelNum = new JLabel(numEntradas);
		labelNum.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelNum.setBounds(174, 301, 197, 14);
		frame.getContentPane().add(labelNum);
		
		JButton btnConfirmar = new JButton("Confirmar compra");
		Connection conn=c.initBD();
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				char[] conc = textCodigo.getPassword(); 
				String con = " ";
				char[] conc1 = textCodigo2.getPassword(); 
				String con1 = " ";
				
				con = String.valueOf(conc);
				con1 = String.valueOf(conc1);
				
				if (textTitular.getText().length()>1) {
					lblErrorTitular.setVisible(false);
				} else {
					lblErrorTitular.setVisible(true);
				}
				
				if (textNumero.getText().length()==16) {
					lblErrorNumero.setVisible(false);
				} else {
					lblErrorNumero.setVisible(true);
				}
				
				if (con.length()==3) {
					lblErrorCodigo.setVisible(false);
				} else {
					lblErrorCodigo.setVisible(true);
				}
				
				if (con1.equals(con)) {
					lblErrorCodigo2.setVisible(false);
				} else {
					lblErrorCodigo2.setVisible(true);
				}
				
				if (con1.equals(con) && con.length() == 3 && textNumero.getText().length() == 16 && textTitular.getText().length() >1) {
					int seleccion = JOptionPane.showOptionDialog(null,"¿Está seguro de que desea realizar su compra?", "",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,null, "opcion 2");
					if(seleccion==1 ){
					
					}
					else{
						String tar=textNumero.getText();
						Reserva r = null;
						String cor=VInicio.correo;
						String cine=VLugar.nomLugar;
						String pelicula=null;
						Date fecha=null;
						String hora=null;
						if(VCartelera.peli!=null && VCartelera.fecha!=null && VCartelera.hora!=null) {
						pelicula=VCartelera.peli;
						System.out.println(pelicula);
						fecha=VCartelera.fecha;
						hora=VCartelera.hora;
						
						}
						if(VCartelera2.peli!=null && VCartelera2.fecha!=null && VCartelera2.hora!=null ) {
						pelicula=VCartelera2.peli;
						System.out.println(pelicula);
						fecha=VCartelera2.fecha;
						hora=VCartelera2.hora;
							}
						
						if(VCartelera3.peli!=null && VCartelera3.fecha!=null && VCartelera3.hora!=null) {
						pelicula=VCartelera3.peli;
						fecha=VCartelera3.fecha;
						hora=VCartelera3.hora;
							}
						int numasientos=VComprar.conmum;
						String asiento=VComprar.asientos;
						double p=0;
						p=p+(8*numasientos);
						String factura="Compra procesada correctamente, los detalles de su reserva son: \n"
								+ "	Titular de la reserva: " + VPago.textTitular.getText() 
								+ "\n 	Número de tarjeta: " + VPago.textNumero.getText()
								+ "\n 	Correo: " + VInicio.correo
								+ "\n 	Cine: " + VLugar.nomLugar
								+ "\n	Película: " + pelicula
								+ "\n	Hora: " + hora
								+ "\n 	Número de asientos: " + numEntradas
								+ "\n 	Asientos: " + VComprar.asientos;
					
								
						logger.log(Level.INFO, factura);
						
						
						
						r=new Reserva(cor, cine, pelicula, fecha, hora, numasientos, asiento, p, tar); 
						c.insertDatosReserva(conn, r);
						CrearArchivo.crearArchivo(factura);
						//System.out.println(r.toString());
						JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
						
					
						
						VCartelera nuevaVentana = new VCartelera(); 
						nuevaVentana.frame.setVisible(true);	
						frame.dispose();
					}
				}
				
			}
		});
		 btnConfirmar.setForeground(new Color(255, 255, 255));
		btnConfirmar.setBackground(new Color(0, 0, 204));
		btnConfirmar.setBounds(244, 547, 146, 20);
		frame.getContentPane().add(btnConfirmar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(47, 343, 343, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblDetalles = new JLabel("Detalles:");
		lblDetalles.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDetalles.setBounds(47, 124, 343, 14);
		frame.getContentPane().add(lblDetalles);
		
		JLabel lblCine = new JLabel("Cine:");
		lblCine.setBounds(47, 194, 139, 14);
		frame.getContentPane().add(lblCine);
		
		JLabel lblPelcula = new JLabel("Pel\u00EDcula:");
		lblPelcula.setBounds(47, 229, 139, 14);
		frame.getContentPane().add(lblPelcula);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setBounds(47, 264, 139, 14);
		frame.getContentPane().add(lblHora);
		
		JLabel lblNmAsientos = new JLabel("N\u00FAm. Asientos:");
		lblNmAsientos.setBounds(47, 301, 139, 14);
		frame.getContentPane().add(lblNmAsientos);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(47, 162, 71, 14);
		frame.getContentPane().add(lblEmail);
		
		JButton btnNewButton = new JButton("Saltar paso");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Saltar directamente a la pantalla de confirmación
				Reserva r = null;
				String cor=VInicio.correo;
				String cine=VLugar.nomLugar;
				String pelicula=VCartelera.peli;
				Date fecha=VCartelera.fecha;
				String hora=VCartelera.hora;
				int numasientos=VComprar.conmum;
				String asiento=VComprar.asientos;
				double p=0;
				p=p+(8*numasientos);
				String factura="Compra procesada correctamente, los detalles de su reserva son: \n"
						+ "	Titular de la reserva: " + VPago.textTitular.getText() 
						
						+ "\n 	Correo: " + VInicio.correo
						+ "\n 	Cine: " + VLugar.nomLugar
						+ "\n	Película: " + VCartelera.peli
						+ "\n	Hora: " + VCartelera.hora
						+ "\n 	Número de asientos: " + numEntradas;
				logger.log(Level.INFO, factura);
				
				
				
				r=new Reserva(cor, cine, pelicula, fecha, hora, numasientos, asiento, p, null); 
				c.insertDatosReserva(conn, r);
				//CrearArchivo.crearArchivo(factura);
				//System.out.println(r.toString());
				JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
				
				VCartelera nuevaVentana = new VCartelera(); 
				nuevaVentana.frame.setVisible(true);	
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(0, 204, 51));
		btnNewButton.setBounds(284, 516, 106, 20);
		 if (VInicio.v== true) {
			 btnNewButton.setVisible(true);
			}else {
				btnNewButton.setVisible(false);
			} 
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
		frame.setLocationRelativeTo(null);
	}
}
