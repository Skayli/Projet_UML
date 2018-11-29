package mvc.model;

public class Carte {
	
	/** Rang de la carte. */
	@SuppressWarnings("all")
	public enum Rang {
		SEPT(0, "7"), HUIT(0, "8"), NEUF(0, "9"), VALET(2,"valet"), DAME(4,"dame"), ROI(5,"roi"), DIX(10, "10"), AS(11,"as");
		
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

	public Carte(Rang r, Couleur c) {
		// TODO Auto-generated constructor stub
		this.rang = r;
		this.couleur = c;
	}

	/**
	 *Retourne le rang de la carte.
	 * @return Renvoie le rang de la carte.
	 */
	public Rang getRang() {
		return this.rang;
	}


	/**
	 * Retourne la couleur de la carte.
	 * @return Renvoie la couleur de la carte.
	 */
	public Couleur getCouleur() {
		return this.couleur;
	}


	/**
	 * Retourne une représentation de la carte.
	 * @return Renvoie une représentation de la carte.
	*/
	@Override
	public String toString() {
		return this.rang + " de " + this.couleur;
	}
	
	public static boolean areEquals(Carte c1, Carte c2) {
		return c1.getRang() == c2.getRang() && c1.getCouleur() == c2.getCouleur();
	}
	   
}
