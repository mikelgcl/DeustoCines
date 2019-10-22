
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
		
		this.setSize(360, 480);
		getContentPane().setBackground(new Color(230, 230, 250));
		getContentPane().setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setBounds(20, 136, 124, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(20, 192, 124, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Confirmar contrase\u00F1a");
		lblNewLabel_2.setBounds(185, 192, 135, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setBounds(20, 277, 124, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellidos");
		lblNewLabel_4.setBounds(185, 277, 135, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tarjeta Deusto");
		lblNewLabel_5.setBounds(20, 333, 124, 14);
		getContentPane().add(lblNewLabel_5);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(20, 161, 124, 20);
		getContentPane().add(textCorreo);
		textCorreo.setColumns(10);
		
		textContra = new JPasswordField();
		textContra.setBounds(20, 217, 124, 20);
		getContentPane().add(textContra);
		textContra.setColumns(10);
		
		textContra1 = new JPasswordField();
		textContra1.setBounds(185, 217, 135, 20);
		getContentPane().add(textContra1);
		textContra1.setColumns(10);
		
		textNom = new JTextField();
		textNom.setBounds(20, 302, 124, 20);
		getContentPane().add(textNom);
		textNom.setColumns(10);
		
		textApel = new JTextField();
		textApel.setBounds(185, 302, 135, 20);
		getContentPane().add(textApel);
		textApel.setColumns(10);
		
		textTD = new JTextField();
		textTD.setBounds(20, 358, 124, 20);
		getContentPane().add(textTD);
		textTD.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Registro");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 0, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_1.setBounds(10, 11, 324, 98);
		getContentPane().add(btnNewButton_1);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setBackground(new Color(0, 0, 255));
		btnRegistrar.setBounds(185, 357, 89, 23);
		getContentPane().add(btnRegistrar);
		
		JLabel lblNewLabel_6 = new JLabel("Las contrase\u00F1as no coinciden");
		lblNewLabel_6.setVisible(false);
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(75, 248, 212, 14);
		getContentPane().add(lblNewLabel_6);
		
		btnRegistrar.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				String cor = " " ;
				String con = " " ;
				String con1 = " " ;
				String nom = " " ;
				String apl= " " ;
				String tdb = " " ;
				
	if (textCorreo.getText().length()<=20 && textCorreo.getText().length()>0) {
					cor = textCorreo.getText();
					
				} else {
					
			}
	if (textContra.getText().length()<=8 && textContra.getText().length()>0) {
		
	} else {
		
}
	if (textContra.getText()==textContra1.getText()) {
		con = textContra.getText();
		
		lblNewLabel_6.setVisible(false);
	} else {
		
		lblNewLabel_6.setVisible(true);
}
	if (textNom.getText().length()<=20 && textNom.getText().length()>0) {
		nom = textNom.getText();
		//errorNombre.setVisible(false);
	} else {
		//errorNombre.setVisible(true);
}
	if (textApel.getText().length()<=20 && textApel.getText().length()>0) {
		apl = textApel.getText();
		//errorNombre.setVisible(false);
	} else {
		//errorNombre.setVisible(true);
}
	if (textTD.getText().length()==8) {
		tdb = textTD.getText();
		
	} else {
		
}
	if(textCorreo.getText().length()<=20 && textCorreo.getText().length()>0 && textContra.getText().length()<=8 && textContra.getText().length()>0 
			&& textContra.getText()==textContra1.getText() && textNom.getText().length()<=20 && textNom.getText().length()>0 && textApel.getText().length()<=20 && textApel.getText().length()>0
			 && textTD.getText().length()==8) {
		Usuario p1=new Usuario(cor, con, nom, apl, tdb);
		System.out.println(p1);
		
	}
	
	
			}});
		
	}
	public static void main(String[] args) {
		VentanaRegistro v=new VentanaRegistro();
		v.setVisible(true);
	}
}
