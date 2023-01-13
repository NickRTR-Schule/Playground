package DruckerAbstract.fachkonzept;

public class CSVDokument extends DruckbaresDokument {
	@Override
	public String liesInhaltAlsText() {
		return "Fischer;Fritz;31.12.1955";
	}
}
