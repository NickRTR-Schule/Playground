package Objektzähler.fachkonzept;

public class Klasse {
	private static int anzahlObjekte = 0;
	private String text;
	
	public Klasse(String pText) {
		anzahlObjekte++;
		text = pText;
	}
	
	public static int liesAnzahlObjekte()
	{
		return anzahlObjekte;
	}
	
	public String liesText() 
	{
		return text;
	}
}