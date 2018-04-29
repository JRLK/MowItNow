package com.mowitnow.main;

import java.io.File;

import com.mowitnow.helper.ArgsHelper;
import com.mowitnow.helper.CheckException;
import com.mowitnow.services.FichierServices;
import com.mowitnow.services.FichierServicesImpl;

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
			
		FichierServices fichierServices = new FichierServicesImpl();
		fichierServices.readCommandFile(commandFile);
		
		System.out.println("### Fin du programme ###");
	}
}
