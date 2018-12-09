package mvc.model;

import mvc.model.Carte.Couleur;
import mvc.model.Carte.Rang;

public class Joueur {

	private String nom;
	private int score;
	
	public Joueur(String nom) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.score = 0;
	}
	
	public Joueur(Joueur j) {
		this.nom = j.nom;
		this.score = j.score;
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
	
	public Carte tirerCarte() {
		return Carte.piocher();
	}

	
	public String toString() {
		return "[Joueur => Nom : " + this.nom + " | Score : " + this.score + "]"; 
	}

}
