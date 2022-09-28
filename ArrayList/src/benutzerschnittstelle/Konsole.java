package benutzerschnittstelle;

import java.util.ArrayList;

public class Konsole
{

	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> alter = new ArrayList<>();
		
		names.add("Julian");
		alter.add(17);
		
		names.add("Nick");
		alter.add(16);
		
		names.add("Lukas");
		alter.add(17);
		
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i) + " ist " + alter.get(i) + " Jahre alt.");
		}
		
	}

}
