package mvc.view.button_listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

/**
 * Classe gérant les boutons servant à afficher l'écran de jeu
 * @author Quentin
 *
 */
public class ListenerToScreenPlay extends Observable implements ActionListener {

	public ListenerToScreenPlay() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.setChanged();
		this.notifyObservers("play");
	}

}
