package mvc.view.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
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

	public JButton buttonToMenu, buttonJouerTour, buttonToScore;
	public JLabel labelIndicationTour, labelCarte1, labelCarte2, labelScoreTour, labelScoreJoueur;
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
		
		// Label indicationTour
		labelIndicationTour = new JLabel("Tours joués : 0 / 5");
		labelIndicationTour.setHorizontalAlignment(SwingConstants.CENTER);
		
		// Label carte 1
		labelCarte1 = new JLabel("Carte 1 : Pas de tour joué");
		labelCarte1.setHorizontalAlignment(SwingConstants.CENTER);
		
		// Label carte 2
		labelCarte2 = new JLabel("Carte 2 :  pas de tour joué");
		labelCarte2.setHorizontalAlignment(SwingConstants.CENTER);
		
		// Label scoreTour
		labelScoreTour = new JLabel("Score du tour : pas de tour joué");
		labelScoreTour.setHorizontalAlignment(SwingConstants.CENTER);
		
		// Label scorePartie
		labelScoreJoueur = new JLabel("Score de la partie : 0");
		labelScoreJoueur.setHorizontalAlignment(SwingConstants.CENTER);
		
		// Composants de "haut"
		haut.add(new JLabel("Plateau de jeu"));
		
		// Composants de "centre"
		centre.setLayout(new BorderLayout());
		centre.setBackground(Color.yellow);
		
		// Centre du panel centre
		JPanel centreCentre = new JPanel(new GridLayout(0, 2));
		centreCentre.add(labelCarte1, 0, 0);
		centreCentre.add(labelCarte2, 0 ,1);
		centreCentre.setBackground(centre.getBackground());
		
		// Bottom du panel centre
		JPanel centreBottom = new JPanel(new GridLayout(0, 2, 2, 2));
		centreBottom.add(labelScoreTour, 0, 0);
		centreBottom.add(labelScoreJoueur, 0, 1);
		centreBottom.setBackground(centre.getBackground());
		
		centre.add(labelIndicationTour, BorderLayout.NORTH);
		centre.add(centreCentre, BorderLayout.CENTER);
		centre.add(centreBottom, BorderLayout.SOUTH);
		
		// Composants de "bas"
		bas.add(buttonToScore);
		bas.add(buttonJouerTour);
		bas.add(buttonToMenu);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		if(arg1.getClass() == String.class) {
			buttonJouerTour.setVisible(false);
			buttonToMenu.setVisible(false);
			buttonToScore.setVisible(true);
		} else {
			String[] donneesDuTour = (String[]) arg1;
			labelCarte1.setText("Carte 1 : " + donneesDuTour[0]);
			labelCarte2.setText("Carte 2 : " + donneesDuTour[1]);
			labelIndicationTour.setText("Tours joues : " + donneesDuTour[2] + " / 5");
			labelScoreJoueur.setText("Score de la partie : " + donneesDuTour[3]);
			labelScoreTour.setText("Score du tour :  " + donneesDuTour[4]);
		}
		
	}
	
	public void reset() {
		labelCarte1.setText("Carte 1 : pas de tour joué");
		labelCarte2.setText("Carte 2 : pas de tour joué");
		labelIndicationTour.setText("Tours joues : 0 / 5");
		labelScoreJoueur.setText("Score de la partie : 0");
		labelScoreTour.setText("Score du tour : pas de tour joué");
	}

}
