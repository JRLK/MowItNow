package com.mowitnow.object;

import java.util.List;

/**
 * Classe pour l'objet Tondeuse.
 * @author Johan
 *
 */
public class Tondeuse {
	
	private TondeusePosition position;
	private JardinTaille jardin;
	private List<CodeTondeuseCommande> commandeList;
	
	/**
	 * Constructeur par défaut.
	 */
	public Tondeuse() {
		super();
	}
	
	/**
	 * Constructeur avec les arguments.
	 * @param position Position de la tondeuse.
	 * @param jardin Taille du jardin.
	 * @param commandeList Liste de commandes de la tondeuse.
	 */
	public Tondeuse(final TondeusePosition position, final JardinTaille jardin, final List<CodeTondeuseCommande> commandeList) {
		this.setPosition(position);
		this.setJardin(jardin);
		this.setCommandeList(commandeList);
	}

	/**
	 * @return the position
	 */
	public TondeusePosition getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(TondeusePosition position) {
		this.position = position;
	}

	/**
	 * @return the jardin
	 */
	public JardinTaille getJardin() {
		return jardin;
	}

	/**
	 * @param jardin the jardin to set
	 */
	public void setJardin(JardinTaille jardin) {
		this.jardin = jardin;
	}

	/**
	 * @return the commandeList
	 */
	public List<CodeTondeuseCommande> getCommandeList() {
		return commandeList;
	}

	/**
	 * @param commandeList the commandeList to set
	 */
	public void setCommandeList(List<CodeTondeuseCommande> commandeList) {
		this.commandeList = commandeList;
	}

}
