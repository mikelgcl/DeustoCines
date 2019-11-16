package baseDeDatos;

public class Cine {
	 private String nombre;
	 private String localizacion;
	 private int Cod_cartelera; 
	 private int numsalas;

	 public Cine(String nombre, String localizacion, int cartelera, int numsalas) {
		super();
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.Cod_cartelera = cartelera;
		this.numsalas = numsalas;
	}
	 public Cine() {
			super();
			this.nombre = "";
			this.localizacion = "";
			this.Cod_cartelera = 0;
			this.numsalas = 0;
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

	public int getCartelera() {
		return Cod_cartelera;
	}

	public void setCartelera(int cartelera) {
		this.Cod_cartelera = cartelera;
	}

	public int getNumsalas() {
		return numsalas;
	}

	public void setNumsalas(int numsalas) {
		this.numsalas = numsalas;
	}
}
