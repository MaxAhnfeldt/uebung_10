package uebung_10;

import java.util.Random;

public class Ausgabe {

	public static void main(String[] args) {

		NatuerlichePerson hans = new NatuerlichePerson("Hans Albers", "Hamburg", 0, 0, "männlich", "Herr");
		NatuerlichePerson otto = new NatuerlichePerson("Otto Waalkes", "Blankenese", 1000, 1, "männlich", "Herr");
		JuristischePerson apple = new JuristischePerson("Apple", "irgendwo in Amerika", 2230000, 3, "AG", true);
		JuristischePerson edeka = new JuristischePerson("Edeka", "Deutschland", 42000, 37, "AG", true);

		Kunde[] alleKunden = new Kunde[4];

		alleKunden[0] = hans;
		alleKunden[1] = otto;
		alleKunden[2] = apple;
		alleKunden[3] = edeka;

		for (int j = 0; j < alleKunden.length; j++) {
			Random randomizer1 = new Random();
			int anzahlAuszufuehrendeBestellungen = randomizer1.nextInt(30);

			for (int i = 0; i < anzahlAuszufuehrendeBestellungen; i++) {
				Random randomizer2 = new Random();
				int bestellung = randomizer2.nextInt(100000);

				alleKunden[j].bestelleEtwas(bestellung);

			}
		}

		for (int i = 0; i < alleKunden.length; i++) {
			if (alleKunden[i].istPremiumkunde(alleKunden[i].bisherigesBestellvolumen) == true) {

				System.out.println(alleKunden[i].getName() + " (Premiumkunde): " + alleKunden[i].anzahlBestellungen
						+ " Bestellungen mit " + alleKunden[i].bisherigesBestellvolumen + "€ Auftragsvolumen.");
			} else {
				System.out.println(alleKunden[i].getName() + ": " + alleKunden[i].anzahlBestellungen
						+ " Bestellungen mit " + alleKunden[i].bisherigesBestellvolumen + "€ Auftragsvolumen.");

			}
		}
	}

}
