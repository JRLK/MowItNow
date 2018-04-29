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

	void readCommandFile(final File commandFile);
	
	JardinTaille getJardinTaille();
	
	TondeusePosition getTondeusePosition();
	
	List<CodeTondeuseCommande> getTondeuseCommandeListe();
}
