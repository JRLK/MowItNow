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
	 * Définie la nouvelle position de la tondeuse.
	 * @param tpInitiale Position initiale de la tondeuse.
	 * @param commande Commande à exécuter.
	 * @return Nouvelle postion de la tondeuse.
	 */
	TondeusePosition getNewTondeusePostion(final TondeusePosition tpInitiale, final CodeTondeuseCommande commande);
	
	/**
	 * Vérifie que la nouvelle position est à l'intérieur du jardin.
	 * @param position position de la tondeuse.
	 * @param jardin Taille du jardin
	 * @return True si la nouvelle position est contenue dans le jardin.
	 */
	boolean checkPostionJardin(final TondeusePosition position, final JardinTaille jardin);
}
