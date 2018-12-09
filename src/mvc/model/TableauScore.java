package mvc.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TableauScore {
	
	File fichierScore;
	final int MAX_SCORE_ENREGISTRES = 10;
	ArrayList<Joueur> tabScore;
	
	public TableauScore() {
		fichierScore = new File("./resources/scores.txt");
		tabScore = new ArrayList<Joueur>();
		
		

		try (BufferedReader br = new BufferedReader(new FileReader(fichierScore))) {
			String line;
			while ((line = br.readLine()) != null) {
				String nom = line.split(" ")[0];
				int score = Integer.parseInt(line.split(" ")[1]);
			    Joueur j = new Joueur(nom);
			    j.setScore(score);
			    
			    tabScore.add(j);
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
	
		System.out.println("Liste des recors -> " + tabScore);
		
	}
	
	public void updateScore(Joueur joueur) {
		
		Joueur newJoueur = new Joueur(joueur);
		
		if (this.tabScore.size() == 0)
		{
			this.tabScore.add(newJoueur);
			this.updateFile();
		}
		else
		{
			for (int i=0; (i < tabScore.size()) && (i < MAX_SCORE_ENREGISTRES); i++)
			{
				if (joueur.getScore() < tabScore.get(i).getScore())
				{
					this.insererJoueur(newJoueur, i);
					this.tabScore.set(i, newJoueur);
					this.updateFile();
					break;
				}
				
				if ( (i == tabScore.size()-1) && (tabScore.size() < MAX_SCORE_ENREGISTRES) )
				{
					tabScore.add(newJoueur);
					this.updateFile();
					break;
				}
			}
		}
	}
	
	private void insererJoueur(Joueur j, int index)
	{
		Joueur temp = tabScore.get(index);
		
		tabScore.set(index, j);
		
		if ( (index+1 < MAX_SCORE_ENREGISTRES) && (index+1 < tabScore.size()) )
		{
			insererJoueur(temp, index+1);
		}
		else
		{
			if ((index+1 < MAX_SCORE_ENREGISTRES))
			{
				tabScore.add(temp);
			}
			
		}
	}
	
	private void decalageScore2(int index, Joueur j)
	{
		if (tabScore.size() < MAX_SCORE_ENREGISTRES)
		{
			tabScore.add(j);
		}
		
		for (int i=tabScore.size()-1; i > index; i--)
		{
			this.tabScore.set(i, this.tabScore.get(i+1));
		}
	}
	
	private void updateFile()
	{
		try (BufferedWriter br = new BufferedWriter(new FileWriter(fichierScore))) {
			
			for (Joueur j : tabScore)
			{
				br.write(j.getNom() + " " + j.getScore() + "\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
