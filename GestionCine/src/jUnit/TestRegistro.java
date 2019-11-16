package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import baseDeDatos.Cartelera;
import baseDeDatos.Cine;
import baseDeDatos.Usuario;
import baseDeDatos.ZBaseDeDatos;

class TestRegistro {

	@Test
	void testregistro() {
		
		Usuario u=new Usuario("t", "", "f", "", "");
		ZBaseDeDatos z=new ZBaseDeDatos();
		Connection con=z.initBD("DeustoCines");
		z.insertDatosUsuario(con, u);
		Usuario usu=z.getusuario(con, "t");
	    assertEquals("f", usu.getNombre());
	        
	}
	@Test
	void testcartelera() {
		Cartelera c=new Cartelera(0, 0, "");
		ZBaseDeDatos z=new ZBaseDeDatos();
		Connection con=z.initBD("DeustoCines");
		z.insertDatosCartelera(con, c);
		Cartelera prueba=z.getcartelera(con,0);
		assertEquals(0, prueba.getCod_Cartelera());
		
		
	}
	@Test
	void testcine() {
		Cine c=new Cine("f", "", 1, 1);
		ZBaseDeDatos z=new ZBaseDeDatos();
		Connection con=z.initBD("DeustoCines");
		z.insertDatosCine(con, c);
		Cine prueba=z.getcine(con, "f");
		assertEquals("f", prueba.getNombre());
		
		
	}
	

}
