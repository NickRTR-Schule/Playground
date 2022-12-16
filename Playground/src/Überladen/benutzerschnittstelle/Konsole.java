package Überladen.benutzerschnittstelle;

import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import Überladen.fachkonzept.Klassenarbeit;

public class Konsole {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Notenrechner");
		System.out.println("============");
		
		System.out.println("maximale Punktzahl:");
		double maximalePunktzahl = eingabe.nextDouble();
		
		System.out.println("erreichte Punktzahl:");
		double erreichtePunktzahl = eingabe.nextDouble();
		
		System.out.println("Anzahl Nachkommastellen:");
		int anzahlNachkommastellen = eingabe.nextInt();
		
		Klassenarbeit dieKlassenarbeit = new Klassenarbeit(erreichtePunktzahl, maximalePunktzahl);
		
		System.out.println("Note ungerundet: " + dieKlassenarbeit.ermittleNote());
		System.out.println("Note gerundet: " + dieKlassenarbeit.ermittleNoteMitRunden(anzahlNachkommastellen));
	}

}
