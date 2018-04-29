package com.mowitnow.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.mowitnow.object.CodeTondeuseCommande;
import com.mowitnow.object.JardinTaille;
import com.mowitnow.object.TondeusePosition;

public class FichierServicesImpl implements FichierServices {

	public void readCommandFile(File commandFile) {
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

	@Override
	public JardinTaille getJardinTaille() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TondeusePosition getTondeusePosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CodeTondeuseCommande> getTondeuseCommandeListe() {
		// TODO Auto-generated method stub
		return null;
	}
}
