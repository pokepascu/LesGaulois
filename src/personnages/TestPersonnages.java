package personnages;

public class TestPersonnages {
	public static void main(String[] args) {
		// Cr�ation d'un objet Gaulois
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		
        // Utilisation du getter pour obtenir le nom du Gaulois
        String nomAsterix = asterix.getNom();

        // Affichage du packetage, classe et nom en hexa
        System.out.println(asterix);
		
        // Affichage du nom du Gaulois
        System.out.println("Nom du Gaulois : " + nomAsterix);
	}
	

}
