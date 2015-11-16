# Kapitel 10 Übung ("Modell für Kundenverwaltungsprogramm")

## Modellbildung mit Vererbung

Es soll ein einfaches Kundenverwaltungsprogramm für eine Firma erstellt werden. Erstellen Sie ein Modell, in welchem Sie mindestens die folgenden Begriffe einordnen:

![Begriffe Modell](/modell/begriffe.png)

## Erweiterung des Modells

Berücksichtigen Sie bei dem Modell nun zusätzlich,
* dass die Ermittlung istPremiumkunde bei Firmen anderen Regeln unterworfen ist als bei Privatpersonen,
* dass Privatpersonen Bestellungen zurückgeben können, Firmen jedoch nicht, und
* dass zur Erzeugung einer Top-10-Liste der Kunden eine Kennzahl ermittelt werden muss, die die "Wichtigkeit" eines Kunden widerspiegelt.

## Umsetzung in Java-Klassen

* Setzen Sie die drei zentralen Klassen Ihres Modells  (```Person```, ```JuristischePerson```, ```NatuerlichePerson```) in Java-Klassen um.
* Erzeugen Sie in einer weiteren Java-Klasse (mit ```main```-Methode) mehrere juristische und natürliche Personen in einer Liste und testen Sie alle Funktionen.
