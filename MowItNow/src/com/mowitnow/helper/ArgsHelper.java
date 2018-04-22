package com.mowitnow.helper;

import java.io.File;

/**
 * Classe qui contient les m�thodes static sur les Args.
 * @author jkichenin
 *
 */
public class ArgsHelper {
	
	private ArgsHelper() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * Controles les arguments re�ues.
	 * @param args Liste des arguments.
	 */
	public static void checkArgs(String[] args) {
		checkArgsSize(args);
		checkCommandPath(args[0]);
	}

	/**
	 * V�rifie la taille de la liste d'arguments.
	 * @param args Liste des arguments.
	 */
	private static void checkArgsSize(String[] args) {
		if(args.length != 1)
			System.out.println("Le programme prend obligatoirement 1 argument : le chemin d'acc�s au fichier de commande.");			
	}
	
	/**
	 * V�rifie que le fichier de commandes existe.
	 * @param commandPath Path du fichier de commande.
	 */
	private static void checkCommandPath(String commandPath) {
		File file = new File(commandPath);
		if(!file.exists())
			System.out.println("Le fichier de commande n'existe pas.");
	}
}
