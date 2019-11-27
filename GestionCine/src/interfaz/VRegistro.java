package interfaz;

import javax.swing.*;

import baseDeDatos.Usuario;
import baseDeDatos.ZBaseDeDatos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class VRegistro extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextField textCorreo;
	private static JPasswordField textContra;
	private static JPasswordField textContra1;
	private static JTextField textNom;
	private static JTextField textApel;
	private static JTextField textTD;
	ZBaseDeDatos c=new ZBaseDeDatos();
 
	Logger logger=Logger.getLogger(VRegistro.class.getName());
	
	public VRegistro() {
		Connection conn=c.initBD("DeustoCines");
		this.setSize(360, 585);
		getContentPane().setBackground(new Color(230, 230, 250));
		getContentPane().setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(56, 136, 124, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(56, 192, 124, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Confirmar contrase\u00F1a");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(56, 248, 135, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(56, 311, 124, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellidos");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(56, 367, 135, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tarjeta Deusto");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(56, 423, 124, 14);
		getContentPane().add(lblNewLabel_5);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(56, 161, 229, 20);
		getContentPane().add(textCorreo);
		textCorreo.setColumns(10);
		
		textContra = new JPasswordField();
		textContra.setBounds(56, 217, 229, 20);
		getContentPane().add(textContra);
		textContra.setColumns(10);
		
		textContra1 = new JPasswordField();
		textContra1.setBounds(56, 273, 229, 20);
		getContentPane().add(textContra1);
		textContra1.setColumns(10);
		
		textNom = new JTextField();
		textNom.setBounds(56, 336, 229, 20);
		getContentPane().add(textNom);
		textNom.setColumns(10);
		
		textApel = new JTextField();
		textApel.setBounds(56, 392, 229, 20);
		getContentPane().add(textApel);
		textApel.setColumns(10);
		
		textTD = new JTextField();
		textTD.setBounds(56, 448, 229, 20);
		getContentPane().add(textTD);
		textTD.setColumns(10);
		
		
		
		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setForeground(Color.WHITE);
		lblRegistro.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblRegistro.setBounds(81, 21, 195, 59);
		getContentPane().add(lblRegistro);
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VInicio nuevaVentana = new VInicio(); 
				nuevaVentana.frame.setVisible(true);
				
				VRegistro.this.dispose();	
				
			}
		});
		btnAtrs.setForeground(Color.WHITE);
		btnAtrs.setBackground(new Color(0, 0, 153));
		btnAtrs.setBounds(56, 497, 107, 20);
		getContentPane().add(btnAtrs);
		
		//Etiquetas de error
		
				JLabel lblErrorCorreo = new JLabel("Formato de correo incorrecto");
				lblErrorCorreo.setFont(new Font("Tahoma", Font.PLAIN, 10));
				lblErrorCorreo.setForeground(new Color(255, 0, 0));
				lblErrorCorreo.setBounds(56, 180, 172, 14);
				lblErrorCorreo.setVisible(false);
				getContentPane().add(lblErrorCorreo);
				
				JLabel lblErrorContrasena = new JLabel("La contrase\u00F1a tiene que tener al menos 6 caracteres");
				lblErrorContrasena.setFont(new Font("Tahoma", Font.PLAIN, 10));
				lblErrorContrasena.setForeground(Color.RED);
				lblErrorContrasena.setBounds(56, 237, 278, 14);
				lblErrorContrasena.setVisible(false);
				getContentPane().add(lblErrorContrasena);
				
				JLabel lblErrorContrasena2 = new JLabel("Las contrase\u00F1as no coinciden");
				lblErrorContrasena2.setForeground(Color.RED);
				lblErrorContrasena2.setFont(new Font("Tahoma", Font.PLAIN, 10));
				lblErrorContrasena2.setBounds(56, 292, 278, 14);
				lblErrorContrasena2.setVisible(false);
				getContentPane().add(lblErrorContrasena2);
				
				JLabel lblErrorNombre = new JLabel("El nombre tiene que tener al menos 2 caracteres");
				lblErrorNombre.setForeground(Color.RED);
				lblErrorNombre.setFont(new Font("Tahoma", Font.PLAIN, 10));
				lblErrorNombre.setBounds(56, 355, 278, 14);
				lblErrorNombre.setVisible(false);
				getContentPane().add(lblErrorNombre);
				
				JLabel lblErrorApellido = new JLabel("El apellido tiene que tener al menos 2 caracteres");
				lblErrorApellido.setForeground(Color.RED);
				lblErrorApellido.setFont(new Font("Tahoma", Font.PLAIN, 10));
				lblErrorApellido.setBounds(56, 411, 278, 14);
				lblErrorApellido.setVisible(false);
				getContentPane().add(lblErrorApellido);
				
				JLabel lblErrorTDeusto = new JLabel("La tarjeta Deusto tiene que tener 8 n\u00FAmeros");
				lblErrorTDeusto.setForeground(Color.RED);
				lblErrorTDeusto.setFont(new Font("Tahoma", Font.PLAIN, 10));
				lblErrorTDeusto.setBounds(56, 466, 278, 14);
				lblErrorTDeusto.setVisible(false);
				getContentPane().add(lblErrorTDeusto);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cor = " " ;
				char[] conc = textContra.getPassword(); 
				String con = " ";
				char[] conc1 = textContra1.getPassword(); 
				String con1 = " ";
				String nom = " " ;
				String apl= " " ;
				String tdb = " " ;
				
				cor=textCorreo.getText();
				con = String.valueOf(conc);
				con1 = String.valueOf(conc1);
				nom=textNom.getText();
				apl=textApel.getText();
				tdb=textTD.getText();
				
				//Mensajes de error en pantalla 
				
				if (textCorreo.getText().length()<=45 && textCorreo.getText().length()>1 && textCorreo.getText().contains("@")) {
					lblErrorCorreo.setVisible(false);
				} else {
					lblErrorCorreo.setVisible(true);
				}
				
				if (con.equals(con1)) {
					lblErrorContrasena2.setVisible(false);
				} else {
					lblErrorContrasena2.setVisible(true);
				}
				
				if (con.length()<=20 && con.length()>5) {
					lblErrorContrasena.setVisible(false);
				} else {
					lblErrorContrasena.setVisible(true);
				}
				
				if (textNom.getText().length()<=45 && textNom.getText().length()>1 ) {
					lblErrorNombre.setVisible(false);
				} else {
					lblErrorNombre.setVisible(true);
				}
				
				if (textApel.getText().length()<=45 && textApel.getText().length()>1) {
					lblErrorApellido.setVisible(false);
				} else {
					lblErrorApellido.setVisible(true);
				}
				
				if (textTD.getText().length()==8) {
					lblErrorTDeusto.setVisible(false);
				} else {
					lblErrorTDeusto.setVisible(true);
				}
				
				if(textCorreo.getText().length()<=45 && textCorreo.getText().length()>1 && textCorreo.getText().contains("@")
						&& con.length()<=20 && con.length()>5
						&& textNom.getText().length()<=45 && textNom.getText().length()>1 
						&& textApel.getText().length()<=45 && textApel.getText().length()>1
						&& textTD.getText().length()==8 && con.equals(con1))  {
					
					System.out.println("");
					logger.log(Level.INFO, "Se ha registrado correctamente, los detalles de su usuario son: \n"
							+ "	Nombre: "  + textNom.getText()
							+ "\n 	Apellidos: " + textApel.getText()
							+ "\n 	Correo: " + textCorreo.getText()
							+ "\n 	Tarjeta Deusto: " + textTD.getText() );
					System.out.println("");
					
					Usuario p1=new Usuario(cor, con, nom, apl, tdb);
					//System.out.println(p1);
					c.insertDatosUsuario(conn, p1);
					VInicio nuevaVentana = new VInicio(); 
					nuevaVentana.frame.setVisible(true);
					VRegistro.this.dispose();	
			}else {
				System.out.println("Fallo a registrar");
			}
		
			}
			
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(174, 497, 113, 20);
		getContentPane().add(btnRegistrar);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(VRegistro.class.getResource("/imagenes/fondo1bueno.jpg")));
		lblNewLabel_7.setBounds(0, 0, 344, 98);
		getContentPane().add(lblNewLabel_7);
		
		
		
		
		VRegistro.this.setLocationRelativeTo(null);
	
		
	}
	public static void main(String[] args) {
		VRegistro v=new VRegistro();
		v.setVisible(true);
	}
}
