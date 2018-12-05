package mvc.controller;

import java.util.Observable;
import java.util.Observer;

import mvc.model.JeuDeCarte;

public class ListenerTourJouer implements Observer {
	
	JeuDeCarte jeu;

	public ListenerTourJouer(JeuDeCarte c) {
		// TODO Auto-generated constructor stub
		jeu = c;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		jeu.jouerTour();
	} 

}
