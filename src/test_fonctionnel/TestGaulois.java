package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		// Création d'un objet Gaulois
		Gaulois asterix = new Gaulois("Astérix", 8);
		
        // Utilisation du getter pour obtenir le nom du Gaulois
        String nomAsterix = asterix.getNom();
        
        // Utilisation de la méthode parler
        asterix.parler("Bonjour à tous");

        // Affichage du packetage, classe et nom en hexa
        //System.out.println(asterix);
		
        // Affichage du nom du Gaulois
        //System.out.println("Nom du Gaulois : " + nomAsterix);
        
        
        Romain minus = new Romain("Minus", 6);
        minus.parler("UN GAU… UN GAUGAU…");
        
        
        
        // Utilisation de la méthode recevoirCoup avec une boucle for
        /*for (int i = 0; i < 2; i++) {
            minus.recevoirCoup(3);
        }*/
        
        asterix.frapper(minus);

	}
}

