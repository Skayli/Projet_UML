package mvc.model;

public class Joueur {

	private String nom;
	private int score;
	
	public Joueur(String nom) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.score = 0;
	}
	
	/********************
	 * GETTER & SETTERS *
	 ********************/
	public String getNom() {
		return nom;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	/********************
	 * Fonctions utiles *
	 ********************/
	public void updateScore(int addToScore) {
		this.score += addToScore;
	}
	
	public String toString() {
		return "[Joueur => Nom : " + this.nom + " | Score : " + this.score + "]"; 
	}

}
