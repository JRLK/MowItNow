package com.mowitnow.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.mowitnow.helper.ArgsHelper;
import com.mowitnow.helper.CheckException;
import com.mowitnow.object.CodeTondeuseCommande;
import com.mowitnow.object.JardinTaille;
import com.mowitnow.object.Tondeuse;
import com.mowitnow.object.TondeusePosition;
import com.mowitnow.services.FichierServices;
import com.mowitnow.services.FichierServicesImpl;
import com.mowitnow.services.TondeuseServices;
import com.mowitnow.services.TondeuseServicesImpl;

/**
 * Classe Main du projet.
 * @author Johan
 *
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("### Début du programme ###");
		File commandFile = null;
		try {
			commandFile = ArgsHelper.checkArgs(args);
			
		} catch (CheckException e) {
			System.out.println(e.getMessage());
		}
		
		if(commandFile == null) {
			System.out.println("### Fin du programme ###");
			return;
		}
			
		// Récupération de la liste des tondeuse.
		List<Tondeuse> tondeuseList = getTondeuseList(commandFile);
		// Exécution des commandes.
		executeTondeuseCommande(tondeuseList);
		
		System.out.println("### Fin du programme ###");
	}
	
	/**
	 * Lecture du fichier.
	 * @param commandFile
	 * @return Liste des tondeuses du fichier.
	 */
	private static List<Tondeuse> getTondeuseList(File commandFile){
		FichierServices fichierServices = new FichierServicesImpl();
		// fichierServices.displayCommandFile(commandFile);
		
		List<String> fileContent = fichierServices.readCommandFile(commandFile);
		boolean firstLine = true;
		int lineNb = 0;
		JardinTaille jardin = null;
		List<Tondeuse> tondeuseList = new ArrayList<Tondeuse>();
		TondeusePosition tondeusePosition = null;
		List<CodeTondeuseCommande> tondeuseCommandeList;
		
		for(String line : fileContent) {
			if(firstLine) {
				jardin = fichierServices.getJardinTaille(line);
				firstLine = false;
				lineNb++;
				continue;
			}
			// Traitement des lignes de position.
			if(lineNb%2 != 0) {
				// Ligne impaire.
				tondeusePosition = fichierServices.getTondeusePosition(line, jardin);
			}
			// Traitement des lignes de commandes.
			if(lineNb%2 == 0) {
				// Ligne paire.
				tondeuseCommandeList = fichierServices.getTondeuseCommandeListe(line);
				tondeuseList.add(new Tondeuse(tondeusePosition, jardin, tondeuseCommandeList));
			}
			lineNb++;
		}
		return tondeuseList;
	}
	
	/**
	 * Exécute la liste des commandes pour chaque Tondeuse du fichier.
	 * @param tondeuses liste des tondeuses.
	 */
	private static void executeTondeuseCommande(final List<Tondeuse> tondeuses) {
		TondeuseServices tondeuseServices = new TondeuseServicesImpl();
		for(Tondeuse tondeuse : tondeuses) {
			List<CodeTondeuseCommande> commandes = tondeuse.getCommandeList();
			JardinTaille jardin = tondeuse.getJardin();
			TondeusePosition lastPosition = tondeuse.getPosition();
			TondeusePosition newPosition;
			for(CodeTondeuseCommande commande : commandes) {
				newPosition = tondeuseServices.getNewTondeusePostion(lastPosition, commande);
				if(tondeuseServices.checkPostionJardin(newPosition, jardin)) {
					tondeuse.setPosition(newPosition);
					lastPosition = newPosition;
				}
			}
			String result = String.format("%d %d %s", lastPosition.getPositionX(), lastPosition.getPositionY(), lastPosition.getDirection());
			System.out.println(result);
		}
	}
}
