package Überladen.fachkonzept;

public class Klassenarbeit {
	private double punkteErreicht;
	private double punkteMaximal;
	
	public Klassenarbeit(double pPunkteErreicht, double pPunkteMaximal)
	{
		punkteErreicht = pPunkteErreicht;
		punkteMaximal = pPunkteMaximal;
	}
	
	public double ermittleNote()
	{
		return 6 - 5 * (punkteErreicht / punkteMaximal);
	}
	
	public double ermittleNoteMitRunden(int pAnzahlNachkommastellen)
	{
		double note = ermittleNote();
		
		if (pAnzahlNachkommastellen == 0)
		{
			return Math.round(note);
		}
		
		String s = String.valueOf(note);
		s = s.substring(0, pAnzahlNachkommastellen + 2);
		return Double.parseDouble(s);
	}
}
