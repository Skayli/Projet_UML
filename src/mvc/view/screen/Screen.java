package mvc.view.screen;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JPanel;

import mvc.view.cadre.Cadre;

/**
 * Classe regroupant tous les écrans affichés par [Cadre]
 * @author Quentin
 *
 */
@SuppressWarnings("serial")
public abstract class Screen extends Component {

	JPanel haut, centre, bas;
	
	public Screen() {
		// TODO Auto-generated constructor stub
	}
	
	public void addContent(Cadre cadre) {
		cadre.add(haut, BorderLayout.NORTH);
		cadre.add(centre, BorderLayout.CENTER);
		cadre.add(bas, BorderLayout.SOUTH);
	}

}
