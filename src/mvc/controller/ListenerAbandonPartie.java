package mvc.controller;

import java.util.Observable;
import java.util.Observer;

public class ListenerAbandonPartie implements Observer
{
 GameController gc;
	public ListenerAbandonPartie(GameController gc)
	{
		// TODO Auto-generated constructor stub
		this.gc = gc;
	}
	@Override
	public void update(Observable arg0, Object arg1)
	{
		// TODO Auto-generated method stub
		
		
	}
	
}
