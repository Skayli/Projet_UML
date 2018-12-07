package mvc.controller;

import java.util.Observable;
import java.util.Observer;

import mvc.view.screen.PseudoScreen;

public class ListenerCreationPartie implements Observer
{

	private GameController gameController;
	private PseudoScreen ps;
	
	public ListenerCreationPartie(GameController gameController, PseudoScreen ps)
	{
		this.gameController = gameController;
		this.ps = ps;
	}
	
	@Override
	public void update(Observable o, Object arg)
	{
		this.gameController.createPartie(ps.textField.getText());
	}

}
