package vorlage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bestellung {
    private int bestellnummer;
    private Date bestelldatum;
    private List<Gericht> gerichte;
    private Kunde kunde;
    private Kellner kellner;
    private double gesamtbetrag;

    // Konstruktor
    public Bestellung(int bestellnummer, Date bestelldatum, Kunde kunde, Kellner kellner) {
        this.bestellnummer = bestellnummer;
        this.bestelldatum = bestelldatum;
        this.gerichte = new ArrayList<>();
        this.kunde = kunde;
        this.kellner = kellner;
    }

    // Getter-Methoden
    public int getBestellnummer() {
        return bestellnummer;
    }

    public Date getBestelldatum() {
        return bestelldatum;
    }

    public List<Gericht> getGerichte() {
        return gerichte;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public Kellner getKellner() {
        return kellner;
    }

    public double getGesamtbetrag() {
        return gesamtbetrag;
    }

    // Methoden zur Verwaltung der Bestellung
    public void gerichtHinzufuegen(Gericht gericht) {
        gerichte.add(gericht);
        gesamtbetragBerechnen();
    }

    public void gesamtbetragBerechnen() {
        gesamtbetrag = 0;
        for (Gericht gericht : gerichte) {
            gesamtbetrag += gericht.getPreis();
        }
    }
}
