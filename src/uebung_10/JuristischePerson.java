package uebung_10;

public class JuristischePerson extends Kunde {
	private String rechtsform;
	private boolean istKapitalgesellschaft;

	public JuristischePerson(String name, String adresse, int bisherigesBestellvolumen, int anzahlBestellungen,
			String rechtsform, boolean istKapitagesellschaft) {
		super(name, adresse, bisherigesBestellvolumen, anzahlBestellungen);
		this.rechtsform = rechtsform;
	}

	public String getRechtsform() {
		return rechtsform;
	}

	public boolean getIstKapitalgesellschaft() {
		return istKapitalgesellschaft;
	}
}
