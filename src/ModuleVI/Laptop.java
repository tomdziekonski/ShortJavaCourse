package ModuleVI;

public class Laptop extends Computer {
    private int batteryLvl;

    public Laptop(String name, String type, int hdd, int ram, int battery) {
        super(name, type, hdd, ram);
        this.batteryLvl = battery;
    }

    @Override
    public void printMe() {
        System.out.println("Hello 5");
    }

    @Override
    public void turnOn() {
        if (this.batteryLvl < 5) {
            System.out.println("Battery level is too low, can not turn on the laptop");
        } else {
            System.out.println("Turning on...");
            super.turnOn();

        }
    }

    public void changeBattery(int battery) {
        this.batteryLvl = battery;
    }
}
