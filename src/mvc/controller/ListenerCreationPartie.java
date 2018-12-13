package mvc.controller;

import java.util.Observable;
import java.util.Observer;

import mvc.view.screen.PlayScreen;
import mvc.view.screen.PseudoScreen;

public class ListenerCreationPartie implements Observer
{

	private GameController gameController;
	private PseudoScreen ps;
	private PlayScreen play;
	
	public ListenerCreationPartie(GameController gameController, PseudoScreen ps, PlayScreen play)
	{
		this.gameController = gameController;
		this.ps = ps;
		this.play = play;
	}
	
	@Override
	public void update(Observable o, Object arg)
	{
		this.gameController.createPartie(ps.textField.getText());
		this.play.reset();
		
		this.play.buttonJouerTour.setVisible(true);
		this.play.buttonToMenu.setVisible(true);
		this.play.buttonToScore.setVisible(false);
	}

}
