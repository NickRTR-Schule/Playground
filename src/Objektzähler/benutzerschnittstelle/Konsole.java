package Objektzähler.benutzerschnittstelle;

import Objektzähler.fachkonzept.Klasse;

public class Konsole {

	public static void main(String[] args) {
		Klasse dieKlasse = new Klasse("Milch");
		System.out.println(Klasse.liesAnzahlObjekte());
	}

}