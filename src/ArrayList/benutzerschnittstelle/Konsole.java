package ArrayList.benutzerschnittstelle;

import java.util.ArrayList;
import ArrayList.fachkonzept.Person;

public class Konsole
{

	public static void main(String[] args)
	{		
		System.out.println("Aufgabe 1");
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
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
		
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("Aufgabe 2");
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		// ArrayList Aufgabe 2
		System.out.println("Uebung 2 (Array: [2, 5, 1, 7, 6)");
		ArrayList<Integer> arrlist = new ArrayList<>();
		arrlist.add(2);
		arrlist.add(5);
		arrlist.add(1);
		arrlist.add(7);
		arrlist.add(6);
		
		// a) Element Nr. 2 entfernen
		System.out.println("Aufgabe 2 a) Element Nr. 2 entfernen");
		loop(arrlist);
		arrlist.remove(1);
		loop(arrlist);
		
		// b) Element mit dem Wert 2 entfernen
		System.out.println("Aufgabe 2 b) Element mit dem Wert 2 entfernen");
		loop(arrlist);
		// arrlist.remove(arrlist.indexOf(2)); korrektur:
		arrlist.remove((Integer) 2);
		loop(arrlist);
	}
	
	static void loop(ArrayList<Integer> arrlist)
	{
		for(int i = 0; i < arrlist.size(); i++)
		{
			System.out.print(arrlist.get(i) + " ");
		}
		System.out.println();
	}
}