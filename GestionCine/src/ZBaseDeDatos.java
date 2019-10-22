import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;

public class ZBaseDeDatos {
	
	
	private static final String NOMBRETABLA = "Usuarios";
	private static final String COLUMNAS_TABLA = " (nombre string, password string)";

	public static Connection initBD( String nombreBD ) {

		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:" + nombreBD );
			//log( Level.INFO, "Conectada base de datos " + nombreBD, null );
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			//lastError = e;
			//log( Level.SEVERE, "Error en conexi�n de base de datos " + nombreBD, e );
			e.printStackTrace();
			return null;
		}
	}

	public static Statement usarCrearTablasBD( Connection con ) {
		try {
			Statement statement = con.createStatement();
			statement.setQueryTimeout(30); // poner timeout 30 msg
			try {
				statement.executeUpdate("create table "+NOMBRETABLA+COLUMNAS_TABLA);
			} catch (SQLException e) {} // Tabla ya existe. Nada que hacer
			//log( Level.INFO, "Creada base de datos", null );
			return statement;
		} catch (SQLException e) {
			//lastError = e;
			//log( Level.SEVERE, "Error en creaci�n de base de datos", e );
			e.printStackTrace();
			return null;
		}
	}
	
	public static void insertDatos(Connection con,String nombre,String password) {
		try {
			Statement st=con.createStatement();
			st.executeUpdate("Insert into "+ NOMBRETABLA+" values ('"+nombre+"', '"+password+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connection con=initBD("Usuarios");
		usarCrearTablasBD(con);
		insertDatos(con, "mikeljon", "1234");
	}

}

