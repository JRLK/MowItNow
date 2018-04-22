package com.mowitnow.main;

import java.io.File;

import com.mowitnow.helper.ArgsHelper;
import com.mowitnow.helper.CheckException;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("### Début du programme ###");
		try {
			File commandFile = ArgsHelper.checkArgs(args);
		} catch (CheckException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("### Fin du programme ###");
		}
	}
}
