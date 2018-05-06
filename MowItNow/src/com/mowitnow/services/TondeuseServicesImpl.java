package com.mowitnow.services;

import com.mowitnow.object.CodeDirection;
import com.mowitnow.object.CodeTondeuseCommande;
import com.mowitnow.object.CodeTondeuseDirection;
import com.mowitnow.object.JardinTaille;
import com.mowitnow.object.TondeusePosition;

/**
 * Classe d'implémentation des services de l'interface TondeuseServices
 * @author Johan
 *
 */
public class TondeuseServicesImpl implements TondeuseServices {

	/** {@inheritDoc} */
	@Override
	public TondeusePosition getNewTondeusePostion(TondeusePosition tpInitiale, CodeTondeuseCommande commande) {
		TondeusePosition newPosition;
		switch (commande) {
		case G:
		case D:
			CodeTondeuseDirection direction = tpInitiale.getDirection();
			CodeDirection newDirection = commande.equals(CodeTondeuseCommande.G) ? direction.getDirectionGauche() : direction.getDirectionDroite();
			newPosition = new TondeusePosition(tpInitiale.getPositionX(), tpInitiale.getPositionY(), newDirection);
			break;
		case A:
			newPosition = getPositionTondeuseAvance(tpInitiale);
			break;
		default:
			newPosition = null;
		}
		return newPosition;
	}

	/**
	 * Retourne la nouvelle position de la tondeuse lorsqu'elle doit avancer.
	 * @param tpInitiale Position initiale de la tondeuse.
	 * @return nouvelle position pour la tondeuse.
	 */
	private TondeusePosition getPositionTondeuseAvance(TondeusePosition tpInitiale) {
		TondeusePosition newPosition;
		switch (tpInitiale.getDirection()) {
		case N:
			newPosition = new TondeusePosition(tpInitiale.getPositionX(), tpInitiale.getPositionY() + 1, tpInitiale.getDirection());
			break;
		case S:
			newPosition = new TondeusePosition(tpInitiale.getPositionX(), tpInitiale.getPositionY() - 1, tpInitiale.getDirection());
			break;
		case E:
			newPosition = new TondeusePosition(tpInitiale.getPositionX() + 1, tpInitiale.getPositionY(), tpInitiale.getDirection());
			break;
		case W:
			newPosition = new TondeusePosition(tpInitiale.getPositionX() - 1, tpInitiale.getPositionY(), tpInitiale.getDirection());
			break;
		default:
			newPosition = null;
			break;
		}
		return newPosition;
	}

	/** {@inheritDoc} */
	@Override
	public boolean checkPostionJardin(TondeusePosition position, JardinTaille jardin) {
		return !(position.getPositionX() < 1 || position.getPositionX() > jardin.getTailleX() 
				|| position.getPositionY() < 1 || position.getPositionX() > jardin.getTailleY());
	}

}
