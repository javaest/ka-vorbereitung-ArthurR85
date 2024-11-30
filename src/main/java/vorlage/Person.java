package vorlage;

public abstract class Person {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 5) {
            throw new IllegalArgumentException("Name muss mindestens 5 Zeichen lang sein.");
        }
        this.name = name;
    }
}
