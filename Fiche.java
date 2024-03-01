package tp1ex2;

public class Fiche {
	
	private String nom;
	private String numéro;
	private String adresse;
	
	public Fiche(String nom, String numéro, String adresse) {
		super();
		this.nom = nom;
		this.numéro = numéro;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNuméro() {
		return numéro;
	}

	public void setNuméro(String numéro) {
		this.numéro = numéro;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Fiche [nom=" + nom + ", numero=" + numéro + ", adresse=" + adresse + "]";
	}
	
	
	
	

}
