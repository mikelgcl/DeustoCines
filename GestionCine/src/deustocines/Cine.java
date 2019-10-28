package deustocines;

public class Cine {
	 private String nombre;
	 private String localizacion;
	 private String cartelera; 
	 private int numsalas;

	 public Cine(String nombre, String localizacion, String cartelera, int numsalas) {
		super();
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.cartelera = cartelera;
		this.numsalas = numsalas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public String getCartelera() {
		return cartelera;
	}

	public void setCartelera(String cartelera) {
		this.cartelera = cartelera;
	}

	public int getNumsalas() {
		return numsalas;
	}

	public void setNumsalas(int numsalas) {
		this.numsalas = numsalas;
	}
}
