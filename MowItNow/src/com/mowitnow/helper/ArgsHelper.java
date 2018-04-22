package com.mowitnow.helper;

import java.io.File;

/**
 * Classe qui contient les m�thodes static sur les Args.
 * @author jkichenin
 *
 */
public class ArgsHelper {
	
	private ArgsHelper() {
		throw new IllegalStateException("Classe de m�thodes statiques.");
	}

	/**
	 * Controles les arguments re�ues.
	 * @param args Liste des arguments.
	 * @return Fichier de commande.
	 */
	public static File checkArgs(String[] args) {
		String commandPath = checkArgsSize(args);
		File commandFile = checkCommandPath(commandPath);
		checkCommandFile(commandFile);
		return commandFile;
	}

	/**
	 * V�rifie la taille de la liste d'arguments.
	 * @param args Liste des arguments.
	 */
	private static String checkArgsSize(String[] args) {
		if(args.length != 1)
			throw new CheckException("Le programme prend obligatoirement 1 argument : le chemin d'acc�s au fichier de commande.");
		return args[0];
	}
	
	/**
	 * V�rifie que le fichier de commandes existe.
	 * @param commandPath Path du fichier de commande.
	 */
	private static File checkCommandPath(String commandPath) {
		File commandFile = new File(commandPath);
		if(!commandFile.exists())
			throw new CheckException("Le fichier de commande n'existe pas.");
		if(!commandFile.isFile())
			throw new CheckException("Le chemin donn� ne correspond pas � un fichier.");
		return commandFile;
	}
	

	/**
	 * V�rifie le fichier de commande.
	 * @param commandFile Fichier de commande.
	 */
	private static void checkCommandFile(File commandFile) {
		if(!commandFile.canRead())
			throw new CheckException("Le fichier de commande ne peut pas �tre lu.");		
	}
}
