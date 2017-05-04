package uebung_10;

public class Kunde {

	private String name;
	private String adresse;
	public int bisherigesBestellvolumen;
	public int anzahlBestellungen;

	public Kunde(String name, String adresse, int bisherigesBestellvolumen, int anzahlBestellungen) {

		this.name = name;
		this.adresse = adresse;
		this.bisherigesBestellvolumen = bisherigesBestellvolumen;
		this.anzahlBestellungen = anzahlBestellungen;
	}

	public String getName() {
		return name;
	}

	public String getAdresse() {
		return adresse;
	}

	public double getBisherigesBestellvolumen() {
		return bisherigesBestellvolumen;
	}

	public double getAnzahlBestellungen() {
		return anzahlBestellungen;
	}

	public boolean istPremiumkunde(int bisherigesBestellvolumen) {
		this.bisherigesBestellvolumen = bisherigesBestellvolumen;
		boolean Premiumkunde = false;

		if (bisherigesBestellvolumen > 1500000) {
			Premiumkunde = true;
		}
		return Premiumkunde;
	}

	public void ergeaenzeBestellung() {
	}

	public String lieferePostanschrift() {
		String Postanschrift = "blabla";
		return Postanschrift;

	}

	public double liefereWichtigkeit(int bisherigesBestellvolumen, int anzahlBestellungen) {
		this.bisherigesBestellvolumen = bisherigesBestellvolumen;
		this.anzahlBestellungen = anzahlBestellungen;

		double wichtigkeit = bisherigesBestellvolumen / anzahlBestellungen;
		return wichtigkeit;
	}

	public void bestelleEtwas(int bestellvolumen) {
		bisherigesBestellvolumen = bisherigesBestellvolumen + bestellvolumen;
		anzahlBestellungen++;

	}
}
