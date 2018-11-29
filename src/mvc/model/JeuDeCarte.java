package mvc.model;

public class JeuDeCarte {
	
	private Joueur joueur;
	private int nbTour = 5;
	private int tourActuel = 1;
	
	public JeuDeCarte(Joueur joueur) {
		// TODO Auto-generated constructor stub
		this.joueur = joueur;
	}
	
	/********************
	 * GETTER & SETTERS *
	 ********************/
	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	
	/********************
	 * Fonctions utiles *
	 ********************/
	public void jouerTour() {
		
	}
	
	public void updateScoreJoueur() {
		
	}
	
	public void comparerCartes(Carte carteA, Carte carteB) {
		
	}
	
	public boolean isPartieTerminee() {
		return this.tourActuel == this.nbTour;
	}

	//-----------------------------------------------------------------------------------------

}
