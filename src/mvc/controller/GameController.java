package mvc.controller;

import mvc.model.JeuDeCarte;
import mvc.view.cadre.Cadre;

public class GameController {
	
	private JeuDeCarte jeu;
	private Cadre cadre;

	public GameController(JeuDeCarte jeu, Cadre cadre) {
		this.jeu = jeu;
		this.cadre = cadre;
		
		// Initialisation du cadre avec l'écran "menu"
		this.cadre.setScreen("menu");
	}	
	
}
