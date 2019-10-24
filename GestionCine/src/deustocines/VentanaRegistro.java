package deustocines;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
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
	
 
	public VentanaRegistro() {
		
		this.setSize(360, 597);
		getContentPane().setBackground(new Color(230, 230, 250));
		getContentPane().setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setBounds(56, 136, 124, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(56, 192, 124, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Confirmar contrase\u00F1a");
		lblNewLabel_2.setBounds(56, 248, 135, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setBounds(56, 311, 124, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellidos");
		lblNewLabel_4.setBounds(56, 367, 135, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tarjeta Deusto");
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
		
		JLabel lblNewLabel_6 = new JLabel("Las contrase\u00F1as no coinciden");
		lblNewLabel_6.setVisible(false);
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(56, 294, 212, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setForeground(Color.WHITE);
		lblRegistro.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblRegistro.setBounds(82, 32, 195, 59);
		getContentPane().add(lblRegistro);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_1.setBounds(0, 11, 344, 98);
		getContentPane().add(btnNewButton_1);
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VInicio nuevaVentana = new VInicio(); 
				nuevaVentana.frame.setVisible(true);
				
				VentanaRegistro.this.dispose();	
				
			}
		});
		btnAtrs.setForeground(Color.WHITE);
		btnAtrs.setBackground(SystemColor.textHighlight);
		btnAtrs.setBounds(56, 497, 107, 31);
		getContentPane().add(btnAtrs);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pass = new String(textContra.getPassword());
				String pass1 = new String(textContra1.getPassword());
				
				if (textContra == textContra1) {
					VInicio nuevaVentana = new VInicio(); 
					nuevaVentana.frame.setVisible(true);
					VentanaRegistro.this.dispose();	
				} else {
					lblNewLabel_6.setVisible(true);
				}
			
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(174, 497, 113, 31);
		getContentPane().add(btnRegistrar);
		
		VentanaRegistro.this.setLocationRelativeTo(null);
		
	}
	public static void main(String[] args) {
		VentanaRegistro v=new VentanaRegistro();
		v.setVisible(true);
	}
}
