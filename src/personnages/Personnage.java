package personnages;

public class Personnage {
	//Déclaration des attributs
	String nom;
	int force;
	
	//constructeur de la classe
	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	//getteur sur le nom de Personnage
    public String getNom() {
        return nom;
    }
    
    
    
    // Méthode parler
    public void parler(String texte) {
        System.out.println("Le Gaulois " + nom + " : «" + texte + "».");
    }
    
    
    // Méthode recevoirCoup
    public void recevoirCoup(int forceDuCoup) {
        force -= forceDuCoup;

        if (force < 0) {
            force = 0;
        }

        if (force > 0) {
            parler("Aïe !");
        } else {
            parler("J’abandonne…");
        }
    }
    
    
    // Méthode frapper
    public void frapper(Romain romain) {
        parler(nom + " envoie un grand coup dans la mâchoire dans " + romain.getNom());
        int forceDuCoup = force / 3;
        romain.recevoirCoup(forceDuCoup);
    }

    
    
    
    
    //MAIN
    
    public static void main(String[] args) {
		// Création d'un objet Personnage
		Personnage asterix = new Personnage("Astérix", 8);
		
        // Utilisation du getter pour obtenir le nom du Personnage
        String nomAsterix = asterix.getNom();

        // Affichage du packetage, classe et nom en hexa
        System.out.println(asterix);
		
        // Affichage du nom du Personnage
        System.out.println("Nom du Gaulois : " + nomAsterix);
		
	}

}

