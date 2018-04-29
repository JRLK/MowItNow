package com.mowitnow.object;

/**
 * Objet permet de définir une position de la tondeuse.
 * @author Johan
 *
 */
public class TondeusePosition {
	
	private int positionX;
	private int positionY;
	private CodeTondeuseDirection direction;
	
	public TondeusePosition(final int positionX, final int positionY, final CodeTondeuseDirection direction) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.direction = direction;
	}
	
	/**
	 * Setter du champ positionX.
	 * @param positionX
	 */
	public void setPositionX(final int positionX) {
		this.positionX = positionX;
	}
	
	/**
	 * Getter du champ positionY.
	 * @return positionX
	 */
	public int getPositionX() {
		return positionX;
	}
	
	/**
	 * Setter du champ positionY.
	 * @param positionY
	 */
	public void setPostionY(final int positionY) {
		this.positionY = positionY;
	}
	
	/**
	 * Getter du champ positionY.
	 * @return positionY
	 */
	public int getPostionY() {
		return positionY;
	}
	
	/**
	 * Setter du champ direction.
	 * @param direction
	 */
	public void setDirection(final CodeTondeuseDirection direction) {
		this.direction = direction;
	}
	
	/**
	 * Getter du champ direction.
	 * @return direction
	 */
	public CodeTondeuseDirection getDirection() {
		return direction;
	}
}
