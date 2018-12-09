package mvc.model;

import mvc.model.Carte.Couleur;
import mvc.model.Carte.Rang;

public class Carte {
	
	/** Rang de la carte. */
	@SuppressWarnings("all")
	public enum Rang {
		SEPT(0, "7"), HUIT(0, "8"), NEUF(0, "9"), VALET(2,"valet"), DAME(3,"dame"), ROI(4,"roi"), DIX(10, "10"), AS(11,"as");
		
		String description;
		int value;
		
		private Rang(int value, String description) {
			this.value = value;
			this.description = description;
		}
	}

	/** Couleur de la carte. */
	@SuppressWarnings("all")
	public enum Couleur {
		PIQUE("pique", "noir"), COEUR("coeur", "rouge"), CARREAU("carreau", "rouge"), TREFLE("trefle", "noir");
		
		String description;
		String couleur;
		
		private Couleur(String description, String couleur) {
			this.description = description;
			this.couleur = couleur;
		}
 	}

	/** Le rang de la carte. */	
	private Rang rang;

	/** La couleur de la carte. */
	private Couleur couleur;

	public Carte() {
		// TODO Auto-generated constructor stub
		
	}
	
	// ------ GETTERS & SETTERS ------ \\
	
	public Rang getRang() {
		return rang;
	}
	
	public Couleur getCouleur() {
		return this.couleur;
	}
	
	private void setRang(Rang rang) {
		this.rang = rang;
	}
	
	private void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	
	
	// ------ Fonctions utiles ------ \\
	
	public static void piocher(Carte carte)
	{
		// TODO Auto-generated method stub
		int rang = (int) (Math.random() * Carte.Rang.values().length);
		int couleur = (int) (Math.random() * Carte.Couleur.values().length);
		
		Rang rangCarte = Carte.Rang.values()[rang];
		Couleur couleurCarte = Carte.Couleur.values()[couleur];
		
		carte.setRang(rangCarte);
		carte.setCouleur(couleurCarte);
	}


	/**
	 * Retourne une représentation de la carte.
	 * @return Renvoie une représentation de la carte.
	*/
	@Override
	public String toString() {
		return this.rang + " de " + this.couleur;
	}
	
	/**
	 * Verifie si C1 et C2 sont la même carte (meme rang et meme couleur)
	 * @param c1
	 * @param c2
	 * @return
	 */
	public static boolean areEquals(Carte c1, Carte c2) {
		return c1.getRang() == c2.getRang() && c1.getCouleur() == c2.getCouleur();
	}
	   
}
