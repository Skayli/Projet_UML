package mvc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TableauScore {
	
	File fichierScore;
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
		    
	
		System.out.println(tabScore);
		
	}
	
	public void updateScore(Joueur joueur) {
		
	}

}
