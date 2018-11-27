package mvc.controller;

import mvc.model.Partie;
import mvc.view.cadre.Cadre;

public class GameController {
	
	private Partie partie;
	private Cadre cadre;

	public GameController(Partie partie, Cadre cadre) {
		this.partie = partie;
		this.cadre = cadre;
		
		// Initialisation du cadre avec l'écran "menu"
		this.cadre.setScreen("menu");
	}	
	
}
