package vorlage;

public class Kellner extends Person {
    private int mitarbeiterID;

    public Kellner(String name, int mitarbeiterID) {
        setName(name);
        this.mitarbeiterID = mitarbeiterID;
    }

    public int getMitarbeiterID() {
        return mitarbeiterID;
    }
}
