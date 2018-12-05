package mvc.view.screen;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import mvc.view.button_listener.ListenerBoutonJouerTour;
import mvc.view.button_listener.ListenerToScreenMenu;
import mvc.view.cadre.Cadre;

@SuppressWarnings("serial")
public class PlayScreen extends Screen {

	JPanel haut, centre, bas;
	JButton buttonToMenu, buttonJouerTour;
	public ListenerToScreenMenu toMenu;
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
		
		// Bouton jouer tour
		buttonJouerTour = new JButton("Jouer un tour");
		jouerTour = new ListenerBoutonJouerTour();
		buttonJouerTour.addActionListener(jouerTour);
		buttonJouerTour.setSize(50, 20);
		
		// Composants de "haut"
		haut.add(new JLabel("Jouer"));
		
		// Composants de "centre"
		centre.setLayout(new BorderLayout());
		JLabel titre = new JLabel("Zone de jeu");
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		centre.add(titre, BorderLayout.CENTER);
		centre.setBackground(Color.yellow);
		
		// Composants de "bas"
		bas.add(buttonJouerTour);
		bas.add(buttonToMenu);
	}

	@Override
	public void addContent(Cadre cadre) {
		// TODO Auto-generated method stub
		cadre.getContentPane().add(haut, BorderLayout.NORTH);
		cadre.getContentPane().add(centre, BorderLayout.CENTER);
		cadre.getContentPane().add(bas, BorderLayout.SOUTH);
	}

}
