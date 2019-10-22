

public class Usuario {

	private String nombre;
	private String contrasenya;
	private String dni;
	private String correo;
	private String numtar;
	private String contar;
	private String cadtar;
	private String dinero;
	
	//Constructor
	public Usuario(String nombre, String contrasenya, String dni, String correo, String numtar, String contar, String cadtar, String dinero) {
		super();
		this.nombre = nombre;
		this.contrasenya = contrasenya;
		this.dni = dni;
		this.correo = correo;
		this.numtar = numtar;
		this.contar = contar;
		this.cadtar = cadtar;
		this.dinero = dinero;
	}



	//Getters y Setters
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getNumtar() {
		return numtar;
	}


	public void setNumtar(String numtar) {
		this.numtar = numtar;
	}


	public String getContar() {
		return contar;
	}


	public void setContar(String contar) {
		this.contar = contar;
	}


	public String getCadtar() {
		return cadtar;
	}


	public void setCadtar(String cadtar) {
		this.cadtar = cadtar;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String dinero) {
		this.contrasenya = contrasenya;
	}
	
	public String getDinero() {
		return dinero;
	}

	public void setDinero(String dinero) {
		this.dinero = dinero;
	}

	//To String
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contrasenya=" + contrasenya + ", dni=" + dni + ", correo=" + correo
				+ ", numtar=" + numtar + ", contar=" + contar + ", cadtar=" + cadtar + "]";
	}
	
	
	
}