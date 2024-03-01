package tp1ex2;

import java.util.HashMap;
import java.util.Map;

public class Annuaire {
	
	private Map<String,Fiche> annuaire ;
	
	public Annuaire() {
		this.annuaire = new HashMap<>();
	}
	
	public void ajouterFiche(String nom,Fiche fiche) {
		annuaire.put(nom, fiche);
	}
	
	public Fiche rechercheFiche(String nom) {
		return annuaire.get(nom);
	}
	
	public void afficheFiche() {
		for(Fiche fiche : annuaire.values()) {
			System.out.println(fiche);
		}
	}
	
	
	

}
