package interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;



import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class VAyuda {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VAyuda window = new VAyuda();
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
	public VAyuda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPolticaDeProteccin = new JLabel("Política de protección de datos personales");
		lblPolticaDeProteccin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPolticaDeProteccin.setBounds(56, 390, 336, 14);
		frame.getContentPane().add(lblPolticaDeProteccin);
		
		JLabel lblPropierdadIntelectualY = new JLabel("Propierdad intelectual y de privacidad");
		lblPropierdadIntelectualY.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPropierdadIntelectualY.setBounds(56, 194, 336, 14);
		frame.getContentPane().add(lblPropierdadIntelectualY);
		
		JLabel lblNewLabel_1 = new JLabel("Condiciones generales de utilización del website.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(56, 130, 336, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblCinesDeusto = new JLabel("Cines Deusto");
		lblCinesDeusto.setForeground(UIManager.getColor("ColorChooser.background"));
		lblCinesDeusto.setFont(new Font("Yu Gothic UI", Font.BOLD, 45));
		lblCinesDeusto.setBounds(84, 11, 294, 71);
		frame.getContentPane().add(lblCinesDeusto);
		
		JButton btnAtras = new JButton("Cerrar");
		btnAtras.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
			
				frame.dispose();
					
			}
		});
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBackground(new Color(0, 0, 153));
		btnAtras.setBounds(56, 490, 95, 23);
		frame.getContentPane().add(btnAtras);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VAyuda.class.getResource("/imagenes/fondo1bueno.jpg")));
		lblNewLabel.setBounds(0, 0, 444, 93);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane txtpnCondicionesGeneralesDe = new JTextPane();
		txtpnCondicionesGeneralesDe.setText(" \nCINES DEUSTO es propietaria del dominio y titular de la aplicacion DeustoCines \n\n  \nLa totalidad de esta aplicación: texto, imágenes, marca comercial, logotipo, archivos descargables, botones, combinaciones de colores, así como la estructura, selección, ordenación y presentación de sus contenidos, se encuentra protegida por las leyes españolas e internacionales sobre propie- dad intelectual e industrial. Asimismo, y sin perjuicio de lo anteriormente citado, el contenido de este website también tiene la consideración de programa de ordenador y le es de aplicación toda la normativa española y comunitaria europea vigente sobre la materia. \n\n \nLos criterios y reglas que sigue CINES DEUSTO respecto a la utilización de los datos, que libre y voluntariamente usted facilite a través de nuestra página web, son los que se exponen en la Política de Privacidad." );
		txtpnCondicionesGeneralesDe.setBounds(54, 127, 346, 345);
		txtpnCondicionesGeneralesDe.setEditable(false);
		frame.getContentPane().add(txtpnCondicionesGeneralesDe);
		
		frame.setLocationRelativeTo(null);
	}
}
