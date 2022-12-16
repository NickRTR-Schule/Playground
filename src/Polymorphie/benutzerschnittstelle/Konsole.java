package Polymorphie.benutzerschnittstelle;

import Polymorphie.fachkonzept.GeometrischeForm;
import Polymorphie.fachkonzept.Kreis;
import Polymorphie.fachkonzept.Rechteck;
import Polymorphie.fachkonzept.Quadrat;

public class Konsole {

	public static void main(String[] args) {
		GeometrischeForm[] geoform = new GeometrischeForm[3];
		geoform[0] = new Kreis(3.5);
		geoform[1] = new Rechteck(2.5, 4.0);
		geoform[2] = new Quadrat(0.5);
		
		for (int f = 0; f < geoform.length; f++)
		{
			System.out.println("Fläche: " + geoform[f].berechneFlaeche());
			System.out.println("Umfang: " + geoform[f].berechneUmfang());
			System.out.println();
		}
	}

}
