

public class Usuario {
	private String correo;
	private String contrasenya;
	private String nombre;
	private String apellido;
	private String tarjetadeusto;
	public Usuario(String correo, String contrasenya, String nombre, String apellido, String tarjetadeusto) {
		super();
		this.correo = correo;
		this.contrasenya = contrasenya;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tarjetadeusto = tarjetadeusto;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTarjetadeusto() {
		return tarjetadeusto;
	}
	public void setTarjetadeusto(String tarjetadeusto) {
		this.tarjetadeusto = tarjetadeusto;
	}
	@Override
	public String toString() {
		return "Usuario [correo=" + correo + ", contrasenya=" + contrasenya + ", nombre=" + nombre + ", apellido="
				+ apellido + ", tarjetadeusto=" + tarjetadeusto + "]";
	}
	
	
	
}
