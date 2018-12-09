package mvc.view.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import mvc.view.button_listener.ListenerToScreenPseudo;
import mvc.view.button_listener.ListenerToScreenScore;
import mvc.view.cadre.Cadre;

@SuppressWarnings("serial")
public class MenuScreen extends Screen {

	JPanel haut, centre, bas;
	JButton buttonToPseudo, buttonToScore;
	public ListenerToScreenPseudo toPseudo;
	public ListenerToScreenScore toScore;
	
	public MenuScreen() {
		// TODO Auto-generated constructor stub
		haut = new JPanel();
		centre = new JPanel();
		bas = new JPanel();
		
		// Bouton vers pseudo
		buttonToPseudo = new JButton("Pseudo");
		buttonToPseudo.setSize(50, 20);
		toPseudo = new ListenerToScreenPseudo();
		buttonToPseudo.addActionListener(toPseudo);
		buttonToPseudo.setFocusable(false);
		
		// Bouton vers score
		buttonToScore = new JButton("Score");
		buttonToScore.setSize(50,20);
		toScore = new ListenerToScreenScore();
		buttonToScore.addActionListener(toScore);
		buttonToScore.setFocusable(false);
		
		// Composants de "haut"
		haut.add(new JLabel("Menu principal"));
		
		// Composants de "centre"
		JLabel titre = new JLabel("Bievenue sur le jeu !");
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		centre.setLayout(new BorderLayout());
		centre.add(titre, BorderLayout.CENTER);
		centre.setBackground(Color.gray);
	
		// Composants de "bas"
		bas.add(buttonToPseudo);
		bas.add(buttonToScore);
		
	}
	
}
