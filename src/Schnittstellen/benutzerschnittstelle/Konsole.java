package Schnittstellen.benutzerschnittstelle;

import java.util.Arrays;

import Schnittstellen.fachkonzept.Flaeche;

public class Konsole {

	public static void main(String[] args) {
		Flaeche[] flaechen = {new Flaeche("Wyoming", 450, 580),
				new Flaeche("Tisch", 0.001, 0.002),
				new Flaeche("Fußballfeld", 0.068, 0.105)};
		Arrays.sort(flaechen);
		System.out.println(flaechen[2].liesName());
	}

}
