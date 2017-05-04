package uebung_10;

public class NatuerlichePerson extends Kunde {
	private String geschlecht;
	private String anrede;

	public NatuerlichePerson(String name, String adresse, int bisherigesBestellvolumen, int anzahlBestellungen,
			String geschlecht, String anrede) {
		super(name, adresse, bisherigesBestellvolumen, anzahlBestellungen);
		this.geschlecht = geschlecht;
		this.anrede = anrede;

	}

	public String getGeschlecht() {
		return geschlecht;
	}

	public String getAnrede() {
		return anrede;
	}

	public boolean istPremiumkunde(int bisherigesBestellvolumen) {
		this.bisherigesBestellvolumen = bisherigesBestellvolumen;
		boolean Premiumkunde = super.istPremiumkunde(bisherigesBestellvolumen);

		if (bisherigesBestellvolumen > 750000) {
			Premiumkunde = true;
		}
		return Premiumkunde;
	}

	public void schickeEtwasZurück(int ruecksendemenge) {
		bisherigesBestellvolumen = bisherigesBestellvolumen - ruecksendemenge;
		anzahlBestellungen = anzahlBestellungen - 1;

	}

}
