package mvc.controller;

import mvc.model.JeuDeCarte;
import mvc.model.Joueur;
import mvc.model.TableauScore;
import mvc.view.cadre.Cadre;

public class GameController {
	
	private JeuDeCarte jeu;
	private Cadre cadre;

	public GameController(Cadre cadre, JeuDeCarte jeu) {
		this.cadre = cadre;
		this.jeu = jeu;
		
		// Initialisation du cadre avec l'écran "menu"
		this.cadre.setScreen("menu");
	}
	
	public JeuDeCarte getJeu()
	{
		return jeu;
	}


	public void setJeu(JeuDeCarte jeu)
	{
		this.jeu = jeu;
	}


	public Cadre getCadre()
	{
		return cadre;
	}


	public void setCadre(Cadre cadre)
	{
		this.cadre = cadre;
	}


	public void createPartie(String pseudo)
	{
		this.jeu.initialiserPartie(pseudo);
	}
	
}
