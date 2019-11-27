package interfaz;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import baseDeDatos.Reserva;

public class CrearArchivo {
	
	public static void crearArchivo(String factura) {
		try {
            String ruta = "reservas.txt";
            String contenido = factura;
            File file = new File(ruta);
            
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
    
}