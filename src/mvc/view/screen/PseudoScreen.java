package mvc.view.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import mvc.view.button_listener.ListenerToScreenMenu;
import mvc.view.button_listener.ListenerToScreenPlay;
import mvc.view.cadre.Cadre;

@SuppressWarnings("serial")
public class PseudoScreen extends Screen {

	JPanel haut, centre, bas;
	JButton buttonToMenu, buttonToPlay;
	public ListenerToScreenMenu toMenu;
	public ListenerToScreenPlay toPlay;
	
	public PseudoScreen() {
		// TODO Auto-generated constructor stub
		haut = new JPanel();
		centre = new JPanel();
		bas = new JPanel();

		// Bouton vers le menu
		buttonToMenu = new JButton("Menu");
		toMenu = new ListenerToScreenMenu();
		buttonToMenu.addActionListener(toMenu);
		buttonToMenu.setSize(50, 20);
		
		// Bouton vers jouer
		buttonToPlay = new JButton("Jouer");
		buttonToPlay.setSize(50, 20);
		toPlay = new ListenerToScreenPlay();
		buttonToPlay.addActionListener(toPlay);

		
		// Composants de "haut"
		haut.add(new JLabel("Pseudo"));
		
		// Composants de "centre"
		centre.setLayout(new BorderLayout());
		JLabel titre = new JLabel("Saisir pseudo");
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		centre.add(titre, BorderLayout.CENTER);
		centre.setBackground(Color.pink);
				
		// Composants de "bas"
		bas.add(buttonToPlay);
		bas.add(buttonToMenu);
		
		
	}

	@Override
	public void addContent(Cadre cadre) {
		// TODO Auto-generated method stub
		cadre.add(haut, BorderLayout.NORTH);
		cadre.add(centre, BorderLayout.CENTER);
		cadre.add(bas, BorderLayout.SOUTH);
	}

}
