package baseDeDatos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




public class ZBaseDeDatos {
	
	
	Logger logger=Logger.getLogger(ZBaseDeDatos.class.getName());

	public  Connection initBD( String nombreBD ) {
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:" + nombreBD );
			logger.log(Level.INFO, "Conectada base de datos " + nombreBD);
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			
			logger.log( Level.SEVERE, "Error en conexi�n de base de datos " + nombreBD, e );
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
			PreparedStatement stmt=con.prepareStatement("Insert into Usuario (correo, contraseña, nombre, apellido, tarjetadeusto) values(?,?,?,?,?)");
			stmt.setString(1, user.getCorreo());
			stmt.setString(2, user.getContrasenya());
			stmt.setString(3, user.getNombre());
			stmt.setString(4, user.getApellido());
			stmt.setString(5, user.getTarjetadeusto());
			stmt.executeUpdate();
			//logger.log(Level.INFO, "Acierto al registrar"+user.getNombre());
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, "Fallo al registrar"+user.getNombre());
		}
	}
	
	public void insertDatosCine(Connection con,Cine cin) {
		try {
			PreparedStatement stmt=con.prepareStatement("Insert into Cine values(?,?,?,?)");
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
			PreparedStatement stmt=con.prepareStatement("Insert into Pelicula values(?,?,?,?,?,?,?)");
			stmt.setString(1, pel.getTitulo());
			stmt.setString(2, pel.getDuracion());
			stmt.setString(3, pel.getEdad());
			stmt.setString(4, pel.getHoras());
			stmt.setInt(5, pel.getCartelera());
			stmt.setString(6, pel.getImagen());
			stmt.setString(7, pel.getDescripcion());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void insertDatosCartelera(Connection con,Cartelera car) {
		try {
			PreparedStatement stmt=con.prepareStatement("Insert into Cartelera values(?,?,?,?)");
			stmt.setInt(1, car.getCod_Cartelera());
			stmt.setInt(2, car.getCod_Cine());
			stmt.setInt(3, car.getCod_Pelicula());
			stmt.setString(4, car.getFecha());
			
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertDatosReserva(Connection con,Reserva res) {
		try {
			PreparedStatement stmt=con.prepareStatement("Insert into Reserva values(?,?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1, res.getCod_res());
			stmt.setString(2, res.getUsu());
			stmt.setString(3, res.getCine());
			stmt.setString(4, res.getPelicula());
			stmt.setLong(5, res.getFecha().getTime());
			stmt.setString(6,res.getHora());
			stmt.setInt(7, res.getNumasientos());
			stmt.setInt(8, res.getAsiento());
			stmt.setDouble(9, res.getPrecio());
			stmt.setString(10,res.getTarjeta());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Usuario iniciarSesion(Connection con,String correo) {
		Usuario u=new Usuario();
		try {
			PreparedStatement stmt=con.prepareStatement("Select correo,contraseña from usuario where correo=?");
			stmt.setString(1, correo);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				
				u.setCorreo(rs.getString("correo"));
				u.setContrasenya(rs.getString("contraseña"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.log(Level.INFO, "Usuario:"+u);
		return u;
	}
	public Usuario getusuario(Connection con,String correo)  {
		Usuario u = new Usuario();
		try {
			PreparedStatement stmt=con.prepareStatement("Select correo,contraseña,nombre,apellido,tarjetadeusto from usuario where correo=?");
			stmt.setString(1,correo);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				
				u.setCorreo(rs.getString("correo"));
				u.setContrasenya(rs.getString("contraseña"));
				u.setNombre(rs.getString("nombre"));
				u.setApellido(rs.getString("apellido"));
				u.setTarjetadeusto(rs.getString("tarjetadeusto"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
		}
	public Cartelera getcartelera(Connection con,int codigo)  {
		Cartelera c = new Cartelera();
		try {
			PreparedStatement stmt=con.prepareStatement("Select cod_cartelera,cod_cine,cod_pelicula,fecha from cartelera where cod_cartelera=?");
			stmt.setInt(1,codigo);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				
				c.setCod_Cartelera(rs.getInt("cod_cartelera"));
				c.setCod_Cine(rs.getInt("cod_cine"));
				c.setCod_Pelicula(rs.getInt("cod_pelicula"));
				c.setFecha(rs.getString("fecha"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
		}
	public Cine getcine(Connection con,String nombre)  {
		Cine c = new Cine();
		try {
			PreparedStatement stmt=con.prepareStatement("Select cinnombre,cinloc,cod_cartelera,numsalas from cine where cinnombre=?");
			stmt.setString(1,nombre);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				
				c.setNombre(rs.getString("cinnombre"));
				c.setLocalizacion(rs.getString("cinloc"));
				c.setCartelera(rs.getInt("cod_cartelera"));
				c.setNumsalas(rs.getInt("numsalas"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
		}
	public Pelicula getpelicula(Connection con,int codigo)  {
		Pelicula p = new Pelicula();
		try {
			PreparedStatement stmt=con.prepareStatement("Select cod_pelicula,titulo,duracion,edad,horas,cartelera,imagen,descripcion from pelicula where cod_pelicula=?");
			stmt.setInt(1,codigo);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				p.setCod_Pelicula(rs.getInt("cod_pelicula"));
				p.setTitulo(rs.getString("titulo"));
				p.setDuracion(rs.getString("duracion"));
				p.setEdad(rs.getString("edad"));
				p.setHoras(rs.getString("horas"));
				p.setCartelera(rs.getInt("cartelera"));
				p.setImagen(rs.getString("imagen"));
				p.setDescripcion(rs.getString("descripcion"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
		}
	public Reserva getreserva(Connection con,int codigo)  {
		Reserva r = new Reserva();
		try {
			PreparedStatement stmt=con.prepareStatement("Select cod_res,usuario,cine,pelicula,fecha,hora,numasientos,asiento,precio,tarjeta from reserva where cod_res=?");
			stmt.setInt(1,codigo);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				r.setCod_res(rs.getInt("cod_res"));
				r.setUsu(rs.getString("usuario"));
				r.setCine(rs.getString("cine"));
				r.setPelicula(rs.getString("pelicula"));
				r.setFecha(rs.getDate("fecha"));
				r.setHora(rs.getString("hora"));
				r.setNumasientos(rs.getInt("numasientos"));
				r.setAsiento(rs.getInt("asiento"));
				r.setPrecio(rs.getDouble("precio"));
				r.setTarjeta(rs.getString("tarjeta"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
		}
	
			

			


	public static void main(String[] args) {
		
		
	}

}

