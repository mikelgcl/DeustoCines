package deustocines;
import java.sql.*;
import java.util.logging.Level;



public class ZBaseDeDatos {
	
	


	public  Connection initBD( String nombreBD ) {

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
	
	public void desconecta(Connection con)  {
		try {
			con.close();
		} catch (SQLException e) {
			
		}
	}

	public void insertDatosUsuario(Connection con,Usuario user) {
		try {
			PreparedStatement stmt=con.prepareStatement("Insert into Usuario values(?,?,?,?,?)");
			stmt.setString(1, user.getNombre());
			stmt.setString(2, user.getContrasenya());
			stmt.setString(3, user.getNombre());
			stmt.setString(4, user.getApellido());
			stmt.setString(5, user.getTarjetadeusto());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertDatosCine(Connection con,Cine cin) {
		try {
			PreparedStatement stmt=con.prepareStatement("Insert into Usuario values(?,?,?,?)");
			stmt.setString(1, cin.getNombre());
			stmt.setString(2, cin.getLocalizacion());
			stmt.setInt(3, cin.getCartelera());
			stmt.setInt(4, cin.getNumsalas());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void insertDatosPelicula(Connection con,Pelicula pel) {
		try {
			PreparedStatement stmt=con.prepareStatement("Insert into Usuario values(?,?,?,?,?)");
			stmt.setString(1, pel.getTitulo());
			stmt.setString(2, pel.getDuracion());
			stmt.setString(3, pel.getEdad());
			stmt.setString(4, pel.getHoras());
			stmt.setInt(5, pel.getCartelera());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void insertDatosCartelera(Connection con,Cartelera car) {
		try {
			PreparedStatement stmt=con.prepareStatement("Insert into Usuario values(?,?,?,?)");
			stmt.setInt(1, car.getCod_Cartelera());
			stmt.setInt(2, car.getCod_Cine());
			stmt.setInt(3, car.getCod_Pelicula());
			stmt.setString(4, car.getFecha());
			
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Usuario iniciarSesion(Connection con,String nombre) {
		Usuario u=new Usuario();
		try {
			PreparedStatement stmt=con.prepareStatement("Select nombre,contraseña from Usuario where nombre=?");
			stmt.setString(1, nombre);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				
				u.setNombre(rs.getString("nombre"));
				u.setContrasenya(rs.getString("contrasenya"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
	


	public static void main(String[] args) {
		
		
	}

}

