package com.mowitnow.main;

import com.mowitnow.helper.ArgsHelper;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("D�but du programme");
		ArgsHelper.checkArgs(args);
		System.out.println("Fin du programme");
	}

}
