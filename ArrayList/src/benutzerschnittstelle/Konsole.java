package benutzerschnittstelle;

import java.util.ArrayList;
import fachkonzept.Person;

public class Konsole
{

	public static void main(String[] args)
	{		
		ArrayList<String> namen = new ArrayList<>();
		ArrayList<Integer> alter = new ArrayList<>();
		
		namen.add("Julian");
		alter.add(17);
		
		namen.add("Nick");
		alter.add(16);
		
		namen.add("Lukas");
		alter.add(17);
		
		for(int i = 0; i < namen.size(); i++)
		{
			System.out.println(namen.get(i) + " ist " + alter.get(i) + " Jahre alt.");
		}
		
		System.out.println("---------------------------------------------------------");
		
		// ArrayList aus Personen
		
		ArrayList<Person> personen = new ArrayList<>();
		
		personen.add(new Person("Julian", 17));
		personen.add(new Person("Nick", 16));
		personen.add(new Person("Lukas", 17));
		
		for(int i = 0; i < personen.size(); i++)
		{
			System.out.println(personen.get(i).liesName() + " ist " + personen.get(i).liesAlter() + " Jahre alt.");
		}
		
		System.out.println("---------------------------------------------------------");
		
		// ArrayList in statischen Array kopieren und ausgeben
		
		Person[] statischePersonen = personen.toArray(new Person[personen.size()]);
		
		for(int i = 0; i < statischePersonen.length; i++)
		{
			System.out.println(statischePersonen[i].liesName() + " ist " + statischePersonen[i].liesAlter() + " Jahre alt.");
		}
	}

}
