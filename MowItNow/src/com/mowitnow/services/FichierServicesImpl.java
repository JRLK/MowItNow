package com.mowitnow.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mowitnow.object.CodeTondeuseCommande;
import com.mowitnow.object.CodeTondeuseDirection;
import com.mowitnow.object.JardinTaille;
import com.mowitnow.object.TondeusePosition;

/**
 * Classe d'implémentation des services de l'interface FichierServices
 * @author Johan
 *
 */
public class FichierServicesImpl implements FichierServices {

	/** {@inheritDoc} */
	@Override
	public void displayCommandFile(File commandFile) {
		try {
			FileReader fileReader = new FileReader(commandFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** {@inheritDoc} */
	@Override
	public List<String> readCommandFile(File commandFile) {
		try {
			FileReader fileReader = new FileReader(commandFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			List<String> lines = new ArrayList<>();
			while ((line = bufferedReader.readLine()) != null) {
				lines.add(line);
			}
			fileReader.close();
			bufferedReader.close();
			return lines;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/** {@inheritDoc} */
	@Override
	public JardinTaille getJardinTaille(String line) {
		// Parsing de la ligne
		String[] jardinRaw = line.split(" ");
		// Contrôle le nombre d'arguments.
		if(jardinRaw.length != 2) {
			return null;
		}
		int tailleX;
		int tailleY;
		// Contrôle le type des arguments.
		try {
			tailleX = Integer.parseInt(jardinRaw[0]);
			tailleY = Integer.parseInt(jardinRaw[1]);
		} catch (NumberFormatException nfe) {
			return null;
		}
		// Contrôle sur les valeurs.
		if(tailleX < 1 || tailleY < 1) {
			return null;
		}
		return new JardinTaille(tailleX, tailleY);
	}

	/** {@inheritDoc} */
	@Override
	public TondeusePosition getTondeusePosition(String line, JardinTaille jardin) {
		// Parsing de la ligne
		String[] positionRaw = line.split(" ");
		// Contrôle le nombre d'arguments.
		if(positionRaw.length != 3) {
			return null;
		}
		int positionX;
		int positionY;
		// Contrôle le type des arguments pour la position
		try {
			positionX = Integer.parseInt(positionRaw[0]);
			positionY = Integer.parseInt(positionRaw[1]);
		} catch (NumberFormatException nfe) {
			return null;
		}
		// Contrôle la valeur des positions.
		if(positionX < 0 || positionX > jardin.getTailleX() || positionY < 0 || positionY > jardin.getTailleY()) {
			return null;
		}
		// Contrôle de la direction.
		CodeTondeuseDirection direction;
		try {
			direction = CodeTondeuseDirection.valueOf(positionRaw[2]);	
		} catch(IllegalArgumentException iae) {
			return null;
		}
		return new TondeusePosition(positionX, positionY, direction);
	}

	/** {@inheritDoc} */
	@Override
	public List<CodeTondeuseCommande> getTondeuseCommandeListe(String line) {
		// Parsing de la ligne
		String[] commandeListRaw = line.split("");
		List<CodeTondeuseCommande> commandeList = new ArrayList<>();
		// Contrôle des commandes.
		try {
			for(String commande : commandeListRaw) {
				commandeList.add(CodeTondeuseCommande.valueOf(commande));
			}
		} catch(IllegalArgumentException iae) {
			return null;
		}
		return commandeList;
	}
}
