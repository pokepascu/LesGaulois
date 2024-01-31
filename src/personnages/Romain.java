package personnages;

public class Romain {
	//D�claration des attributs
	String nom;
	int force;
	
	//constructeur de la classe
	public Romain(String nom, int force) {
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
    
    // M�thode recevoirCoup
    public void recevoirCoup(int forceDuCoup) {
        force -= forceDuCoup;

        if (force < 0) {
            force = 0;
        }

        if (force > 0) {
            parler("A�e !");
        } else {
            parler("J�abandonne�");
        }
    }

}
