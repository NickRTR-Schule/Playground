package DruckerAbstract.fachkonzept;

import java.awt.print.PrinterException;

import javax.swing.JTextArea;

public class Drucker
{
	public void drucke(DruckbaresDokument pDokument)
	{
		JTextArea textArea = new JTextArea(pDokument.liesInhaltAlsText());
		try
		{
			textArea.print();
		}
		catch (PrinterException e)
		{
			return;
		}
//		pDokument.gedruckt();
	}
}
