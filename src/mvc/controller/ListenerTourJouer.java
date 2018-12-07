package mvc.controller;

import java.util.Observable;
import java.util.Observer;

import mvc.model.JeuDeCarte;

public class ListenerTourJouer implements Observer {
	
	GameController gc;

	public ListenerTourJouer(GameController gc) {
		// TODO Auto-generated constructor stub
		this.gc = gc;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		gc.getJeu().jouerTour();
	} 

}
