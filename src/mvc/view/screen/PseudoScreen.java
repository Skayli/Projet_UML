package mvc.view.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import mvc.view.button_listener.ListenerToScreenMenu;
import mvc.view.button_listener.ListenerToScreenPlay;
import mvc.view.cadre.Cadre;

@SuppressWarnings("serial")
public class PseudoScreen extends Screen {

	JButton buttonToMenu, buttonToPlay;
	public ListenerToScreenMenu toMenu;
	public ListenerToScreenPlay toPlay;
	public JTextField textField;
	
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
		buttonToMenu.setFocusable(false);
		
		// Bouton vers jouer
		buttonToPlay = new JButton("Jouer");
		buttonToPlay.setSize(50, 20);
		toPlay = new ListenerToScreenPlay();
		buttonToPlay.addActionListener(toPlay);
		buttonToPlay.setFocusable(false);

		
		// Composants de "haut"
		haut.add(new JLabel("Pseudo"));
		
		// Composants de "centre"
		centre.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel titre = new JLabel("Saisir pseudo");
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		textField = new JTextField("pseudo");
		textField.setColumns(10);
//		textField.setPreferredSize(new Dimension( 50, 20 ));
//		textField.setMaximumSize(new Dimension( 50, 20 ));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		
//		JPanel wrapper = new JPanel( new FlowLayout(this.centre.getWidth()/2, this.centre.getHeight()/2, FlowLayout.LEADING) );
//		wrapper.add( textField );
		
		
		centre.add(titre, BorderLayout.CENTER);
		centre.add(textField, BorderLayout.CENTER);
		centre.setBackground(Color.pink);
				
		// Composants de "bas"
		bas.add(buttonToPlay);
		bas.add(buttonToMenu);
		
	}

}
