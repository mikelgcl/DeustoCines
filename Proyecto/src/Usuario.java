
public class Usuario {
	String cor = " " ;
	String con = " " ;
	String nom = " " ;
	String apl= " " ;
	String tdb = " " ;
	
	public Usuario(String cor, String con, String nom, String apl, String tdb) {
		super();
		this.cor = cor;
		this.con = con;
		
		this.nom = nom;
		this.apl = apl;
		this.tdb = tdb;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApl() {
		return apl;
	}

	public void setApl(String apl) {
		this.apl = apl;
	}

	public String getTdb() {
		return tdb;
	}

	public void setTdb(String tdb) {
		this.tdb = tdb;
	}

	@Override
	public String toString() {
		return "Usuario [cor=" + cor + ", con=" + con +  ", nom=" + nom + ", apl=" + apl + ", tdb="
				+ tdb + "]";
	}
	
}
