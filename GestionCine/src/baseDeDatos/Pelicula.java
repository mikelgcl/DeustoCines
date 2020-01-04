package baseDeDatos;

public class Pelicula {
private static int count = 0; 
private int Cod_Pelicula;
private String titulo;
private String duracion;
private String edad;
private String horas;
private String imagen;
private String descripcion;




public Pelicula(String titulo, String duracion, String edad, String horas, 
		String imagen,String descripcion) {
	super();
	this.Cod_Pelicula = count++;
	this.titulo = titulo;
	this.duracion = duracion;
	this.edad = edad;
	this.horas = horas;
	this.imagen = imagen;
	this.descripcion=descripcion;
}
public Pelicula() {
	super();
	this.Cod_Pelicula = 0;
	this.titulo = "";
	this.duracion = "";
	this.edad = "";
	this.horas ="";
	
	this.imagen = "";
	this.descripcion="";
}
public int getCod_Pelicula() {
	return Cod_Pelicula;
}

public void setCod_Pelicula(int cod_Pelicula) {
	Cod_Pelicula = cod_Pelicula;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getDuracion() {
	return duracion;
}

public void setDuracion(String duracion) {
	this.duracion = duracion;
}

public String getEdad() {
	return edad;
}

public void setEdad(String edad) {
	this.edad = edad;
}

public String getHoras() {
	return horas;
}

public void setHoras(String string) {
	this.horas = string;
}

public String getImagen() {
	return imagen;
}

public void setImagen(String imagen) {
	this.imagen = imagen;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
 
}
