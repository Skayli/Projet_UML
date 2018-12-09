package mvc.model;

import java.util.Observable;
import java.util.concurrent.TimeUnit;

import mvc.controller.GameController;
import mvc.model.Carte.Couleur;
import mvc.model.Carte.Rang;

public class JeuDeCarte extends Observable {
	
	private Joueur joueur;
	private GameController gameController;
	private TableauScore tabScores;
	
	private final int MAX_TOURS = 5;
	private int tour;
	
	private Carte c1, c2;
	
	public JeuDeCarte() {
		// TODO Auto-generated constructor stub
		this.tabScores = new TableauScore();
		
		this.c1 = new Carte();
		this.c2 = new Carte();
	}
	
	public void initialiserPartie(String pseudo) {
		this.joueur = new Joueur(pseudo);
		this.tour = 1;
	}
	
	/********************
	 * Fonctions utiles *
	 ********************/
	public void jouerTour() {		
		joueur.tirerCarte(c1);
		
		do {
			joueur.tirerCarte(c2);
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
			
			this.tabScores.updateScore(joueur);
			
			this.setChanged();
			this.notifyObservers("fin de partie");
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
	
	private boolean isPartieTerminee() {
		return tour > MAX_TOURS;
	}

	//-----------------------------------------------------------------------------------------

}
