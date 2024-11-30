package vorlage;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Bestellung> bestellungen;

    public Restaurant() {
        this.bestellungen = new ArrayList<>();
    }

    // Methode, um Bestellungen hinzuzufügen
    public void bestellungAufnehmen(Bestellung bestellung) {
        bestellungen.add(bestellung);
    }

    // Methode, um Bestellungen zu entfernen
    public void bestellungEntfernen(Bestellung bestellung) {
        bestellungen.remove(bestellung);
    }

    // Methode, um alle Bestellungen abzurufen
    public List<Bestellung> getBestellungen() {
        return bestellungen;
    }
}
