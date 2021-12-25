package ModuleVIII;

public class Laptop extends Computer implements Music, Video {
    private int batteryLvl;

    public Laptop(String name, String type, Hdd hdd, Ram ram, int battery) {
        super(name, type, hdd, ram);
        this.batteryLvl = battery;
        this.volume = 0;
    }

    @Override
    public void printMe() {
        System.out.println("Hello 5");
    }

    public void volumeUp(int level) {
        this.volume += level;
        if (this.volume > 100) {
            this.volume = 100;
        }
    }

    public void volumeDown(int level) {
        this.volume -= level;
        if (this.volume < 0) {
            this.volume = 0;
        }
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

    public void volumeUp() {
        this.volume += 5;
        if (this.volume > 100){
            this.volume = 100;
        }
    }

    public void volumeDown() {
        this.volume -= 5;
        if (this.volume < 0){
            this.volume = 0;
        }
    }

    @Override
    public void playMusic() {
        System.out.println("Play Music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pause Music");

    }

    @Override
    public void stopMusic() {
        System.out.println("Stop Music");

    }

    @Override
    public void playVideo() {
        System.out.println("Play Video");

    }

    @Override
    public void stopVideo() {
        System.out.println("Stop Video");

    }

    @Override
    public void pauseVideo() {
        System.out.println("Pause Video");

    }
}
