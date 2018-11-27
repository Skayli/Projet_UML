package mvc.view.screen_manager;

import java.util.HashMap;
import java.util.Map;

import mvc.view.screen.Screen;

public class ScreenManager {
	
	Map<String, Screen> screensMap; // Map des �crans affich�s par [Cadre]

	public ScreenManager() {
		// TODO Auto-generated constructor stub
		screensMap = new HashMap<String, Screen>();
	}
	
	/**
	 * Ajoute un cadre dans la map
	 * @param key    => La cl� de l'�cran dans la map
	 * @param screen => l'�cran
	 */
	public void addScreen(String key, Screen screen) {
		screensMap.put(key, screen);
	}
	
	public Screen getScreen(String key) {
		return screensMap.get(key);
	}
}
