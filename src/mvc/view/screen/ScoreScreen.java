package mvc.view.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import mvc.model.Joueur;
import mvc.view.button_listener.ListenerToScreenMenu;
import mvc.view.cadre.Cadre;

@SuppressWarnings("serial")
public class ScoreScreen extends Screen implements Observer {
	
	JButton buttonToMenu;
	public ListenerToScreenMenu toMenu;
	JPanel panelScores;

	public ScoreScreen() {
		// TODO Auto-generated constructor stub
		haut = new JPanel();
		centre = new JPanel();
		bas = new JPanel();
		
		panelScores = new JPanel();
		panelScores.setLayout(new GridLayout(0,1));
		
		// Couleur
		centre.setBackground(Color.GREEN);
		panelScores.setBackground(centre.getBackground());
		
		// Bouton vers menu
		buttonToMenu = new JButton("Menu");
		toMenu = new ListenerToScreenMenu();
		buttonToMenu.addActionListener(toMenu);
		buttonToMenu.setSize(50, 20);
		buttonToMenu.setFocusable(false);
		
		// Composants de "haut"
		haut.add(new JLabel("Tableau des scores"));
		
		// Composants de "centre"
		centre.setLayout(new BorderLayout());
		centre.add(panelScores, BorderLayout.CENTER);

		
		// Composants de "bas"
		bas.add(buttonToMenu);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		updateScreenScore((ArrayList<Joueur>) arg);
	}
	
	public void updateScreenScore(ArrayList<Joueur> listeScores) {
		panelScores.removeAll();
		
		int rang = 1;
		for(Joueur j : listeScores) {
			JLabel newScore = new JLabel("["+rang+"] " + j.getNom() + " | " + j.getScore());
			newScore.setHorizontalAlignment(SwingConstants.CENTER);
			panelScores.add(newScore);
			rang++;
		}
		
	}

}
