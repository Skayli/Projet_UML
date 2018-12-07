package mvc.model;

import java.util.Observable;

import mvc.controller.GameController;
import mvc.model.Carte.Couleur;
import mvc.model.Carte.Rang;

public class JeuDeCarte extends Observable {
	
	private Joueur joueur;
	private GameController gameController;
	private final int MAX_TOURS = 5;
	private int tour;
	
	private Carte c1, c2;
	
	public JeuDeCarte(Joueur joueur) {
		// TODO Auto-generated constructor stub
		this.joueur = joueur;
		this.tour = 1;
		this.gameController = gameController;
	}
	
	public void initialiserPartie(Joueur j) {
		this.joueur = j;
		this.tour = 1;
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
	
	public void setGameController(GameController gameController)
	{
		this.gameController = gameController;
	}
	
	/********************
	 * Fonctions utiles *
	 ********************/
	public void jouerTour() {
		Carte c1, c2;
		
		c1 = joueur.tirerCarte();
		
		do {
			c2 = joueur.tirerCarte();
		} while(Carte.areEquals(c1, c2));
		
		
		int scoreTour = comparerCartes(c1, c2);
		System.out.println("Carte 1 : " + c1);
		System.out.println("Carte 2 : " + c2);
		System.out.println("ScoreTour = " + scoreTour);
		joueur.updateScore(scoreTour);
		tour++;
		
		if(isPartieTerminee()) {
			System.out.println("partie terminée");
			
			System.out.println("Score joueur " + joueur.getScore());
			
			this.gameController.getTableauScores().updateScore(joueur);
			
			this.setChanged();
			this.notifyObservers("score");
		}
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
		return tour > MAX_TOURS;
	}

	public Carte getC1()
	{
		return c1;
	}

	public void setC1(Carte c1)
	{
		this.c1 = c1;
	}

	public Carte getC2()
	{
		return c2;
	}

	public void setC2(Carte c2)
	{
		this.c2 = c2;
	}

	//-----------------------------------------------------------------------------------------

}
