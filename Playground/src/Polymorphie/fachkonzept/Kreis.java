package Polymorphie.fachkonzept;

public class Kreis extends GeometrischeForm {
	private double r;
	
	public Kreis(double pR) 
	{
		r = pR;
	}
	
	public double berechneFlaeche() 
	{
		return Math.PI * Math.pow(r, 2);
	}
	
	public double berechneUmfang()
	{
		return 2 * Math.PI * r;
	}
}
