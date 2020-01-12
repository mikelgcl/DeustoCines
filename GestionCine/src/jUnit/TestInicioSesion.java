package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import baseDeDatos.Usuario;
import baseDeDatos.ZBaseDeDatos;

class TestInicioSesion {
	
	
	@Test
	void testinicio() {
		String a="a";
		ZBaseDeDatos z=new ZBaseDeDatos();
		Connection con=z.initBD();
		Usuario u=z.iniciarSesion(con, a);
		assertEquals(a, u.getCorreo());
	}

}
