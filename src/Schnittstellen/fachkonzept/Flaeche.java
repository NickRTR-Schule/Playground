package Schnittstellen.fachkonzept;

public class Flaeche implements Comparable<Flaeche> {
	private double breite;
	private double laenge;
	private String name;

	public Flaeche(String pName, double pBreite, double pLaenge)
	{
		breite = pBreite;
		laenge = pLaenge;
		name = pName;
	}
	
	public double liesBreite()
	{
		return breite;
	}
	
	public double liesLaenge()
	{
		return laenge;
	}
	
	public String liesName()
	{
		return name;
	}

	@Override
	public int compareTo(Flaeche pFlaeche) {
		return (int) (breite * laenge - pFlaeche.liesBreite() * pFlaeche.liesLaenge());
	}
}
