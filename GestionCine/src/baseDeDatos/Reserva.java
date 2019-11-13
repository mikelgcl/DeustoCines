package baseDeDatos;

import java.util.Date;

public class Reserva {
private String usu;
private String cine;
private String pelicula;
private Date fecha;
private Date hora;
private int numasientos;
private int asiento;
private double precio;
private int tarjeta;

public Reserva(String usu, String cine, String pelicula, Date fecha, Date hora, int numasientos, int asiento,
		double precio, int tarjeta) {
	super();
	this.usu = usu;
	this.cine = cine;
	this.pelicula = pelicula;
	this.fecha = fecha;
	this.hora = hora;
	this.numasientos = numasientos;
	this.asiento = asiento;
	this.precio = precio;
	this.tarjeta = tarjeta;
}

public String getUsu() {
	return usu;
}

public void setUsu(String usu) {
	this.usu = usu;
}

public String getCine() {
	return cine;
}

public void setCine(String cine) {
	this.cine = cine;
}

public String getPelicula() {
	return pelicula;
}

public void setPelicula(String pelicula) {
	this.pelicula = pelicula;
}

public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public Date getHora() {
	return hora;
}

public void setHora(Date hora) {
	this.hora = hora;
}

public int getNumasientos() {
	return numasientos;
}

public void setNumasientos(int numasientos) {
	this.numasientos = numasientos;
}

public int getAsiento() {
	return asiento;
}

public void setAsiento(int asiento) {
	this.asiento = asiento;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public int getTarjeta() {
	return tarjeta;
}

public void setTarjeta(int tarjeta) {
	this.tarjeta = tarjeta;
}





}
