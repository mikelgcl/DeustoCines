package interfaz;

import javax.swing.*;

import baseDeDatos.Usuario;
import baseDeDatos.ZBaseDeDatos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class VentanaRegistro extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textCorreo;
	private JPasswordField textContra;
	private JPasswordField textContra1;
	private JTextField textNom;
	private JTextField textApel;
	private JTextField textTD;
	ZBaseDeDatos c=new ZBaseDeDatos();
 
	public VentanaRegistro() {
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
		
		/*JLabel lblNewLabel_6 = new JLabel("Las contrase\u00F1as no coinciden");
		lblNewLabel_6.setVisible(false);
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(56, 294, 212, 14);
		getContentPane().add(lblNewLabel_6);*/
		
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
				
				VentanaRegistro.this.dispose();	
				
			}
		});
		btnAtrs.setForeground(Color.WHITE);
		btnAtrs.setBackground(new Color(0, 0, 153));
		btnAtrs.setBounds(56, 497, 107, 20);
		getContentPane().add(btnAtrs);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cor = " " ;
				char[] conc = textContra.getPassword(); ;
				String con = " ";
				String nom = " " ;
				String apl= " " ;
				String tdb = " " ;
				
				cor=textCorreo.getText();
				con = String.valueOf(conc);
				nom=textNom.getText();
				apl=textApel.getText();
				tdb=textTD.getText();
				
				if(textCorreo.getText().length()<=45 && textCorreo.getText().length()>0 
						&& con.length()<=8 && con.length()>0 
						&& textNom.getText().length()<=45 && textNom.getText().length()>0 
						&& textApel.getText().length()<=45 && textApel.getText().length()>0
						&& textTD.getText().length()==8) {
					
					
					Usuario p1=new Usuario(cor, con, nom, apl, tdb);
					System.out.println(p1);
					c.insertDatosUsuario(conn, p1);
					VInicio nuevaVentana = new VInicio(); 
					nuevaVentana.frame.setVisible(true);
					VentanaRegistro.this.dispose();	
			}else {
				System.out.println("Fallo a registrar");
			}
		
			}
			
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(174, 497, 113, 20);
		getContentPane().add(btnRegistrar);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/imagenes/fondo1bueno.jpg")));
		lblNewLabel_7.setBounds(0, 0, 344, 98);
		getContentPane().add(lblNewLabel_7);
		
		VentanaRegistro.this.setLocationRelativeTo(null);
	
		
	}
	public static void main(String[] args) {
		VentanaRegistro v=new VentanaRegistro();
		v.setVisible(true);
	}
}
