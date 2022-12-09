package Polymorphie.fachkonzept;

public class Quadrat extends Rechteck {
	public Quadrat(double pA)
	{
		super(pA, pA);
	}
	
	public double berechneFlaeche()
	{
		return Math.pow(a, 2);
	}
	
	public double berechneUmfang()
	{
		return 4 * a;
	}
}
