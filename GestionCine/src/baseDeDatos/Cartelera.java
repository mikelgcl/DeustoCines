package baseDeDatos;

public class Cartelera {
private static int count = 0; 
private int Cod_Cartelera;
private String Cod_Cine;
private int Cod_Pelicula;
private String fecha;

public Cartelera( String cod_Cine, int cod_Pelicula, String fecha) {
	super();
	Cod_Cartelera = count++;
	Cod_Cine = cod_Cine;
	Cod_Pelicula = cod_Pelicula;
	this.fecha = fecha;
}
public Cartelera() {
	super();
	Cod_Cartelera = 0;
	Cod_Cine = "";
	Cod_Pelicula = 0;
	this.fecha ="";
}

public int getCod_Cartelera() {
	return Cod_Cartelera;
}

public void setCod_Cartelera(int cod_Cartelera) {
	Cod_Cartelera = cod_Cartelera;
}

public String getCod_Cine() {
	return Cod_Cine;
}

public void setCod_Cine(String cod_Cine) {
	Cod_Cine = cod_Cine;
}

public int getCod_Pelicula() {
	return Cod_Pelicula;
}

public void setCod_Pelicula(int cod_Pelicula) {
	Cod_Pelicula = cod_Pelicula;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}


}
