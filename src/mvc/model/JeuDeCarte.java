package mvc.model;

import java.util.ArrayList;

import mvc.model.Carte.Couleur;
import mvc.model.Carte.Rang;

public class JeuDeCarte {
	
	private Carte[] paquet;
	private Joueur joueur;
	
	public JeuDeCarte() {
		// TODO Auto-generated constructor stub
		paquet = new Carte[Couleur.values().length * Rang.values().length];
		
		// Initialisation du paquet
		for(int i = 0; i < Couleur.values().length; i++) {
			for(int j = 0; j < Rang.values().length; j++) {
				paquet[i] = new Carte(Rang.values()[i], Couleur.values()[i]);
			}
		}		
	}
	
	/********************
	 * GETTER & SETTERS *
	 ********************/
	public Carte[] getPaquet() {
		return paquet;
	}

	public void setPaquet(Carte[] paquet) {
		this.paquet = paquet;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	//-----------------------------------------------------------------------------------------

}
