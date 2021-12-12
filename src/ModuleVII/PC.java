package ModuleVII;

public class PC extends Computer {
    private boolean isPluggedIn;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        this.isPluggedIn = false;
        this.volume = 0;
    }

    public void plugIn() {
        this.isPluggedIn = true;
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

    public void volumeUp() {
        this.volume += 1;
        if (this.volume > 100){
            this.volume = 100;
        }
    }

    public void volumeDown() {
        this.volume -= 1;
        if (this.volume < 0){
            this.volume = 0;
        }
    }
    public void unplug() {
        this.isPluggedIn = false;
    }

    public void printName() {
        System.out.println(name);
    }

    public void turnOn() {
        if (this.isPluggedIn) {
            System.out.println("PC is plugged in, turning on");
            super.turnOn();
        } else {
            System.out.println("PC is unplugged, not possible to turn it on");
        }
    }
}
