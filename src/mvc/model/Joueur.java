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
		// TODO Auto-generated method stub
		int rang = (int) (Math.random() * Carte.Rang.values().length);
		int couleur = (int) (Math.random() * Carte.Couleur.values().length);
		
		Rang rangCarte = Carte.Rang.values()[rang];
		Couleur couleurCarte = Carte.Couleur.values()[couleur];
		
		return new Carte(rangCarte, couleurCarte);
	}

	
	public String toString() {
		return "[Joueur => Nom : " + this.nom + " | Score : " + this.score + "]"; 
	}

}
