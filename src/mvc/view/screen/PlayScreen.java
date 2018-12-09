package mvc.view.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import mvc.view.button_listener.ListenerBoutonJouerTour;
import mvc.view.button_listener.ListenerToScreenMenu;
import mvc.view.button_listener.ListenerToScreenScore;
import mvc.view.cadre.Cadre;

@SuppressWarnings("serial")
public class PlayScreen extends Screen implements Observer {

	JPanel haut, centre, bas;
	public JButton buttonToMenu, buttonJouerTour, buttonToScore;
	public ListenerToScreenMenu toMenu;
	public ListenerToScreenScore toScore;
	public ListenerBoutonJouerTour jouerTour;
	
	public PlayScreen() {
		// TODO Auto-generated constructor stub
		haut = new JPanel();
		centre = new JPanel();
		bas = new JPanel();
		
		// Bouton vers menu
		buttonToMenu = new JButton("Abandonner (retour menu)");
		toMenu = new ListenerToScreenMenu();
		buttonToMenu.addActionListener(toMenu);
		buttonToMenu.setSize(50, 20);
		buttonToMenu.setFocusable(false);
		
		// Bouton vers les scores
		buttonToScore = new JButton("Voir la liste des scores");
		toScore = new ListenerToScreenScore();
		buttonToScore.addActionListener(toScore);
		buttonToScore.setSize(50,20);
		buttonToScore.setVisible(false);
		buttonToScore.setFocusable(false);
		
		// Bouton jouer tour
		buttonJouerTour = new JButton("Jouer un tour");
		jouerTour = new ListenerBoutonJouerTour();
		buttonJouerTour.addActionListener(jouerTour);
		buttonJouerTour.setSize(50, 20);
		buttonJouerTour.setFocusable(false);
		
		// Composants de "haut"
		haut.add(new JLabel("Jouer"));
		
		// Composants de "centre"
		centre.setLayout(new BorderLayout());
		JLabel titre = new JLabel("Zone de jeu");
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		centre.add(titre, BorderLayout.CENTER);
		centre.setBackground(Color.yellow);
		
		// Composants de "bas"
		bas.add(buttonToScore);
		bas.add(buttonJouerTour);
		bas.add(buttonToMenu);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		buttonJouerTour.setVisible(false);
		buttonToMenu.setVisible(false);
		buttonToScore.setVisible(true);
	}

}
