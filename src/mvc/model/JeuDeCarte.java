package mvc.model;

import mvc.model.Carte.Couleur;
import mvc.model.Carte.Rang;

public class JeuDeCarte {
	
	private Joueur joueur;
	private int nbTour;
	private int tourActuel;
	
	public JeuDeCarte(Joueur joueur) {
		// TODO Auto-generated constructor stub
		this.joueur = joueur;
		
		this.nbTour = 5;
		this.tourActuel = 1;
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
		Carte c1, c2;
		
		c1 = getRandomCarte();
		do {
			c2 = getRandomCarte();
		} while(Carte.areEquals(c1, c2));
		
//		System.out.println("Carte 1 : " + c1);
//		System.out.println("Carte 2 : " + c2);
		
		int scoreTour = comparerCartes(c1, c2);
		
		updateScoreJoueur(scoreTour);
		
		tourActuel++;
	}

	private Carte getRandomCarte() {
		// TODO Auto-generated method stub
		int rang = (int) (Math.random() * Carte.Rang.values().length);
		int couleur = (int) (Math.random() * Carte.Couleur.values().length);
		
		Rang rangCarte = Carte.Rang.values()[rang];
		Couleur couleurCarte = Carte.Couleur.values()[couleur];
		
		return new Carte(rangCarte, couleurCarte);
	}

	public void updateScoreJoueur(int scoreTour) {
		joueur.updateScore(scoreTour);
	}
	
	public int comparerCartes(Carte c1, Carte c2) {
		int sommeValeur = c1.getRang().value + c2.getRang().value;
		
		if(c1.getCouleur().couleur == c2.getCouleur().couleur && c1.getRang() == c2.getRang()) {
			sommeValeur *= -2;
		} else if (c1.getRang() == c2.getRang()) {
			sommeValeur *= -1;
		}
		
		return sommeValeur;
	}
	
	public boolean isPartieTerminee() {
		return this.tourActuel == this.nbTour;
	}

	//-----------------------------------------------------------------------------------------

}
