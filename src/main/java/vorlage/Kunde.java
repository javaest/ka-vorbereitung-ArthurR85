package vorlage;

public class Kunde extends Person {
    private int kundennummer;

    public Kunde(String name, int kundennummer) {
        setName(name);  
        this.kundennummer = kundennummer;
    }

    public int getKundennummer() {
        return kundennummer;
    }
}
