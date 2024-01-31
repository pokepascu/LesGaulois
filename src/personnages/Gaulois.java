package personnages;

public class Gaulois {
	//Déclaration des attributs
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

}

