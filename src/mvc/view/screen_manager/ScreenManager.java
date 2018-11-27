package mvc.view.screen_manager;

import java.util.HashMap;
import java.util.Map;

import mvc.view.screen.Screen;

public class ScreenManager {
	
	Map<String, Screen> screensMap; // Map des écrans affichés par [Cadre]

	public ScreenManager() {
		// TODO Auto-generated constructor stub
		screensMap = new HashMap<String, Screen>();
	}
	
	/**
	 * Ajoute un cadre dans la map
	 * @param key    => La clé de l'écran dans la map
	 * @param screen => l'écran
	 */
	public void addScreen(String key, Screen screen) {
		screensMap.put(key, screen);
	}
	
	public Screen getScreen(String key) {
		return screensMap.get(key);
	}
}
