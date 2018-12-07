package mvc.controller;

import mvc.model.JeuDeCarte;
import mvc.model.Joueur;
import mvc.model.TableauScore;
import mvc.view.cadre.Cadre;

public class GameController {
	
	private JeuDeCarte jeu;
	private Cadre cadre;
	private TableauScore tableauScore;

	public GameController(Cadre cadre, TableauScore tableauScore) {
		this.cadre = cadre;
		this.tableauScore = tableauScore;
		
		// Initialisation du cadre avec l'écran "menu"
		this.cadre.setScreen("menu");
	}
	
	
	public TableauScore getTableauScores()
	{
		return this.tableauScore;
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


	public TableauScore getTableauScore()
	{
		return tableauScore;
	}


	public void setTableauScore(TableauScore tableauScore)
	{
		this.tableauScore = tableauScore;
	}


	public void createPartie(String pseudo)
	{

		
		this.jeu = new JeuDeCarte(new Joueur(pseudo));
		this.jeu.setGameController(this);
		
		this.jeu.addObserver(this.cadre);
	}
	
}
