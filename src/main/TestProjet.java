package main;

import mvc.controller.GameController;
import mvc.model.Carte;
import mvc.model.Carte.Couleur;
import mvc.model.Carte.Rang;
import mvc.model.JeuDeCarte;
import mvc.model.Joueur;
import mvc.view.cadre.Cadre;
import mvc.view.screen.MenuScreen;
import mvc.view.screen.PlayScreen;
import mvc.view.screen.PseudoScreen;
import mvc.view.screen.ScoreScreen;
import mvc.view.screen_manager.ScreenManager;

public class TestProjet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		/*********
		 * Model *
		 *********/
		Joueur j = new Joueur("Pseudo");
		JeuDeCarte partie = new JeuDeCarte(j);
		
		/********
		 * View *
		 ********/
		
		// Screens
		MenuScreen menu = new MenuScreen();
		PseudoScreen pseudo = new PseudoScreen();
		ScoreScreen score = new ScoreScreen();
		PlayScreen play = new PlayScreen();
		
		// Screen manager
		ScreenManager sc = new ScreenManager();
		
		sc.addScreen("menu", menu);
		sc.addScreen("pseudo", pseudo);
		sc.addScreen("score", score);
		sc.addScreen("play", play);
		
		// Cadre (fenetre) 
		Cadre cadre = new Cadre(sc);
		
		/**************
		 * Controller *
		 **************/
		
		// Controller
		GameController gc = new GameController(partie, cadre);
		
		
		/************
		 * Observer *
		 ************/
		// DP Observer
		menu.toPseudo.addObserver(cadre);
		menu.toScore.addObserver(cadre);
		
		pseudo.toMenu.addObserver(cadre);
		pseudo.toPlay.addObserver(cadre);
		
		score.toMenu.addObserver(cadre);
		
		play.toMenu.addObserver(cadre);
		
	}

}
