package tp1ex2;

import java.util.Scanner;

public class TestAnnuaire {

	public static void main(String[] args) {
		Annuaire annuaire = new Annuaire();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer une commande +nom , ?nom , !bye : ");
		
		while (true) {
	        String commande = sc.nextLine();

	        if (commande.startsWith("+")== true) {
	        	
	        	String nom = commande.substring(1);
	            System.out.println("Entrez le num :");
	            String numero = sc.nextLine();
	            System.out.println("Entrez l'adresse :");
	            String adresse = sc.nextLine();
	            Fiche fiche = new Fiche(nom, numero, adresse);
	            annuaire.ajouterFiche(nom, fiche);
	            System.out.println("ajout : " + nom);
	            annuaire.afficheFiche();
	          
	            
	        } else if (commande.startsWith("?")== true) {
	            String nom = commande.substring(1);
	            Fiche fiche = annuaire.rechercheFiche(nom);
	            if (fiche != null) {
	                System.out.println(fiche);
	            } else {
	                System.out.println("Aucune fiche trouvée pour le nom : " + nom);
	            }
	        } else if (commande.equals("!")) {
	            annuaire.afficheFiche();
	        }
	        else {
	        	System.out.println("arrêt du programme ");
	        }
	}
	}
}
