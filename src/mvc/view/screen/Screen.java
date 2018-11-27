package mvc.view.screen;

import java.awt.Component;

import mvc.view.cadre.Cadre;

/**
 * Classe regroupant tous les écrans affichés par [Cadre]
 * @author Quentin
 *
 */
@SuppressWarnings("serial")
public abstract class Screen extends Component {

	public Screen() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void addContent(Cadre cadre);

}
