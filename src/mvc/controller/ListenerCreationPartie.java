package mvc.controller;

import java.util.Observable;
import java.util.Observer;

public class ListenerCreationPartie implements Observer
{

	private GameController gameController;
	
	public ListenerCreationPartie(GameController gameController)
	{
		this.gameController = gameController;
	}
	
	@Override
	public void update(Observable o, Object arg)
	{
		this.gameController.createPartie("Pseudo");
	}

}
