package personnages;

public class Gaulois {
	//D�claration des attributs
	String nom;
	int force;
	
	//constructeur de la classe
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	//getteur sur le nom de Gaulois
    public String getNom() {
        return nom;
    }
    
    
    
    // M�thode parler
    public void parler(String texte) {
        System.out.println("Le gaulois " + nom + " : �" + texte + "�.");
    }

    
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

