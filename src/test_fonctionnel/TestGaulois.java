package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		// Création d'un objet Gaulois
		Gaulois asterix = new Gaulois("Astérix", 8);
		
        // Utilisation du getter pour obtenir le nom du Gaulois
        String nomAsterix = asterix.getNom();
        
        // Utilisation de la méthode parler
        asterix.parler("Bonjour à tous");

        // Affichage du packetage, classe et nom en hexa
        System.out.println(asterix);
		
        // Affichage du nom du Gaulois
        System.out.println("Nom du Gaulois : " + nomAsterix);
	}

}

