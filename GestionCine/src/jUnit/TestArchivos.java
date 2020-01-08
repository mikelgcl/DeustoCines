package jUnit;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import interfaz.CrearArchivo;
import interfaz.VInicio;

public class TestArchivos {

	@Test
	public void testcreararchivo()  {
		String prueba="Buenos dias";
		String cadena;
		CrearArchivo v=new CrearArchivo();
		File file= new File("reservas.txt");
		v.crearArchivo(prueba);
		assertTrue(file.exists());
		
		try {
			FileReader fr=new FileReader(file);
			BufferedReader b = new BufferedReader(fr);
			      while((cadena = b.readLine())!=null) {
			          assertEquals(prueba, cadena);
			      }
			      b.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch( IOException e1) {
			e1.printStackTrace();
		}
		
		
		}
	@Test
	public void testguardarcorreo() {
		VInicio v=new VInicio();
		String valor="a.com";
		File file=new File("ultimo.xml");
		v.guardarcorreo(valor);
		assertTrue(file.exists());
		
		String devolver=v.devolvercorreo();
		
		assertEquals(valor, devolver);
		
	}
	

}
