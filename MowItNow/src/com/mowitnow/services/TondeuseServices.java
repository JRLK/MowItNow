package com.mowitnow.services;

import com.mowitnow.object.CodeTondeuseCommande;
import com.mowitnow.object.TondeusePosition;

/**
 * Interfaces de services pour les actions de la tondeuse.
 * @author Johan
 *
 */
public interface TondeuseServices {

	TondeusePosition getNewTondeusePostion(final TondeusePosition tpInitiale, final CodeTondeuseCommande commande);
}
