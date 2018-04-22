package com.mowitnow.helper;

/**
 * Classe d'exception sp�cifique pour les contr�les.
 * @author Johan
 *
 */
public class CheckException extends RuntimeException{

	/**
	 * Cl� unique de la classe.
	 */
	private static final long serialVersionUID = 245772034178951977L;

	/**
	 * Appel du constructeur du parent.
	 */
	public CheckException() {
		super();
	}
	
	/**
	 * Appel du constructeur du parent.
	 * @param message Message de l'exception.
	 */
	public CheckException(String message) {
		super(message);
	}
}
