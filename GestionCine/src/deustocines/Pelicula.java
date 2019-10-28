package deustocines;

public class Pelicula {
private String titulo;
private String duracion;
private String edad;
private String horas;

public Pelicula(String titulo, String duracion, String edad, String horas) {
	super();
	this.titulo = titulo;
	this.duracion = duracion;
	this.edad = edad;
	this.horas = horas;
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

public void setHoras(String horas) {
	this.horas = horas;
}
 
 
}
