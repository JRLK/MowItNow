package com.mowitnow.services;

import java.io.File;
import java.util.List;

import com.mowitnow.object.CodeTondeuseCommande;
import com.mowitnow.object.JardinTaille;
import com.mowitnow.object.TondeusePosition;

/**
 * Interface de services pour le traitement du fichier de commande.
 * @author Johan
 *
 */
public interface FichierServices {

	/**
	 * Affiche le contenu du fichier de commande dans la console.
	 * @param commandFile
	 */
	void displayCommandFile(final File commandFile);
	
	/**
	 * Parcours le fichier de commande et retourne la liste des lignes.
	 * @param commandFile Fichier de commande.
	 * @return Liste de lignes du fichiers de commandes.
	 */
	List<String> readCommandFile(final File commandFile);
	
	/**
	 * Retourne la taille du jardin en parsant la ligne.
	 * @param line Première ligne du fichier.
	 * @return Taille du jardin.
	 */
	JardinTaille getJardinTaille(String line);
	
	/**
	 * Retourne la position initiale de la tondeuse en parsant une ligne du fichier de commandes.
	 * @param line Ligne impaire du fichier.
	 * @param jardin Taille du jardin.
	 * @return Postion de la tondeuse.
	 */
	TondeusePosition getTondeusePosition(String line, JardinTaille jardin);
	
	/**
	 * Retourne la liste des commandes de la tondeuse en parsant une ligne du fichier de commandes.
	 * @param line Ligne paire du fichier.
	 * @return Liste des commandes de la tondeuse.
	 */
	List<CodeTondeuseCommande> getTondeuseCommandeListe(String line);
}
