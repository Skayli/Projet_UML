package mvc.view.screen;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import mvc.view.button_listener.ListenerToScreenMenu;
import mvc.view.cadre.Cadre;

@SuppressWarnings("serial")
public class ScoreScreen extends Screen {
	
	JButton buttonToMenu;
	public ListenerToScreenMenu toMenu;

	public ScoreScreen() {
		// TODO Auto-generated constructor stub
		haut = new JPanel();
		centre = new JPanel();
		bas = new JPanel();
		
		// Bouton vers menu
		buttonToMenu = new JButton("Menu");
		toMenu = new ListenerToScreenMenu();
		buttonToMenu.addActionListener(toMenu);
		buttonToMenu.setSize(50, 20);
		buttonToMenu.setFocusable(false);
		
		// Composants de "haut"
		haut.add(new JLabel("Score"));
		
		// Composants de "centre"
		centre.setLayout(new BorderLayout());
		JLabel titre = new JLabel("Tableau des scores");
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		centre.add(titre, BorderLayout.CENTER);
		centre.setBackground(Color.GREEN);
		
		// Composants de "bas"
		bas.add(buttonToMenu);
	}

}
