package jUnit;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import baseDeDatos.Pelicula;
import baseDeDatos.Usuario;
import baseDeDatos.ZBaseDeDatos;

public class TestBD {

	@Test
	void testregistro() {

		Usuario u=new Usuario("t", "", "f", "", "");
		ZBaseDeDatos z=new ZBaseDeDatos();
		Connection con=z.initBD();
		z.insertDatosUsuario(con, u);
		Usuario usu=z.getusuario(con, "t");
	    assertEquals("f", usu.getNombre());

	}
	
	@Test
	void testpelicula() {
		Pelicula p=new Pelicula("g", "", "", "", "", "");
		ZBaseDeDatos z=new ZBaseDeDatos();
		Connection con=z.initBD();
		z.insertDatosPelicula(con, p);
		Pelicula prueba=z.getpelicula(con, 0);
		assertEquals(0, prueba.getCod_Pelicula());


	}

}
