package com.mowitnow.object;

/**
 * Objet pour définir la taille du jardin. 
 * @author Johan
 *
 */
public class JardinTaille {

	private int tailleX;
	private int tailleY;
	
	/**
	 * Constructeur de l'objet.
	 * @param x taille X du jardin.
	 * @param y taille Y du jardin.
	 */
	public JardinTaille(final int x, final int y) {
		setTailleX(x);
		setTailleY(y); 
	}

	/**
	 * Getter de la taille en longueur du jardin.
	 * @return the tailleX
	 */
	public int getTailleX() {
		return tailleX;
	}

	/**
	 * Setter de la taille en longueur du jardin.
	 * @param tailleX the tailleX to set
	 */
	public void setTailleX(int tailleX) {
		this.tailleX = tailleX;
	}

	/**
	 * Getter de la taille en largeur du jardin.
	 * @return the tailleY
	 */
	public int getTailleY() {
		return tailleY;
	}

	/**
	 * Setter de la taille en largeur du jardin.
	 * @param tailleY the tailleY to set
	 */
	public void setTailleY(int tailleY) {
		this.tailleY = tailleY;
	}
}
