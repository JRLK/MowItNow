package com.mowitnow.object;

/**
 * Enum�ration pour la direction de la tondeuse.
 * @author Johan
 *
 */
public enum CodeTondeuseDirection {

	/* North */
	N(CodeDirection.W, CodeDirection.E),
	/* East */
	E(CodeDirection.N, CodeDirection.S),
	/* South */
	S(CodeDirection.E, CodeDirection.W),
	/* West */
	W(CodeDirection.S, CodeDirection.N);
	
	private CodeDirection gauche;
	private CodeDirection droite;
	
	private CodeTondeuseDirection(final CodeDirection gauche, final CodeDirection droite) {
		this.gauche = gauche;
		this.droite = droite;
	}
	
	/**
	 * Indique la direction apr�s un virage � gauche.
	 * @return direction gauche.
	 */
	public CodeDirection getDirectionGauche() {
		return gauche;
	}
	
	/**
	 * Indique la directioin apr�s un virage � droite.
	 * @return direction droite.
	 */
	public CodeDirection getDirectionDroite( ) {
		return droite;
	}
}
