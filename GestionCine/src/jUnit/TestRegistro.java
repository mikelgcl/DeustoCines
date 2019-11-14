package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

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

}
