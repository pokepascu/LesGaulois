package personnages;

public class Soldat extends Romain {
	public Grade grade;

	
	@Override
	protected String donnerAuteur() {
		return grade.getNom();
	}
	
	@Override
	public void recevoirCoup(int forceCoup) {
	    int forceAbsorbee = 0;
	    

	    
	    if (forceCoup > 0) {
	        force = force - forceCoup;
	        if (force > 0) {
	            parler("Aïe");
	        } else {
	            force = 0;
	            parler("J'abandonne");
	        }
	    } 
	}
	
	public Soldat(String nom,  Grade grade, int force) {
		super(nom, force);
		this.grade = grade;
	}
	


}
