package ModuleXI;

public enum Enumerations {
    MONDAY("Poniedziałek"), TUESDAY("Wtorek"), WEDNESDAY("Środa"), THURSDAY("Czwartek"), FRIDAY("Piątek");
    protected String name;

    Enumerations(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
