package baseDeDatos;

import java.util.Date;

public class Reserva {
private static int count = 0; 
private int Cod_res;
private String usu;
private String cine;
private String pelicula;
private Date fecha;
private String hora;
private int numasientos;
private String asiento;
private double precio;
private String tarjeta;

public Reserva(String usu, String cine, String pelicula, Date fecha, String hora, int numasientos, String asiento,
		double precio, String tarjeta) {
	super();
	this.Cod_res=count++;
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

public Reserva() {
	super();
	this.Cod_res=0;
	this.usu = "";
	this.cine = "";
	this.pelicula = "";
	this.fecha = null;
	this.hora = "";
	this.numasientos = 0;
	this.asiento = "";
	this.precio = 0;
	this.tarjeta = "";
}

public int getCod_res() {
	return Cod_res;
}

public void setCod_res(int cod_res) {
	Cod_res = cod_res;
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

public String getHora() {
	return hora;
}

public void setHora(String hora) {
	this.hora = hora;
}

public int getNumasientos() {
	return numasientos;
}

public void setNumasientos(int numasientos) {
	this.numasientos = numasientos;
}

public String getAsiento() {
	return asiento;
}

public void setAsiento(String asiento) {
	this.asiento = asiento;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public String getTarjeta() {
	return tarjeta;
}

public void setTarjeta(String tarjeta) {
	this.tarjeta = tarjeta;
}

@Override
public String toString() {
	return "Reserva [usu=" + usu + ", cine=" + cine + ", pelicula=" + pelicula + ", fecha=" + fecha + ", hora=" + hora
			+ ", numasientos=" + numasientos + ", asiento=" + asiento + ", precio=" + precio + ", tarjeta=" + tarjeta
			+ "]";
}





}
