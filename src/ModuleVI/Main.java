package ModuleVI;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC("Compaq", "desktop", 500, 16);
        Laptop lap = new Laptop("Microsoft", "lap", 200, 8, 2);
        pc.turnOn();
        System.out.println(pc.isTurnedOn());
        System.out.println(lap.isTurnedOn());
        lap.turnOn();
        lap.changeBattery(5);
        lap.turnOn();

        System.out.println(lap.isTurnedOn());

        Computer comp = new Computer("Apple", "lap", 200, 8);
        comp.printMe();
        lap.printMe();

        pc.printName();

        System.out.println("--------------------");
        pc.plugIn();
        pc.turnOn();
        pc.unplug();
        pc.turnOn();

    }
}
