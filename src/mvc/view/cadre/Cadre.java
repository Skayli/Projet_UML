package mvc.view.cadre;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import mvc.view.screen_manager.ScreenManager;

@SuppressWarnings({ "serial", "deprecation" })
public class Cadre extends JFrame implements Observer {
	
	ScreenManager sc; // Contient les différents écrans pouvant être affichés
	
	public Cadre(ScreenManager sc) {
		// TODO Auto-generated constructor stub
		this.sc = sc;
		
		this.setTitle("Jeu de carte");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		this.setVisible(true);
	}
	
	/**
	 * Modifie l'écran affiché dans le cadre
	 * @param screenKey => La clé d'un écran du ScreenManager
	 */
	public void setScreen(String screenKey) {
		getContentPane().removeAll();
		sc.getScreen(screenKey).addContent(this);
		this.revalidate();
		this.repaint();
	}
	
	public ScreenManager getScreenManager() {
		return this.sc;
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		String screenKey = (String) arg1;
		System.out.println("[Cadre] Changement de cadre : " + screenKey);
		setScreen(screenKey);
	}


}
