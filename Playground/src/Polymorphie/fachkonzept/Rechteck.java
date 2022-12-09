package Polymorphie.fachkonzept;

public class Rechteck extends GeometrischeForm {
	protected double a;
	
	private double b;
	
	public Rechteck(double pA, double pB)
	{
		a = pA;
		b = pB;
	}
	
	public double berechneFlaeche()
	{
		return a * b;
	}
	
	public double berechneUmfang()
	{
		return 2 * a + 2 * b;
	}
}
