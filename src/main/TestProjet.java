package main;

import mvc.controller.GameController;
import mvc.model.Partie;
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
		Partie p = new Partie();
		
		
		
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
		Cadre c = new Cadre(sc);
		
		
		
		
		/**************
		 * Controller *
		 **************/
		
		// Controller
		GameController gc = new GameController(p, c);
		
		
		/************
		 * Observer *
		 ************/
		// DP Observer
		menu.toPseudo.addObserver(c);
		menu.toScore.addObserver(c);
		
		pseudo.toMenu.addObserver(c);
		pseudo.toPlay.addObserver(c);
		
		score.toMenu.addObserver(c);
		
		play.toMenu.addObserver(c);
		
	}

}
