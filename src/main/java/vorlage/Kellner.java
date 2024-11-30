package vorlage;

public class Kellner extends Person {
    private int mitarbeiterID;

    public Kellner(String name, int mitarbeiterID) {
        setName(name);  // Vererbung von der Person-Klasse
        this.mitarbeiterID = mitarbeiterID;
    }

    public int mitarbeiterID() {
        return mitarbeiterID;
    }

    public void mitarbeiterID(int mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }
}
