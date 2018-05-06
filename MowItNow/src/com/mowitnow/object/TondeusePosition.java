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
	
	/**
	 * Constructeur de TondeusePosition avec la position et la direction en code Tondeuse.
	 * @param positionX
	 * @param positionY
	 * @param direction
	 */
	public TondeusePosition(final int positionX, final int positionY, final CodeTondeuseDirection direction) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.direction = direction;
	}
	
	/**
	 * Constructeur de TondeusePosition avec la position et la direction en code Direction.
	 * @param positionX
	 * @param positionY
	 * @param direction
	 */
	public TondeusePosition(final int positionX, final int positionY, final CodeDirection direction) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.direction = CodeTondeuseDirection.valueOf(direction.toString());
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
	public void setPositionY(final int positionY) {
		this.positionY = positionY;
	}
	
	/**
	 * Getter du champ positionY.
	 * @return positionY
	 */
	public int getPositionY() {
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
