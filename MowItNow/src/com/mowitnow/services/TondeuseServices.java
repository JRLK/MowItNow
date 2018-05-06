package com.mowitnow.services;

import com.mowitnow.object.CodeTondeuseCommande;
import com.mowitnow.object.JardinTaille;
import com.mowitnow.object.TondeusePosition;

/**
 * Interfaces de services pour les actions de la tondeuse.
 * @author Johan
 *
 */
public interface TondeuseServices {

	/**
	 * D�finie la nouvelle position de la tondeuse.
	 * @param tpInitiale Position initiale de la tondeuse.
	 * @param commande Commande � ex�cuter.
	 * @return Nouvelle postion de la tondeuse.
	 */
	TondeusePosition getNewTondeusePostion(final TondeusePosition tpInitiale, final CodeTondeuseCommande commande);
	
	/**
	 * V�rifie que la nouvelle position est � l'int�rieur du jardin.
	 * @param position position de la tondeuse.
	 * @param jardin Taille du jardin
	 * @return True si la nouvelle position est contenue dans le jardin.
	 */
	boolean checkPostionJardin(final TondeusePosition position, final JardinTaille jardin);
}
